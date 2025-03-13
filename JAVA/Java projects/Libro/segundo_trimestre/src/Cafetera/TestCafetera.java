/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Cafetera;

import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class TestCafetera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cafetera expreso = new Cafetera(1000, 0);
        int taza;
        int cafe;
        int a;
        Scanner teclado = new Scanner(System.in);
        do{
        System.out.println("Que quieres hacer?");
        System.out.println("1-Ver la cantidad de cafe actual.\n2-Vaciar cafetera.\n3-Llenar cafetera.\n4-Echar cafe.\n5-Sirve una taza.\n0-Fin.");
        a = teclado.nextInt();
        if(a!=0){
        switch (a) {
 
            case 1 -> expreso.cantidadCafe();
            case 2 -> expreso.vaciarCafetera();
            case 3 -> expreso.llenarCafetera();
            case 4 ->{
                System.out.println("Con cuantos cc vas a llenar la cafetera?");
                cafe=teclado.nextInt();
                expreso.echarCafe(cafe);
                } 
            case 5 -> {
                System.out.println("De cuantos cc es la taza?");
                taza=teclado.nextInt();
                expreso.servirTaza(taza);
                }
                
            default -> System.out.println("Introduzca uno de los numeros del menu.");
        }
        }
        }while(a>0);
    }
}
