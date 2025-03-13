package Cadenas;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 * 2. Realiza un programa que, dada una cadena, imprima cada palabra en una
 * línea separada.
 *
 * @author nuria
 */
public class Act2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "Buenos dias, como estas?";
        String[] trozos;
        trozos = frase.split(" ");

        for (int i = 0; i <trozos.length; i++) {
            System.out.println(trozos[i]);
        }

    }

}
