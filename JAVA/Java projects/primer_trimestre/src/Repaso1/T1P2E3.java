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
public class T1P2E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero n: ");
        int num = teclado.nextInt();
        int op;
        int res=0;
        String suma;

        while (-1 >= num) {//Apartado a
            System.out.println("Introduce el numero de nuevo: ");
            num = teclado.nextInt();
        }
        int original[] = new int[num];

        for (int i = 0; i < original.length; i++) {//apartado b
            original[i] = (int) (Math.random() * (20 - 1 + 1) + 1);
        }
        for (int i = 0; i < original.length; i++) {
            suma = original[i] + "   ";
            System.out.print(suma);

        
          System.out.println(" ");
        System.out.println("Introduce el primer numero: ");
        int num1 = teclado.nextInt();
                System.out.println("Introduce el segundo numero: ");
        int num2 = teclado.nextInt();

                while ((-5 > num1 || 5<num1) || (-5 > num2 || 5<num2)) {//Apartado c
            System.out.println("Introduce el numero de nuevo: ");
            num1 = teclado.nextInt();
            System.out.println("Introduce el numero de nuevo: ");
            num2 = teclado.nextInt();
        }
        int multiplicadores[] = new int[2];
         multiplicadores[0]=num1;
         multiplicadores[1]=num2;
         
         
         for (int d = 0; d < multiplicadores.length; d++) {
        op=multiplicadores[0]* original[i];
        
             System.out.println(op);
        teclado.close();

        }
       }
    } 
}
