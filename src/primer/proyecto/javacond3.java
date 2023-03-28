/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.proyecto;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class javacond3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase");
        String palabra=leer.next();
        int largo = palabra.length();
        
        if (largo==8){
         System.out.println("largo correcto");
        }
        else if(largo>8){
        System.out.println("Te pasaste de letras");}
        else{
            System.out.println("Pocas letras");}
    }

}