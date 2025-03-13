/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cadenas;

/**
 *
 * @author Nuria
 */
public class act7 {

    /**
     * 7. Realiza un programa que, dada una cadena o texto, cuente la cantidad
     * de veces que aparece cada vocal.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ca = "Me gustan las patatas";
        String[] a;
        a = ca.split("a");
        String[] e;
        e = ca.split("e");
        String[] i;
        i = ca.split("i");
        String[] o;
        o = ca.split("o");
        String[] u;
        u = ca.split("u");
        System.out.println("En: "+ca);
        System.out.println("Hay "+(a.length - 1)+" a");
        System.out.println("Hay "+(e.length - 1)+" e");
        System.out.println("Hay "+(i.length - 1)+" i");
        System.out.println("Hay "+(o.length - 1)+" o");
        System.out.println("Hay "+(u.length - 1)+" u");

    }

}
