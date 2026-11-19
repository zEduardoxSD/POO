package ads.poo;

public enum Naipes {
    PAUS("p"),
    OURO("o"),
    COPAS("c"),
    ESPADA("e");

    public final String codigo;

    Naipes(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return codigo;
    }

    public static Naipes getCodigo(String c) {
        for (Naipes v : Naipes.values()) {
            if (c == v.codigo) {
                return v;
            }
        }
        throw new IllegalArgumentException(
                "Naipe invalido"
        );
    }
}


