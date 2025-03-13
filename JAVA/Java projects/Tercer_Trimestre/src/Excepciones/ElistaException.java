/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Excepciones;

/**
 *throw new
 * @author nuria
 */
public class ElistaException extends Exception{//como extiende de Excepction es de obligado cumplimiento
    public ElistaException(){
        super();
    }
    public ElistaException(String mns){
        super(mns);
    }
    public String danielErrorManagement(){
    return "Hola soy daniel";
    }
    public void solucion1(){
        System.out.println("Solucionado.");}
}
