grammar funx;

root : bloc EOF;

bloc : (instru | funcio)*;

instru: execfunc 
    | expr
    | cond
    | bucle
    | assignacio
    ;

funcio: FUNCIO (VARIABLE)* '{' (instru)+ '}';

execfunc: FUNCIO expr* ';'?;

expr: '(' expr ')'                        # ExprParentesis
    | <assoc=right> expr '^' expr         # Potencia
    | expr ('%' | '/' | '*') expr         # ModDivMult
    | expr ('+' | '-') expr               # SumaResta
    | VARIABLE                            # ExprVariable
    | NUM                                 # Numero
    | '-' expr                            # Negatiu
    | execfunc                            # Exprfunc
    ;

cond: ifcond elsecond?;
ifcond: 'if' bool '{' instru* '}' ;
elsecond: 'else' '{' instru* '}' ;

bool: '(' bool ')'                        # BoolParentesis
    | 'not' bool                          # Negacio
    | bool 'or' bool                      # Disjuncio
    | bool 'and' bool                     # Unio
    | expr ('=' | '!=' | '<' | '>' | '<=' | '>=') expr #Comparacio
    | expr                                # Boolean
    | 'True'                              # True
    | 'False'                             # False
    | VARIABLE                            # BoolVariable
    ;

bucle: 'while' bool '{' instru* '}' ;

assignacio: VARIABLE '<-' (expr | bool) ;

NUM : [0-9]+;
VARIABLE : [a-z][A-Za-z0-9]* ;
FUNCIO : [A-Z][a-zA-Z0-9]+ ;
STRING: '"' ~["]* '"';

COMENTARI : '#' (~[\n])* '\n' -> skip;
WS : [ \n]+ -> skip;