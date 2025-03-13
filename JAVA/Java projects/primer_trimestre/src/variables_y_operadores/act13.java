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
public class act13 {

   public static void main(String[]args) {
        Scanner teclado=new Scanner(System.in);
          System.out.println("Introduzca el ancho de la habitación: ");
              int ancho = teclado.nextInt(); 
           System.out.println("Introduzca el largo de la habitación: ");
              int largo = teclado.nextInt(); 
           System.out.println("Introduzca la medida del lado de una valdosa: ");
              int ladvaldos = teclado.nextInt();
           System.out.println("Precio de una valdosa: ");
             int precio = teclado.nextInt(); 
             int area=(ancho*largo)*100;
             int cantvaldos= (int)Math.ceil(area/(ladvaldos*2));
             int preciofinal= cantvaldos*precio;
                     
            System.out.println("La cantidad necesaria es: "+cantvaldos);
            System.out.println("El precio es...........: "+preciofinal);
                     
    }
    
}
