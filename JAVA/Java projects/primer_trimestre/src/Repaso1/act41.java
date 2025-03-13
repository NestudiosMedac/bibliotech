/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author Nuria
 * 41. Algoritmo que solicite al usuario un numero entero y a continuación muestre la tabla
de multiplicar de ese número hasta el 10. Pej:
 */
public class act41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Tabla de multiplicar de? ");
        int num = teclado.nextInt();
        int mul; 
        
      
        for (int i = 1; i <=10; i++) {
         mul=num*i;
         System.out.println(num+"x"+i+"="+mul);
        }
    }
}
