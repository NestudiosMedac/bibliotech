/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package GUERRERO;

/**
 *
 * @author nuria
 */
public class TestGuerrero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arma miarma= new Arma("Pincho", 5, 10);
        Arma arrancapulmones= new Arma("malboro", 5, 25);

        Guerrero enfe= new Guerrero("Santi", 100, 10, 60, true, miarma);
        Guerrero jose= new Guerrero("Jose", 60, 50, 30, true, arrancapulmones);
        
        
        
        for (int i = 0; i<=7; i++){
        enfe.atacar(jose);
        jose.atacar(enfe);
        }
    }
    
    
}

