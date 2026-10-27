package ads.poo;

public class Arqueiro extends Personagem{

    public Arqueiro() {
        super(35, 2, 1);
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
