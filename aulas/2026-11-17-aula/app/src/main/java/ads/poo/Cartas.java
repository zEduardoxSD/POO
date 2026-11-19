package ads.poo;

public class Cartas extends Desenhar {
    protected Valores valor;
    protected Naipes naipe;

    public Cartas(Valores valor, Naipes naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }

    public String nomeDaImagem(){
       return this.valor.simbolo+this.naipe+".png";

    }



    @Override
    public String toString() {
        return valor + " " + naipe;
    }
}
