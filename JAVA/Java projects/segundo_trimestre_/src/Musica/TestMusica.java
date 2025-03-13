/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Musica;

/**
 *
 * @author Nuria
 */
public class TestMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
   Nota no = new Nota("do", 3);
   Nota si = new Nota("si", 3);
        Partitura Patata= new Partitura("Patata", "autor");
       
        Patata.addNota(no);
        Patata.addNota(si);
        Patata.numNotas();
        for (int i = 0; i <Patata.listaNotas.length; i++) {
            System.out.println(Patata.listaNotas[i]);
        }
        
        System.out.println(Patata);
        
   
        
  
    }   
}
