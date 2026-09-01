//Funcionario file
public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;
    private int idade;
    private String sexo;
    private int numero;



//construtor
public Funcionario(){}

public Funcionario(String nome, String sobrenome, double salarioMensal, 
     int idade, String sexo, int numero){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salarioMensal = salarioMensal;
        this.idade = idade;
        this.sexo = sexo;
        this.numero = numero;

    }
}

//TestaFuncionario file
public class TestaFuncionario{
    public static void main(String[] args){
        Funcionario f1 = new Funcionario("camila", "Reis", 1621, 20, "female", 123);
    }
}

//Produto file
public class Produto{
    private String nome;
    private double preco;
    private int qtdEstoque;

    //construtores
    public Funcionario(String nome, String preco, double qtdEstoque){
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    //metodos
     public void adicionaEstoque(int qtde){
       qtdEstoque = qtdEstoque + qtde;
    }

    public void reajustaPreco(double percentual){
     preco = preco + (preco * percentual / 100);

    }

    public void exibeInfo(){

        System.out.println("produto: " + nome);
        System.out.println("preco: " + preco);
        System.out.println("quantidade disponivel: " + qtdEstoque);
    }

}

//TestaProduto file
public class TestaProduto{
    public static void main(String[] args) {
        Produto p1 = new Produto("teclado", 100, 3);
        p1.exibeInfo();
        p1.adicionaEstoque(3);
        p1.reajustaPreco(5);
        p1.exibeInfo();
    }

}
