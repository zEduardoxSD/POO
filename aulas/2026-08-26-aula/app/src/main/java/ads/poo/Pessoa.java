package ads.poo;

public class Pessoa {
    private static int contador;
    private int id = 0;
    private String nome;
    private String email;

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.id = contador ++;
    }

    @Override
    public String toString() {
        return "Pessoa{" + '\n' +
                " ID   : " + id + '\n'+
                " Nome : " + nome + '\n' +
                " Email: " + email + '\n' +
                '}';
    }

    public int getId() {
        return id;
    }
}