/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Concesionario.Exceptions;

/**
 *
 * @author Nuria package Excepciones;
 */
public class ConcesionarioException extends Exception {

    public ConcesionarioException() {
        super();
    }

    public ConcesionarioException(String mns) {
        super(mns);
    }

    public String TamErrorManagement() {
        return "No puedes crear un concesionario sin espacio.";
    }

    

}
