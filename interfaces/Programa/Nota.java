package Programa;
import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class Nota {

 double nota1, nota2, nota3, nota4 ;
 void total(){
     double total = nota1+nota2+nota3+nota4;
     System.out.println("Seu total foi: " + total);}
 Double media(){
    double media = (nota1+nota2+nota3+nota4)/4;
    System.out.println("\nSua media foi : " + media + "\n");
    return media;}
    
 void situacao(){
    if(media()>=7){System.out.println("Você foi aprovado");}
    else{System.out.println("Você foi reprovado");}
  }
 
 
 
    
        

    
    
    
    
}
