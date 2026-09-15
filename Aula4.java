public class Laser {
    //atriutos
    private String fornecedor;
    private double alcance;
    private double precisao;
    private double medida;

    //construtores
  //Laser file 
  public Laser (String fornrcedor, double alcance, double precisao,
    double medida){
        this.fornecedor = fornrcedor;
        this.alcance = alcance;
        this.precisao = precisao;
        this.medida = medida;
    }

    //metodos
    public String getFornecedor(){
        return fornecedor;
    }
    public void setFornecedor(String fornecedor){
        this.fornecedor = fornecedor;
    } 

    public double getAlcance(){
        return alcance;
    }
    public void setAlcance(double alcance){
        this.alcance = alcance;
    } 
    public double getPrecisao(){
        return precisao;
    }
    public void setPrecisao(double precisao){
        this.precisao = precisao;
    } 

    public double getMedida(){
        return medida;
    }
    public void setMedida(double medida){
        this.medida = medida;
    } 
}


//TestaLaser file

//ComparaCores file

import java.util.ArrayList;
import java.util.Collections;
//psvm + tab

public class ComparaCores {
    public static void maing(String[] args){
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Vermelho");
        c1.add("Rosa");
        c1.add("Roxo");
        c1.add("Amarelo");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vermelho");
        c2.add("Rosa");
        c2.add("Roxo");
        c2.add("Amarelo");

        if(c1.size() == c2.size() && 
        c1.containsAll(c2) &&
        c2.containsAll(c1) ){
        System.out.println(c1.containsAll(c2));
    }
}
}
