grammar AdvancedCalculator;

// TODO Erweitern Sie die Grammatik

// Ein Programm besteht aus vielen Statements
// Ein Statement pro Zeile
// Ein Statement kann sein
// Eine Zuweisung (t = …)
// Eine Expression (1 + 2 * s / u - 1)

statement   : expression                            # operation
            | VARIABLE '=' expression               # assignment
            ;

expression  : '(' expression ')'                    # parens
            | expression op=('*' | '/') expression  # mulDiv
            | expression op=('+' | '-') expression  # addSub
            | NUMBER                                # num //expression can be a number
            | VARIABLE                              # var //Expression can be a variable
            ;

program     : // ...
            ;

NUMBER      :   DIGIT* '.' DIGIT+
            |   DIGIT+
            ;
VARIABLE    :   CHARACTER+ ;
DIGIT       :   [0-9];
NEWLINE     :   '\r'? '\n' ;
CHARACTER   :   ('a' .. 'z') | ('A' .. 'Z') ;
WS          :   [ \t]+ -> skip ;
