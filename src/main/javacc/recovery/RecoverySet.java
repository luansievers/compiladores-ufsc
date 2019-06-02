package recovery;

import java.util.*;
import langX;

public class RecoverySet extends HashSet {

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

    // faz a união de dois conjutos
    public RecoverySet union(RecoverySet s) {
        RecoverySet t = null;

        // se s == null retorna null
        if (s != null) {
            t = (RecoverySet) this.clone();
            t.addAll(s);
        }

        // retorna um terceiro conjunto, sem destruir nenhum
        return t;
    }

    // retira 1 elemento do conjunto
    public RecoverySet remove(int n) {
        RecoverySet t = (RecoverySet) this.clone();
        t.remove(new Integer(n));

        // retorna um novo conjunto, sem 1 dos elementos
        return t;
    }

    // cria string descrevendo os tokens que pertencem ao conjunto
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
