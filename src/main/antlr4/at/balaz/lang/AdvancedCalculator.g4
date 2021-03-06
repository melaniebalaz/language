grammar AdvancedCalculator;

program     : (statement NEWLINE)+                  #start
            ;

statement   : VARIABLE '=' expression                          # assignment
            | expression                                       # express
            | languageconstruct                                # standardmethods
            ;


function    :'('(VARIABLE (','VARIABLE)*)* ')'':' NEWLINE (statement)+'.'      # declaration
            ;

languageconstruct : 'out: ' ( expression | STRING)                             # print
                  | 'foreach ' VARIABLE 'in ' expression ' do ' expression     # foreach
                  ;

//'do' expression on datacontainer

expression  : '(' expression ')'                    # parens
            | expression '*' expression             # mul
            | expression '/' expression             # div
            | expression '+' expression             # add
            | expression '-' expression             # sub
            | datacontainer                              # data
            | function                                   # func
            | VARIABLE'('(expression (','expression)*)*')' #functionCall
            ;

datacontainer    : NUMBER                                                                # num
                 | VARIABLE                                                              # var
                 | STRING                                                                # string
                 | 'list('(datacontainer(','datacontainer)*)')'                          # list
                 | '('(VARIABLE ':' datacontainer(','VARIABLE ':' datacontainer)*)')'    # dictionary
                 ;


NUMBER      :   DIGIT* '.' DIGIT+
            |   DIGIT+
            ;
VARIABLE    :   CHARACTER+ ;
STRING      :   '"' ([ \t] | CHARACTER)* '"' ;
DIGIT       :   [0-9];
NEWLINE     :   '\r'? '\n' ;
CHARACTER   :   ('a' .. 'z') | ('A' .. 'Z') ;
COMMENT     :   '//' ([ \t] | CHARACTER | NUMBER)* NEWLINE -> skip;
WS          :   [ \t]+ -> skip ;
