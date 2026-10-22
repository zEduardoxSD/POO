package ads.poo;

public class Arqueiro extends Personagem{
    public Arqueiro(int vida, int ataque, double velocidade) {
        super(vida, ataque, velocidade);
    }

    @Override
    public String atacar() {
        return "Arqueiro atacando com força 2";
    }

    @Override
    public String mover() {
        return "Arqueiro movendo com velocidade 1";

    }
}
