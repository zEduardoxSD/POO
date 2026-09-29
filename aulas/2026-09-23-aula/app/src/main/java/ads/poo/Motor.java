package ads.poo;

public class Motor {
    private int hp;
    private int giroAtual;
    private int cilindro;

    public Motor(int hp, int cilindro) {
        this.hp = hp;
        this.cilindro = cilindro;
        this.giroAtual = 0;
    }

    public void acelerar(int valor){
        this.giroAtual += valor;
    }

}
