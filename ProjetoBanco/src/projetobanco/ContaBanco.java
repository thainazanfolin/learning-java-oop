/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetobanco;

public class ContaBanco {
    
   //atributos
    
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
   //gets

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

    public boolean isStatus() {
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
    
    public void abrirConta(){
        this.status = true;     //status true, conta aberta
        
        if (this.tipo == "cp"){
            this.saldo = 150;   // ao abrir uma conta cp, o dono recebe 150 reais. Nao precisa somar, pois a conta nao existia, logo, está zerada
        }
        
        if (this.tipo == "cc"){
            this.saldo = 50;    // ao abrir uma conta cc, o dono recebe 50 reais. Nao precisa somar, pois a conta nao existia, logo, está zerada
        }
    }
    
    public void fecharConta(){  // retirar o saldo. Se estiver negativo, não permitir o fechamento (mostrar erro)
        // TODO
    }
    
    public void depositar(double valorDep){    //parametro: valor a ser depositado, passado na main
        this.saldo = saldo + valorDep;         //soma valor recebido ao saldo
    }
   
    public void sacar(double valorSaque){
        if (this.saldo >= valorSaque){                   //permite o saque apenas se o valor do saldo for maior que o pedido de saque, ou seja, se houver saldo suficiente
             this.saldo = saldo - valorSaque;
        }
        if (this.saldo < valorSaque) {
            System.out.println("Saldo insuficiente para realizar o saque");     // caso nao houver saldo suficiente
        }
       
    }
    
    public void pagaMensal(){
        if (this.tipo == "cc"){
            this.saldo = saldo - 12;        // retira 12 reais da conta cc toda vez que for chamado 
        }
        
        if(this.tipo == "cp"){
            this.saldo = saldo - 20;
        }
    }
}
