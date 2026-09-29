package ads.poo;

public class Endereco {
    private String rua;
    private String bairro;
    private String cidade;
    private String numero;
    private String uf;
    private String pais;
    private String cep;

    public Endereco(String rua, String cidade, String bairro, String numero, String uf, String pais, String cep) {
        this.rua = rua;
        this.cidade = cidade;
        this.bairro = bairro;
        this.numero = numero;
        this.uf = uf;
        this.pais = pais;
        this.cep = cep;
    }
}
