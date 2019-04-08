# Analisador SIntático X+++ PARTE 2

- Fazer as alterações necessárias no arquivo langX.jj de acordo com as especificações da linguagem X+++ postada no moodle para que o analisador sintático possa realizar o tratamento de erros baseado no modo pânico a partir de conjunto de tokens de sincronização para cada símbolo não terminal construído como o FIRST e FOLLOW de cada não terminal
- Gerar com o JavaCC nova versão do analisador sintático para a linguagem X+++ com o tratamento de erros
- Compilar o arquivo gerado
- Criar programas exemplo em linguagem X+++ para testar todas as estruturas sintáticas da linguagem, sendo um deles com vários erros sintáticos no mesmo programa
- Submeter cada um dos programas ao analisador sintático criado gerando os arquivos de saída. O analisador deve detectar os vários erros de um mesmo programa e emitir a mensagem adequada.
- Criar um arquivo compactado com todos os arquivos e postar no moodle
- Arquivo .jj, arquivo .java arquivo .class do analisador léxico
- Arquivos dos programas fonte em X+++ usados nos testes e os logs gerados na análise sintática deles


| Item  | Peso | Desc | Nota |
| ----- | ---- | ---- | ---- |
|Entrega completa: Arquivo langX+++.jj, Arquivos fonte, arquivos .class, exemplos, LOGs|0,5|ok|0,5| 
|Compilação do arquivo langX+++|0,5|ok|0,5|
|Compilação dos arquivos Java|0,5|ok|0,5|
|compilação exemplo|0,5|ok|0,5|
|alterações no arquivo LangX.jj|3,5|faltou incluir os qualificadores PUBLIC PRIVATE, PROTECTED em clasdecl, construcdecl, methoddecl. Faltou methodcall em statment. Faltou XOR e NOT [1]|2,0|
|Altererações no arquivo First (RecoverySet)|2,5|faltou incluir os qualificadores PUBLIC PRIVATE, PROTECTED e FINAL	[2]|2,0|
|Exemplos e testes apresentados|2,0|incompleto|1,5|
|*Anotações*||||
|**TOTAL**|**10**| |**7,5**|





- [1]  `classdecl	[ | | ]
classbody	atribstat
vardecl	[ | | ]
primitivetype
constructdecl	[ | | ]
methoddecl	[ | | ]
primitivetype
RecoverySet f1 = new RecoverySet(LBRACKET).union(g)
RecoverySet f2 = new RecoverySet(IDENT).union(f1);
methodbody	 
paramlist	primitivetype(f1)
RecoverySet f1 = new RecoverySet(IDENT).union(g);
statement	dowhilestat(f1)
whilestat(g)
switchstat(g)
methodcall(f1)
methodcall	RecoverySet f1 = new RecoverySet(RPAREN).union(g)
atribstat	logicexpression(g)
printstat	logicexpression(g)
returnstat	logicexpression(g)
whilestat	RecoverySet f1 = new RecoverySet(RPAREN).union(g);
dowhilestat	RecoverySet f1 = new RecoverySet(LPAREN).union(g)
RecoverySet f2 = new RecoverySet(RPAREN).union(g);
switchstat	RecoverySet f1 = new RecoverySet(RBRACE).union(g);
RecoverySet f2 = First.switchcasestat.union(f1);
switchcasestat	switchstat(RecoverySet g)
alocexpression	 primitivetype(f3)
f3 = new RecoverySet(LBRACKET).union(g)
logicexpression	RecoverySet f1 = new RecoverySet(XOR).union(g);
RecoverySet f2 = new RecoverySet(OR).union(f1);
RecoverySet f3 = new RecoverySet(AND).union(f2);
unaryexpr	RecoverySet f3 = new RecoverySet(AND).union(f2);
factor()	|
|
|
|
|
|
|
methodcall(null)
primitivetype`
 
- [2] `methoddecl	BOOLEAN		
CHAR
DOUBLE
BYTE
SHORT
LONG
FLOAT
PUBLIC
PRIVATE
PROTECTED
FINAL
vardecl	BOOLEAN
CHAR
DOUBLE
BYTE
SHORT
LONG
FLOAT
PUBLIC
PRIVATE
PROTECTED
FINAL
classlist	PUBLIC
PRIVATE
PROTECTED
constructdecl	PUBLIC
PRIVATE
PROTECTED
statlist	DO
WHILE
SWITCH`
	
Anotações	 	 	 	 
TOTAL	10,0	7,5
