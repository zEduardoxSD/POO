package ads.poo;

public class Cavaleiro extends Personagem {
    public Cavaleiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String atacar() {
        return "Cavaleiro atacando com força 3";

    }

    @Override
    public String mover() {
        return "Cavaleiro movendo com velocidade 2";

    }
}
