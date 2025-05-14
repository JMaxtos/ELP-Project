grammar XML;


xql: init atrib+ end+;
init: LOAD arg TO doc;
arg: ARGUMENTO;
doc: STRING;
atrib: STRING EQUAL func;
func: dotX | dotXArr | dotXArrdot | size | map | biggField | xml;
dotX: STRING DOT STRING;
dotXArr: dotX ARR;
dotXArrdot: dotXArr DOT STRING;
size: dotX HASH;
map: dotX MAP STRING;
biggField: map PP;

xml: START body START;
body: TAG (SPACE)* line+ ENDTAG;
line:(TAG|encapsule) (VALUE)?(ENDTAG)*;
encapsule:TAG (NEWLINE TAG)*;

end: SAVE doc TO arg;

SAVE: 'save';
LOAD: 'load';
TO: 'to';
ARGUMENTO: '$'[0-9]+;
STRING: [a-z]+;
EQUAL: '=';
DOT: '.';
ARR: '[' [0-9]+ ']';
HASH: '#';
MAP: '->';
PP: '++';
VAR: '$' STRING;

START: '***';
TAG: '<' TAGNAME (ATTRIBUTE)* ('/')?'>' ;
ENDTAG: '<''/'TAGNAME'>';
ATTRIBUTE:' ' ATTRIBUTE_NAME '='PARAMETER | VAR;
TAGNAME:[a-z]+(('-')?[a-z]+)*;
ATTRIBUTE_NAME : [a-zA-Z_:][a-zA-Z0-9_.:-]* ;
SPACE: (' ')+->skip;
VALUE:[0-9]+;
PARAMETER: '"' (~["\r\n])* '"' ;
NEWLINE:('\n'|'\r\n'|'\t')->skip;
