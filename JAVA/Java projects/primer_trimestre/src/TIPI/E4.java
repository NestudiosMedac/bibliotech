
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nuria
 */
public class E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
            int edad = teclado.nextInt();
            // esta hecho a la puta carrera y mal
            if(edad<5){
                System.out.println("Pagas 1 euro");
    }else if (edad>=6 && 14>=edad){
                System.out.println("Pagas 11, 75 euros");
    }else if (edad>14 && edad<50){
                System.out.println("Pagas 12");
    }else if (edad>50 && edad<70){
                System.out.println("Pagas 11, 25 euros");
    }else if (edad>70){
                System.out.println("Pagas 1 euro");
            
    }else{ //queda por arreglar el error
                System.out.println("error");
    }
  }  
}
// precio Final= precioNormal-(precio Normal*0.25)



