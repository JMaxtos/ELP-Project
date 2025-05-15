grammar XML;


xql: init assign+ end;
init: 'load' ARGUMENTO 'to' STRING;
assign: STRING '=' function;
dotX: STRING '.' STRING;
function: dotX
        | dotX ARR
        | dotX ARR '.' STRING
        | dotX '#'
        | dotX '->' STRING
        | dotX '->' STRING '++'
        | xml
        ;

xml: '***' line* '***';
line:(TAG (VALUE|line*)(ENDTAG)* )| SELFCLOSINGTAG | SELFCLOSINNGTAG_FOREACH |TAGFOREACH;
end: 'save' STRING 'to' ARGUMENTO;

FOREACH: STRING'$'STRING;
ARGUMENTO: '$'[0-9]+;
STRING: [a-z]+;
ARR: '[' [0-9]+ ']';
VAR: '$' STRING;
TAG: '<' (TAGNAME (ATTRIBUTE)*)'>' ;
TAGFOREACH: '<' (FOREACH (ATTRIBUTE)*)'>' ;
SELFCLOSINNGTAG_FOREACH: '<' FOREACH (ATTRIBUTE)*'/''>';
SELFCLOSINGTAG: '<' TAGNAME (ATTRIBUTE)*'/''>';
ENDTAG: '<''/'TAGNAME'>';
ATTRIBUTE:' '  [a-zA-Z_:][a-zA-Z0-9_.:-]* '='PARAMETER | VAR;
TAGNAME:[a-z]+(('-')?[a-z]+)*;
SPACE: (' ')+->skip;
VALUE:[0-9]+;
PARAMETER: '"' (~["\r\n])* '"' ;
NEWLINE:('\n'|'\r\n'|'\t')->skip;

