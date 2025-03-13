/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Persona;

import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class TestPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el nombre");
        String nombre = teclado.next();
        System.out.println("Introduce la edad");
        int edad = teclado.nextInt();
        while (edad < 0) {
            System.out.println("Valor incorrecto");
            edad = teclado.nextInt();
        }
        System.out.println("Introduce el sexo (chico/chica)");
        String sexo = teclado.next();//true masc/false fem
        while (!sexo.equalsIgnoreCase("chico") && !sexo.equalsIgnoreCase("chica")) {
            System.out.println("Introduce uno de los valores validos");
            sexo = teclado.next();
        }
       
        
        System.out.println("Introduce el pais (Espania, Bulgaria, Colombia o Venezuela)");
        String pais = teclado.next();
        while (!pais.equalsIgnoreCase("Espania") && !pais.equalsIgnoreCase("Bulgaria") && !pais.equalsIgnoreCase("Colombia") && !pais.equalsIgnoreCase("Venezuela")) {
            System.out.println("Vuelve a introducir el pais");
            pais = teclado.next();
        }
        Persona random = new Persona(nombre, edad, true, pais);

        int a;
        int opcion;

        do {
            System.out.println("Que quieres hacer?");
            System.out.println("1-Saludar.\n2-Mostrar datos.\n0-Fin.");
            a = teclado.nextInt();

            if (a != 0) {
                switch (a) {

                    case 1 -> {
                        System.out.println("Que quieres hacer?(obligatorio seleccionar)");
                        System.out.println("1-Saludo preestablecido.\n2-Saludo de friki de navidad.\n3-Saludo de rarito.");
                        opcion = teclado.nextInt();
                    }

                    case 2 ->
                        random.mostrarDatos(nombre, edad, sexo, pais);

                    default ->
                        System.out.println("Introduzca uno de los numeros del menu.");
                }
            }
        } while (a > 0);
    }
}
