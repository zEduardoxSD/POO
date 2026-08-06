
import java.util.Scanner;

public class Leitor {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        while (leitor.hasNext() == true) {
            String linha = leitor.nextLine();
            String[] aluno = linha.split(",");
            double media = Math.round((Double.parseDouble(aluno[1])+Double.parseDouble(aluno[2]))/2);
            if (media >= 6){
                System.out.println(aluno[0] + " Aprovado media: "+ media);
            }else {
                System.out.println(aluno[0] + " Reprovado, media: " + media);
            }
        }
        leitor.close();
    }
}
