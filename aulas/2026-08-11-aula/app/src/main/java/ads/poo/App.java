package ads.poo;

public class App {

    public static void main(String[] args) {
        String nome = IO.readln("Entre com seu nome: ");
        System.out.println("Olá "+ nome);
        int contador = 0;
        for(String aux: args){
            if (aux.equals("POO")){
                System.out.println("Acertou");
            }else {
                contador++;
              }
            }
        System.out.println("Total de argumentos diferentes de POO: "+ contador);
        }

    }

