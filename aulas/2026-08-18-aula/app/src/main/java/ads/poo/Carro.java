package ads.poo;

public class Carro {
    //atributos
    private int velocidadeAtual;

    //metodos
    public void acelerar(int incremento){
        velocidadeAtual += incremento;
        if (velocidadeAtual > 100){
            velocidadeAtual = velocidadeAtual - velocidadeAtual % 100;
        }
    }
    public int obterVelocidadeAtual(){
        return velocidadeAtual;
    }
   /* public int limitarVelocidade(int velocidadeAtual){
        if (velocidadeAtual > 100){
           velocidadeAtual = velocidadeAtual - (velocidadeAtual/100);
        }
        return velocidadeAtual;*/






}
