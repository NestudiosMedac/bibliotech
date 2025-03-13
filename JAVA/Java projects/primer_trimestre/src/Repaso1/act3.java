/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce 5 numeros: ");
        int num1= teclado.nextInt();
        int num2= teclado.nextInt();
        int num3=teclado.nextInt();
        int num4=teclado.nextInt();
        int num5=teclado.nextInt();
        
       double media= (num1+num2+num3+num4+num5)/5;
        System.out.println("La media es: "+media);
        teclado.close();
    }
    
}
