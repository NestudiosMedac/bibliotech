/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author nuria
 */
public class ej53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int anni[] = {1, 2, 3, 4, 5};
        int guango[] = {7, 2, 3};
        //int comparador= 0;
        boolean comparador = true;

        if (anni.length != guango.length) {
            comparador = false;
             //comparador=1;
        } else {
            for (int i = 0; i < anni.length; i++) {
                if (anni[i] != guango[i]) {
                    comparador = false;
                    //comparador=1;
                    i=anni.length;//forzar salida porque ya la i es mayor que la lista de anni
                }
            }
        }

        if (comparador == true) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son diferentes");
        }
    }
}
