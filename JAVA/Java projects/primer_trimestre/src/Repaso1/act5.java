/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;
import java.util.Scanner;
/**
 *
 * @author nuria
 * 5. Diseña un algoritmo que pida por teclado un tiempo expresado
 * en segundos y muestre por pantalla ese valor expresado en horas, minutos y
 * segundos. Prueba con 3.600 segundos que son 1 h.
 */
public class act5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado= new Scanner(System.in);
        System.err.println("Introduce x segundos:");
        int x=teclado.nextInt();
        
        int min= x/60;
        int hora=min/60;
        System.out.println("La x en segundos es: "+x);
        System.out.println("La x en min es: "+min);
        System.out.println("La x en horas es: "+hora);
        teclado.close();
    }
    
}
