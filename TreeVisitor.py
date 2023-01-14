from funxParser import funxParser
from funxVisitor import funxVisitor


class FunxTreeVisitor(funxVisitor):

    def __init__(self):
        self.contexts = [{}]
        self.funcions = {}
        self.outputInter = False
        self.outputs = []
        self.dintreFuncio = False
        self.instruFunc = True

    def visitRoot(self, ctx):
        fills = list(ctx.getChildren())
        self.outputs = []
        self.instruFunc = True
        for f in fills:
            self.visit(f)
        self.instruFunc = False
        for f in fills:
            self.visit(f)

    def visitInstru(self, ctx):
        if self.instruFunc:
            return
        fills = list(ctx.getChildren())
        res = self.visit(fills[0])
        if res is not None and not self.dintreFuncio:
            if self.outputInter:
                self.writeOutput(str(res))
            else:
                self.writeOutput("Out: {}".format(res))
        return res

    def visitFuncio(self, ctx):
        if not self.instruFunc:
            return
        fills = list(ctx.getChildren())
        func = fills[0].getText()
        params = []
        codi = []
        parsing_params = True
        for f in fills[1:-1]:
            t = f.getText()
            if t == '{':
                parsing_params = False
                continue
            if parsing_params:
                params.append(t)
            else:
                codi.append(f)

        if len(params) != len(set(params)):
            raise Exception(
                "ERROR: es repeteixen parametres en la funcio {}".format(func))

        key = (func, len(params))
        if key in self.funcions.keys():
            raise Exception("ERROR: una versio de la funcio {} amb {} parametres ja existeix".format(
                func, len(params)))
        self.funcions[key] = (params, codi)

    def visitExecfunc(self, ctx):
        fills = list(ctx.getChildren())
        nomFuncio = fills[0].getText()
        if fills[-1].getText() == ';':
            params = [self.visit(param) for param in fills[1:-1]]
        else:
            params = [self.visit(param) for param in fills[1:]]

        key = (nomFuncio, len(params))
        if key not in self.funcions.keys():
            raise Exception("ERROR: funcio {} amb els parametres {} no s'ha trobat".format(
                nomFuncio, len(params)))
        function = self.funcions[key]
        nouContext = {}
        for i in range(key[1]):
            nouContext[function[0][i]] = params[i]
        self.contexts.append(nouContext)
        old_inf = self.dintreFuncio
        self.dintreFuncio = True
        for code_item in function[1]:
            val = self.visit(code_item)
            if val is not None:
                self.contexts.pop(-1)
                self.dintreFuncio = old_inf
                return val
        self.dintreFuncio = old_inf
        self.contexts.pop(-1)

    def visitExprParentesis(self, ctx):
        fills = list(ctx.getChildren())
        return self.visit(fills[1])

    def visitPotencia(self, ctx):
        fills = list(ctx.getChildren())
        v1 = self.visit(fills[0])
        v2 = self.visit(fills[2])
        if v2 < 0:
            expr = "".join([x.getText() for x in fills])
            raise Exception("ERROR: exponenciacio negativa {}".format(expr))
        return v1**v2

    def visitModDivMult(self, ctx):
        fills = list(ctx.getChildren())
        v1 = self.visit(fills[0])
        v2 = self.visit(fills[2])
        if fills[1].getText() == '*':
            return v1 * v2
        elif v2 != 0:
            if fills[1].getText() == '/':
                return v1 // v2
            else:
                return v1 % v2
        else:
            expr = "".join([x.getText() for x in fills])
            raise Exception("ERROR: divisio per 0 {}".format(expr))

    def visitSumaResta(self, ctx):
        fills = list(ctx.getChildren())
        v1 = self.visit(fills[0])
        v2 = self.visit(fills[2])
        if fills[1].getText() == '+':
            return v1 + v2
        else:
            return v1 - v2

    def visitExprVariable(self, ctx):
        fills = list(ctx.getChildren())
        var = fills[0].getText()

        if var not in self.contexts[-1].keys():
            raise Exception(
                "ERROR: desconegut el nom de la variable \"{}\"".format(var))
        return self.contexts[-1][var]

    def visitNumero(self, ctx):
        fills = list(ctx.getChildren())
        return int(fills[0].getText())

    def visitNegatiu(self, ctx):
        fills = list(ctx.getChildren())
        return -self.visit(fills[1])

    def visitExprFuncall(self, ctx):
        fills = list(ctx.getChildren())
        return self.visit(fills[0])

    def visitCond(self, ctx):
        fills = list(ctx.getChildren())
        for condicio in fills:
            cert, v = self.visit(condicio)
            if cert:
                return v
        return None

    def visitIfcond(self, ctx):
        fills = list(ctx.getChildren())
        if self.visit(fills[1]):
            for f in fills[3:-1]:
                v = self.visit(f)
                if self.dintreFuncio and v is not None:
                    return True, v
            return True, None
        return False, None

    def visitElsecond(self, ctx):
        fills = list(ctx.getChildren())
        for f in fills[2:-1]:
            v = self.visit(f)
            if self.dintreFuncio and v is not None:
                return True, v
        return True, None

    def visitBoolParentesis(self, ctx):
        fills = list(ctx.getChildren())
        return self.visit(fills[1])

    def visitNegacio(self, ctx):
        fills = list(ctx.getChildren())
        return not self.visit(fills[0])

    def visitDisjuncio(self, ctx):
        fills = list(ctx.getChildren())
        return self.visit(fills[0]) or self.visit(fills[2])

    def visitUnio(self, ctx):
        fills = list(ctx.getChildren())
        return self.visit(fills[0]) and self.visit(fills[2])

    def visitComparacio(self, ctx):
        fills = list(ctx.getChildren())
        simbol = fills[1].getText()

        if fills[1].getText() == '=':
            return self.visit(fills[0]) == self.visit(fills[2])
        elif fills[1].getText() == '!=':
            return self.visit(fills[0]) != self.visit(fills[2])
        elif fills[1].getText() == '<':
            return self.visit(fills[0]) < self.visit(fills[2])
        elif fills[1].getText() == '>':
            return self.visit(fills[0]) > self.visit(fills[2])
        elif fills[1].getText() == '<=':
            return self.visit(fills[0]) <= self.visit(fills[2])
        elif fills[1].getText() == '>=':
            return self.visit(fills[0]) >= self.visit(fills[2])
        else:
            raise Exception("ERROR: desconegut simbol {}".format(simbol))

    def visitBoolean(self, ctx):
        fills = list(ctx.getChildren())
        res = self.visit(fills[0])
        return res != 0

    def visitTrue(self):
        return True

    def visitFalse(self):
        return False

    def visitBoolVariable(self, ctx):
        fills = list(ctx.getChildren())
        var = fills[0].getText()

        if var not in self.contexts[-1].keys():
            raise Exception(
                "ERROR: desconegut el nom de la variable \"{}\"".format(var))
        return self.contexts[-1][var]

    def visitBucle(self, ctx):
        fills = list(ctx.getChildren())
        while self.visit(fills[1]):
            for f in fills[3:-1]:
                res = self.visit(f)
                if self.dintreFuncio and res is not None:
                    return res

    def visitAssignacio(self, ctx):
        fills = list(ctx.getChildren())
        value = self.visit(fills[2])
        self.contexts[-1][fills[0].getText()] = value

    def getFuncions(self):
        funcions = []
        for key, val in self.funcions.items():
            funcions.append((key[0], " ".join(val[0])))
        return funcions

    def getOutput(self):
        return self.outputs

    def writeOutput(self, text):
        if self.outputInter:
            self.outputs.append(text)
        else:
            print(text)

    def setOutputInter(self, outputInter):
        self.outputInter = outputInter
