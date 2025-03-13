package Array;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nuria
 */
//pide 10 notas  y las asigna a 10 cajones
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime tus notas: ");
        int nota;
        double lista[] = new double[10];

      for (int a=0; a<lista.length ; a++){
       do {
        if ((nota>=0) || (10=<nota)){
           System.out.println("Mete un valor valido: ");
                nota=teclado.nextInt();
          }
          } while ((0 >=nota) || (nota=<10));
                }
        System.out.println("Es: "+lista[a]);
    
    }

}