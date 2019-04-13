package recovery;

import parser.*;
import java.util.*;

public class First { //implementa os conjuntos first p/ alguns n.terminais

    static public final RecoverySet methoddecl = new RecoverySet();
    static public final RecoverySet vardecl = new RecoverySet();
    static public final RecoverySet classlist = new RecoverySet();
    static public final RecoverySet constructdecl = new RecoverySet();
    static public final RecoverySet statlist = new RecoverySet();
	static public final RecoverySet switchCasesStat = new RecoverySet();
    static public final RecoverySet program = classlist;

    static {
        methoddecl.add(new Integer(CompiladorConstants.primitivetype));
        methoddecl.add(new Integer(CompiladorConstants.IDENT));

        vardecl.add(new Integer(CompiladorConstants.primitivetype));
        vardecl.add(new Integer(CompiladorConstants.IDENT));

        classlist.add(new Integer(CompiladorConstants.CLASS));

        constructdecl.add(new Integer(CompiladorConstants.CONSTRUCTOR));

        statlist.addAll(vardecl);
        statlist.add(new Integer(CompiladorConstants.IDENT)); // first do atribstat
        statlist.add(new Integer(CompiladorConstants.PRINT));
        statlist.add(new Integer(CompiladorConstants.READ));
        statlist.add(new Integer(CompiladorConstants.RETURN));
        statlist.add(new Integer(CompiladorConstants.SUPER));
        statlist.add(new Integer(CompiladorConstants.IF));
        statlist.add(new Integer(CompiladorConstants.FOR));
		statlist.add(new Integer(CompiladorConstants.WHILE));
		statlist.add(new Integer(CompiladorConstants.DO));
		statlist.add(new Integer(CompiladorConstants.SWITCH));
        statlist.add(new Integer(CompiladorConstants.LBRACE));
        statlist.add(new Integer(CompiladorConstants.BREAK));
        statlist.add(new Integer(CompiladorConstants.SEMICOLON));
		
		switchCasesStat.add(new Integer(CompiladorConstants.CASE));
		switchCasesStat.add(new Integer(CompiladorConstants.DFAULT));
    }
}
