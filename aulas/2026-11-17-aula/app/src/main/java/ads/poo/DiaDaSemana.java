package ads.poo;

public enum DiaDaSemana {
    DOMINGO(1, "dom"),
    SEGUNDA(2, "seg"),
    TERCA(3, "ter"),
    QUARTA(4, "qua"),
    QUINTA(5, "qui"),
    SEXTA(6, "sex"),
    SABADO(7, "sab");



    public final int codigo;
    public final String extenso;


    DiaDaSemana(int codigo, String extenso){
        this.codigo = codigo;
        this.extenso = extenso;
    }

    @Override
    public String toString() {
        return "DiaDaSemana{" +
                "codigo=" + codigo +
                ", extenso='" + extenso + '\'' +
                '}';
    }
}
