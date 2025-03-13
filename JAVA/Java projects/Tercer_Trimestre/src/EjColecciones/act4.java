/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjColecciones;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 4.- Utilizando objetos de la clase Persona (hashCode y Equals) usada en el
 * ejercicio 126 (Cola de supermercado) crea un programa que haga lo siguiente:
 * • Crea 7 objetos persona diferentes y metelos en un SET • Muestra el SET por
 * pantalla • Pide al usuario por teclado un DNI • Indica si hay una persona con
 * ese DNI en el conjunto o no
 *
 * @author Nuria
 */
public class act4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona Paco = new Persona("789217N");
        Persona Sara = new Persona("789427A");
        Persona Maria = new Persona("001217H");
        Persona Rufino = new Persona("7821017Q");
        Persona Sofia = new Persona("7921217X");
        Persona Aurora = new Persona("7828217Y");
        Persona Ana = new Persona("782167Z");

        HashSet<Persona> Gente = new HashSet<>();

        Gente.add(Paco);
        Gente.add(Sara);
        Gente.add(Maria);
        Gente.add(Rufino);
        Gente.add(Sofia);
        Gente.add(Aurora);
        Gente.add(Ana);

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime un DNI: ");
        String DNI = teclado.next();
        
        
        Persona Apoyo = new Persona(DNI);
        if (Gente.contains(Apoyo)) {
            System.out.println("SI hay una persona con ese DNI.");
        } else {
            System.out.println("NO hay una persona con ese DNI.");

        }
    }

}
