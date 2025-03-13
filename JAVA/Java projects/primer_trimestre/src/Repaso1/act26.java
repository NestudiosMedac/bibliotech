/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

import java.util.Scanner;

/**
 *
 * @author nuria 26. El sistema de verificación en dos pasos funciona de la
 * siguiente manera:
 *
 * • Se le pide al usuario que introduzca su nick, su email y la contraseña.x
 *
 * •Si el email y la contraseña son correctos (los datos se dicen en clase), el
 * programa va a generar un número aleatorio de 4 cifras y lo va a mostrar por
 * pantalla.x
 *
 * • A continuación se vuelve a pedir el email, la contraseña y, esta vez, el nú
 * mero aleatorio.
 *
 * • Si todo ha ido correctamente, se mostrará el mensaje: “Verificación
 * aceptada Bienvenid@: xxxxxx (siendo xxxxxx el nick del usuario).
 *
 * • Si hay algún fallo, se mostrará un mensaje de error.x
 *
 */
public class act26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el nick: ");
        String nick = teclado.next();
        System.out.print("Introduce el email: ");
        String email = teclado.next();
        System.out.print("Introduce la password: ");
        String pswd = teclado.next();

        String cemail = "julian@gmail.com";
        String cpswd = "1234";
        int veri = (int) (Math.random() * (9999 - 1111 + 1) + 1111);
        int veri2;

        if (cemail.equals(email) && cpswd.equals(pswd)) {//no se usa == es valor2.equals(valor1)
            System.out.println("El numero de verificacion es: " + veri);
            System.out.print("Introduce el email: ");
            email = teclado.next();
            System.out.print("Introduce la password: ");
            pswd = teclado.next();
            System.out.print("Introduce la verificacion: ");
            veri2 = teclado.nextInt();
            if (cemail.equals(email) && cpswd.equals(pswd) && veri2 == veri) {
                System.err.println("Verificacion aceptada. Bienvenidx: " + nick);
            } else {
                System.err.println("ERROR");
            }

        } else {
            System.err.println("ERROR");
        }
        teclado.close();
    }

}
