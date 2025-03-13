/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;


/**
 *
 * @author nuria
 * 32. Escriba un programa que pida un número al usuario. Si el
 * número introducido no es divisible por 2 y 3 entonces el programa mostrará un
 * mensaje de error y volverá a pedir un número al usuario. En caso de que el
 * número sea divisible por dichos números se mostrará el resultado de dividirlo
 * por ellos y se terminará el programa.
 */
public class act32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num= teclado.nextInt();
        int div2;
        int div3;
        while (!(num%2==0) || !(num%3==0)){       
            System.err.println("Error");
            System.err.print("Introduce otro numero: ");
            num= teclado.nextInt();
        }        
        div2=num/2;
        div3=num/3;
        
        System.out.println("El resultado de dividir "+num+" por 2 es "+div2+" y al dividirlo por 3  es "+div3);
        }
    }
    

