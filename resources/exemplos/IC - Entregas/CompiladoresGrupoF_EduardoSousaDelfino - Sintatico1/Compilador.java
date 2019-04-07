/* Compilador.java */
/* Generated By:JavaCC: Do not edit this line. Compilador.java */
        import java.io.*;
        public class Compilador implements CompiladorConstants {
                final static String Version = "Compilador X+++ - Versao 1.0 - 2017";
                int contParseError = 0;           // contador de erros sintáticos

                public static void main( String[] args ) throws ParseException {
                        boolean debug = false;
                        String filename = "";
                        Compilador parser;
                        int i;
                        boolean ms = false;
                        System.out.println(Version);

                        for (i = 0; i < args.length - 1; i++){
                                if (args[i].equals("-debug_AS"))
                                        debug = true;
                                else {
                                        System.out.println("Uso: java langX [-short] arquivo");
                                        System.exit(0);
                                }
                        }

                        if (args[i].equals("-")){       // lê da entrada padrão      
                                System.out.println("Lendo da entrada padrao . . .");
                                parser = new Compilador(System.in);
                        } else {       // lê do arquivo
                                filename = args[args.length-1];
                                System.out.println("Lendo do arquivo " + filename + " . . .");
                                try {
                                        parser = new Compilador(new java.io.FileInputStream(filename));
                                } catch (java.io.FileNotFoundException e) {
                                        System.out.println("Arquivo " + filename + " nao encontrado.");
                                        return;
                                }
                        }

                        if (!debug) parser.disable_tracing(); // desabilita verbose do AS
                        try {
                                parser.program();   // chama o método que faz a análise
                        } catch (ParseException e){
                                System.err.println(e.getMessage());
                                parser.contParseError = 1;   // não existe recuperação de erros
                        } finally {
                                System.out.println(parser.token_source.foundLexError() + " erros lexicos encontrados");
                                System.out.println(parser.contParseError + " erros sintaticos encontrados");
                        }
                }

                static public String im(int x){
                        int k;
                        String s;
                        s = tokenImage[x];
                        k = s.lastIndexOf("\u005c"");
                        try {
                                s = s.substring(1,k);
                        } catch (StringIndexOutOfBoundsException e){

                        }
                return s;
        }

  final public void program() throws ParseException {
    trace_call("program");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CLASS:{
        classlist();
        break;
        }
      default:
        jj_la1[0] = jj_gen;
        ;
      }
      jj_consume_token(0);
    } finally {
      trace_return("program");
    }
  }

  final public void classlist() throws ParseException {
    trace_call("classlist");
    try {
      classdecl();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CLASS:{
        classlist();
        break;
        }
      default:
        jj_la1[1] = jj_gen;
        ;
      }
    } finally {
      trace_return("classlist");
    }
  }

  final public void classdecl() throws ParseException {
    trace_call("classdecl");
    try {
      jj_consume_token(CLASS);
      jj_consume_token(IDENT);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case EXTENDS:{
        jj_consume_token(EXTENDS);
        jj_consume_token(IDENT);
        break;
        }
      default:
        jj_la1[2] = jj_gen;
        ;
      }
      classbody();
    } finally {
      trace_return("classdecl");
    }
  }

  final public void classbody() throws ParseException {
    trace_call("classbody");
    try {
      jj_consume_token(LBRACE);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CLASS:{
        classlist();
        break;
        }
      default:
        jj_la1[3] = jj_gen;
        ;
      }
      label_1:
      while (true) {
        if (jj_2_1(3)) {
          ;
        } else {
          break label_1;
        }
        vardecl();
        jj_consume_token(SEMICOLON);
      }
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case CONSTRUCTOR:{
          ;
          break;
          }
        default:
          jj_la1[4] = jj_gen;
          break label_2;
        }
        constructdecl();
      }
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case primitivetype:
        case IDENT:{
          ;
          break;
          }
        default:
          jj_la1[5] = jj_gen;
          break label_3;
        }
        methoddecl();
      }
      jj_consume_token(RBRACE);
    } finally {
      trace_return("classbody");
    }
  }

  final public void vardecl() throws ParseException {
    trace_call("vardecl");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case primitivetype:{
        jj_consume_token(primitivetype);
        break;
        }
      case IDENT:{
        jj_consume_token(IDENT);
        break;
        }
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(IDENT);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACKET:{
          ;
          break;
          }
        default:
          jj_la1[7] = jj_gen;
          break label_4;
        }
        jj_consume_token(LBRACKET);
        jj_consume_token(RBRACKET);
      }
      label_5:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case COMMA:{
          ;
          break;
          }
        default:
          jj_la1[8] = jj_gen;
          break label_5;
        }
        jj_consume_token(COMMA);
        jj_consume_token(IDENT);
        label_6:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case LBRACKET:{
            ;
            break;
            }
          default:
            jj_la1[9] = jj_gen;
            break label_6;
          }
          jj_consume_token(LBRACKET);
          jj_consume_token(RBRACKET);
        }
      }
    } finally {
      trace_return("vardecl");
    }
  }

  final public void constructdecl() throws ParseException {
    trace_call("constructdecl");
    try {
      jj_consume_token(CONSTRUCTOR);
      methodbody();
    } finally {
      trace_return("constructdecl");
    }
  }

  final public void methoddecl() throws ParseException {
    trace_call("methoddecl");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case primitivetype:{
        jj_consume_token(primitivetype);
        break;
        }
      case IDENT:{
        jj_consume_token(IDENT);
        break;
        }
      default:
        jj_la1[10] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACKET:{
          ;
          break;
          }
        default:
          jj_la1[11] = jj_gen;
          break label_7;
        }
        jj_consume_token(LBRACKET);
        jj_consume_token(RBRACKET);
      }
      jj_consume_token(IDENT);
      methodbody();
    } finally {
      trace_return("methoddecl");
    }
  }

  final public void methodbody() throws ParseException {
    trace_call("methodbody");
    try {
      jj_consume_token(LPAREN);
      paramlist();
      jj_consume_token(RPAREN);
      statement();
    } finally {
      trace_return("methodbody");
    }
  }

  final public void paramlist() throws ParseException {
    trace_call("paramlist");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case primitivetype:
      case IDENT:{
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case primitivetype:{
          jj_consume_token(primitivetype);
          break;
          }
        case IDENT:{
          jj_consume_token(IDENT);
          break;
          }
        default:
          jj_la1[12] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        jj_consume_token(IDENT);
        label_8:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case LBRACKET:{
            ;
            break;
            }
          default:
            jj_la1[13] = jj_gen;
            break label_8;
          }
          jj_consume_token(LBRACKET);
          jj_consume_token(RBRACKET);
        }
        label_9:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case COMMA:{
            ;
            break;
            }
          default:
            jj_la1[14] = jj_gen;
            break label_9;
          }
          jj_consume_token(COMMA);
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case primitivetype:{
            jj_consume_token(primitivetype);
            break;
            }
          case IDENT:{
            jj_consume_token(IDENT);
            break;
            }
          default:
            jj_la1[15] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          jj_consume_token(IDENT);
          label_10:
          while (true) {
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case LBRACKET:{
              ;
              break;
              }
            default:
              jj_la1[16] = jj_gen;
              break label_10;
            }
            jj_consume_token(LBRACKET);
            jj_consume_token(RBRACKET);
          }
        }
        break;
        }
      default:
        jj_la1[17] = jj_gen;
        ;
      }
    } finally {
      trace_return("paramlist");
    }
  }

  final public void statement() throws ParseException {
    trace_call("statement");
    try {
      if (jj_2_2(2)) {
        vardecl();
        jj_consume_token(SEMICOLON);
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case IDENT:{
          atribStat();
          jj_consume_token(SEMICOLON);
          break;
          }
        case PRINT:{
          printStat();
          jj_consume_token(SEMICOLON);
          break;
          }
        case READ:{
          readStat();
          jj_consume_token(SEMICOLON);
          break;
          }
        case RETURN:{
          returnStat();
          jj_consume_token(SEMICOLON);
          break;
          }
        case SUPER:{
          superStat();
          jj_consume_token(SEMICOLON);
          break;
          }
        case IF:{
          ifStat();
          break;
          }
        case FOR:{
          forStat();
          break;
          }
        case WHILE:{
          whileStat();
          break;
          }
        case DO:{
          doWhileStat();
          jj_consume_token(SEMICOLON);
          break;
          }
        case SWITCH:{
          switchStat();
          break;
          }
        case LBRACE:{
          jj_consume_token(LBRACE);
          statlist();
          jj_consume_token(RBRACE);
          break;
          }
        case BREAK:{
          jj_consume_token(BREAK);
          jj_consume_token(SEMICOLON);
          break;
          }
        case SEMICOLON:{
          jj_consume_token(SEMICOLON);
          break;
          }
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } finally {
      trace_return("statement");
    }
  }

  final public void atribStat() throws ParseException {
    trace_call("atribStat");
    try {
      lvalue();
      jj_consume_token(ASSIGN);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case NEW:{
        alocexpression();
        break;
        }
      case int_constant:
      case stringLiteral:
      case string_constant:
      case null_constant:
      case intLiteral:
      case IDENT:
      case LPAREN:
      case PLUS:
      case MINUS:{
        expression();
        break;
        }
      default:
        jj_la1[19] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("atribStat");
    }
  }

  final public void printStat() throws ParseException {
    trace_call("printStat");
    try {
      jj_consume_token(PRINT);
      expression();
    } finally {
      trace_return("printStat");
    }
  }

  final public void readStat() throws ParseException {
    trace_call("readStat");
    try {
      jj_consume_token(READ);
      lvalue();
    } finally {
      trace_return("readStat");
    }
  }

  final public void returnStat() throws ParseException {
    trace_call("returnStat");
    try {
      jj_consume_token(RETURN);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case int_constant:
      case stringLiteral:
      case string_constant:
      case null_constant:
      case intLiteral:
      case IDENT:
      case LPAREN:
      case PLUS:
      case MINUS:{
        expression();
        break;
        }
      default:
        jj_la1[20] = jj_gen;
        ;
      }
    } finally {
      trace_return("returnStat");
    }
  }

  final public void superStat() throws ParseException {
    trace_call("superStat");
    try {
      jj_consume_token(SUPER);
      jj_consume_token(LPAREN);
      arglist();
      jj_consume_token(RPAREN);
    } finally {
      trace_return("superStat");
    }
  }

  final public void ifStat() throws ParseException {
    trace_call("ifStat");
    try {
      jj_consume_token(IF);
      jj_consume_token(LPAREN);
      expression();
      jj_consume_token(RPAREN);
      statement();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case ELSE:{
        jj_consume_token(ELSE);
        statement();
        break;
        }
      default:
        jj_la1[21] = jj_gen;
        ;
      }
    } finally {
      trace_return("ifStat");
    }
  }

  final public void forStat() throws ParseException {
    trace_call("forStat");
    try {
      jj_consume_token(FOR);
      jj_consume_token(LPAREN);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENT:{
        atribStat();
        break;
        }
      default:
        jj_la1[22] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case int_constant:
      case stringLiteral:
      case string_constant:
      case null_constant:
      case intLiteral:
      case IDENT:
      case LPAREN:
      case PLUS:
      case MINUS:{
        expression();
        break;
        }
      default:
        jj_la1[23] = jj_gen;
        ;
      }
      jj_consume_token(SEMICOLON);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case IDENT:{
        atribStat();
        break;
        }
      default:
        jj_la1[24] = jj_gen;
        ;
      }
      jj_consume_token(RPAREN);
      statement();
    } finally {
      trace_return("forStat");
    }
  }

  final public void whileStat() throws ParseException {
    trace_call("whileStat");
    try {
      jj_consume_token(WHILE);
      jj_consume_token(LPAREN);
      expression();
      jj_consume_token(RPAREN);
      statement();
    } finally {
      trace_return("whileStat");
    }
  }

  final public void doWhileStat() throws ParseException {
    trace_call("doWhileStat");
    try {
      jj_consume_token(DO);
      statement();
      jj_consume_token(LPAREN);
      expression();
      jj_consume_token(RPAREN);
    } finally {
      trace_return("doWhileStat");
    }
  }

  final public void switchStat() throws ParseException {
    trace_call("switchStat");
    try {
      jj_consume_token(SWITCH);
      jj_consume_token(LPAREN);
      jj_consume_token(IDENT);
      jj_consume_token(RPAREN);
      jj_consume_token(LBRACE);
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CASE:
      case DFAULT:{
        switchCasesStat();
        break;
        }
      default:
        jj_la1[25] = jj_gen;
        ;
      }
      jj_consume_token(RBRACE);
    } finally {
      trace_return("switchStat");
    }
  }

  final public void switchCasesStat() throws ParseException {
    trace_call("switchCasesStat");
    try {
      switchCaseStat();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CASE:
      case DFAULT:{
        switchCasesStat();
        break;
        }
      default:
        jj_la1[26] = jj_gen;
        ;
      }
    } finally {
      trace_return("switchCasesStat");
    }
  }

  final public void switchCaseStat() throws ParseException {
    trace_call("switchCaseStat");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case CASE:{
        jj_consume_token(CASE);
        factor();
        break;
        }
      case DFAULT:{
        jj_consume_token(DFAULT);
        break;
        }
      default:
        jj_la1[27] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(COLON);
      statement();
    } finally {
      trace_return("switchCaseStat");
    }
  }

  final public void statlist() throws ParseException {
    trace_call("statlist");
    try {
      statement();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case BREAK:
      case DO:
      case FOR:
      case IF:
      case PRINT:
      case READ:
      case RETURN:
      case SUPER:
      case SWITCH:
      case WHILE:
      case primitivetype:
      case IDENT:
      case LBRACE:
      case SEMICOLON:{
        statlist();
        break;
        }
      default:
        jj_la1[28] = jj_gen;
        ;
      }
    } finally {
      trace_return("statlist");
    }
  }

  final public void lvalue() throws ParseException {
    trace_call("lvalue");
    try {
      jj_consume_token(IDENT);
      label_11:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACKET:
        case DOT:{
          ;
          break;
          }
        default:
          jj_la1[29] = jj_gen;
          break label_11;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LBRACKET:{
          jj_consume_token(LBRACKET);
          expression();
          jj_consume_token(RBRACKET);
          break;
          }
        case DOT:{
          jj_consume_token(DOT);
          jj_consume_token(IDENT);
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case LPAREN:{
            jj_consume_token(LPAREN);
            arglist();
            jj_consume_token(RPAREN);
            break;
            }
          default:
            jj_la1[30] = jj_gen;
            ;
          }
          break;
          }
        default:
          jj_la1[31] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } finally {
      trace_return("lvalue");
    }
  }

  final public void alocexpression() throws ParseException {
    trace_call("alocexpression");
    try {
      jj_consume_token(NEW);
      if (jj_2_3(2)) {
        jj_consume_token(IDENT);
        jj_consume_token(LPAREN);
        arglist();
        jj_consume_token(RPAREN);
      } else {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case primitivetype:
        case IDENT:{
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case primitivetype:{
            jj_consume_token(primitivetype);
            break;
            }
          case IDENT:{
            jj_consume_token(IDENT);
            break;
            }
          default:
            jj_la1[32] = jj_gen;
            jj_consume_token(-1);
            throw new ParseException();
          }
          label_12:
          while (true) {
            jj_consume_token(LBRACKET);
            expression();
            jj_consume_token(RBRACKET);
            switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
            case LBRACKET:{
              ;
              break;
              }
            default:
              jj_la1[33] = jj_gen;
              break label_12;
            }
          }
          break;
          }
        default:
          jj_la1[34] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } finally {
      trace_return("alocexpression");
    }
  }

  final public void expression() throws ParseException {
    trace_call("expression");
    try {
      numexpr();
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case GT:
      case LT:
      case EQ:
      case LE:
      case GE:
      case NEQ:{
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case LT:{
          jj_consume_token(LT);
          break;
          }
        case GT:{
          jj_consume_token(GT);
          break;
          }
        case LE:{
          jj_consume_token(LE);
          break;
          }
        case GE:{
          jj_consume_token(GE);
          break;
          }
        case EQ:{
          jj_consume_token(EQ);
          break;
          }
        case NEQ:{
          jj_consume_token(NEQ);
          break;
          }
        default:
          jj_la1[35] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        numexpr();
        break;
        }
      default:
        jj_la1[36] = jj_gen;
        ;
      }
    } finally {
      trace_return("expression");
    }
  }

  final public void numexpr() throws ParseException {
    trace_call("numexpr");
    try {
      term();
      label_13:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PLUS:
        case MINUS:{
          ;
          break;
          }
        default:
          jj_la1[37] = jj_gen;
          break label_13;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PLUS:{
          jj_consume_token(PLUS);
          break;
          }
        case MINUS:{
          jj_consume_token(MINUS);
          break;
          }
        default:
          jj_la1[38] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        term();
      }
    } finally {
      trace_return("numexpr");
    }
  }

  final public void term() throws ParseException {
    trace_call("term");
    try {
      unaryexpr();
      label_14:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STAR:
        case SLASH:
        case REM:{
          ;
          break;
          }
        default:
          jj_la1[39] = jj_gen;
          break label_14;
        }
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case STAR:{
          jj_consume_token(STAR);
          break;
          }
        case SLASH:{
          jj_consume_token(SLASH);
          break;
          }
        case REM:{
          jj_consume_token(REM);
          break;
          }
        default:
          jj_la1[40] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        unaryexpr();
      }
    } finally {
      trace_return("term");
    }
  }

  final public void unaryexpr() throws ParseException {
    trace_call("unaryexpr");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case PLUS:
      case MINUS:{
        switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
        case PLUS:{
          jj_consume_token(PLUS);
          break;
          }
        case MINUS:{
          jj_consume_token(MINUS);
          break;
          }
        default:
          jj_la1[41] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        break;
        }
      default:
        jj_la1[42] = jj_gen;
        ;
      }
      factor();
    } finally {
      trace_return("unaryexpr");
    }
  }

  final public void factor() throws ParseException {
    trace_call("factor");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case int_constant:{
        jj_consume_token(int_constant);
        break;
        }
      case intLiteral:{
        jj_consume_token(intLiteral);
        break;
        }
      case string_constant:{
        jj_consume_token(string_constant);
        break;
        }
      case stringLiteral:{
        jj_consume_token(stringLiteral);
        break;
        }
      case null_constant:{
        jj_consume_token(null_constant);
        break;
        }
      case IDENT:{
        lvalue();
        break;
        }
      case LPAREN:{
        jj_consume_token(LPAREN);
        expression();
        jj_consume_token(RPAREN);
        break;
        }
      default:
        jj_la1[43] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("factor");
    }
  }

  final public void arglist() throws ParseException {
    trace_call("arglist");
    try {
      switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
      case int_constant:
      case stringLiteral:
      case string_constant:
      case null_constant:
      case intLiteral:
      case IDENT:
      case LPAREN:
      case PLUS:
      case MINUS:{
        expression();
        label_15:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk_f():jj_ntk) {
          case COMMA:{
            ;
            break;
            }
          default:
            jj_la1[44] = jj_gen;
            break label_15;
          }
          jj_consume_token(COMMA);
          expression();
        }
        break;
        }
      default:
        jj_la1[45] = jj_gen;
        ;
      }
    } finally {
      trace_return("arglist");
    }
  }

  private boolean jj_2_1(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla)
 {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_3_1()
 {
    if (jj_3R_16()) return true;
    if (jj_scan_token(SEMICOLON)) return true;
    return false;
  }

  private boolean jj_3R_18()
 {
    if (jj_scan_token(COMMA)) return true;
    return false;
  }

  private boolean jj_3R_17()
 {
    if (jj_scan_token(LBRACKET)) return true;
    return false;
  }

  private boolean jj_3R_16()
 {
    if (!jj_rescan) trace_call("vardecl(LOOKING AHEAD...)");
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(25)) {
    jj_scanpos = xsp;
    if (jj_scan_token(32)) { if (!jj_rescan) trace_return("vardecl(LOOKAHEAD FAILED)"); return true; }
    }
    if (jj_scan_token(IDENT)) { if (!jj_rescan) trace_return("vardecl(LOOKAHEAD FAILED)"); return true; }
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_17()) { jj_scanpos = xsp; break; }
    }
    while (true) {
      xsp = jj_scanpos;
      if (jj_3R_18()) { jj_scanpos = xsp; break; }
    }
    { if (!jj_rescan) trace_return("vardecl(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  private boolean jj_3_3()
 {
    if (jj_scan_token(IDENT)) return true;
    if (jj_scan_token(LPAREN)) return true;
    return false;
  }

  private boolean jj_3_2()
 {
    if (jj_3R_16()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public CompiladorTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[46];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x400,0x400,0x8000,0x400,0x800,0x2000000,0x2000000,0x0,0x0,0x0,0x2000000,0x0,0x2000000,0x0,0x0,0x2000000,0x0,0x2000000,0x1fb2100,0x7c040000,0x7c000000,0x4000,0x0,0x7c000000,0x0,0x1200,0x1200,0x1200,0x3fb2100,0x0,0x0,0x0,0x2000000,0x0,0x2000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x7c000000,0x0,0x7c000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x1,0x1,0x80,0x800,0x80,0x1,0x80,0x1,0x80,0x800,0x1,0x80,0x1,0x421,0x600009,0x600009,0x0,0x1,0x600009,0x1,0x0,0x0,0x0,0x421,0x1080,0x8,0x1080,0x1,0x80,0x1,0x1f8000,0x1f8000,0x600000,0x600000,0x3800000,0x3800000,0x600000,0x600000,0x9,0x800,0x600009,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[3];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public Compilador(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Compilador(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CompiladorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 46; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 46; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public Compilador(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CompiladorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 46; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 46; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public Compilador(CompiladorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 46; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(CompiladorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 46; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      trace_token(token, "");
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  @SuppressWarnings("serial")
  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    } else {
      trace_scan(jj_scanpos, kind);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
      trace_token(token, " (in getNextToken)");
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk_f() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[60];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 46; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 60; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  private int trace_indent = 0;
  private boolean trace_enabled = true;

/** Enable tracing. */
  final public void enable_tracing() {
    trace_enabled = true;
  }

/** Disable tracing. */
  final public void disable_tracing() {
    trace_enabled = false;
  }

  private void trace_call(String s) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Call:   " + s);
    }
    trace_indent = trace_indent + 2;
  }

  private void trace_return(String s) {
    trace_indent = trace_indent - 2;
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Return: " + s);
    }
  }

  private void trace_token(Token t, String where) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Consumed token: <" + tokenImage[t.kind]);
      if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
        System.out.print(": \"" + t.image + "\"");
      }
      System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
    }
  }

  private void trace_scan(Token t1, int t2) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Visited token: <" + tokenImage[t1.kind]);
      if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
        System.out.print(": \"" + t1.image + "\"");
      }
      System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
    }
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 3; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
