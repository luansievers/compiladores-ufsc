# Analisador SIntático X+++ PARTE 1

- Fazer as alterações necessárias no arquivo langX.jj de acordo com as especificações da linguagem X+++ no grafo de sintaxe postado no moodle
- Incluir as demais alterações definidas no enunciado do analisador lexico:
    - Possibilidade de inicializar uma variável fora de qualquere método
    - Operadores lógicos AND, OR, XOR e NOT
    - Expressões lógicas com estes operadores
    - Uso de expressoes lógicas nos contextos adequados
    - Novos tipos de variáveis e literais: BYTE, SHORT, LONG e FLOAT, além dos já existentes
    - Qualificadores de identificadores: FINAL, PUBLIC, PRIVATE e PROTECTED, como usado em Java
- Gerar com o JavaCC o analisador sintático para a linguagem X+++
- Compilar o arquivo gerado
- Criar  programas exemplo em linguagem X+++ para testar TODAS as estruturas sintáticas da linguagem, sendo um deles com erros sintáticos
- Submeter cada um dos programas ao analisador sintático criado gerando os arquivos de saída (usar o recurso debug_AS em um deles)

| Item  | Peso | Desc | Nota |
| ----- | ---- | ---- | ---- |
|Entrega completa: Arquivo langX+++.jj, Arquivos fonte, arquivos .class, exemplos, LOGs|0,5|ok|0,5|
|Compilação do arquivo langX+++	|0,5|ok|0,5|
|Compilação dos arquivos Java	|0,5|ok|0,5|
|compilação exemplo sem erros	|1|ok|1|
|compilação exemplo com erros	|0,5|ok|0,5|
|Uso dos comandos do, while, Switch, case, default, break	|1|ok|0,5|
|Uso de variáveis e literais com tipos double, char e boolean	|1|não testou|0,5|
|Inicialização de variáveis	|1|não testou|0,5|
|Expressões com chamadas de métodos e chamadas de métodos como statment	|1|não testou|0,5|
|Uso dos operadores lógicos AND, OR, XOR e NOT em expressões	|1|não testou|0,5|
|Uso de variáveis e literais com os tipos BYTE, SHORT, LONG e FLOAT	|1|não testou|0,5|
|Uso dos qualificadores FINAL, PUBLIC, PRIVATE e PROTECTED	|1|não testou|0,5|
|*Anotações*|Compilador testado com exemplo de outro grupo mostrou funicionalidades não testadas foram contempladas na gramática. FAVOR TESTAR COMPLETAMENTE NA PROXIMA ENTREGA|
|**TOTAL**|10| |6,5|
