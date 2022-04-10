package Programa;

import java.util.Scanner;

public class Programa{
    public static void main(String[] args) { 

    Scanner teclado = new Scanner(System.in); 

    Aluno aluno = new Aluno();

    System.out.print("Seu nome é: ");
    aluno.nome1 = teclado.next();
    System.out.print("Seu sobrenome é: ");
    aluno.nome2 = teclado.next();
    

    Nota nota = new Nota();

    System.out.println ("Escreva sua primeira nota: ");
        nota.nota1 = teclado.nextDouble();
        
        System.out.println("Escreva sua segunda nota: " );
        nota.nota2 = teclado.nextDouble();

        System.out.println("Escreva sua terceira nota: " );
        nota.nota3 = teclado.nextDouble();

        System.out.println("Escreva sua quarta nota: " );
        nota.nota4 = teclado.nextDouble();


        aluno.nome();
        nota.total();
        nota.situacao();
    
     

    }

    
}