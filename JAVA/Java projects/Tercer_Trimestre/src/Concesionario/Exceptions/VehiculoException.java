/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Concesionario.Exceptions;

/**
 *
 * @author Nuria package Excepciones;
 */
public class VehiculoException extends Exception {

    public VehiculoException() {
        super();
    }

    public VehiculoException(String mns) {
        super(mns);
    }

    public String ColorErrorManagement() {
        return "El color no está en la lista de colores permitidos.";
    }

    public String KmErrorManagement() {
        return "Los kilómetros introducidos como parámetros no sean positivos";
    }

    public String MatriculasErrorManagement() {
        return "Las matriculas introducidas como parámetros no son válidas";
    }

}