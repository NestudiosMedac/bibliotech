/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Problemas_Bucles;

import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class ej33potencianomath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero base: ");
        int base= teclado.nextInt();
         System.out.println("Introduce el numero exponente: ");
        int exponente= teclado.nextInt();
        
        
          for (int d=1; d<=exponente; d++){
        int oper= base*d;  
        System.out.println("La potencia es: "+oper);
        }  
    }
}
