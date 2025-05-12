grammar xml;

xml: TAG line+ ENDTAG;
line:(TAG|encapsule) (VALUE)?(ENDTAG)*;
encapsule:TAG (NEWLINE TAG)*;


TAG: '<' [a-z]+(('-')?[a-z]+)* (ATTRIBUTE)* ('/')?'>' ;
ENDTAG: '<''/'[a-z]+(('-')?[a-z]+)*'>';
ATTRIBUTE:' ' ATTRIBUTE_NAME '='PARAMETER;
ATTRIBUTE_NAME : [a-zA-Z_:][a-zA-Z0-9_.:-]* ;
SPACE: (' ')+->skip;
VALUE:[0-9]+;
PARAMETER: '"' (~["\r\n])* '"' ;
NEWLINE:('\n'|'\r\n')->skip;
