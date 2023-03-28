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
public class javacond4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String compara ="a";
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra=leer.next();
        String letra = palabra.substring(0,1);
        //   if (frase.substring(0 , 1).equals("A")){       
        if (letra.equals(compara)){
         System.out.println("Correcto");
        }
       
        else{
            System.out.println("Incorrecto");}
    }
    }
    