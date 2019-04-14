package symtable;

public class Symtable { 
	
	// apontador para o topo da tabela (mais recente) 
	public EntryTable top; 
	
	// numero que controla o escopo (aninhamento) corrente 
	public int scptr;
	
	// apontador para a entrada EntryClass de nivel sup. 
	public EntryClass levelup;
	
	public Symtable() // cria uma tabela vazia 
	{
		top = null; 
		scptr = 0; 
		levelup = null;
	}
	
	// cria tabela vazia apontando para nivel sup. 
	public Symtable (EntryClass up) 
	{
		top = null; 
		scptr = 0;
		levelup = up;
	}
		
	public void add(EntryTable x) // adiciona uma entrada ä tabela 
	{
		x.next = top; // inclui nova entrada no topo
		top = x;
		x.scope = scptr; // atribui para a entrada o numero do escopo 
		x.mytable = this; // faz a entrada apontar para a propria tabela 		
	}
	
	public void beginScope()
	{
		scptr++;// inicia novo aninhamento de variaveis
	}
	 
	public void endScope() 
	{
		while (top != null && top.scope == scptr)
			top = top.next; // retira todas as vars do aninhamento corrente 
		scptr--; // finaliza aninhamento corrente
		
	} 
	
	public EntryTable classFindUp(String x)
	{
		EntryTable p = top;
		// para cada elemento da tabela corrente
		while (p != null)
		{
			//verifica se é uma entrada de classe ou tipo sirrples e entäo o nome
			if ( ((p instanceof EntryClass) || (p instanceof EntrySimple)) && p.name.equals(x)) 
				return p; 
			p = p.next; // proxima entrada
		}
  		if (levelup == null) // se nao achou e é o nivel mais externo 
  			return null; // retorna null 
		
  		// procura no nivel mais externo 
		return levelup.mytable.classFindUp(x) ; 

		
	}

}