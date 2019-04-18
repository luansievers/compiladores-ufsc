# Introdução a Compiladores

Projeto para trabalhos da disciplina INE5622-06238 (20191) - Introdução a Compiladores.

---

Observações gerais:

- Trabalho deve ser executado em no máximo 4 estudantes da disciplina.
- Todas as codificações devem JavaCC e Java.
- Duas ou mais equipes com trabalhos total ou parcialmente iguais receberão nota 0.

---

## Enunciado da primeira atividade

Para cumprir o trabalho, a equipe deve implementar o analisador léxico capaz de reconhecer os tokens da linguagem X++ especificado no Capítulo 3 do [livro](resources/livro.pdf) Delamaro (2004) utilizando JavaCC, adicionando as seguintes extensões (conforme usado na linguagem JAVA):

- Operadores lógicos AND, OR, XOR e NOT;
- Novos tipos de variáveis e literais: BYTE, SHORT, LONG e FLOAT, além dos já existentes;
- Qualificadores de identificadores: FINAL, PUBLIC, PRIVATE e PROTECTED, como usado em Java.

Apresentar um [relatório](resources/relatorio_1.md) contendo os seguintes itens devidamente comentados:

- Nome e código de matrícula de todos os integrantes das equipes;
- Ao lado de cada nome, determinar qual o papel de cada integrante no trabalho;
- A especificação léxica da linguagem utilizada como arquivo de entrada da ferramenta JavaCC.

Entregar em anexo ao relatório:

- O código fonte das classes geradas em Java pela ferramenta JavaCC;
- Os arquivos .class gerados pelo compilador java a partir do código fonte gerado pelo JavaCC;
- Pelo menos dois arquivos com programas fonte escritos na linguagem X+++ contendo todos os recursos léxicos da linguagem (um exemplo sem erros léxicos e outro com alguns erros léxicos). Os exemplos devem ser completos contendo todos os recursos da linguagem.
- Os arquivos com os LOGs gerados pelo analisador léxico, referente aos programas de teste em X+++ com a listagem dos tokens reconhecidos pelo programa.

A entrega deve ser realizada no MOODLE por um dos integrandes da equipe em um arquivo compactado (.ZIP).

## Compilando o projeto

A especificação da linguagem que atenderá aos requisitos do enunciado será feita no arquivo [langX++.jj](src/main/javacc/parser/langX.jj). Além da especificação da linguagem, será necessário desenvolver dois exemplos de código da linguagem X+++: um [com erro](src/main/javacc/code/exemplo_erro_lexico.x) e outro [sem erro](src/main/javacc/code/exemplo_lexico.x). 

Para gerar os arquivos *.java e *.class da especificação, executar o comando abaixo:

```bash
mvn compile
```

A validação da especificação deve ser feita utilizando os arquivos da linguagem X+++. Executar o teste com os códigos abaixo, para que além da execução também sejam salvos os arquivos de log, que também deverão ser entregues:

```bash
# Arquivo léxicamente correto, última linha do log deverá ser "Program successfully analyzed."
mvn exec:java '-Dexec.args="src/main/javacc/code/exemplo_lexico.x"' -q --log-file target/exemplo_lexico.log

# Arquivo com erro léxico, última linha do log deverá ser diferente de "Program successfully analyzed."
mvn exec:java '-Dexec.args="src/main/javacc/code/exemplo_erro_lexico.x"' -q --log-file target/exemplo_erro_lexico.log
```

## Preparando o arquivo de entrega

Para preparar o arquivo de entrega, executar os comandos Maven de compilação e teste, para que sejam gerados todos os arquivos. Além disso, converter o [arquivo de relatorio](resoucers/relatorio.md) de Markdown para PDF, salvando na pasta resources com o nome relatorio.pdf. Por último, executar o comando abaixo: 

```bash
# Prepara o arquivo para ser enviado no Moodle
mvn package
```

Será gerado na pasta target o arquivo compiladores_bruno_djessica_luan.zip com a seguinte estrutura:

```text
├── class
├── code
├── java
├── jj
└── log
relatorio.pdf
```

O conteúdo de cada pasta:

- class: arquivos class da linguagem;
- code: arquivos da linguagem X+++;
- java: arquivos Java gerados a partir da especificação;
- jj: especificação da linguagem X++;
- log: arquivos de logs dos testes do gerador com os exemplos da linguagem X+++;

## Referências

- [Generating Lexical Analyser and Parser with JavaCC](https://www.youtube.com/watch?v=UMXF14KV038)
- [How to work with maven javacc plugin](https://ivanursul.com/how-to-work-with-maven-javacc-plugin)
- [Filtering Some Distribution Files](https://maven.apache.org/plugins/maven-assembly-plugin/examples/single/filtering-some-distribution-files.html)
