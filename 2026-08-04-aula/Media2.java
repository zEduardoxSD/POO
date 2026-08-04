public class Media2{
    public static void main(String[] args) {
        double matriz[][] = new double[3][3];
        for(int i = 0; i < 3; i++){
            for (int j = 0; j < 2; j++) {
            matriz[i][j] = Double.parseDouble(IO.readln("Entre com a nota: "));
        }
        matriz[i][2] = (matriz[i][0] + matriz[i][1]) / 2;
     }
     for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        IO.print(String.format("%,2f ", matriz[i][j]));
        }
         IO.println();
     }
    }
}