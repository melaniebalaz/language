grammar AdvancedCalculator;

program     : (statement NEWLINE)+                  #start
            ;

statement   : VARIABLE '=' ( expression | STRING | function)   # assignment
            | function                                         # func
            | expression                                       # express
            ;


function    : 'out'':' ( expression | STRING)                         # print
            | 'foreach ' VARIABLE 'in ' expression ' do ' expression   # foreach
            ;

//'do' expression on datacontainer

expression  : '(' expression ')'                    # parens
            | expression op=('*' | '/') expression  # mulDiv
            | expression op=('+' | '-') expression  # addSub
            | datacontainer                              # data
            ;

datacontainer    : NUMBER                                          # num
                 | VARIABLE                                        # var
                 | STRING                                          # string
                 | 'list('(datacontainer(','datacontainer)*)')'    # list
                 ;


NUMBER      :   DIGIT* '.' DIGIT+
            |   DIGIT+
            ;
VARIABLE    :   CHARACTER+ ;
STRING      :   '"' ([ \t] | CHARACTER)* '"' ;
DIGIT       :   [0-9];
NEWLINE     :   '\r'? '\n' ;
CHARACTER   :   ('a' .. 'z') | ('A' .. 'Z') ;
WS          :   [ \t]+ -> skip ;
