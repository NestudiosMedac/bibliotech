package Problemas_Bucles;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nuria
 */
public class ej40 { //el 39 y el cuarenta son iguales, el 39 un factorial y ya.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el número n: ");
        int n = teclado.nextInt();
        System.out.println("Dame el número m: ");
        int m = teclado.nextInt();
        int factorial = 1, factorial2 = 1, factorial3 = 1, oper;

        if (m >= n) {
            for (int i = 1; i <= n; i++) {//asi se hace un factorial
                factorial *= i;
            }
            for (int i = 1; i <= m; i++) {
                factorial2 *= i;
            }
            for (int i = (m - n); i > 1; i--) {
                factorial3 *= i;
            }
            oper = factorial2 / (factorial * factorial3);
            System.out.println("El numero combinatorio es:" + oper);
        } else {
            System.out.println("error");
        }
    }
}
