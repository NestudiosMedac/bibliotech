/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mientras;

import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class mientras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el usuario: ");
        String usu = teclado.next();
        System.out.print("Introduce la contraseña: ");
        String contr = teclado.next();

        String usucorrecto = "MedacNova";
        String contracorrecto = "Mara2122";
        int intento = 1;
        while (!usu.equals(usucorrecto) && !contr.equals(contracorrecto) && intento < 4) {
            System.out.println("Intento " + intento + " vuelve a intentarlo");
            System.out.print("Introduce el usuario: ");
            usu = teclado.next();
            System.out.print("Introduce la contraseña: ");
            contr = teclado.next();
            intento++;

        }
        if (intento >= 4) {
            System.out.println("Fin");

        } else {
            System.out.println("Welcome");
        }
    }

}
