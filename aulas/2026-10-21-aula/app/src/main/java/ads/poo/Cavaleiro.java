package ads.poo;

public class Cavaleiro extends Personagem {
    public Cavaleiro() {

        super(50, 3, 2);
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
