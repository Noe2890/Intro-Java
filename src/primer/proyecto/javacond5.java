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
public class javacond5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   int suma = 0,num;
          Scanner leer = new Scanner(System.in);
   System.out.println("Ingrese el numero límite");
       int limite = leer.nextInt();
 
       do {
       System.out.println("Ingrese un numero");
      num=leer.nextInt();
      suma=(suma+num);
       }
       while(suma<=limite);
       
        System.out.println("La suma es " + suma + " y ha superado el limite");
    }
    
}
