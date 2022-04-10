import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String login, senha, email, nome;
        
    
        Scanner teclado = new Scanner(System.in);
        int nao;
        
        
         System.out.println("Abrindo Aplicativo.....");
        System.out.println("Você já fez login \nSe nao digite 0\nSe sim digite 1");
        nao = teclado.nextInt();

                boolean condicao = nao==0 ;
                if(condicao == true ){
                System.out.println("Abrindo área de cadastro......");
                System.out.print("Coloque seu e-mail: ");
                email = teclado.next();
                System.out.println("---------------------------");
                System.out.print("Coloque seu nome: ");
                nome = teclado.next();
                System.out.println("---------------------------");
                System.out.print("Cria sua senha: ");
                senha = teclado.next();
                } else {
                System.out.println("Abrindo área de login.....");
                System.out.print("Coloque o nome do Usuário: ");
                login = teclado.next();
                System.out.println("---------------------------");
                System.out.print("Coloque a sua senha: ");
                senha = teclado.next();
                }
        
        
        int opcao = 0;

        System.out.println("Bem-vindo a área do usuário");
        System.out.println("O que você quer acessar?");
        System.out.println("1- Perfil \n2-Menu \n3-Opção \n4-Sobre \n5-Ajuda \n6-sair");
        System.out.println("---------------------------------------");

       opcao = teclado.nextInt();

       switch (opcao) {

        case 1 : 
            System.out.println("Bem-vindo ao seu perfil");
            break;
        case 2 :
            System.out.println("O que você deseja acessa no menu?");
            break;
        case 3 :
            System.out.println("O que você deseja acessar nas opções?");
            break;
        case 4 :
            System.out.println("O que você quer saber sobre nós?");
            break;
        case 5 :
            System.out.println("Qual a sua dúvida?");
            break;
        case 6 :
            System.out.println("Saindo....");
            break;
        

       }

   
    }
}
