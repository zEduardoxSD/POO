package ads.poo;

public class Linha extends Desenho {
    private int xFinal;
    private int yFinal;

    public Linha(int xIni, int yIni, String cor, int xFinal, int yFinal) {
        super(xIni, yIni, cor);
        this.yFinal = yFinal;
        this.xFinal = xFinal;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String desenhar() {
        return "Desenhando uma linha de : "  + " " + xFinal +" e " + yFinal + "até: " + xIni +  " e " + yIni + "Na cor: "+ cor;
    }
}
