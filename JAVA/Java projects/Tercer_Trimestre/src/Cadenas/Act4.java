/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cadenas;

/**
 *
 * @author Nuria
 */
public class Act4 {

    /**
     * 4. Realiza un programa que , dada una cadena, cuente la cantidad de veces
     * que aparece la letra 'a' (mayúscula o minúscula) 9 10
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ca = "Me gustan las patatas";
        String[] trozos;
        trozos = ca.split("a");
        System.out.println(trozos.length-1);
    }

}
