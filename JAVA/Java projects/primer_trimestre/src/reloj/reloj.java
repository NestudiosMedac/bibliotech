/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reloj;


/**
 *
 * @author nuria
 */
public class reloj { //relojTest

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //apartado d
        
        relojtipo casio= new relojtipo(24, 58, 73);
        casio.adelantarHora();
        System.out.println(casio);
        casio.encenderse();
        casio.adelantarSegundos(120);
        System.out.println(casio);
        casio.adelantarSegundos(5);
        System.out.println(casio);
        
     
        }
    

    }

