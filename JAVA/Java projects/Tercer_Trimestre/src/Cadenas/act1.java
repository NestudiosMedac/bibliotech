package Cadenas;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nuria
 */
public class act1 {

    /**
     * 1. Realiza un programa que, dada una cadena o texto, imprima cada
     * carácter en una línea separada.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "Buenas tardes";
        String car_sep;
        for (int i = 0; i < frase.length(); i++) {
            car_sep=frase.charAt(i)+"\n";
            System.out.println(car_sep);
        }
        

    }

}
