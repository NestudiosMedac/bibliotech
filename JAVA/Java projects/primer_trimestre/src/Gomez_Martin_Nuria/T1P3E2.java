/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Gomez_Martin_Nuria;
/**
 *
 * @author nuria
 */
public class T1P3E2 {
    public static void main(String[] args) {
        Tablet toshiba = new Tablet("Toshiba", "nuevo idea", 1, 5.2, 100.92);//Aqui creamos el tablet con sus caracterisicas
       
        toshiba.encender();//aqui estan las acciones que vamos a hacer, se enciende, y se apaga 2 veces
        toshiba.apagar();
        toshiba.apagar();
      
        System.out.println(toshiba.toString());//Aqui  muestra el/la tablet con sus características
    }
}