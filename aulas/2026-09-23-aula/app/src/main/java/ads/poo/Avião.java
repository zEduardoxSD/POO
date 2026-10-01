package ads.poo;


import java.util.ArrayList;

public class Avião {
    private ArrayList<MotorAviao> motores;
    private int tripulacao;
    private int passageiros;
    private double tanque;
    private boolean statusAviao;
    private int totalMotores;
    private String tipo;


    public Avião(MotorAviao motores, int tripulacao, int passageiros, double tanque, boolean statusAviao) {
        this.motores =  new ArrayList<>();
        this.tripulacao = tripulacao;
        this.passageiros = passageiros;
        this.tanque = tanque;
        this.statusAviao = statusAviao;
        for (int i = 0; i < totalMotores ; i++) {
            this.motores.add(new MotorAviao(tipo,false));
        }
    }
}
