
class exemplo_syntatic_ok {

    byte exemploByte = 2;
    short exemploShort = 1;
    long exemploLong = 2.3456;
    float exemploFloat = 1.2;

    byte exemploByte2;
    short exemploShort2;
    long exemploLong2;
    float exemploFloat2;
    exemploByte2 = 3
    exemploShort2 = 4;
    exemploLong2 = 3.456;
    exemploFloat2 = 5.1;

    byte exemploByte3;
    short exemploShort3;
    long exemploLong3;
    float exemploFloat3;

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

    byte retornaByteMaior() {
        exemploByte3 = 5;
        if(exemploByte2 > exemploByte3) {
            return exemploByte2;
        }
        return exemploByte3;
    }

    protected short retornaShortMaior() {
        exemploShort3 = 4;
         if(exemploShort2 > exemploShort3) {
            return exemploShort2;
        }
        return exemploShort3;
    }

    private long retornaLongMaior() {
        exemploLong3 = 4.475;
         if(exemploLong2 > exemploLong3) {
            return exemploLong2;
        }
        return exemploLong3;
    }

    public float retornaFloatMaior() {
        exemploFloat3 = 6.567;
         if(exemploFloat2 > exemploFloat3) {
            return exemploFloat2;
        }
        return exemploFloat3;
    }

    byte retornaByteMenor() {
        byte exemploByte4 = 6;
        byte exemploByte5;
        exemploByte5 = 7;

        if(exemploByte4 < exemploByte5) {
            return exemploByte4;
        }
        return exemploByte5;
    }

    protected short retornaShortMenor() {
        short exemploShort4 = 2;
        short exemploShort5;
        exemploShort5 = 6;

         if(exemploShort4 < exemploShort5) {
            return exemploShort4;
        }
        return exemploShort5;
    }

    private long retornaLongMenor() {
        long exemploLong4 = 6.3234;
        long exemploLong5;
        exemploLong5 = 4.123;

         if(exemploLong4 < exemploLong5) {
            return exemploLong4;
        }
        return exemploLong5;
    }

    public float retornaFloatMenor() {
        float exemploFloat4 = 0.434;
        float exemploFloat5;
        exemploFloat5 = 9.232;

         if(exemploFloat4 < exemploFloat5) {
            return exemploFloat4;
        }
        return exemploFloat5;
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
