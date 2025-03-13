/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjColecciones;

import java.util.HashSet;

/**
 *
 * 3.- Dado un conjunto de NOMBRES de estudiantes que aprobaron Matemáticas y un
 * conjunto de NOMBRES de estudiantes que aprobaron Física, realiza las
 * siguientes operaciones:
 *
 * • Encuentra el conjunto de estudiantes que aprobaron solo Matemáticas. •
 * Encuentra el conjunto de estudiantes que aprobaron solo Física. • Encuentra
 * el conjunto de estudiantes que aprobaron Matemáticas pero no Física. •
 * Encuentra el conjunto de estudiantes que aprobaron Física pero no
 * Matemáticas.
 *
 * @author Nuria
 */
public class act3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet<String> Matematicas = new HashSet<>();
        Matematicas.add("Antonio");//antonio ha aprobado mates pero no fisica
        Matematicas.add("Sara");
        Matematicas.add("Nina");

        HashSet<String> Fisica = new HashSet<>();
        Fisica.add("Juan");//juan ha aprobado fisica pero no mates
        Fisica.add("Sara");
        Fisica.add("Nina");

        HashSet<String> Ambos = new HashSet<>(Matematicas);
        Ambos.retainAll(Fisica);
        System.out.println("Los estudiantes que han aprobado mates y fisica son:" + Ambos);

        HashSet<String> SoloMates = new HashSet<>(Matematicas);
        SoloMates.removeAll(Fisica);
        System.out.println("Los estudiantes han aprobado solo matematicas son:" + SoloMates);

        HashSet<String> SoloFisi = new HashSet<>(Fisica);
        SoloFisi.removeAll(Matematicas);
        System.out.println("Los estudiantes han aprobado solo fisica son:" + SoloFisi);

        System.out.println("Los estudiantes que han aprobado mates pero no fisica son:" + Ambos + " y " + SoloMates);//es decir contando a Sara y Nina
        System.out.println("Los estudiantes que han aprobado mates pero no fisica son:" + Ambos + " y " + SoloFisi);//es decir contando a Sara y Nina
    }
}
