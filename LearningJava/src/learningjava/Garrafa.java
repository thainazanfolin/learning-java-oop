/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package learningjava;


public class Garrafa {
   
   String cor;
   String marca;
   float capacidade;
   boolean tampada;
   boolean cheia;
   
  
   
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
        
    }
    

