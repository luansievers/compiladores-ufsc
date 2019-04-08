# Analisador Léxico X+++

Implementar, utilizando a ferramenta JavaCC, um analisador léxico capaz de reconhecer os tokens da linguagem X++, tomando como ponto de partida a especificação da linguagem X+++ 2017-2, disponível no Moodle, acrescida das seguintes extensões (conforme usado em JAVA):


- Possibilidade de inicializar uma variável fora de qualquere método
- Operadores lógicos AND, OR, XOR e NOT
- Expressões lógicas com estes operadores
- Uso de expressoes lógicas nos contextos adequados
- Novos tipos de variáveis e literais: BYTE, SHORT, LONG e FLOAT, além dos já existentes
- Qualificadores de identificadores: FINAL, PUBLIC, PRIVATE e PROTECTED, como usado em Java

Apresentar um relatório contendo:

1. A especificação léxica da linguagem utilizada como arquivo de entrada da ferramenta JavaCC,
2. O código fonte das classes geradas em Java pela ferramenta javaCC,
3. Os arquivos .class gerados pelo compilador java a partir do código fonte gerado pelo JavaCC, 
4. Pelo menos dois arquivos com programas fonte escritos na linguagem X+++ contendo todos os recursos léxicos da linguagem (um exemplo sem erros léxicos e outro com alguns erros léxicos). Os exemplos devem ser completos contendo todos os recursos da linguagem.
5. Os arquivos com os LOGs gerados pelo analisador léxico, referente aos programas de teste em X+++ com a listagem dos tokens reconhecidos pelo programa

Postar todos os arquivos no moodle em um arquivo compactado (.ZIP).

A execução do trabalho será feito em grupos e acompanhada nas aulas no laboratório, considerando a participação de todos os alunos do grupo.

| Item  | Peso | Desc | Nota |
| ----- | ---- | ---- | ---- |
|Entrega completa: Arquivo langX+++.jj, Arquivos fonte, arquivos .class, exemplos, LOGs|0,5|ok|0,5| 
|Compilação do arquivo langX+++|0,5|ok|0,5|
|Compilação dos arquivos Java|0,5|ok|0,5|
|compilação exemplo sem erros|0,5|ok|0,5|
|compilação exemplo com erros|1|ok|1|
|Tipos char, boolean e double|1|ok para char|0,66|
|Comandos do, while, Switch, case, default|1|ok|1|
|Literais Double, char e boolean|1|ok para char mas aceita coisas erradas|0,2|
|Uso de underscore nos identificadores|1|ok|1|
|Operadores lógicos AND, OR, XOR e NOT|1|Não apresentaram exemplos|0,5|
|Tipos BYTE, SHORT, LONG e FLOAT|1|Ok para float|0,7|
|Qualificadores FINAL, PUBLIC, PRIVATE e PROTECTED|1|Não apresentaram exemplos|0,5|
|*Anotações*||Alterei exemplo para testar|Acho que a gramática está ruim. Eles aceitam char como "hoihoh"|
|**TOTAL**|**10**| |**7,56**|
