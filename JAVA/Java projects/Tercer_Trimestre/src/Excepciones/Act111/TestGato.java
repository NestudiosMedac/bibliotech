/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones.Act111;

import java.util.InputMismatchException;

/**
 *
 * @author Nuria
 */
public class TestGato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato Michi=null;
        Gato Atropellado=null;

        Michi = new Gato("michi", 8);
        try {
            Atropellado = new Gato("A", -5);
        } catch (InputMismatchException es) {
            System.out.println(es.getMessage());
        }
        try {
            Michi.setEdad(-8);
        } catch (ArithmeticException es) {
            System.out.println(es.getMessage());
        }
        try {
            Michi.setNombre("Ps");
        } catch (InputMismatchException es) {
            System.out.println(es.getMessage());
        }

    }

}
