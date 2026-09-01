//TestaAluno file

public class TestaAluno {
    public static void main(String[] args){
        Aluno a1 = new Aluno("ale", 5.5, 3.0);
        a1. exibeInfo();

        Aluno a2 =new Aluno("Jessia");
        a2.exibeInfo();

        /*
        //a1.nome = "Ale";
        a1.setNome("ale");
        a1.setNota1(5.5);
        a1.setNota2(5.5);
        //a1.nota1 = 6.5;
       // a1.nota2 = 8.0;


        Aluno a2 = new Aluno();
        a2.setNome("jeej");
        a2.setNota1(5.5);
        a2.setNota2(5.5);
        // a2.nome = "jessica";
        // a2.nota1 = 9.5;
        // a2.nota2 = 10.0;

       a1.exibeInfo();
       double m1 = a1.calculaMedia();
       String s1 = a1.situacao();
       System.out.printf("media: %.1f | %s\n", m1, s1);

       a2.exibeInfo();
       double m2 = a2.calculaMedia();
       String s2 = a2.situacao();
       System.out.printf("media: %.1f | %s\n", m2, s2);

    //    a1.situacao();
    //     String situacao1 = a1.situacao();
    //    System.out.println(situacao1);
    // 
    /* */
    }
    
}



//Aluno file


public class Aluno {
    //atributo
    private String nome;
    private double nota1;
    private double nota2;

    //construtores
    public Aluno(String nome, double nota1, double nota2){
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;

    }
    public Aluno(String nome){
        this.nome = nome;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }

    //metodos
    public double calculaMedia(){
        double soma = nota1 + nota2;
        return soma / 2;
    }

    public void exibeInfo() {
        System.out.printf("%s | %.1f | %.1f%n", nome, nota1, nota2);
    }  
    
     public String situacao() {
        String situacao ;
        
        double media = calculaMedia(); //return "Aprovado"
        if (media >= 5 ) {
            situacao = "aprovado";
        }
        else {
            situacao = "reprovado"; //return "reprovado"
        }
        return situacao;
        
        
    }

    //guetters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String n)
    {nome = n;}

    public double getNota1(){
        return nota1;
    }
    public void setNota1(double nota){
        if(nota >= 0.0 && nota <= 10.0){
        nota1 = nota;                       //encapsulamento
        }
       
    }

        public double getNota2(){
        return nota2;
    }
    public void setNota2(double nota){
        nota2 = nota;
    }
}

//TestaContador file

public class TestaContador {
    public static void main(String[] arg) {
        Contador c = new Contador();
        System.out.printf("Contador = %d\n", c.getValor());

        c.incrementa();
        c.incrementa();
        c.incrementa();

        System.out.printf("Contador = %d\n", c.getValor());

        c.zera();
         System.out.printf("Contador = %d\n", c.getValor());
    
    }
}


// Contador file

public class Contador {
    private int valor;
    

    public void incrementa(){

        valor = valor + 1; //valor++
    }
    public void zera(){
         valor = 0;
        
    }
    public int getValor(){
        return valor;

    }

}



