/**************************************************************
                   Aula 01 Java 17/08/2026
                         Exercicio 02
                Pergunte o nome da pessoa e dê ola pra ela 
                       feito pela jeej                             
***************************************************************/

import java.util.Scanner;

public class ex2{
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.print("poe teu nome aqui: ");
        
        string nome = entrada.nextLine();
        System.out.println("ola, " + nome);
        entrada.close();
    }
}


/**************************************************************
                   Aula 01 Java 17/08/2026
                         Exercicio 03
                Pegue 2 notas do usuario e faca a media dele 
                       feito pela jeej                             
***************************************************************/

import java.util.Scanner;

public class ex3{
    public staric void main(String[]args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("nota 1: ");
        double nota1 = entrada.nextDouble();
        System.out.print("nota 2: ");
        double nota2 = entrada.nextDouble();
        
        double media = (nota1 + nota2)/2;
        
        System.out.printf("sua media: %.1f", media);
        entrada.close();
    }

}


/**************************************************************
                   Aula 01 Java 17/08/2026
                         Exercicio 04
                Pegue 2 notas do usuario e faca a media dele 
                       feito pela jeej                             
***************************************************************/



















