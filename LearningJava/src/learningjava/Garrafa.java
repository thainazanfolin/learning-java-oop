
package learningjava;


public class Garrafa {
   
    
    // TODO definir privacidade
    
   public String cor;
   public String marca;
   public float capacidade;
   public boolean tampada;
   public boolean cheia;
   
  
   
   /* métodos */ 
   void tampar(){
       this.tampada = true;
    }
   
   void destampar(){
       this.tampada = false;
   }
   
    void encher(){
        if (this.cheia == true){
            System.out.println("Já está cheia");
        } else {
            this.cheia = true;
            System.out.println("Enchendo a garrafa");
        }
    }

     public void status(){
        System.out.println("Garrafa da marca:" + this.marca + "e cor " + this.cor); /* this é autorefrencia. O retorno será referente ao objeto que chamou o metodo */ 
        System.out.println("Capacidade de" + this.capacidade);
        System.out.println("Está tampada? " + this.tampada);
        System.out.println("Já está cheia? " + this.cheia);
 
    }
     
    public String getCor() {
        return cor;
    }

    public String getMarca() {
        return marca;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public boolean isTampada() {
        return tampada;
    }

    public boolean isCheia() {
        return cheia;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void setCheia(boolean cheia) {
        this.cheia = cheia;
    }
        
    
    
    
    }
    

