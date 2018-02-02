grammar AdvancedCalculator;

program     : (statement NEWLINE)+                  #start
            ;

statement   : expression                            # operation
            | VARIABLE '=' ( expression | STRING)   # assignment
            | 'out' ':' ( expression | STRING)      # print
            ;



expression  : '(' expression ')'                    # parens
            | expression op=('*' | '/') expression  # mulDiv
            | expression op=('+' | '-') expression  # addSub
            | NUMBER                                # num //expression can be a number
            | VARIABLE                              # var //Expression can be a variable
            | STRING                                # string
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
