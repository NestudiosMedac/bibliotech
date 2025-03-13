/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones.Act107;

/**
 *
 * @author Nuria
 */
public class TestImpar {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            System.out.println(new Impar(24));
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());

        }
    }
}
