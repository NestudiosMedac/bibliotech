
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nuria
 */
public class act1_hay_2a {

    public static void main(String[]args) {
        Scanner teclado=new Scanner(System.in);
          System.out.println("Introduzca el primer numero: ");
              int a = teclado.nextInt(); 
          System.out.println("Introduzca el segundo numero: ");
              int b = teclado.nextInt();    
    if(a>b)
    {
  System.out.println("El mayor es "+a+"el menor es "+b);
    }
    else
    {
  System.out.println("El mayor es "+b+"y el menor es "+a);
        }
    }
}   