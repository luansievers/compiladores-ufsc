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

- Possibilidade de inicializar uma variável fora de qualquer método;
- Operadores lógicos AND, OR, XOR e NOT;
- Expressões lógicas com estes operadores;
- Uso de expressoes lógicas nos contextos adequados;
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