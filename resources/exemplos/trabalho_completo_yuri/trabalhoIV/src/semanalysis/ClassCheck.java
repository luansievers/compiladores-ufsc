package semanalysis;

import symtable.*;
import syntactictree.*;

public class ClassCheck {
	
	Symtable Maintable; // tabela de mais alto nivel
	protected Symtable Curtable; // apontador para a tabela corrente
	int foundSemanticError;
	
	public ClassCheck()
	{
		EntrySimple k;
		foundSemanticError = 0;
		Maintable = new Symtable(); // cria tabela principal
		k = new EntrySimple("int"); // insere tipos básicos da linguagem
		Maintable.add(k);
		k = new EntrySimple("string");
		Maintable.add(k);
		
	}
	
	public void ClassCheckRoot(ListNode x) throws SemanticException
	{
		Curtable = Maintable; // tabela corrente = principal
		ClassCheckClassDeclListNode(x); // chama análise para raiz da árvore
		
		if (foundSemanticError != 0) // se houve erro, lanca excecao 
            throw new SemanticException(foundSemanticError + " Erros semanticos encontrados (fase 1)"); 
	}
	
	public void ClassCheckClassDeclListNode (ListNode x)
	{
	
		if (x == null) return; 
		
		//SSystem.out.println("****image - " + x.node);
		
		if (x.node instanceof ClassDeclNode) { 
			try {
				ClassCheckClassDeclNode( (ClassDeclNode) x.node) ;
			}		 
			catch (SemanticException e) 
			{ // se um erro ocorreu na analise da classe, 
			 // da a mensagem, mas faz a analise para proxima classe 
				System.out.println (e.getMessage () ) ; 
				foundSemanticError++; 
			}
			
		}
		if (x.node instanceof ClassBodyStatementNode) { 
			ClassCheckClassBodyStatementNode( (ClassBodyStatementNode) x.node);			
		}
		ClassCheckClassDeclListNode(x.next) ;
	}
	
	public void ClassCheckClassDeclNode (ClassDeclNode x) throws SemanticException{
		//System.out.println("**** in ClassCheckClassDeclNode - " + x.nameToken.image);
		Symtable temphold = Curtable; // salva apontador /p tabela corrente
		EntryClass nc;
		
		if (x == null) return;
		
		//procura classe na tabela
		nc = (EntryClass) Curtable.classFindUp(x.nameToken.image);
		
		//System.out.println("**** in NC - " + nc.name);
		
		if (nc != null) // ja declarada, ERRO
		{
			throw new SemanticException(x.nameToken, "Classe "+ x.nameToken.image + " ja declarada");
		}
		//notifica que ira adicionar nova classe na tabela de simbolos
		System.out.println("Classe adicionada na tabela de simbolos: " + x.nameToken.image);
		
		//inclui classe na tabela corrente
		nc = new EntryClass(x.nameToken.image, Curtable);
		Curtable.add(nc);
		Curtable = nc.nested; //tabela corrente = tabela da classe
		ClassCheckClassBodyNode(x.classBody);
		Curtable = temphold; // recupera apotnador p/ tabela corrente
		
		
		
	}
	
	public void ClassCheckClassBodyNode(ClassBodyNode x)
	{
		//System.out.println("**** in ClassCheckClassBodyNode - " + x);
		if (x == null) return;
			ClassCheckClassDeclListNode(x.list);
	}
	
	public void ClassCheckClassBodyStatementNode(ClassBodyStatementNode x) 
	{
		//System.out.println("**** in ClassCheckClassBodyStatementNode - " + x);
		if (x==null) return;
			ClassCheckClassDeclListNode(x.classList); // valida se no corpo da classe, ha classes aninhadas
	}

}
