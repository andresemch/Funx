from antlr4 import *
from TreeVisitor import FunxTreeVisitor
from funxParser import funxParser
from funxLexer import funxLexer
import sys


def main():
    # print(sys.argv)
    input_stream = FileStream(sys.argv[1])
    # print(input_stream)
    # input_stream = InputStream(input('? '))
    lexer = funxLexer(input_stream)
    token_stream = CommonTokenStream(lexer)
    parser = funxParser(token_stream)
    tree = parser.root()
    visitor = FunxTreeVisitor()
    visitor.visit(tree)


if __name__ == '__main__':
    main()
