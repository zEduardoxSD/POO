package ads.poo;

import edu.princeton.cs.algs4.Draw;

public class Desenhar extends Cartas{
    protected double x;
    protected double y;


    public Desenhar(Valores valor, Naipes naipe, double x, double y) {
        super(valor, naipe);
        this.x = x;
        this.y = y;
    }

    public String nomeDaImagem(){
        return this.valor.simbolo+this.naipe+".png";

    }
    public void desenhar(Draw draw) {
        draw.picture(this.x, this.y, "cartas/" +this.nomeDaImagem());
    }
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
