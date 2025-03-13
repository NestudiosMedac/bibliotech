/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TIPI;

import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);//aqui pides un nº.
        System.out.println("Introduce un numero entre entero: ");
        int num= teclado.nextInt();
        
        int resto= num%2;// estableces las operaciones
        int div= num%5;  
        // no hace falta que los separes, puedes meterlo en el if asi (num%2==0)
        if ( div==0 && resto==0){// aquí estan las condiciones
            System.out.println("El numero es par y divisible entre 5.");
             }else if(div!=0 && resto==0){
             System.out.println("El numero es par, pero no es divisible entre 5");
                }else/*if*/{
                System.out.println("El numero no es par pero es divisible entre 5");
    }
  }
}
