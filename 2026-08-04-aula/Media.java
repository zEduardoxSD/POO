public class Media {
    public static void main(String[] args){
        String nome = IO.readln("Entre com seu nome: ");
        double nota1 = Double.parseDouble(IO.readln("Entre com a primeira nota: "));
        double nota2 = Double.parseDouble(IO.readln("Entre com a segunda nota: "));
        double media = Math.round((nota1+nota2) / 2);
        if (media >= 6){
            System.out.println("Parabéns você foi aprovado");
        }else System.out.println("Infelizmente você foi reprovado");
        System.out.println(nome + ", Sua media foi de " + media);
    
    }

}