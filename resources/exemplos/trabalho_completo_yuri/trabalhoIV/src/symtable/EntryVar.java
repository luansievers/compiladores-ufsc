package symtable;

//classe que abriga uma declaracao de variavel na tabela de simbolos 
public class EntryVar extends EntryTable { 
	
	public EntryTable type ;  // apontador para o tipo da variavel 
	public int dim;  // numero de dimensoes da variavel 
	public int localcount ;  // numeracao sequencial para as vars.  locais
	 
 // cria uma entrada para var. de classe 
 public EntryVar (String n, EntryTable p, int d) 
 {
	 name = n;         // nome da variavel 
	 type = p;         // apontador para a classe 
	 dim = d;          // numero de dimensoes 
	 localcount = -1;  // numero sequencial é sempre -I (näo local) 
 }          
 
 // cria uma entrada para var.local
 public EntryVar (String n, EntryTable p, int d, int k) 
 {
	 name = n;         // nome da variavel 
	 type = p;         // apontador para a classe 
	 dim = d;          // numero de dimensoes 
	 localcount = k;   // inclui tambem o numero sequencial 
 }
 
}  
