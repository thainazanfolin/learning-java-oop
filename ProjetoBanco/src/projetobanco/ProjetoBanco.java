
package projetobanco;


public class ProjetoBanco {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ContaBanco conta1 = new ContaBanco();   //instanciando objeto sem parametros no construtor
        conta1.setNumConta(111);
        conta1.setDono("José");
        conta1.setStatus(true);
        conta1.abrirConta("cc");
    
        conta1.statusAtual();       // mostrando as config atuais do objeto instanciado
        
        
        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(112);
        conta2.setDono("Vitor");
        conta2.setStatus(true);
        conta2.abrirConta("cp");
        
        conta2.statusAtual();
        
    }
    
    
    
}
