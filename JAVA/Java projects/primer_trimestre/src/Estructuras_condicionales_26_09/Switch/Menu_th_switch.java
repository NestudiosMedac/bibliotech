/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nuria
 */
        import java.util.Scanner;


public class Menu_th_switch {
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        System.out.println("1-Nueva partida.\n2-Cargar partida.\n3-Opciones.\n4-Salir.");
         int a= teclado.nextInt(); 
            switch (a){
                    case 1:
                        System.out.println("Estas en una nueva partida.");
                        break;
                    case 2:
                         System.out.println("Cargando partida...");
                        break;
                    case 3: 
                       System.out.println("Estas en opciones.");
                         break;
                      case 4:
                          System.out.println("Taluego");
                             break;
                 default:
                  System.out.println("Illo tontopolla pon uno de los putos numero.");   
                    
            }
        }
    }

    