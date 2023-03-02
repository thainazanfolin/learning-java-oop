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

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public float getPonta() {
        return ponta;
    }

    public int getCarga() {
        return carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
   
   // construtor
/*
    public Caneta(String modelo, String cor) {
        this.modelo = modelo;
        this.cor = cor;
    }
    */
}
