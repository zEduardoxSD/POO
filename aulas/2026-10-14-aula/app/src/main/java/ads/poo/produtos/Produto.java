package ads.poo.produtos;

import ads.poo.Dimensao;

public class Produto {
    protected String modelo;
    protected int codigo;
    protected String numSerie;
    protected double peso;
    protected Dimensao dimensao;


    public Produto(String modelo, int codigo, String numSerie, double peso, Dimensao dimensao) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.numSerie = numSerie;
        this.peso = peso;
        this.dimensao = dimensao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "modelo='" + modelo + '\'' +
                ", codigo=" + codigo +
                ", numSerie='" + numSerie + '\'' +
                ", peso=" + peso +
                ", dimensao=" + dimensao +
                '}';
    }
}
