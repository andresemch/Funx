# Generated from funx.g4 by ANTLR 4.11.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .funxParser import funxParser
else:
    from funxParser import funxParser

# This class defines a complete generic visitor for a parse tree produced by funxParser.

class funxVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by funxParser#root.
    def visitRoot(self, ctx:funxParser.RootContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#bloc.
    def visitBloc(self, ctx:funxParser.BlocContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#instru.
    def visitInstru(self, ctx:funxParser.InstruContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#funcio.
    def visitFuncio(self, ctx:funxParser.FuncioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#execfunc.
    def visitExecfunc(self, ctx:funxParser.ExecfuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#ExprParentesis.
    def visitExprParentesis(self, ctx:funxParser.ExprParentesisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#Numero.
    def visitNumero(self, ctx:funxParser.NumeroContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#Negatiu.
    def visitNegatiu(self, ctx:funxParser.NegatiuContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#Exprfunc.
    def visitExprfunc(self, ctx:funxParser.ExprfuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#Potencia.
    def visitPotencia(self, ctx:funxParser.PotenciaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#ExprVariable.
    def visitExprVariable(self, ctx:funxParser.ExprVariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#SumaResta.
    def visitSumaResta(self, ctx:funxParser.SumaRestaContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#ModDivMult.
    def visitModDivMult(self, ctx:funxParser.ModDivMultContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#cond.
    def visitCond(self, ctx:funxParser.CondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#ifcond.
    def visitIfcond(self, ctx:funxParser.IfcondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#elsecond.
    def visitElsecond(self, ctx:funxParser.ElsecondContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#Negacio.
    def visitNegacio(self, ctx:funxParser.NegacioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#Comparacio.
    def visitComparacio(self, ctx:funxParser.ComparacioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#Unio.
    def visitUnio(self, ctx:funxParser.UnioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#BoolParentesis.
    def visitBoolParentesis(self, ctx:funxParser.BoolParentesisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#True.
    def visitTrue(self, ctx:funxParser.TrueContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#BoolVariable.
    def visitBoolVariable(self, ctx:funxParser.BoolVariableContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#False.
    def visitFalse(self, ctx:funxParser.FalseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#Boolean.
    def visitBoolean(self, ctx:funxParser.BooleanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#Disjuncio.
    def visitDisjuncio(self, ctx:funxParser.DisjuncioContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#bucle.
    def visitBucle(self, ctx:funxParser.BucleContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by funxParser#assignacio.
    def visitAssignacio(self, ctx:funxParser.AssignacioContext):
        return self.visitChildren(ctx)



del funxParser