from TreeVisitor import FunxTreeVisitor
from antlr4 import *
from funxLexer import funxLexer
from funxParser import funxParser
from flask import Flask, request, render_template

class FunxInterpret:
    def __init__(self):
        self.funcions = {}
        self.tree_visitor = FunxTreeVisitor()
        self.tree_visitor.setOutputInter(True)
        self.in_out = []

    def execute(self, code):
        code_stream = InputStream(code)
        lexer = funxLexer(code_stream)
        token_stream = CommonTokenStream(lexer)
        parser = funxParser(token_stream)
        tree = parser.root()
        try:
            self.tree_visitor.visit(tree)
            output = self.tree_visitor.getOutput()
            if len(output) == 0:
                output = ["None"]
            self.in_out.append((code, output))
        except Exception as e:
            self.in_out.append((code, [e]))


    def getFuncions(self):
        return self.tree_visitor.getFuncions()

    def getInout(self):
        return self.in_out

app = Flask(__name__)
funxInter = FunxInterpret()

@app.route("/", methods=['GET', 'POST'])
def base():
    if request.method == 'POST':
        new_code = request.form["coding"]
        funxInter.execute(new_code)
    
    in_out = funxInter.getInout()
    funcions = funxInter.getFuncions()
    return render_template('base.html',
        name="ok",in_out=in_out[::-1],funcions=funcions[::-1])