package ads.poo;

import java.time.LocalDate;
import java.util.HashMap;

public class Contato {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private HashMap<String, Telefone> telefones;
    private HashMap<String, Email> emails;

    public Contato(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.telefones = new HashMap<>();
        this.emails = new HashMap<>();
    }
    public boolean addTelefone(String rotulo, String valor){
        boolean mensagem = false;
        if (!telefones.containsKey(rotulo)){
            telefones.put(rotulo, new Telefone(valor));
            mensagem = true;
        }
        return mensagem;
    }
    public boolean addEmail(String rotulo, String valor){
        boolean mensagem = false;
        if (!emails.containsKey(rotulo)){
            emails.put(rotulo, new Email(valor));
            mensagem = true;
        }
        return mensagem;
    }
    public boolean removeTelefone(String rotulo){
        boolean mensagem = false;
        if (telefones.containsKey(rotulo)){
            telefones.remove(rotulo);
            mensagem = true;
        }
        return mensagem;
    }
    public boolean removeEmail(String rotulo){
        boolean mensagem = false;
        if (emails.containsKey(rotulo)){
            emails.remove(rotulo);
            mensagem = true;
        }
        return mensagem;
    }
    public boolean updateTelefone(String rotulo, String valor){
        boolean mensagem = false;

        Telefone telefone = telefones.get(rotulo);

        if (telefone != null){
            telefone.setValor(valor);
             mensagem = true;
        }
        return mensagem;

    }

    public boolean updateEmail(String rotulo, String valor){
        boolean mensagem = false;
        Email email = emails.get(rotulo);
        if (email != null){
            email.setValor(valor);
        }
        return mensagem;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataNasc=" + dataNasc +
                ", telefones=" + telefones +
                ", emails=" + emails +
                '}';
    }
}
