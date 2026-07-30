final String[] SEMANA = {"SEG", "TER", "QUA","QUI","SEX"};
void main (){
    String buffer = IO.readln("Entre com a sigla da materia: ");
    String[] aula = new String[5];
    int i = 0;
    String dia;
    do {
        dia = IO.readln("Informe o dia da semana ou nao para encerrar: ");
       switch (dia) {
           case "seg" -> aula[0] = SEMANA[0]; 
           case "ter" -> aula[1] = SEMANA[1];
           case "qua" -> aula[2] = SEMANA[2];
           case "qui" -> aula[3] = SEMANA[3];
           case "sex" -> aula[4] = SEMANA[4];
           case "nao" -> i =5;
           default -> IO.println("Valor invalido");
       }
    i = i + 1;
    }
    while (i < 5);
    IO.println("Na disciplina de " + buffer + " você tem aulas nos seguintes dias: ");
    for(int j = 0; j < 5; j++){
        IO.println((" - " + aula[j]));
    }  
}