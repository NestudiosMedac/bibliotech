/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Mamifero;

/**
 *
 * @author nuria
 */
public class MamiferoTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro yira= new Perro("yira", "bull terrier", 4, 30, 14);
        Gato ifrit=new Gato("Azul", 4, 4, 15);
        
        yira.comunicarse();
        ifrit.comunicarse();
    }
    
}
