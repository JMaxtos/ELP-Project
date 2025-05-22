grammar XML;

xql: instructions+;
instructions: init| assign| save;
init: 'load' ARGUMENTO 'to' STRING;
assign: STRING '=' function;
dotX: STRING '.' STRING;
function: dotX
        | dotX ARR                 // Acesso a um índice do Array
        | dotX ARR'.' STRING       // Acesso a um campo do índice do Array
        | dotX '#'                 // Size
        | dotX '->' STRING         // Map
        | dotX '->' STRING '++'    // Incremento
        | xml                      // ficheiro XML
        ;
xml: '***' xmlfile '***';
xmlfile: line;
line:(TAG (VALUE|line+)(ENDTAG))| SELFCLOSINGTAG | SELFCLOSINGTAG_FOREACH |TAGFOREACH (VALUE|line*) ENDTAG;
save: 'save' STRING 'to' ARGUMENTO;

FOREACH: STRING'$'STRING;
ARGUMENTO: '$'[0-9]+;
STRING: [a-z]+;
ARR: '[' [0-9]+ ']';
VAR: '$' STRING;
TAG: '<' (TAGNAME (ATTRIBUTE)*)'>' ;
TAGFOREACH: '<' (FOREACH (ATTRIBUTE)*)'>' ;
SELFCLOSINGTAG_FOREACH: '<' FOREACH (ATTRIBUTE)*'/''>';
SELFCLOSINGTAG: '<' TAGNAME (ATTRIBUTE)*'/''>';
ENDTAG: '<''/'TAGNAME'>';
ATTRIBUTE: ' ' [a-zA-Z_:][a-zA-Z0-9_.:-]* '=' PARAMETER | VAR;
TAGNAME:[a-z]+(('-')?[a-z]+)*;
SPACE: (' ')+->skip;
VALUE:[0-9]+;
PARAMETER: '"' (~["\r\n])* '"' ;
NEWLINE:('\n'|'\r\n'|'\t')->skip;