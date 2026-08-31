//Pessoa file
public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    
    //getters e setters
    
    //nome
    public String getNome() {
        return nome;
    }
    
    public String setNome(String n){
        nome = n;
        
    }
    
    //cpf
    public String getCpf() {
        return cpf;
    }
    
    public String setCpf(String c){
        cpf = c;
        
    }
    
    //idade
    public int getIdade() {
        return idade;
    }
    
    public int setIdade(int i){
        idade = i;
        
    }
	
}



//TestaPessoa file
 public class TestaPessoa {
     public static void main(String[] args) {  
     
     p1.setNome("Joberval");
     Pessoa p1 = new Pessoa();
     p1.setCpf("538.239.348-64");
     p1.setIdade(24);
     
     Pessoa p2 = new Pessoa();
     
     p2.setNome("Aildo");
     p2.setCpf("306.891.408-60");
     p2.setIdade(20);
     
     Pessoa p3 = new Pessoa();
     
     p3.setNome("Juju do Pix")
     p3.setCpf("103.883.308-64")
     p3.setIdade(35)
 }
 
System.out.println("Pessoa 1: " + p1.getNome() + " | CPF: " + p1.getCpf() + " | Idade: " + p1.getIdade());
System.out.println("Pessoa 2: " + p2.getNome() + " | CPF: " + p2.getCpf() + " | Idade: " + p2.getIdade());
System.out.println("Pessoa 3: " + p3.getNome() + " | CPF: " + p3.getCpf() + " | Idade: " + p3.getIdade());
 
 }
 
 
 
 
 
 
 //Swapper file
public class Swapper {
    private float x;
    private float y;

    // getters e setters
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    //trocar x e y
    public void magica() {
        float ax = x;
        x = y;
        y = ax;
    }
}

// TestaSwapper file
public class TestaSwapper {
     public static void main(String[] args) {
         
         
     }
