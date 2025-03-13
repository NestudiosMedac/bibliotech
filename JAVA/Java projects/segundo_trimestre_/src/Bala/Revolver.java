/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bala;

/**
 *
 * @author nuria
 */
public class Revolver {
    String marca; 
    String modelo;
    
    Bala tambor[];
    int martillo;
    
    public Revolver( String trademark, String model, int tam){
        this.marca=trademark;
        this.modelo=model;
        
        this.tambor=new Bala[tam];
        
        for (int i = 0; i < tam; i++) {
            this.tambor[i]=new Bala();
        }
        
    }
}
