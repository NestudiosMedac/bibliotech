/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Poo;


import java.util.Scanner;

/**
 *
 * @author nuria
 */
public class TestHeroe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int isma=7;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Vamos a crear un super heroe");
        System.out.println("Introduce un nombre ");
        String nombre= teclado.next();
        System.out.println("Introduce edad ");
        int edad = teclado.nextInt();
        System.out.println("Introduce altura ");
        double altura = teclado.nextDouble();
        
        System.out.println("Introduce sexo(M/F): ");
        String sexo = teclado.next();
        boolean res=true;
        if(sexo.equalsIgnoreCase("M")){
            res= false;
        }
        
        
        // Creación de un objeto
          //Heroe otro= new Heroe (Nombre , altura, edad, sex);
        Heroe popote = new Heroe("Super Isma", 1.80, 18, false);
      
        //consultar y cambiar atributos
       System.out.println(popote.nombre);
        
        popote.nombre="Super Ismael";
        System.out.println("Altura:"+popote.altura);//asi con todos
        System.out.println("Sexo"+popote.sexo);
        if (popote.sexo==true){
            System.out.println("Es chica");
        }else{
            System.out.println("Es chico");
        }
          popote. volar();//acciones,
    }
    
}
