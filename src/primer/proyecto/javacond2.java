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
public class javacond2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String clave="eureka";
       
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra clave");
        String palabra=leer.next();
        
        if (palabra.equals(clave)){
         System.out.println("Correcto! =D");
        }
        else {
        System.out.println("Lo siento, no es la palabra clave =(");}
    }
    
}
