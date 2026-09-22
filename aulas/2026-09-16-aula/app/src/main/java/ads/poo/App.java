package ads.poo;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.oned.EAN13Writer;
import net.datafaker.Faker;

import java.util.HashMap;

public class App {
    int n = 0;

    public void menu() {
        while (true) {
            IO.println("Opção 1: Cadastro de livro");
            IO.println("Opção 2: Listar ISBN e Titulo");
            IO.println("Opção 3: Consultar pelo ISBN");
            IO.println("Opção 4: Consultar Pelo Autor");
            IO.println("Opção 5: Consultar pelo ano de publicação");
            IO.println("Opção 6: Atualizar dados de um livro");
            IO.println("Opção 7: Remover um livro");
            IO.println("Opção 8: Sair");
            n = Integer.parseInt(IO.readln("Entre com a opção desejada: "));
            if (n == 1){
                cadastrar();
            }else if(n == 2){
                listarTodos();
            } else if (n == 3) {
                consultaIsbn();
            } else if (n == 4) {
                consultaAutor();
            } else if (n == 5) {
                consultaAno();
            } else if (n == 6) {
                atualizarLivro();
            } else if (n == 7) {
                removerLivro();
            } else if (n == 8) {
                break;
            }
        }
    }

    private HashMap<String, Livro> livros = new HashMap<>();


    public void cadastrar() {
        String isbn = IO.readln("Entre com o ISBN: ");
        String nome = IO.readln("Entre com o nome do livro: ");
        String autor = IO.readln("Entre com o autor do livro: ");
        String data = IO.readln("Entre com o ano de publicação do livro: ");
        Livro livro = new Livro(isbn, nome, autor, data);
        if (livros.containsKey(isbn)) {
            IO.println("Livro ja cadastrado");
        } else {
            livros.put(isbn, livro);
        }
    }
    public void listarTodos(){
        for (var elemento : livros.entrySet()) {
            System.out.println("ISBN: " + elemento.getKey());
            System.out.println("Título: " + elemento.getValue().getAutor());
        }
    }
    public void consultaIsbn(){
        String isbn = IO.readln("Entre com o ISBN: ");
        Livro a = livros.get(isbn);
        System.out.println(livros.get(isbn).getISBN());
        System.out.println(livros.get(isbn).getTitulo());
    }
    public void consultaAutor(){
        String autor = IO.readln("Entre com o autor: ");
        if (livros.containsValue(autor)){
            System.out.println(livros.get(autor).getISBN());
            System.out.println(livros.get(autor).getTitulo());;
        }else{
            System.out.println("Autor inexistente no cadastro");
        }
    }

    public void consultaAno(){
        String data = IO.readln("Entre com a data desejada para busca: ");
        System.out.println(livros.get(data).getDataPublicacao());
    }
    public void atualizarLivro(){
        String isbn = IO.readln("Qual o isbn do livro? ");
        Livro a = livros.get(isbn);
        String titulo = " ";
        String ano = " ";
        String autor = " ";
        if(a != null){
             titulo = IO.readln("Entre com o titulo(vazio para manter): ");
             ano = IO.readln("Entre com o ano de publicação vazio para manter): ");
             autor = IO.readln("Entre com o autor(vazio para manter): ");
        }else {
            IO.println("Livro inexistente no cadastro");
        }
        if(titulo.isEmpty()){
            IO.println("Cadastro atualizado");
        }else {
            a.setTitulo(titulo);
        }
        if(ano.isEmpty()){
            IO.println("Cadastro atualizado");
        }else {
            a.setDataPublicacao(ano);
        }
        if(autor.isEmpty()){
            IO.println("Cadastro atualizado");
        }else {
            a.setAutor(autor);
        }
    }
    public void removerLivro(){
        String isbn = IO.readln("Entre com o ISBN que deseja excluir: ");
        Livro a = livros.remove(isbn);
        if (a != null){
            IO.println("Livro removido");
        }else IO.println("Livro inexistente");
    }

    public static void main(String[] args) {
      //  App a = new App();
        // a.menu();
        int largura = 105;
        int altura = 5;
        String isbn = "9788576053576";
        EAN13Writer writer = new EAN13Writer();
    // Gera a matriz de bits para o formato EAN_13
        BitMatrix bitMatrix = writer.encode(isbn, BarcodeFormat.EAN_13, largura, 1);
    // Renderiza o código de barras usando blocos cheios █ e espaços em branco
    // https://www.unicodepedia.com/unicode/block-elements/2588/full-block/
        for (int i = 0; i < altura; i++) {
            for (int x = 0; x < bitMatrix.getWidth(); x++) {
                if (bitMatrix.get(x, 0)) {
                    System.out.print("\u2588");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Quebra de linha para a próxima camada da barra
        }
        System.out.println("ISBN-13: " + isbn);
        Faker faker = new Faker();
        
    }
}



