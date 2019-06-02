package recovery;

import parser.*;

import java.util.*;


public class First { //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet methoddecl = new RecoverySet();
    static public final RecoverySet vardecl = new RecoverySet();
    static public final RecoverySet classlist = new RecoverySet();
    static public final RecoverySet constructdecl = new RecoverySet();
    static public final RecoverySet statlist = new RecoverySet();
    static public final RecoverySet program = classlist;

    static {
        methoddecl.add(new Integer(langXConstants.INT));
        methoddecl.add(new Integer(langXConstants.STRING));
        methoddecl.add(new Integer(langXConstants.IDENT));
        methoddecl.add(new Integer(langXConstants.BYTE));
        methoddecl.add(new Integer(langXConstants.SHORT));
        methoddecl.add(new Integer(langXConstants.LONG));
        methoddecl.add(new Integer(langXConstants.FLOAT));
        methoddecl.add(new Integer(langXConstants.PUBLIC));
        methoddecl.add(new Integer(langXConstants.PRIVATE));
        methoddecl.add(new Integer(langXConstants.PROTECTED));
        methoddecl.add(new Integer(langXConstants.FINAL));

        vardecl.add(new Integer(langXConstants.INT));
        vardecl.add(new Integer(langXConstants.STRING));
        vardecl.add(new Integer(langXConstants.IDENT));
        vardecl.add(new Integer(langXConstants.BYTE));
        vardecl.add(new Integer(langXConstants.SHORT));
        vardecl.add(new Integer(langXConstants.LONG));
        vardecl.add(new Integer(langXConstants.FLOAT));
        vardecl.add(new Integer(langXConstants.PRIVATE));
        vardecl.add(new Integer(langXConstants.PUBLIC));
        vardecl.add(new Integer(langXConstants.PROTECTED));
        vardecl.add(new Integer(langXConstants.FINAL));

        classlist.add(new Integer(langXConstants.CLASS));
        classlist.add(new Integer(langXConstants.PUBLIC));
        classlist.add(new Integer(langXConstants.PRIVATE));
        classlist.add(new Integer(langXConstants.PROTECTED));

        constructdecl.add(new Integer(langXConstants.CONSTRUCTOR));
        constructdecl.add(new Integer(langXConstants.PUBLIC));
        constructdecl.add(new Integer(langXConstants.PRIVATE));
        constructdecl.add(new Integer(langXConstants.PROTECTED));

        statlist.addAll(vardecl);
        statlist.add(new Integer(langXConstants.IDENT));
        statlist.add(new Integer(langXConstants.PRINT));
        statlist.add(new Integer(langXConstants.READ));
        statlist.add(new Integer(langXConstants.RETURN));
        statlist.add(new Integer(langXConstants.SUPER));
        statlist.add(new Integer(langXConstants.IF));
        statlist.add(new Integer(langXConstants.FOR));
        statlist.add(new Integer(langXConstants.LBRACE));
        statlist.add(new Integer(langXConstants.BREAK));
        statlist.add(new Integer(langXConstants.SEMICOLON));
    }
}
