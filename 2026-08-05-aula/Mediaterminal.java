
public class Mediaterminal {

    public static void main(String[] args) {

        if (args.length <= 1) {
            System.out.println("Número de argumentos inválido");
        } else {
            double n1 = Double.parseDouble(args[0]);
            double n2 = Double.parseDouble(args[1]);
            double media = Math.round((n1 + n2) / 2);
            System.out.println("A sua média é: " + media);
            if (media >= 6) {
                System.out.println("Parabéns você foi aprovado!");
            } else {
                System.out.println("Infelizmenzte você reprovou");
            }
        }
    }
}
