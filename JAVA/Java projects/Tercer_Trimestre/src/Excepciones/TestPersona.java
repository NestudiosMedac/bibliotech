/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Excepciones;

//import java.util.InputMismatchException;
//import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class TestPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Persona p=null;
       int a=5;
       try{
           System.out.println(p);
           System.out.println(a/0);}
       catch(ArithmeticException e){
           System.out.println(e.getMessage()+"=Error no se puede dividir entre 0");
       }
      
        Scanner teclado= new Scanner(System.in);
        try{
            System.out.println("Introduce un numero");
        int b=teclado.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage()+"=error porque has metido una palabra");}
    }*/
 /* Scanner teclado= new Scanner(System.in);
     String nombre= teclado.next();
     int edad=teclado.nextInt();
     if (edad<18){
     throw ...;
     }*/
        //teclado.close();
        /*
        double res;
        int num = 10, deno = 2;
        boolean salir = false;
        Scanner teclado = new Scanner(System.in);
        do {
            try {
                System.out.println("Introduce un numero");
                num = teclado.nextInt();//consume un numero que el usuario pone en el buffer
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + "=error porque has metido una palabra en el numerador"); 
                teclado.nextLine();
                
            }
         
        } while (!salir);
         salir=false;
        
        do {
            try {
                System.out.println("Introduce un numero");
                deno = teclado.nextInt();
                teclado.close();
                salir = true;

            } catch (InputMismatchException e) {
                System.out.println(e.getMessage() + "=error porque has metido una palabra en el denominador");
                  teclado.nextLine();
            }
          
        } while (!salir);

        try {
            res = num / deno;
            System.out.println("Acabo de dividir");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage() + "=error porque has metido una palabra");
        }
*/
    }

}
