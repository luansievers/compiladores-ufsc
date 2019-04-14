package syntactictree;

public class PrintTree {
    int kk;

    public PrintTree() {
        kk = 1; // inicializa contador de nós
    }

    public void printRoot(ListNode x) {
        if (x == null) {
            System.out.println("Empty syntatic tree. Nothing to be printed");
        } else {
            numberClassDeclListNode(x);
            printClassDeclListNode(x);
        }

        System.out.println();
    }
    
 // ------------- lista de classes --------------------------
    public void numberClassDeclListNode(ListNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberClassDeclNode((ClassDeclNode) x.node);
        numberClassDeclListNode(x.next);
    }

    public void printClassDeclListNode(ListNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": ListNode (ClassDeclNode)  ===> " +
            x.node.number + " " +
            ((x.next == null) ? "null" : String.valueOf(x.next.number)));

        printClassDeclNode((ClassDeclNode) x.node);
        printClassDeclListNode(x.next);
    }

    // ------------- declaracão de classe -------------------------
    public void numberClassDeclNode(ClassDeclNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberClassBodyNode(x.classBody);
    }

    public void printClassDeclNode(ClassDeclNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": ClassDeclNode ===> " + x.nameToken.image +
            " " + ((x.superNameToken == null) ? "null" : x.superNameToken.image) + " " +
            ((x.classBody == null) ? "null" : String.valueOf(x.classBody.number)));

        printClassBodyNode(x.classBody);
    }

    //------------------------- Corpo da classe -------------------
    public void numberClassBodyNode(ClassBodyNode x) {
        if (x == null) {
            return;
        }
        x.number = kk++;
        numberClassBodyNodeList(x.list);
    }

    public void printClassBodyNode(ClassBodyNode x) {
        if (x == null) {
            return;
        }
        System.out.println();
        System.out.print(x.number + ": ClassBodyNode ===> " 
        				 + x.position.image + " "
					     + (x.list !=null ? x.list.number:"null")
					     );
        printClassBodyNodeList(x.list);
    }
    
    //------------------------------------Lista corpo da classe----------------------------------
    public void numberClassBodyNodeList(ListNode x){
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberClassBodyStatementNode((ClassBodyStatementNode) x.node);
        numberClassBodyNodeList(x.next);
    }
    
    public void printClassBodyNodeList(ListNode x){
    	  if (x == null) {
              return;
          }
        System.out.println();
        System.out.print(x.number + ": ListNode (ClassBodyStatementNode)  ===> " +
            x.node.number + " " +
            ((x.next == null) ? "null" : String.valueOf(x.next.number)));

        printClassBodyStatementNode((ClassBodyStatementNode) x.node);
        printClassBodyNodeList(x.next);
    }
    //-------------------------------Class Body Node Statement----------------------------------------------
    public void numberClassBodyStatementNode(ClassBodyStatementNode x){
        if (x == null) {
            return;
        }
        x.number = this.kk++;
        if(x.classList!=null){
        	numberClassDeclListNode(x.classList);
        }else if(x.atributionStatement!=null){
        	numberAtribNode(x.atributionStatement);        	
        }else if(x.construct!=null){
        	numberConstructDeclNode(x.construct);        	
        }else if(x.method!=null){
        	numberMethodDeclNode(x.method);
        }else{
        	numberVarDeclNode(x.varDeclaration);        	
        }
    }
    
    public void printClassBodyStatementNode (ClassBodyStatementNode x){
        if (x == null) {
            return;
        }
        System.out.println();
        System.out.print(x.number + ": ClassBodyStatementNode ===> " + ((x.classList == null) ? "null" : String.valueOf(x.classList.number)) + " " 
        + ((x.atributionStatement == null) ? "null" : String.valueOf(x.atributionStatement.number)) + " "
        + ((x.construct == null) ? "null" : String.valueOf(x.construct.number)) + " "
        + ((x.method== null) ? "null" : String.valueOf(x.method.number)) + " "
        + ((x.varDeclaration== null) ? "null" : String.valueOf(x.varDeclaration.number)) + " "
        );

        if(x.classList!=null){
        	printClassDeclListNode(x.classList);
        }else if(x.atributionStatement!=null){
        	printAtribNode(x.atributionStatement);
        }else if(x.construct!=null){
        	printConstructDeclNode(x.construct);
        }else if(x.method!=null){
        	printMethodDeclNode(x.method);
        }else{
        	printVarDeclNode(x.varDeclaration);
        }
    }
    
    
    
    // ---------------- Lista de declaracões de variáveis ---------------- 
    public void numberVarDeclListNode(ListNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberVarDeclNode((VarDeclNode) x.node);
        numberVarDeclListNode(x.next);
    }

    public void printVarDeclListNode(ListNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": ListNode (VarDeclNode) ===> " +
            x.node.number + " " +
            ((x.next == null) ? "null" : String.valueOf(x.next.number)));

        printVarDeclNode((VarDeclNode) x.node);
        printVarDeclListNode(x.next);
    }

    // -------------------- Declaracão de variável --------------------
    public void numberVarDeclNode(VarDeclNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numbervarListNode(x.listVars);
    }

    public void printVarDeclNode(VarDeclNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": VarDeclNode ===> " + x.position.image +
            " " + x.listVars.number);
        printvarListNode(x.listVars);
    }

    // ------------------- Lista de variáveis --------------------
    public void numbervarListNode(ListNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberVarNode((VarNode) x.node);
        numbervarListNode(x.next);
    }

    public void printvarListNode(ListNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": ListNode (VarNode) ===> " +
            x.node.number + " " +
            ((x.next == null) ? "null" : String.valueOf(x.next.number)));

        printVarNode((VarNode) x.node);
        printvarListNode(x.next);
    }

    // ------------------ Declaracão de construtor -----------------
    public void numberConstructDeclNode(ConstructNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberMethodBodyNode(x.methodBody);
    }

    public void printConstructDeclNode(ConstructNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": ConstructDeclNode ===> " +
            x.methodBody.number);
        printMethodBodyNode(x.methodBody);
    }
    
    // --------------------- Declaracão de método ---------------
    public void numberMethodDeclNode(MethodDeclNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberMethodBodyNode(x.methodBody);
    }

    public void printMethodDeclNode(MethodDeclNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": MethodDeclNode ===> " +
            x.position.image + " " + ((x.dimension == 0) ? "" : ("[" + x.dimension+ "] ")) +
            x.name.image + " " + x.methodBody.number);
        printMethodBodyNode(x.methodBody);
    }

    //-------------------------- Corpo de método ----------------------
    public void numberMethodBodyNode(MethodBodyNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberParamList(x.params);
        numberStatementNode(x.statement);
    }

    public void printMethodBodyNode(MethodBodyNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": MethodBodyNode ===> " +
            ((x.params == null) ? "null" : String.valueOf(x.params.number)) +
            " " + x.statement.number);
        printParamList(x.params);
        printStatementNode(x.statement);
    }
    
    //---------------------parametros do metodo -----------------------------
    public void numberParamList(ListNode x){
    	if (x == null) {
            return;
        }

        x.number = kk++;
        if(x.node instanceof VarDeclNode){
        	numberVarDeclNode((VarDeclNode) x.node);        	
        }else{
        	numberAtribNode((AtribStatNode)x.node);
        }
        numberParamList(x.next);
    }
    
    public void printParamList(ListNode x){
    	 if (x == null) {
             return;
         }

         System.out.println();
         System.out.print(x.number + ": ListNode (ParamsList) ===> " +
             x.node.number + " " +
             ((x.next == null) ? "null" : String.valueOf(x.next.number)));
         if(x.node instanceof VarDeclNode){
        	 printVarDeclNode((VarDeclNode) x.node);        	
         }else{
         	printAtribNode((AtribStatNode)x.node);
         } 
         printParamList(x.next);
    }

    // --------------------------- Comando composto ----------------------
    public void numberBlockNode(BlockNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberStatementListNode(x.stats);
    }

    public void printBlockNode(BlockNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": BlockNode ===> " + x.stats.number);
        printStatementListNode(x.stats);
    }

    // --------------------- Lista de comandos --------------------
    public void numberStatementListNode(ListNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberStatementNode((StatementNode) x.node);
        numberStatementListNode(x.next);
    }

    public void printStatementListNode(ListNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": ListNode (StatementNode) ===> " +
            x.node.number + " " +
            ((x.next == null) ? "null" : String.valueOf(x.next.number)));

        printStatementNode((StatementNode) x.node);
        printStatementListNode(x.next);
    }

    // --------------------------- Comando print ---------------------
    public void numberPrintNode(PrintNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreNode(x.expr);
    }

    public void printPrintNode(PrintNode x) {
        if (x == null) {
        	return ;
        }
        System.out.println();
        System.out.print(x.number + ": PrintNode ===> " + x.expr.number);
        printExpreNode(x.expr);
    }

    // --------------------- Comando return -------------------------
    public void numberReturnNode(ReturnNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreNode(x.expr);
    }

    public void printReturnNode(ReturnNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": ReturnNode ===> " +
            ((x.expr == null) ? "null" : String.valueOf(x.expr.number)));
        printExpreNode(x.expr);
    }

    // ------------------------ Comando super --------------------------
    public void numberSuperNode(SuperNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreListNode(x.args);
    }
    public void printSuperNode(SuperNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": SuperNode ===> " +
            ((x.args == null) ? "null" : String.valueOf(x.args.number)));
        printExpreListNode(x.args);
    }

    // ------------------------- Comando de atribuição -------------------
    public void numberAtribNode(AtribStatNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreNode(x.name);
        numberExpreNode(x.value);
    }

    public void printAtribNode(AtribStatNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        if(x.name!=null){
        	System.out.print(x.number + ": AtribStatNode ===> " + x.name.number + " " +
        					x.position.image+ " "+
        	            	x.value.number);
        	printExpreNode(x.name);
        }else{
        	System.out.print(x.number + ": AtribStatNode ===> " 
        			+ x.type.image + " " 
        			+ x.ident.image + " " 
        			+ String.valueOf(x.dimension) + " "
        			+ x.value.number);
        }
        printExpreNode(x.value);
    }

    // ---------------------------------- comando if --------------------
    public void numberIfNode(IfNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreNode(x.expr);
        numberStatementNode(x.stat1);
        numberStatementNode(x.stat2);
    }

    public void printIfNode(IfNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": IfNode ===> " + x.expr.number + " " +
            x.stat1.number + " " +
            ((x.stat2 == null) ? "null" : String.valueOf(x.stat2.number)));

        printExpreNode(x.expr);
        printStatementNode(x.stat1);
        printStatementNode(x.stat2);
    }

    // ------------------------- comando for -----------------------
    public void numberForNode(ForNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberForParamsNode(x.params);
        numberStatementNode(x.s3);
    }

	public void printForNode(ForNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": ForNode ===> " +
        		((x.params== null) ? "null" : String.valueOf(x.params.number)) + " " +
        	//((x.init == null) ? "null" : String.valueOf(x.init.number)) + " " +
            //((x.expr == null) ? "null" : String.valueOf(x.expr.number)) + " " +
            //((x.incr == null) ? "null" : String.valueOf(x.incr.number)) + " " +
            x.s3.number);

