package recovery;

import parser.*;
import java.util.*;


public class RecoverySet extends HashSet {
    private static final long serialVersionUID = 1L;

    // cria conjunto vazio
    public RecoverySet() {
        super();
    }

    // cria conjunto com 1 tipo de token
    public RecoverySet(int t) {
        this.add(new Integer(t));
    }

    // verifica se token pertence ao conjunto
    public boolean contains(int t) {
        return super.contains(new Integer(t));
    }

    // faz a união de dois conjuntos
    public RecoverySet union(RecoverySet s) {
        RecoverySet t = null;

        if (s != null) { // se s == null retorna null
            t = (RecoverySet) this.clone();
            t.addAll(s);
        }
        return t;
        // retorna um terceiro conjunto, sem destruir nenhum
    }

    public RecoverySet remove(int n) { // retira 1 elemento do conjunto

        RecoverySet t = (RecoverySet) this.clone();
        t.remove(new Integer(n));

        return t; // retorna um novo conjunto, sem 1 dos elementos
    }

    // cria string descrevendo os tokens que pertencem
    // ao conjunto
    public String toString() {
        Iterator it = this.iterator();
        String s = "";
        int k;

        while (it.hasNext()) {
            k = ((Integer) it.next()).intValue();
            s += (langX.im(k) + " ");
        }

        return s;
    }
}
