from TreeVisitor import FunxTreeVisitor
from antlr4 import *
from funxLexer import funxLexer
from funxParser import funxParser
from flask import Flask, request, render_template

class FunxInterpret:
    def __init__(self):
        self.funcions = {}
        self.tree_visitor = FunxTreeVisitor()
        self.tree_visitor.setOutputToBuffer(True)
        self.io_buffer = []

    def execute(self, code):
        code_stream = InputStream(code)
        lexer = funxLexer(code_stream)
        token_stream = CommonTokenStream(lexer)
        parser = funxParser(token_stream)
        tree = parser.root()
        try:
            self.tree_visitor.visit(tree)
            output = self.tree_visitor.getOutputBuffer()
            if len(output) == 0:
                output = ["None"]
            self.io_buffer.append((code, output))
        except Exception as e:
            self.io_buffer.append((code, [e]))


    def getFunctions(self):
        return self.tree_visitor.getFunctions()

    def getIObuffer(self):
        return self.io_buffer

app = Flask(__name__)
funxInter = FunxInterpret()

@app.route("/", methods=['GET', 'POST'])
def base():
    #if request.method == 'GET':
    #    return render_template('base.html', name="default")
    #else:
    if request.method == 'POST':
        new_code = request.form["coding"]
        funxInter.execute(new_code)
    
    io_buffer = funxInter.getIObuffer()
    funcions = funxInter.getFunctions()
    return render_template('base.html',
        name="ok",io_buffer=io_buffer[::-1],funcions=funcions[::-1])