//        printAtribNode(x.init);
//        printExpreNode(x.expr);
//        printAtribNode(x.incr);
        printForParamsNode(x.params);
        printStatementNode(x.s3);
    }
	
	//---------------------- For params Node ----------------------------- 
    private void numberForParamsNode(ForParamsNode x) {
    	 if (x == null) {
             return;
         }
    	 x.number = kk++;
    	 numberAtribNode(x.s1);
         numberExpreNode(x.e1);
         numberAtribNode(x.s2);
	}
    
    private void printForParamsNode(ForParamsNode x) {
	   	 if (x == null) {
	         return;
	     }
	     System.out.println();
	     System.out.print(x.number + ": ForParamsNode ===> " +
	    	 ((x.s1 == null) ? "null" : String.valueOf(x.s1.number)) + " " +
	         ((x.e1== null) ? "null" : String.valueOf(x.e1.number)) + " " +
	         ((x.s2 == null) ? "null" : String.valueOf(x.s2.number)));
	
	     printAtribNode(x.s1);
	     printExpreNode(x.e1);
	     printAtribNode(x.s2);
    }

	// --------------------------- Comando break --------------------
    public void numberBreakNode(BreakNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
    }

    public void printBreakNode(BreakNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": BreakNode");
    }

    // --------------------------- Comando vazio -------------------
    public void numberNopNode(NopNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
    }

    public void printNopNode(NopNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": NopNode");
    }

    // -------------------------- Alocação de objeto ------------------------
    public void numberNewObjectNode(NewObjectNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreListNode(x.args);
    }

    public void printNewObjectNode(NewObjectNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": NewObjectNode ===> " + x.name.image +
            " " + ((x.args == null) ? "null" : String.valueOf(x.args.number)));

        printExpreListNode(x.args);
    }

    // -------------------------- Alocação de array ------------------------
    public void numberNewArrayNode(NewArrayNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreListNode(x.dims);
    }

    public void printNewArrayNode(NewArrayNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": NewArrayNode ===> " + x.name.image +
            " " + ((x.dims == null) ? "null" : String.valueOf(x.dims.number)));

        printExpreListNode(x.dims);
    }

    // --------------------------- Lista de expressões ---------------
    public void numberExpreListNode(ListNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreNode((ExpreNode) x.node);
        numberExpreListNode(x.next);
    }

    public void printExpreListNode(ListNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": ListNode (ExpreNode) ===> " +
            x.node.number + " " +
            ((x.next == null) ? "null" : String.valueOf(x.next.number)));
        printExpreNode((ExpreNode) x.node);
        printExpreListNode(x.next);
    }

    // --------------------- Expressão relacional -------------------
    public void numberRelationalNode(RelationalNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreNode(x.expr1);
        numberExpreNode(x.expr2);
    }

    public void printRelationalNode(RelationalNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": RelationalNode ===> " + x.expr1.number +
            " " + x.position.image + " " + x.expr2.number);
        printExpreNode(x.expr1);
        printExpreNode(x.expr2);
    }

    // ------------------------ Soma ou subtração  -------------------
    public void numberAddNode(AddNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreNode(x.expr1);
        numberExpreNode(x.expr2);
    }

    public void printAddNode(AddNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": AddNode ===> " + x.expr1.number + " " +
            x.position.image + " " + x.expr2.number);
        printExpreNode(x.expr1);
        printExpreNode(x.expr2);
    }

    // ---------------------- Multiplicação ou divisão --------------------
    public void numberMultNode(MultNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreNode(x.expr1);
        numberExpreNode(x.expr2);
    }

    public void printMultNode(MultNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": MultNode ===> " + x.expr1.number + " " +
            x.position.image + " " + x.expr2.number);
        printExpreNode(x.expr1);
        printExpreNode(x.expr2);
    }

    // ------------------------- Expressão unária ------------------------
    public void numberUnaryNode(UnaryNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreNode(x.expr);
    }

    public void printUnaryNode(UnaryNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": UnaryNode ===> " + x.position.image +
            " " + x.expr.number);
        printExpreNode(x.expr);
    }

    // -------------------------- Constante inteira ----------------------
    public void numberIntConstNode(IntNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
    }

    public void printIntConstNode(IntNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": IntNode ===> " + x.position.image);
    }

    // ------------------------ Constante string ----------------------------
    public void numberStringConstNode(StringNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
    }

    public void printStringConstNode(StringNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": StringConstNode ===> " +
            x.position.image);
    }
    
    //-------------------------Constante Boolean ----------------------------------
	private void printBooleanNode(BooleanNode x) {
		if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": BooleanNode ===> " +
            x.position.image);
	}

	private void numberBooleanNode(BooleanNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
	}
	
	//--------------Constante Char -----------------------------------------------
	private void printCharNode(CharNode x) {
		if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": CharNode ===> " +
            x.position.image);
	}

	private void numberCharNode(CharNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
		
	}
	//C=---------Constante Float -------------------------------------------------
	private void printFloatNode(FloatNode x) {
		if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": FloatNode ===> " +
            x.position.image);
	}
	

	private void numberFloatNode(FloatNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
		
	}

    // ------------------------------ Constante null --------------------------
    public void numberNullConstNode(NullNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
    }

    public void printNullConstNode(NullNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": NullConstNode ===> " + x.position.image);
    }

    // -------------------------------- Nome de variável ------------------
    public void numberVarNode(VarNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
    }

    public void printVarNode(VarNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": VarNode ===> " + x.position.image + " " +
            ((x.dimension == 0) ? "" : ("[" + x.dimension + "]")));
    }

    // ---------------------------- Chamada de método ------------------------
    public void numberCallNode(CallNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreNode(x.e1);
        numberExpreListNode(x.params);
    }

    public void printCallNode(CallNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": CallNode ===> " + x.e1.number + " " +
            x.paren.image + " " +
            ((x.params== null) ? "null" : String.valueOf(x.params.number)));
        printExpreNode(x.e1);
        printExpreListNode(x.params);
    }

    // --------------------------- Indexação de variável ---------------
    public void numberIndexNode(IndexNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreNode(x.e1);
        numberExpreNode(x.e2);
    }

    public void printIndexNode(IndexNode x) {
        if (x == null) {
            return;
        }

        System.out.println();
        System.out.print(x.number + ": IndexNode ===> " + x.e1.number + " " +
            x.e2.number);
        printExpreNode(x.e1);
        printExpreNode(x.e2);
    }
    
    //----------------------------- Xor e Or Nodes ----------------------------------

    private void printXorOrNode(XorOrNode x) {
    	 if (x == null) {
             return;
         }		
    	 
    	 System.out.println();
    	 System.out.print(x.number + ": XorOrNode ===> " + x.expr1.number + " " +
    			 x.position.image + " " + x.expr2.number);
    	 printExpreNode(x.expr1);
    	 printExpreNode(x.expr2);
	}
    
    private void numberXorOrNode(XorOrNode x) {
    	 if (x == null) {
             return;
         } 		

         x.number = kk++;
         numberExpreNode(x.expr1);
         numberExpreNode(x.expr2);

    }
	//----------------------------------------And Node ------------------------------------------------------------------
	
    private void printAndNode(AndNode x) {
	   	 if (x == null) {
	         return;
	     }		
		 
		 System.out.println();
		 System.out.print(x.number + ": AndNode ===> " + x.expr1.number + " " +
				 x.position.image + " " + x.expr2.number);
		 printExpreNode(x.expr1);
		 printExpreNode(x.expr2);
	}
	
	private void numberAndNode(AndNode x) {
	   	 if (x == null) {
	         return;
	     } 		
	
	     x.number = kk++;
	     numberExpreNode(x.expr1);
	     numberExpreNode(x.expr2);
	}
    
    //---------------------------- Not Node -----------------------------------------
	private void printNotNode(NotNode x) {
	   	 if (x == null) {
	         return;
	     }		
		 
		 System.out.println();
		 System.out.print(x.number + ": NotNode ===> " 
				 + x.position.image + " "
				 + x.expre.number
				 );
		 printExpreNode(x.expre);
	}
	
	private void numberNotNode(NotNode x) {
	   	 if (x == null) {
	         return;
	     } 		
	
	     x.number = kk++;
	     numberExpreNode(x.expre);
	}
	//---------------------------- READ NODE----------------------------------------------
    public void numberReadNode(ReadNode x) {
        if (x == null) {
            return;
        }

        x.number = kk++;
        numberExpreNode(x.expr);
    }

    public void printReadNode(ReadNode x) {
        if (x == null) {
            return;
        }
        System.out.println();
		System.out.print(x.number + ": ReadNode ===> " 
				 + x.position.image + " "
				 + x.expr.number
				 );
		printExpreNode(x.expr);
        
    	return;
    }


	
	// --------------------------- Expressão em geral --------------------------
    public void printExpreNode(ExpreNode x) {
        if (x instanceof NewObjectNode) {
            printNewObjectNode((NewObjectNode) x);
        } else if (x instanceof NewArrayNode) {
            printNewArrayNode((NewArrayNode) x);
        } else if (x instanceof RelationalNode) {
            printRelationalNode((RelationalNode) x);
        } else if (x instanceof AddNode) {
            printAddNode((AddNode) x);
        } else if (x instanceof MultNode) {
            printMultNode((MultNode) x);
        } else if (x instanceof UnaryNode) {
            printUnaryNode((UnaryNode) x);
        } else if (x instanceof CallNode) {
            printCallNode((CallNode) x);
        } else if (x instanceof IntNode) {
            printIntConstNode((IntNode) x);
        } else if (x instanceof StringNode) {
            printStringConstNode((StringNode) x);
        } else if (x instanceof NullNode) {
            printNullConstNode((NullNode) x);
        } else if (x instanceof IndexNode) {
            printIndexNode((IndexNode) x);
        } else if (x instanceof VarNode) {
            printVarNode((VarNode) x);
        } else if(x instanceof XorOrNode){
        	printXorOrNode((XorOrNode)x);
        } else if (x instanceof AndNode){
        	printAndNode((AndNode) x);
        } else if (x instanceof NotNode){
        	printNotNode((NotNode) x);
        }else if (x instanceof BooleanNode){
        	printBooleanNode((BooleanNode) x);
        }else if(x instanceof FloatNode){
        	printFloatNode((FloatNode) x);
        }else if(x instanceof CharNode){
        	printCharNode((CharNode) x);
        }
    }

	public void numberExpreNode(ExpreNode x) {
        if (x instanceof NewObjectNode) {
            numberNewObjectNode((NewObjectNode) x);
        } else if (x instanceof NewArrayNode) {
            numberNewArrayNode((NewArrayNode) x);
        } else if (x instanceof RelationalNode) {
            numberRelationalNode((RelationalNode) x);
        } else if (x instanceof AddNode) {
            numberAddNode((AddNode) x);
        } else if (x instanceof MultNode) {
            numberMultNode((MultNode) x);
        } else if (x instanceof UnaryNode) {
            numberUnaryNode((UnaryNode) x);
        } else if (x instanceof CallNode) {
            numberCallNode((CallNode) x);
        } else if (x instanceof IntNode) {
            numberIntConstNode((IntNode) x);
        } else if (x instanceof StringNode) {
            numberStringConstNode((StringNode) x);
        } else if (x instanceof NullNode) {
            numberNullConstNode((NullNode) x);
        } else if (x instanceof IndexNode) {
            numberIndexNode((IndexNode) x);
        } else if (x instanceof VarNode) {
            numberVarNode((VarNode) x);
        } else if( x instanceof XorOrNode){
        	numberXorOrNode((XorOrNode) x);
        } else if( x instanceof AndNode){
        	numberAndNode((AndNode) x);
        } else if(x instanceof NotNode){
        	numberNotNode((NotNode)x);
        }else if (x instanceof BooleanNode){
        	numberBooleanNode((BooleanNode) x);
        }else if(x instanceof FloatNode){
        	numberFloatNode((FloatNode) x);
        }else if(x instanceof CharNode){
        	numberCharNode((CharNode) x);
        }
    }

	// --------------------------- Comando em geral -------------------
    public void printStatementNode(StatementNode x) {
        if (x instanceof BlockNode) {
            printBlockNode((BlockNode) x);
        } else if (x instanceof VarDeclNode) {
            printVarDeclNode((VarDeclNode) x);
        } else if (x instanceof AtribStatNode) {
            printAtribNode((AtribStatNode) x);
        } else if (x instanceof IfNode) {
            printIfNode((IfNode) x);
        } else if (x instanceof ForNode) {
            printForNode((ForNode) x);
        } else if (x instanceof PrintNode) {
            printPrintNode((PrintNode) x);
        } else if (x instanceof NopNode) {
            printNopNode((NopNode) x);
        } else if (x instanceof ReadNode) {
            printReadNode((ReadNode) x);
        } else if (x instanceof ReturnNode) {
            printReturnNode((ReturnNode) x);
        } else if (x instanceof SuperNode) {
            printSuperNode((SuperNode) x);
        } else if (x instanceof BreakNode) {
            printBreakNode((BreakNode) x);
        }
    }

    public void numberStatementNode(StatementNode x) {
        if (x instanceof BlockNode) {
            numberBlockNode((BlockNode) x);
        } else if (x instanceof VarDeclNode) {
            numberVarDeclNode((VarDeclNode) x);
        } else if (x instanceof AtribStatNode) {
            numberAtribNode((AtribStatNode) x);
        } else if (x instanceof IfNode) {
            numberIfNode((IfNode) x);
        } else if (x instanceof ForNode) {
            numberForNode((ForNode) x);
        } else if (x instanceof PrintNode) {
            numberPrintNode((PrintNode) x);
        } else if (x instanceof NopNode) {
            numberNopNode((NopNode) x);
        } else if (x instanceof ReadNode) {
            numberReadNode((ReadNode) x);
        } else if (x instanceof ReturnNode) {
            numberReturnNode((ReturnNode) x);
        } else if (x instanceof SuperNode) {
            numberSuperNode((SuperNode) x);
        } else if (x instanceof BreakNode) {
            numberBreakNode((BreakNode) x);
        }
    }
}

