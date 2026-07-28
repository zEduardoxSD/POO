void main (){
    String buffer = IO.readln("Entre com a sua idade: ");
    int idade = Integer.parseInt(buffer);
    char sexo = IO.readln("Entre com seu sexo(M/F): ").toUpperCase().charAt(0);
    if (sexo == 'M' && idade >= 18)
        IO.println("Você deve entregar o Atestado de reservista");
    else 
        IO.println("Você não precisa apresentar o atestado");
}