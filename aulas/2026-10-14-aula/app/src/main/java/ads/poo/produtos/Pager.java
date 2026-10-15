package ads.poo.produtos;

import ads.poo.Dimensao;

public class Pager extends Produto {
    private int numLinhasDisplay;

    public Pager(String modelo, int codigo, String numSerie, double peso, Dimensao dimensao) {
        super(modelo, codigo, numSerie, peso, dimensao);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "NumLinhasDysplay: " + numLinhasDisplay;
    }
}
