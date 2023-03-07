
package projetobanco;

public class ContaBanco {
    
   //atributos
    
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    
      //metodo construtor 
        public ContaBanco(){
                            
                   this.saldo = 0; 
                   this.status = false;
        }
        
        // duvida no construtor: usar set e getters? acusa erro
        
   //getters

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isStatus() {             // metodo booleano fica como IS
        return status;
    }
    
    //setters

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    // métodos
    
    public void abrirConta(String t){
        
        this.setTipo(t);     //setando o atributo da conta com o parametro
        this.setStatus(true);     //status true, conta aberta
        
        if ("cp".equals(t)){            // função equals faz a comparação entre os valores, mas pode usar os operadores tambem
            this.setSaldo(150);   // ao abrir uma conta cp, o dono recebe 150 reais. Nao precisa somar, pois a conta nao existia, logo, está zerada
        }
        
        if (t == "cc"){
            this.setSaldo(50);    // ao abrir uma conta cc, o dono recebe 50 reais. Nao precisa somar, pois a conta nao existia, logo, está zerada
        }
    }
    
    public void fecharConta(){  // retirar o saldo. Se estiver negativo, não permitir o fechamento (mostrar erro)
            if (this.getSaldo()>0){
                System.out.println("Conta com dinheiro");
            } 
            
            if (this.getSaldo()<0) {
                System.out.println("Conta em débito");
            } 
            
            if (this.getSaldo()==0) {
                this.setStatus(false);      //fechando a conta
            }
    }
    
    public void depositar(double valorDep){    //parametro: valor a ser depositado, passado na main
      
        if (isStatus() == true) {
            this.setSaldo(this.getSaldo() + valorDep);         //setando o valor com o saldo antigo + o deposito
            System.out.println("Depósito realizado");
            System.out.println("Saldo atual: " + this.getSaldo());
        } else{
            System.out.println("Você ainda não tem uma conta");
        }     
    }
   
    public void sacar(double valorSaque){           // TODO: fazer com set e get
        if (this.getSaldo() >= valorSaque){                   //permite o saque apenas se o valor do saldo for maior ou igual ao pedido de saque, ou seja, se houver saldo suficiente
             this.setSaldo(this.getSaldo() - valorSaque);
        }
        if (this.saldo < valorSaque) {
            System.out.println("Saldo insuficiente para realizar o saque");     // caso nao houver saldo suficiente
        }
       
    }
    
    public void pagaMensal(){
        if ("cc".equals(this.getTipo())){
            this.setSaldo(getSaldo() - 12);        // retira 12 reais da conta cc toda vez que for chamado 
        }
        
        if(this.getTipo() == "cp"){
            this.setSaldo(getSaldo() - 20);
        }
    }
    
    public void statusAtual(){
        System.out.println("Numero da conta: " + getNumConta());
        System.out.println("Dono da conta: " + getDono());
        System.out.println("Tipo da conta: " + getTipo());
        System.out.println("Saldo atual: " + getSaldo());
    }
}
