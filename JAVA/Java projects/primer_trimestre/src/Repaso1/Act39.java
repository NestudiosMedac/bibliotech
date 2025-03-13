/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author Nuria
 * 39. Diseña un algoritmo que calcule el factorial de un número
 * pedido por teclado. El factorial de un numero es la multiplicación desde el 1
 * hasta ese número. Pej 5! = 1*2*3*4*5 = 120

 */
public class Act39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = teclado.nextInt();
        int mul=1; //importante inicilizarla con un 1 sino te comes les moques.
        
        
        for (int i = 1; i <=num; i++) {
         mul*=i;
         
        }
        System.out.println("El factorial de "+num+" es: "+mul);
    }
    
}
