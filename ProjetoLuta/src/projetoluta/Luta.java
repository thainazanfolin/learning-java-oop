/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoluta;


public class Luta {
    
    
    /*
    REGRAS DE NEGÓCIO:
    - só pode ser marcada entre lutdores da mesma categoria
    - desafiado e desafiante são pessoas diferentes (precisa dessa definicao para nao ter bugs)
    - luta começa apenas se for aprovada
    - só pode ser vitoria de um deles ou, senão, empates
    */
    
    //atributos
    private Lutador desafiado;  //  vai ser um OBJETO de lutador. Criar uma relação entre o tipo abstrato e essa classe
    private Lutador desafiante; // atributo do tipo Lutador
    private int rounds;
    private boolean aprovada;
    
    
    
    
    
    
}
