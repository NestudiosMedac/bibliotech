/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TIPI;

import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);//aqui pides en nombre y la edad
        System.out.print("Introduce tu nombre: ");
        String nom = teclado.next();
        System.out.print("Introduce tu edad: ");
        int edad = teclado.nextInt();
        //int resta, resta2
      int jubil=edad-65;//operaciones
      int falta=65-edad;//esto se puede hacer en los parentesis de las condiciones
      
        if (edad>=18&& edad>=65){//aqui solo entras si ya eres abuelo
            //aquí dentro podría ponerse esas operaciones
            //resta=edad-65
            //crear variable edad de jubilacion
            System.out.println("Sr./Sra. "+nom+", llevas "+jubil+" años jubilado/a.");
            
             }else if(edad>=18&& edad<65){ //aqui entras si eres mayor de edad
                System.out.println("Sr./Sra. "+nom+", te quedan todavia "+falta+" años para ser jubilado/a.");
                
                  }else{// aqui te echa cuando eres menor
                    System.out.println("Emm no eres mayor de edad ERROR...");
    }
  }
}

