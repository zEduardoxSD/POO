package ads.poo.produtos;

import ads.poo.Dimensao;

public class Telefone extends Produto {
    private String tipo;

    public Telefone(String modelo, int codigo, String numSerie, double peso, Dimensao dimensao) {
        super(modelo, codigo, numSerie, peso, dimensao);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}



