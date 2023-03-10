/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoluta;

/**
 *
 * @author Usuario
 */
public class ProjetoLuta {

   
    public static void main(String[] args) {
        
        /* instanciando 1 a 1
        Lutador lutador1 = new Lutador("Pretty boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        
        lutador1.apresentar();
        lutador1.status();
        */
        
        //instanciando lutadores em vetores     // pode fazer com for
        
        Lutador lutador[] = new Lutador[6];
        lutador[0] = new Lutador("Pretty boy", "França", 31, 1.75, 68.9, 11, 2, 1);
        lutador[1] = new Lutador("Marcos", "Brasil", 35, 1.78, 70.2, 14, 2, 3);
        lutador[2] = new Lutador("Paulo", "Brasil", 33, 1.70, 65.2, 10,4,3);
        lutador[3] = new Lutador("Pierre", "França", 30, 1.80, 72.5,11,3,1);
        lutador[4] = new Lutador("James", "Estados Unidos", 29, 1.75, 70.0, 9,3,4);
        lutador[5] = new Lutador("Jose", "Colombia", 30, 1.70, 63.2, 12,3,3);
    }
    
}
