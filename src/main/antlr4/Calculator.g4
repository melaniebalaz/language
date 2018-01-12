grammar Calculator;

expression  : '(' expression ')'                    # parens
            | expression op=('*' | '/') expression  # mulDiv
            | expression op=('+' | '-') expression  # addSub
            | NUMBER                                # num
            ;

NUMBER  :   DIGIT* '.' DIGIT+
        |   DIGIT+
        ;
DIGIT   :   [0-9];
WS      :   [\r\n \t]+ -> skip
        ;
