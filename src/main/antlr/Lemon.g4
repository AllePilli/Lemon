grammar Lemon;

/* Lexical Rules */

IF          : 'if';
ELSEIF      : 'else if';
ELSE        : 'else';

AND         : 'and';
OR          : 'or';

TRUE        : 'true';
FALSE       : 'false';

MULT        : '*' ;
DIV         : '/' ;
PLUS        : '+' ;
MINUS       : '-' ;

GT          : '>' ;
GE          : '>=' ;
LT          : '<' ;
LE          : '<=' ;
EQ          : '==' ;
NE          : '!=';

FLOAT       : '-'?[0-9]+('.'[0-9]+)?;
INT         : '-'?[1-9]([0-9]+);
STR         : '"' ~('\r' | '\n' | '"')* '"';

TYPE        : 'int'|'string';

IDENTIFIER  : [a-zA-Z_][a-zA-Z_0-9]*;

LPAREN      : '(';
RPAREN      : ')';
LBRACKET    : '{';
RBRACKET    : '}';
SEMI        : ';';

// COMMENT and WS are stripped from the output token stream by sending to a different channel 'skip'

COMMENT     : '//' .+? ('\n'|EOF) -> skip;

WS          : [ \r\t\u000C\n]+ -> skip;

/* Grammar Rules */

rule_set    : single_rule* EOF;

single_rule : (declaration | show | if_s)SEMI?;

if_s        : IF condition LBRACKET conclusion RBRACKET (else_if_s)* (else_s)?;
else_if_s   : ELSEIF condition LBRACKET conclusion RBRACKET;
else_s      : ELSE LBRACKET conclusion RBRACKET;

condition   : logical_expression;
conclusion  : single_rule*;

logical_expression
    : logical_expression AND logical_expression # LogicalExpressionAnd
    | logical_expression OR logical_expression  # LogicalExpressionOr
    | comparison_expression                     # ComparisonExpression
    | LPAREN logical_expression RPAREN          # LogicalExpressionInParen
    | logical_entity                            # LogicalEntity
    ;

comparison_expression
    : comparison_operand comp_operator comparison_operand   # ComparisonExpressionWithOperator
    | LPAREN comparison_expression RPAREN                   # ComparisonExpressionParens
    ;

comparison_operand  : arithmetic_expression;

comp_operator       : GT | GE | LT | LE | EQ | NE;

arithmetic_expression
    : arithmetic_expression MULT arithmetic_expression  # ArithmeticExpressionMult
    | arithmetic_expression DIV arithmetic_expression   # ArithmeticExpressionDiv
    | arithmetic_expression PLUS arithmetic_expression  # ArithmeticExpressionPlus
    | arithmetic_expression MINUS arithmetic_expression # ArithmeticExpressionMinus
    | MINUS arithmetic_expression                       # ArithmeticExpressionNegation
    | LPAREN arithmetic_expression RPAREN               # ArithmeticExpressionParens
    | numeric_entity                                    # ArithmeticExpressionNumericEntity
    ;

logical_entity
    : (TRUE|FALSE)  # LogicalConst
    | IDENTIFIER    # LogivalVariable
    ;

numeric_entity
    : (FLOAT|INT)   # NumericConst
    | IDENTIFIER    # NumbericVariable
    ;

declaration : TYPE IDENTIFIER '=' (FLOAT|INT|STR);
show        : 'show' (FLOAT|INT|STR|IDENTIFIER);