import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Define o tipo de variaveis
        int janeiro,fevereiro,marco,abril;
        String nome;
        Scanner teclado = new Scanner( System.in);

        // Da o valor da variaveis
        System.out.print("Qual é o seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Quanto foi o seu salario em Janeiro? ");
        janeiro = teclado.nextInt();
        System.out.print("Quanto foi o seu salario em Fevereiro? ");
        fevereiro = teclado.nextInt();
        System.out.print("Quanto foi o seu salario em Março? ");
        marco = teclado.nextInt();
        System.out.print("Quanto foi o seu salario em Abril? ");
        abril = teclado.nextInt();

        //Faz o cálculo das variaveis dadas 
        int total = janeiro+fevereiro+marco+abril; //Soma todos os meses
        int media = total/4; // Divide o total por 4

        //Format faz com que as variaveis sejam substituidas or caracteres
        System.out.format("Seu nome é: %s \nSeu salario foi no total de : %d \nSua média foi: %d \n", nome,total,media);

    }
}
