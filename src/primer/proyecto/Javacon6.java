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
public class Javacon6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1,num2;
            Scanner leer = new Scanner(System.in);
            
        do {
            System.out.println("Ingrese un numero");
             num1=leer.nextInt();
             System.out.println("Ingrese segundo numero");
             num2=leer.nextInt();
             
       System.out.println("Que operacion desea realizar?(Oprima el numero correspondente del 1 al 5)");
        
         System.out.println("1 - SUMAR");
         System.out.println("2 - RESTAR");
         System.out.println("3- MULTIPLICAR");
         System.out.println("4- DIVIDIR");
         System.out.println("5- SALIR");
         int opc=leer.nextInt();
         
       }
       while(opc != 5);
       
    }
    
}
