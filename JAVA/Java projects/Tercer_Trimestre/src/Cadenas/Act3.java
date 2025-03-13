package Cadenas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nuria
 */
public class Act3 {

    /**
     * 3. Realiza un programa que, dada una cadena, imprima dicha cadena al
     * revés (en orden inverso).
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ca = "Hola que tal";//los string en si son arrays xd

        for (int i = (ca.length() - 1); i > 0; i--) {
            System.out.println(ca.charAt(i));
        }
    }

}
