package ads.poo;

public class Avatar {
    public int pontosVida = 100;
    private int stamina = 50;
    private int pontosAtaque = 200;
    int vida = 100;
    public int aumentarVida(int estus){
        vida += estus;
        return vida;
    }
}
