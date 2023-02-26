/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningjava;

/**
 *
 * @author Usuario
 */
public class Caneta {
    
    /*Atributos: características. Tipo e nome. */ 
    
  public String modelo;
  public  String cor;
  private float ponta;
  protected  int carga;
  protected  boolean tampada; /* true or false */
    
    /*Metodos: ações do objeto */ 
    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("Erro! A caneta está tampada, não é possível rabiscar");
        } else{
            System.out.println("Rabiscando...");
        }
    }
    
    protected void tampar(){
        this.tampada = true;
    }
    
    protected void destampar(){
        this.tampada = false;
    }
    
   public void status(){
        System.out.println("Essa caneta é " + this.cor); /* this é autorefrencia. O retorno será referente ao objeto que chamou o metodo */ 
        System.out.println("Essa caneta está tampada?" + this.tampada);
        System.out.println("A ponta é de " + this.ponta);
        System.out.println("A carga está em " + this.carga);
 
    }
}
