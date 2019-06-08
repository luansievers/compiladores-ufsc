#!/usr/bin/env bash

# List of examples of syntactic and lexical corrects examples of code
_samples=(
    "src/main/javacc/code/lexico/exemplo.x"
    "src/main/javacc/code/samples/SClass.x"
    "src/main/javacc/code/samples/bintree-with-main.x"
    "src/main/javacc/code/samples/bintree.x"
    "src/main/javacc/code/samples/coercao.x"
    "src/main/javacc/code/samples/debugAS.x"
    "src/main/javacc/code/samples/statement.x"
    "src/main/javacc/code/sintatico/exemplo.x"
)

# List of examples of syntactic or lexical errors examples of code
_error_samples=(
    "src/main/javacc/code/lexico/exemplo_erro.x"
    "src/main/javacc/code/samples/atribstat.x"
    "src/main/javacc/code/samples/bintree-erro-lexico.x"
    "src/main/javacc/code/samples/bintree-erro-sintatico.x"
    "src/main/javacc/code/samples/classbody.x"
    "src/main/javacc/code/samples/classbody2.x"
    "src/main/javacc/code/samples/classdecl.x"
    "src/main/javacc/code/samples/empty.x"
    "src/main/javacc/code/samples/expression.x"
    "src/main/javacc/code/samples/matriz.x"
    "src/main/javacc/code/samples/methodbody.x"
    "src/main/javacc/code/samples/methoddecl.x"
    "src/main/javacc/code/samples/paramlist.x"
    "src/main/javacc/code/samples/program.x"
    "src/main/javacc/code/samples/statement2.x"
    "src/main/javacc/code/samples/vardecl.x"
    "src/main/javacc/code/sintatico/exemplo_err.x"
)

mvn clean compile -q

echo "TESTING SYNTACTIC AND LEXICAL SAMPLES"
for sample in "${_samples[@]}"; do
    mvn exec:java -q -Dexec.args="$sample"
done

echo "_________________________________________________"

echo "TESTING SYNTACTIC AND LEXICAL SAMPLES WITH ERRORS"
for error_sample in "${_error_samples[@]}"; do
    mvn exec:java -q -Dexec.args="$error_sample"
done
