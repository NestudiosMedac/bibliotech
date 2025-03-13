/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria
 * 8. Crea un algoritmo que simule el lanzamiento de un dado de N
 * caras. El número de caras del dado se solicitará por teclado
 */
public class act8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.err.println("Introduce el numero de caras");
        int n= teclado.nextInt();
        
        int dado=(int) (Math.random()*(n-0+1)+0);
        
        System.out.println("Si el dado es de "+n+" caras el resultado aleatorio es: "+dado);
        teclado.close();
        
    }
    
}
