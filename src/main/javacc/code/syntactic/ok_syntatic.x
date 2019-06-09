
class exemplo {

    byte exemploByte = 2;
    short exemploShort = 1;
    long exemploLong = 2.3456;
    float exemploFloat = 1.2;

    short comparaSeShortIgualAoDefinido(short x) {
        if (x == exemploShort) {
            print "Short igual!";
            return 1;
        }
        return -1;
    }

    protected long comparaSeLongMaiorQueDefinido(long x) {
        if (x > exemploByte) {
            print "Long maior!";
            return 1;
        }
        return -1;
    }

    private float comparaSeFloatIgualAoDefinido(float x) {
        if(x == exemploFloat){
            print "float igual!";
            return 1;
        }
        return -1;
    }

    public byte comparaSeByteMenorQueDefinido(byte x) {
        if (x < exemploByte) {
            print "Byte menor!";
            return 1;
        }
        return -1;
    }

    public void comparaDoisFloat(float x) {
        if(x < exemploFloat) { print "Valor informado Menor que o definido!"; }
        if(x > exemploFloat) { print "Valor informado Maior que o definido!"; }
        if(x == exemploFloat) { print "Valor informado Igual ao definido!"; }
    }

    public void comparaDoisShort(short x) {
        if(x < exemploShort) { print "Valor informado Menor que o definido!"; }
        if(x > exemploShort) { print "Valor informado Maior que o definido!"; }
        if(x == exemploShort) { print "Valor informado Igual ao definido!"; }
    }

    public void comparaDoisLong(long x) {
        if(x < exemploLong) { print "Valor informado Menor que o definido!"; }
        if(x > exemploLong) { print "Valor informado Maior que o definido!"; }
        if(x == exemploLong) { print "Valor informado Igual ao definido!"; }
    }

    public void comparaDoisByte(byte x) {
        if(x < exemploByte) { print "Valor informado Menor que o definido!"; }
        if(x > exemploByte) { print "Valor informado Maior que o definido!"; }
        if(x == exemploByte) { print "Valor informado Igual ao definido!"; }
    }

    protected void testarDoisValores(float x, log y) {
        if (x && y) {
            print "AND";
        }
        if (x || y) {
            print "OR";
        }
        if (x ^ y) {
            print "XOR";
        }
        if (!x) {
            print "NOT";
        }
    }
}
