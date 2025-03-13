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
public class ej42 {//cuadrado

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero base: ");
        int base= teclado.nextInt();
       int i, f;
        
       for (f=0; f<=base; f++){
            for (i=0; i<=base; i++){
             System.out.print(" * ");
        }
            System.out.println("");//esto es lo que hace que se ponga abajo
     }  
   }
}
