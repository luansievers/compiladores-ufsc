package symtable;

//lista de EntryClass usada para representar os tipos de uma lista de parametros 
public class EntryRec extends EntryTable{

 public EntryTable type;  // tipo de um objeto 
 public int dim;          // dimensao 
 public EntryRec next;    // apontador para o resto da lista 
 public int cont;         // numero de elementos a partir daquele elemento 
 public boolean optional; // definie se eh um parametro opcional 

 // cria elemento     
 public EntryRec (EntryTable p, int d, int c, boolean opt)
 {
     type = p;
     cont = c;
     dim = d;
     next = null;
     optional = opt;
 }
 
 // cria elemento e poe no inicio da lista     
 public EntryRec (EntryTable p, int d, int c, EntryRec t, boolean opt)
 {
     type = p;
     cont = c;
     dim = d;
     next = t;
     optional = opt;
 }    
}
