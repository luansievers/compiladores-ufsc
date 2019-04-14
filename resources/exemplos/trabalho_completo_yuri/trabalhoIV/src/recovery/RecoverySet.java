package recovery;

import java.util.*;
import parser.Fun;


public class RecoverySet extends HashSet{
	
	public RecoverySet()  //conjunto vazio
	{
		super();
	}
	
	public RecoverySet(int t ) {
		this.add(new Integer(t));
	}
	
	public boolean contains(int t) {
		return super.contains(new Integer(t));
	}
	
	public RecoverySet union(RecoverySet s) {
		RecoverySet t = null; 
		if (s != null) 
		{
			t = (RecoverySet) this. clone() ; 
			t.addAll (s); 
		}
		return t; 
	}
	
	public RecoverySet remove (int n) { // retira um elemento do conjunto
		
		RecoverySet t = (RecoverySet) this.clone(); 
		t.remove(new Integer(n) ) ; 
		return t; 
		// retorna novo conjunto, sem um dos elementos 

	}
	
	public String toString() {
		Iterator it = this.iterator() ; 
		String s = ""; 
		int k; 
		while ( it.hasNext() ) 
		{
			k = ( (Integer) it.next()).intValue() ;
			s += Fun.im(k) + " ";
		}
		return s;
	}
		
	
}
