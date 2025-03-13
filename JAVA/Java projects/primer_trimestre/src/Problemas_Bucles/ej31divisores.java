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
public class ej31divisores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num= teclado.nextInt();

       
        
        
    for (int d=1; d<=num; d++){
        if (num%d==0){    
        System.out.println("los divisores son: "+d);
       }
    }   
  }
}