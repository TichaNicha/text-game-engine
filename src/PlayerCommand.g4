grammar PlayerCommand;

// Define a main entry point for the parser
start: command;

// Parser rules
command: exploreCommand | battleCommand;

exploreCommand:
    commonCommands
    | describeCommand
    | statsCommand
    | pickupCommand
    | admireCommand
    | eatCommand
    | wieldCommand
    | openCommand
    | doorCommand
    | exitCommand;

battleCommand:
    commonCommands
    | attackCommand;

commonCommands:
    helpCommand
    | wieldCommand;

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

attackCommand: 'attack' WORD; // Added for battle mode

// Lexer rules
WORD: ~[ \t\r\n]+;

// Skip spaces and tabs
WS: [ \t\r\n]+ -> skip;
NEWLINE: '\r'? '\n'; // return newlines to parser (is end-statement signal)
