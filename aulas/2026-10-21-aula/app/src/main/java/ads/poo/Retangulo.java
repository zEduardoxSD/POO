package ads.poo;

public class Retangulo extends Formas {
    private double xFinal;
    private double yFinal;

    public Retangulo(int xIni, int yIni, String cor, double xFinal, double yFinal) {
        super(xIni, yIni, cor);
        this.xFinal = xFinal;
        this.yFinal = yFinal;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double calcularArea() {
        double base = xFinal - xIni;
        double altura = yFinal - yIni;
        double area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double base = xFinal - xIni;
        double altura = yFinal - yIni;
        double perimetro = (2*base) + (2*altura);
        return perimetro;
    }
}
