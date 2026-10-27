package ads.poo;

public class Circulo extends Formas {
    private double raio;

    public Circulo(int xIni, int yIni, String cor, double raio) {
        super(xIni, yIni, cor);
        this.raio = raio;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcularArea() {
        double area = Math.PI * Math.pow(raio, 2);
        return Math.round(area);
    }

    @Override
    public double calcularPerimetro() {
        double perimetro = 2 * Math.PI * raio;
        return Math.round(perimetro);
    }
}
