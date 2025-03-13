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
public class E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero entre 15 y 27: ");
        int num = teclado.nextInt();
         int maquina=(int)(Math.random()*(50-5 + 1)+5); 
          int user=(int)(Math.random()*(50-5 + 1)+5); //el user tenia ya su numero
          
        if (num>=15 && num<27){
        
          System.out.println("Tu resultado es: "+user);
          System.out.println("El resultado de la maquina es: "+maquina);
                
           }else if (num<15 || num>=27){
                 System.out.println("error, el numero esta fuera del rango.");
                 
              }if(maquina>user){
            System.out.println("El ganador es la maquina.");
        
             }else if (user>maquina){
            System.out.println("El ganador es el usuario.");
            
            }else if (num<15 || num>=27){
                 System.out.println("error, el numero esta fuera del rango.");
            
         
            }
      }

}


