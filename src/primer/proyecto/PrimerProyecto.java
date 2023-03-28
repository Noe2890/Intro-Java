/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primer.proyecto;


import java.io.Console;
import java.util.Scanner;
import javafx.scene.text.Text;

/**
 *
 * @author Usuario
 */
public class PrimerProyecto {

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
  	boolean logico;
        int num1;
        int num2;
        int centi;
        float faren;
        int edad = 32;
        String nombre;
        double num3;
        double result;
        
        Scanner leer = new Scanner(System.in);
    /*    Scanner leerNom = new Scanner(System.in);
        System.out.println("Ingrese un numero ");
        num1 = leer.nextInt();
        System.out.println("Ingrese otro numero ");
        num2 = leer.nextInt();
        num1 = num1 + num2;
        System.out.println("La suma es " + num1);
        
        System.out.println("INGRESE Una Frase");
        nombre = leer.nextLine();
        System.out.println(nombre.toUpperCase());*/
        
    
        System.out.println("Ingrese un numero");
      /*  centi=leer.nextInt();
        faren= 32 +(9*centi/5);*/
      num3=leer.nextDouble();
        System.out.println(num3*2);
        System.out.println(num3*3);
        System.out.println(Math.sqrt(num3));
      
    }

}

