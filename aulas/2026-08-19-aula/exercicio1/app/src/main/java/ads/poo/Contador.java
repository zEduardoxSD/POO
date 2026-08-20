package ads.poo;

public class Contador {
    private int valorContador;

    public void atribuirValor(int valorAtual){
        valorContador = valorAtual;
    }
    public void incrementar(){
        valorContador++;
    }
    public int obterValor(){
        return valorContador;
    }
}
