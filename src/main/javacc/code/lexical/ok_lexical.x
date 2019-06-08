/***********************************************
Esse programa implementa uma árvore de busca binária
*************************************************/

class bintree { /* ná da árvore binária */


    final class data { // define um classe aninhada do tipo data (dia, mes ano)
        private int dia, mes, ano;

        // construtor 1, sem parâmetros
        constructor() {
            ano = 1900; // inicializa em 1/1/1900
            mes = 1;
            dia = 1;
        }

        // construtor 2 - dia mês e ano como
        constructor(int d, int m, int a) {
            // parâmetros
            dia = d;
            mes = m;
            ano = a;
        }

        // compara duas datas
        public int compara(data x) {
            // < 0 - menor > 0 maior 0 igual
            if ( ano < x.ano) return -1;
            if ( ano > x.ano) return 1;
            if ( mes < x.mes) return -1;
            if ( mes > x.mes) return 1;
            if ( dia < x.dia) return -1;
            if ( dia > x.dia) return 1;
            return 0;
        }


    } // final classe data


    // variáveis da classe bintree
    public data key;       // chave de comparação
    bintree left,right; // referência para os filhos

    constructor(data x) {
    key = x;
    left = null;
    right = null;
    }

    // adiciona um elemento na árvore
    protected int insert(data k) {
        int x;

        x = k.compara(key);
        if (x < 0) {
            if (left != null)
                return left.insert(k);
            left = new bintree(k);
            return 1;
        }
        if (x > 0) {
            if (right != null)
                return right.insert(k);
            right = new bintree(k);
            return 1;
        }
        return 0;
    }

    // imprime a árvore
    int treeprint(int x) {
        int i;

        if (left != null)
            i = left.treeprint(x+4);
        for (i = 0; i < x; i = i + 1)
            print " ";
        print key.dia+ "/" + key.mes + "/" + key.ano + "\n";
        if (right != null)
            i = right.treeprint(x+4);
    }


    int start() {
        bintree t;
        int i, d, m, a;
        data w; read d; read m; read a;
        w = new data(d, m, a);
        t = new bintree(w);
        for (i = 0; i < 10; i = i + 1){
            read d; read m; read a;
            w = new data(d, m, a);
            if (t.insert(w) == 0)
                print "Elemento ja existe\n";
        }
        i = t.treeprint(0);
        return 0;
    }

    void checkOperadoresLogicos() {
        if (1 && 1) {
            print "Operador lógico AND - OK";
        }
        if (1 || 0) {
            print "Operador lógico OR - OK";
        }
        if (1 ^ 0) {
            print "Operador lógico XOR - OK";
        }
        if (!0) {
            print "Operador lógico NOT - OK";
        }
    }

    void checkNovasVariaveis() {
        byte testeByte;
        byte testeByte;
        short testeShort;
        long testeShort;
        float testeFloat1;
        float testeFloat2;
        float testeFloat3;
        float testeFloat4;

        testeByte = 1;
        testeByte = 1;
        testeShort = 1;
        testeShort = 1;
        testeFloat1 = 5.3876e4;
        testeFloat2 = 7.321E-3;
        testeFloat3 = 0.5e-6;
        testeFloat4 = 0.45;
    }

}
