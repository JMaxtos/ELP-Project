grammar XML;


xql: init atrib+ end+;
init: LOAD ARGUMENTO TO STRING;
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
end: SAVE STRING TO ARGUMENTO;

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
ATTRIBUTE:' '  [a-zA-Z_:][a-zA-Z0-9_.:-]* '='PARAMETER | VAR;
TAGNAME:[a-z]+(('-')?[a-z]+)*;
SPACE: (' ')+->skip;
VALUE:[0-9]+;
PARAMETER: '"' (~["\r\n])* '"' ;
NEWLINE:('\n'|'\r\n'|'\t')->skip;
