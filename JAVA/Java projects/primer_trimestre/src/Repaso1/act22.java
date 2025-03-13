package Repaso1;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nuria 22. Necesitamos realizar un algoritmo que dados un mes (número
 * del 1 al 12) y un año introducidos por el usuario, indique si ese mes tiene
 * 31, 30, 29 o 28 días. Recuerda que en los años bisiestos, Febrero tiene 29
 * días y no 28.
 */
public class act22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un year y un mes: ");
        int year = teclado.nextInt();
        int mes = teclado.nextInt();

        int bisiesto = year % 4;

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 9 || mes == 11) {
            System.out.println("El mes tiene 31 dias.");

        } else if (mes == 4 || mes == 6 || mes == 8 || mes == 10 || mes == 12) {
            System.out.println("El mes tiene 30 dias.");
        } else if (mes == 2 && bisiesto == 0) {
            System.out.println("El mes tiene 29 dias.");

        } else if (mes == 2 && bisiesto != 0) {
            System.out.println("El mes tiene 28 dias.");
        }else{
            System.err.println("ERROR"); 
        }
        teclado.close();
    }
}
