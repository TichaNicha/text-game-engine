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

pickupCommand: 'pickup' PICKUP;
admireCommand: 'admire' PICKUP;
eatCommand: 'eat' PICKUP;
wieldCommand: 'wield' PICKUP;
openCommand: 'open' PICKUP;
doorCommand: 'door' INT;
exitCommand: 'exit';
describeCommand: 'describe';
statsCommand: 'stats';
helpCommand: 'help';


PICKUP: WIELDABLE | CONSUMABLE | OPENER | VALUABLE | OPENABLE;
WIELDABLE: 'axe' | 'fistsoffury' | 'sword';
CONSUMABLE: VALUABLE | FOOD;
VALUABLE: 'chalice' | 'moneybag' | 'ring' | 'coin' | 'goldbars' | 'jewel' | 'mobile';
FOOD: 'mead' | 'roastboar' | 'bread';
OPENER: 'key' | 'lockpick';
OPENABLE: 'warchest' | 'treasurechest';

// Lexer rules
WORD: [a-zA-Z]+;
INT: [0-9]+;

// Skip spaces and tabs
WS: [ \t\r\n]+ -> skip;
NEWLINE: '\r'? '\n'; // return newlines to parser (is end-statement signal)

// Define error handling for invalid commands
InvalidCommand: . {System.err.println("Invalid command. Please enter a valid command.");};
