#!/usr/bin/env bash

_usage() {
   cat <<USAGE
$0 Script to help in the development of the X+++ language parser

usage: $0 [option]

Options:
    b, build    compiles the code with maven
    t, test     parsers examples of code with the generated parser
    p, package  creates a zip file with all artifacts
    h, help     show this message
USAGE


}

_build() {
    mvn clean compile -q
}

_test() {

    _build

    if [[ ! -d target/log ]]; then
        mkdir -p target/log
    fi

    # List of examples of syntactic and lexical corrects examples of code
    local _samples=(
        src/main/javacc/code/lexical/ok*
        src/main/javacc/code/syntactic/ok*
    )

    # List of examples of syntactic or lexical errors examples of code
    local _error_samples=(
        src/main/javacc/code/lexical/error*
        src/main/javacc/code/syntactic/error*
    )


    echo "TESTING SYNTACTIC AND LEXICAL SAMPLES"
    for sample in "${_samples[@]}"; do
        mvn exec:java -q -Dexec.args="$sample" | tee target/log/"${sample##*/}.log"
    done

    echo "_________________________________________________"

    echo "TESTING SYNTACTIC AND LEXICAL SAMPLES WITH ERRORS"
    for error_sample in "${_error_samples[@]}"; do
        mvn exec:java -q -Dexec.args="$error_sample" | tee target/log/"${error_sample##*/}.log"
    done
}

_package() {
    printf "Preparing package..."
    _test > /dev/null 2>&1
    mvn package -q
    printf "done\n"
    local _artifact_file=(target/*.zip)
    echo "Release artifact available at ${PWD}/${_artifact_file}"
}

case "$1" in
    ("b" | "build") _build ;;
    ("t" | "test") _test ;;
    ("p" | "package") _package ;;
    ("h" | "help" | *) _usage ;;
esac
