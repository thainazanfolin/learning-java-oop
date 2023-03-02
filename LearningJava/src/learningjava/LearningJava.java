
package learningjava;


public class LearningJava {

  
    public static void main(String[] args) {
       
        /*instaciando objeto da classe já criada */ 
        Caneta c1 = new Caneta();
        
        System.out.println("Caneta 1");
        /*definindo atributos do objeto instanciado*/
        c1.cor = "azul";
        // c1.ponta = 0.5f;
        c1.tampada = false;  /*destampada*/
        
        c1.status(); /*chamada de metodo*/
        c1.tampar(); /* tampa a caneta pq o metodo dentro da classe  transforma o atributo em true */ 
        
        /* instanciando segunda caneta */
        
        Caneta c2 = new Caneta();
        
        System.out.println("Caneta 2");
        c2.cor = "preta";
      //  c2.ponta = 0.5f;
       c2.destampar();
       c2.status();
       
       // com o construtor
     
        
       /* GARRAFA */ 
       
       Garrafa garrafa1 = new Garrafa("preta", null, 1000);
       
        System.out.println("Garrafa 1");
        
        garrafa1.cheia = false;

      
        
        garrafa1.encher();
        
        // com o construtor
        Garrafa garrafa3 = new Garrafa("azul", "fresh", 1000);
                
        
        
        
        
        
    }
    
    
    
    
    
    
}
