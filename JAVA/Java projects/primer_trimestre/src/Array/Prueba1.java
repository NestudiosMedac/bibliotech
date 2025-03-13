/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;
import java.util.Scanner;
/**
 *
 * @author Nuria
 */
public class Prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       String chico[]=new String[10];
        String grande[]=new String[14];
       String S="sitio";
       
       int i;
       int escoger;
       for(i=0;i<grande.length; i++){
           grande[i]= S;
       }
       for(i=0;i<chico.length; i++){
           chico[i]=S;
    }
        System.out.println("APARCAMIENTOS MEDAC NOVA");
        System.out.println("------------------------");
        
        do{
            System.out.println("1) Aparcar vehiculo.");
            System.out.println("2) Sacar vehiculo.");
            System.out.println("3) Mostrar aparcamiento.");
            System.out.println("4) Salir.\n");
            System.out.println("Opcion??");
            escoger=teclado.nextInt();
        
            if (escoger==3){
                 System.out.println("Situación del aparcamiento: ");
                     System.out.println("Parking grande=");
                         for(i=0;i<grande.length; i++){
                             System.out.println("["+grande[1]+"]");
                                 }
                                 System.out.println("Parking chico=");
                                 for(i=0;i<chico.length; i++){
                                        System.out.println("["+chico[1]+"]");
    }
            }while ((escoger=<1)||(escoger>=4));
           System.out.println("Error");
        
       
