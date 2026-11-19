package ads.poo;

public enum Valores {
    AS(1,"1"),
    DOIS(2,"2"),
    TRES(3,"3"),
    QUATRO(4,"4"),
    CINCO(5,"5"),
    SEIS(6,"6"),
    SETE(7,"7"),
    OITO(8,"8"),
    NOVE(9,"9"),
    DEZ(10,"10"),
    CAVALO(11,"j"),
    DAMA(12,"q"),
    REI(13,"k");

    public final int codigo;
    public final String simbolo;

    Valores(int c, String s) {
        this.codigo = c;
        this.simbolo = s;
    }

    @Override
    public String toString() {
        return simbolo;
    }

    public static Valores getCodigo(int c) {
        for (Valores v : Valores.values()) {
            if (c == v.codigo) {
                return v;
            }
        }
        throw new IllegalArgumentException(
                "Codigo invalido"
        );
    }
}


