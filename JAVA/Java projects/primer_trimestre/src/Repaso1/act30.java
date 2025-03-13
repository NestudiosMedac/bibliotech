/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 30. Escribe un programa que lea de teclado 2 números enteros y
 * saque en pantalla todos los números que estén entre ellos. Ejemplo: Introduce
 * primer número: 4 Introduce segundo número: 10 4,5,6,7,8,9,10 Importante: El
 * programa no debe asumir que el usuario introducirá primero el número más
 * pequeño. b) Modifica el programa para que solo escriba en pantalla los
 * números pares del intervalo
 */
public class act30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce dos numeros: ");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        if (n1 < n2) {
            for (int i = n1; i <= n2; i++) {
            if(i==n2){
                System.out.println(n2);
            }else if(i!=n2){
                System.out.print(i +", ");
            
            }
            //if(i % 2 == 0)
            }
        } else {
            for (int j = n2; j <= n1; j++) {
        if(j==n1){
                System.out.println(n1);
            }else if(j!=n1){
                System.out.print(j +", ");
            }
        }

    }
}
}