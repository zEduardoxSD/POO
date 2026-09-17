package ads.poo;

public class Livro {
    private String ISBN;
    private String titulo;
    private String autor;
    private String dataPublicacao;

    public Livro(String ISBN, String titulo, String autor, String dataPublicacao) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.dataPublicacao = dataPublicacao;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", dataPublicacao='" + dataPublicacao + '\'' +
                '}';
    }
}
