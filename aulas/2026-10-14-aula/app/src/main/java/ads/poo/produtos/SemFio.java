package ads.poo.produtos;

import ads.poo.Dimensao;

public class SemFio extends Produto {
    private double frequencia;
    private int canais;
    private double distanciaOperacao;

    public SemFio(String modelo, int codigo, String numSerie, double peso, Dimensao dimensao) {
        super(modelo, codigo, numSerie, peso, dimensao);
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "freq: " + frequencia + ", " + "canais: " + canais + ", " + "dist: " + distanciaOperacao;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public int getCanais() {
        return canais;
    }

    public void setCanais(int canais) {
        this.canais = canais;
    }

    public double getDistanciaOperacao() {
        return distanciaOperacao;
    }

    public void setDistanciaOperacao(double distanciaOperacao) {
        this.distanciaOperacao = distanciaOperacao;
    }
}
