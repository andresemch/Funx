from funxParser import funxParser
from funxVisitor import funxVisitor

class FunxTreeVisitor(funxVisitor):

    def __init__(self):
        self.nivell = 0
        self.contexts = [{}]
        # functions is a dictionary where the key is
        # the function name and number of arguments of
        # the function and the value is the argument names
        # and code
        self.functions = {}
        # if the program is executing a function things like
        # conditionals or while loops should return the first
        # thing that return a value that they encounter, whereas
        # in the main code conditionals and loops do not return
        # anything
        self.infunction = False
        self.parsing_functions = True
        self.output_to_buffer = False
        self.output_buffer = []

    def visitRoot(self, ctx):
        fills = list(ctx.getChildren())
        self.output_buffer = []
        self.parsing_functions = True
        for f in fills:
            self.visit(f)
        self.parsing_functions = False
        for f in fills:
            self.visit(f)

    def visitInstru(self, ctx): ##
        # if this is not a function declaration, ignore it
        # when parsing functions
        if self.parsing_functions:
            return
        fills = list(ctx.getChildren())
        if len(fills) > 1:
            raise Exception("LANGUAGE ERROR: non atomic statement")
        res = self.visit(fills[0])
        if not self.infunction and res is not None:
            # if the output is for the webpage there is no need
            # to add the word output, as it will be added in
            # the HTML
            if self.output_to_buffer:
                self.writeOutput(str(res))
            else:
                self.writeOutput("Out: {}".format(res))
        return res

    def visitFuncio(self, ctx): ##
        # avoid visiting this element if not parsing functions
        # as functions were already parsed at the beginning
        if not self.parsing_functions:
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
        # check that all parameters are different
        if len(params) != len(set(params)):
            msg = "ERROR: es repeteixen parametres en la funcio {}"
            raise Exception(msg.format(func))

        key = (func, len(params))
        if key in self.functions.keys():
            msg = "ERROR: a version of the function {} with {}\
 parameters already exists"
            raise Exception(msg.format(func, len(params)))
        self.functions[key] = (params, codi)



    def visitExecfunc(self, ctx): ##
        fills = list(ctx.getChildren())
        nomFuncio = fills[0].getText()
        if fills[-1].getText() == ';':
            params = [self.visit(param) for param in fills[1:-1]]
        else:
            params = [self.visit(param) for param in fills[1:]]

        key = (nomFuncio, len(params))
        if key not in self.functions.keys():
            msg = "ERROR: function {} with {} parameters not found"
            raise Exception(msg.format(nomFuncio, len(params)))

        # generate new context with function variables
        function = self.functions[key]
        new_context = {}
        for i in range(key[1]):
            new_context[function[0][i]] = params[i]
        self.contexts.append(new_context)

        # execute function code until something returns a
        # value that is not none, otherwise return none
        old_inf = self.infunction
        self.infunction = True
        for code_item in function[1]:
            val = self.visit(code_item)
            if val is not None:
                self.contexts.pop(-1)
                self.infunction = old_inf
                return val
        self.infunction = old_inf
        self.contexts.pop(-1)


    def visitExprParentesis(self, ctx):
        fills = list(ctx.getChildren())
        return self.visit(fills[1])

    def visitPotencia(self, ctx):
        fills = list(ctx.getChildren())
        v1 = self.visit(fills[0])
        v2 = self.visit(fills[2])
        if v2 < 0:
            expr = "".join([x.getText() for x in childs])
            msg = "ERROR: negative powers are undefined in expr {}"
            raise Exception(msg.format(expr))
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
            msg = "ERROR: division by zero at expr {}"
            raise Exception(msg.format(expr))

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
            msg = "ERROR: desconegut el nom de la variable \"{}\""
            raise Exception(msg.format(var))
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
        # for each if, elseif or else statement
        for condition in fills:
            # if the condition is true, skip the others
            true_cond, value = self.visit(condition)
            if true_cond:
                return value
        return None

    def visitIfcond(self, ctx):
        fills = list(ctx.getChildren())
        if self.visit(fills[1]):
            for f in fills[3:-1]:
                v = self.visit(f)
                if self.infunction and v is not None:
                    return True, v
            # return true to let the conditional statement
            # know that this condition was met
            return True, None
        return False, None

    def visitElsecond(self, ctx):
        fills = list(ctx.getChildren())
        for f in fills[2:-1]:
            v = self.visit(f)
            if self.infunction and v is not None:
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
            msg = "ERROR: desconegut simbol {}"
            raise Exception(msg.format(simbol))

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
            msg = "ERROR: desconegut el nom de la variable \"{}\""
            raise Exception(msg.format(var))
        return self.contexts[-1][var]
    
    def visitBucle(self, ctx):
        fills = list(ctx.getChildren())
        while self.visit(fills[1]):
            for f in fills[3:-1]:
                res = self.visit(f)
                if self.infunction and res is not None:
                    return res
    
    def visitAssignacio(self, ctx):
        fills = list(ctx.getChildren())
        value = self.visit(fills[2])
        self.contexts[-1][fills[0].getText()] = value























    def getFunctions(self):
        # the format is:
        # name of function, parameters
        functions = []
        for key, val in self.functions.items():
            functions.append((key[0], " ".join(val[0])))
        return functions

    def getGlobVars(self):
        # the format is:
        # name of the variable, value
        variables = []
        for name, val in self.contexts[-1].items():
            variables.append((name, str(val)))
        return variables

    def setOutputToBuffer(self, output_to_buffer):
        self.output_to_buffer = output_to_buffer

    def writeOutput(self, text):
        if self.output_to_buffer:
            self.output_buffer.append(text)
        else:
            print(text)

    def getOutputBuffer(self):
        return self.output_buffer
    

    

    
