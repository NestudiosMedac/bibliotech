/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplo_Composicion;

/**
 *
 * @author nuria
 */
public class testArbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Arbol pino= new Arbol (30, "conifera", 150, 100);
       pino.germinarHojas();
       System.out.print(pino);
    }
    
}
