# ERROS
mvn exec:java '-Dexec.args="src/main/javacc/code/lexico/exemplo_erro.x"' -q --log-file target/exemplo_erro_lexico.log
# TODO
mvn exec:java '-Dexec.args="src/main/javacc/code/sintatico/exemplo_erro.x"' -q --log-file target/exemplo_erro_sintatico.log

mvn exec:java '-Dexec.args="src/main/javacc/code/samples/atribstat.x"'  -q --log-file target/atribstat.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/bintree-erro-lexico.x"'  -q --log-file target/bintree-erro-lexico.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/bintree-erro-sintatico.x"'  -q --log-file target/bintree-erro-sintatico.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/classbody.x"' -q --log-file target/classbody.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/classbody2.x"' -q --log-file target/classbody2.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/classdecl.x"' -q --log-file target/classdecl.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/empty.x"' -q --log-file target/empty.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/expression.x"' -q --log-file target/expression.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/matriz.x"' -q --log-file target/matriz.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/methodbody.x"' -q --log-file target/methodbody.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/methoddecl.x"' -q --log-file target/methoddecl.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/paramlist.x"' -q --log-file target/paramlist.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/program.x"' -q --log-file target/program.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/statement2.x"' -q --log-file target/statement2.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/vardecl.x"' -q --log-file target/vardecl.log


# CORRETOS
mvn exec:java '-Dexec.args="src/main/javacc/code/lexico/exemplo.x"' -q --log-file target/exemplo_lexico.log
# TODO
mvn exec:java '-Dexec.args="src/main/javacc/code/sintatico/exemplo.x"' -q --log-file target/exemplo_sintatico.log

mvn exec:java '-Dexec.args="src/main/javacc/code/samples/bintree-with-main.x"' -q --log-file target/bintree-with-main.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/bintree.x"' -q --log-file target/bintree.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/coercao.x"' -q --log-file target/coercao.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/debugAS.x"' -q --log-file target/debugAS.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/SClass.x"'  -q --log-file target/SClass.log
mvn exec:java '-Dexec.args="src/main/javacc/code/samples/statement.x"' -q --log-file target/statement.log











