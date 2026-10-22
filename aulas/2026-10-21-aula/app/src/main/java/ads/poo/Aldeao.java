package ads.poo;

public class Aldeao extends Personagem {


    public Aldeao(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }


    @Override
    public String atacar() {
        return "Aldeão atacando com força 1";
    }

    @Override
    public String mover() {
        return "Aldeão movendo com velocidade 0.8";
    }
}
