grammar GameMap;

gamemap: room* connections;
room: 'room' ID pickupContents? openableContents? monsters? roomType?;

connections: connection+;
connection: 'room' ID 'connects' 'to' ID (',' ID)*;

pickupContents: 'contains' pickupList;
pickupList: PICKUP (',' PICKUP)*;
openableContents: 'contains' OPENABLE_TYPE 'with' pickupList;
OPENABLE_TYPE: 'warchest' | 'treasurechest';
monsters: 'contains' monsterList;
roomType: 'is' ROOMTYPE;
ID: [0-9];
PICKUP: WIELDABLE | CONSUMABLE | OPENER | VALUABLE;
WIELDABLE: 'axe' | 'fistsoffury' | 'sword';
CONSUMABLE: VALUABLE | FOOD;
VALUABLE: 'chalice' | 'moneybag' | 'ring' | 'coin' | 'goldbars' | 'jewel' | 'mobile';
FOOD: 'mead' | 'roastboar' | 'bread';
OPENER: 'key' | 'lockpick';
MONSTER: 'dragon' | 'ogre' | 'zombie';
ROOMTYPE: 'exit';
monsterList: MONSTER (',' MONSTER)*;
WS: [ \t\r\n]+ -> skip;
COMMENT: '//' ~[\r\n]* -> skip;
ERR: . -> skip;
NEWLINE: '\r'? '\n';
