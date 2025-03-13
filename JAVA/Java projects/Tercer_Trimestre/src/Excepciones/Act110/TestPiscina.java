/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones.Act110;

/**
 *
 * @author Nuria
 */
public class TestPiscina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Piscina Charco = new Piscina((int) (Math.random() * (100 - 1 + 1) + 1));
        try {
            for (int i = 0; i < 5; i++) {//Añadir
            
                Charco.ponerAgua((int) (Math.random() * (25 - 1 + 1) + 1));
                System.out.println(Charco.getNivel());
            }
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
        try {
            for (int i = 0; i < 5; i++) {//Quitar
            
                Charco.quitarAgua((int) (Math.random() * (25 - 1 + 1) + 1));
                System.out.println(Charco.getNivel());
            }
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
