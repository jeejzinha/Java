/**************************************************************
                   Aula 01 Java 17/08/2026
                         Exercicio 01
                    Printe um "ola mundo" 
                       feito pela jeej                             
***************************************************************/

public class ex01 {
  
    public static void main(String[] args) {
       System.out.println("ola mundo");
    }
    
}


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
       Faça um algoritmo q converte celcius em fahrenheit 
                       feito pela jeej                             
***************************************************************/

import java.util.Scanner;
public class Ex04 {
    public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);

    System.out.print("temperatura em graus celcius:");
    double graus = entrada.nextDouble();

    double F = 1.8 * graus + 32;


   System.out.printf("resposta: %.2f", F);
    entrada.close();
    
}
}

/**************************************************************
                   Aula 01 Java 17/08/2026
                         Exercicio 05
               Reajuste o salario do usuario 
                       feito pela jeej                             
***************************************************************/

//salario menor q 1500, reajuste de 7%; salario maior
//ou igual a 1500, reajuste de 5.25%

import java.util.Scanner;
public class Ex05 {

    public static void main(String[]args){
    Scanner entrada = new Scanner(System.in);

    System.out.print("seu salario:");
    double sal = entrada.nextDouble();
    double nsal; 
   if (sal < 1500) {
        nsal = sal + sal * 0.07;

   }
    else  {
        nsal = sal + sal * 0.0525;
    }

     System.out.printf("seu novo salario: %.2f", nsal);
    entrada.close();
    
    
}
}

















