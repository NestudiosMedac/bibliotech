/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author nuria
 */
public class Ej2 {

    /**
     * @param args the command line arguments
    saca un nº del 5 al 10 y sus sumas */
    public static void main(String[] args) {
        int lista[] = new int[8];
        int res = 0;//java no te lo inicializa porque no le sale de los huevos
        String suma;
        System.out.println("La lista es:");
        for (int i = 0; i < lista.length; i++) {
            lista[i] = (int) (Math.random() * (10 - 5 + 1) + 5);
        }
        for (int i = 0; i < lista.length; i++) {
            res += lista[i];
            suma = res + "   ";

            System.out.print(suma);
        }
    }
}
