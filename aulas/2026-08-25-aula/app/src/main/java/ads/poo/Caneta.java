package ads.poo;

public class Caneta {

    private String cor;
    private double nivelTinta;

    public Caneta(String cor, double nivelTinta) {
        this.cor = cor;
        this.nivelTinta = nivelTinta;
    }
    public Caneta(int nivelTinta) {
        this("azul", nivelTinta);
    }
    public Caneta() {
        this(100);
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public double desenhar(int x1, int x2, int y1, int y2){
        double distancia = 0.0;
        double tinta = 0.0;
        distancia = Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));
        double desenho = nivelTinta - (distancia/100);
        if (desenho >= 0){
            tinta = desenho;
        }else tinta = -1;
        return tinta;
    }
    public String toString(){
        return "Cor: " + cor + "\nTinta: " + nivelTinta;
    }










}
