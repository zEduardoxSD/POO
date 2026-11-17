package ads.poo;

import java.util.ArrayList;
import java.util.Arrays;

public class Disciplina {
    private String nome;
    private DiaDaSemana[] diasSemana;

    public Disciplina(String nome, DiaDaSemana[] diasSemana) {
        this.nome = nome;
        this.diasSemana = diasSemana;
    }

    @Override
    public String toString() {
        String dias = "";
        for (DiaDaSemana e : DiaDaSemana.values()) {
            IO.println(e);
        }
        return "Sigla= " + nome
                + "\n" +
        "Dias com aula" + "\n"
                ;

    }
}
