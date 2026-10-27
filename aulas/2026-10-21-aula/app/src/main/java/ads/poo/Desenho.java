package ads.poo;

public class Desenho {
    protected int xIni;
    protected int yIni;
    protected String cor;

    public Desenho(int xIni, int yIni, String cor) {
        this.xIni = xIni;
        this.yIni = yIni;
        this.cor = cor;
    }

    public String desenhar(){

        return "a";
    }
    @Override
    public String toString() {
        return "Desenho{" +
                "xIni=" + xIni +
                ", yIni=" + yIni +
                ", cor='" + cor + '\'' +
                '}';
    }
}
