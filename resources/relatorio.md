# Relatório de atividade

Alunos: Bruno Ribeiro da Silva (12200992), Djéssica Schell Crocetta (12203762), Luan Felipe Sievers (12204515)

---

## Atribuições

Bruno responsável por xyz, Luan foi encarregado de xyz, Djéssica responsável pelo relatório.

--------- Aqui vai um print do git log ------

## Especificação léxica da linguagem X+++ 
(A especificação léxica de uma linguagem é uma sequência de regras, onde cada regra é composta de uma expressão regular e um tipo de token)

Ex?:

| Token  	| Regra                       	|
|--------	|-----------------------------	|
| INT    	| (["0"-"9"] (["0"-"9"])* ) | ...	|
| FLOAT  	|                             	|
| STRING 	|                             	|
| NULL   	|                             	|
|        	|                             	|

(Adicionar a parte corrigida)



Nos trecho de código abaixo, estão exemplificados as alterações implantadas para a linguagem X+++:

##### Operadores lógicos AND, OR, XOR e NOT:

```X+++
/* Operadores */
TOKEN : {

    [...]

    // Operadores lógicos
    < AND: "&&" > |
    < OR: "||" > |
    < XOR: "^" > |
    < NOT: "!" >
}

``` 
##### Qualificadores de identificadores: FINAL, PUBLIC, PRIVATE e PROTECTED:
``` X+++
/* Palavras reservadas */
TOKEN : {

    [...]
    
    // Qualificadores de identificadores
    < FINAL: "final" > |
    < PUBLIC: "public" > |
    < PRIVATE: "private" > |
    < PROTECTED: "protected" > |

    [...]
}
```
##### Novos tipos de variáveis e literais: BYTE, SHORT, LONG e FLOAT:
``` X+++

/* Palavras reservadas */
TOKEN : {

    [...]

    // Novos tipos de variáveis e literais
    < BYTE: "byte" > |
    < SHORT: "short" > |
    < LONG: "long" > |
    < FLOAT: "float" >
}

[...]

/* constantes */
TOKEN : {
    
    [...]
 
    < byte_constant: ("-")? (<DIGIT> (<DIGIT>)? | ( ["1"]["0"-"1"] ["0"-"9"]) (["1"] ["0"-"2"] ["0"-"7"])) >
    |

    < short_constant: ("-")? ((<DIGIT> (<DIGIT>)? (<DIGIT>)? (<DIGIT>)?) |
                            (["1"-"2"] <DIGIT> <DIGIT> <DIGIT> <DIGIT>) |
                            (["3"] ["0"-"1"] <DIGIT> <DIGIT> <DIGIT>) |
                            (["3"] ["2"] ["0"-"6"] <DIGIT> <DIGIT>) |
                            (["3"] ["2"] ["7"] ["0"-"5"] <DIGIT>) |
                            (["3"] ["2"] ["7"] ["6"] ["0"-"7"])) >
    |

    < long_constant: <DIGIT> (<DIGIT>)* ("l" | "L") >
    |

    < float_constant: (
                     <int_constant> "."
                    ( <int_constant> ( ("e" | "E")? ("-")? <int_constant> )? )? |
                    (<int_constant>)? "." <int_constant>
                    (("e" | "E")? ("-")? <int_constant>)? ) ("F" | "f")?
                    >

}

```
