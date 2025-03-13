/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;
import javax.print.attribute.standard.Media;

/**
 *
 * @author Nuria
 * 38. Queremos realizar un algoritmo que vaya pidiendo una
 * sucesión de notas por teclado hasta que se introduzca el valor -1. Tras eso
 * se mostrará la media aritmética de las notas introducidas. Importante: Hay
 * que controlar que los valores de las notas introducidas sea el correcto
 * (entre 0 y 10)

 */
public class act38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int num;
         int suma=0;
        int conta = 0;
        int contafinal=conta;
        
        do {
            Scanner teclado = new Scanner(System.in);
            System.out.print("Dame un numero: ");
            num = teclado.nextInt();
            if(num>=0 && num<=10){
            conta++;
            for (int i = 0; i <= contafinal; i++) {
            suma+= num;
                    }
        }else if (num!=-1){
                    System.out.println("Illo mete un numero valido. ");
                    
                            }
        } while (num!=-1);
        
        System.out.println("La nota media es: "+(suma/conta));
    }
    
}
