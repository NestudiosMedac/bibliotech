/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria
 * 2. Solicita dos números por teclado. Muestra por pantalla la
 * suma, la resta, la multiplicación, la potencia y la división de ambos
 * números. Usa la siguiente plantilla:
 */
public class act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        int num1= teclado.nextInt();
        int num2= teclado.nextInt();
        double potencia= Math.pow(num1, num2);
      
        System.out.println("La suma de "+num1+" y "+num2+" es: "+(num1+num2));
        System.out.println("La resta de "+num1+" y "+num2+" es: "+(num1-num2));
        System.out.println("La multiplicacon de "+num1+" por "+num2+" es: "+(num1*num2));
        System.out.println("El cociente de "+num1+" entre "+num2+" es: "+(num1/num2)+" , y el resto es :"+(num1%num2));
        System.out.println("La potencia de "+num1+" elevado al "+num2+" es: "+potencia);
        teclado.close();
    }
    
}
