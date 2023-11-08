grammar PlayerCommand;

/** the start rule, begin parsing here **/


command : NEWLINE;


NEWLINE:'\r'? '\n' ;     // return newlines to parser (is end-statement signal)