package variables_y_operadores;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nuria
 */
public class act8 {

 public static void main(String[]args) {
        Scanner teclado=new Scanner(System.in);
          System.out.println("Introduzca el numero de caras: ");
              int caras = teclado.nextInt(); 
              int resultado =(int)(Math.random()*(caras-0+1));
         System.out.println("El resultado es: "+resultado);
              
    }
    
}
