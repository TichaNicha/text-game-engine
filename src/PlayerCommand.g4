grammar PlayerCommand;

// Define a main entry point for the parser
start: command;

// Parser rules
command: exploreCommand | battleCommand;

battleCommand: ' dd';

exploreCommand:
    pickupCommand
    | admireCommand
    | eatCommand
    | wieldCommand
    | openCommand
    | doorCommand
    | exitCommand
    | describeCommand
    | statsCommand
    | helpCommand;

pickupCommand: 'pickup' WORD;
admireCommand: 'admire' WORD;
eatCommand: 'eat' WORD;
wieldCommand: 'wield' WORD;
openCommand: 'open' WORD;
doorCommand: 'door' WORD;
exitCommand: 'exit';
describeCommand: 'describe';
statsCommand: 'stats';
helpCommand: 'help';

// Lexer rules
WORD: .+;

// Skip spaces and tabs
WS: [ \t\r\n]+ -> skip;
NEWLINE: '\r'? '\n'; // return newlines to parser (is end-statement signal)

InvalidCommand: . { $channel = HIDDEN; System.err.close(); } ;
