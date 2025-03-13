/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author nuria
 */
public class ej51{  //el 50 de los nuevos

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int lista[] = new int[100];

        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random()* 100 + 1);
        System.out.print(lista[i]+" ");
        }
        
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 5 == 0) {
        System.out.println(lista[i]+" ");
            }
        }
        
        System.out.println(" ");
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2 ==0) {
        System.out.print(lista[i]+" ");
            }
        }
        
        System.out.println(" ");
        
        int mayor = lista[0];
        int pos = 0;
        
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] > mayor) {
            mayor = lista[i];
            pos = i;
            }
        }

        System.out.println(" ");
        System.out.println("El numero es: " +mayor);
    }
}


