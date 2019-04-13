package symtable;


// entrada utilizada para declarar os tipos básicos da linguagem
public class EntrySimple extends EntryTable {
    public EntrySimple(String n) {
        name = n;
    }

    public String dscJava() // devolve descritor de tipo
     {
        if (name.equals("int")) {
            return "I";
        } else if (name.equals("float")) {
            return "F";
        } else if (name.equals("char")) {
            return "C";
        } else if (name.equals("double")) {
            return "D";
        } else if (name.equals("boolean	")) {
            return "Z";
        } else {
            return "Ljava/lang/String;"; // classe String JAVA
        }
    }
}
