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
public class ej35multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero n: ");
        int n= teclado.nextInt();
         System.out.println("Introduce el numero m: ");
        int m= teclado.nextInt();
        int op;
        String res="";
       
        
        
    for (int d=1; d<=m*n; d++){
  
         if (d*n<n*m){
             op=(d*n);
             res+=op+",";
         }
         else if(d*n==n*m){
             op=(d*n);
             res+=op+".";
         }
         teclado.close();
       }
            System.out.println("Los multiplos entre "+n+" y "+m*n+" son: "+res);
          
    }   

}