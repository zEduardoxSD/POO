package ads.poo;

public class Cartas {
    protected Valores valor;
    protected Naipes naipe;

    public Cartas(Valores valor, Naipes naipe) {
        this.valor = valor;
        this.naipe = naipe;
    }





    @Override
    public String toString() {
        return valor + " " + naipe;
    }
}
