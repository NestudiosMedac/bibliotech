/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Gomez_Martin_Nuria;

/**
 *
 * @author nuria
 */
public class Tablet {

    String marca;//Establecemos las variables
    String modelo;
    int ram;
    double camara;
    double peso;
    double tam;
    double version;

    boolean encendido;

    public Tablet(String marca, String modelo, int ram, double camara, double peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.camara = camara;
        this.peso = peso;
        this.tam = 10.1;
        this.version = 11.0;

        this.encendido = false;
    }

    public void encender() {//creamos la acción
        this.encendido = true;
        if (this.encendido==true) {
            System.out.println("La tablet esta encendida ^-^");
            System.out.println("Marca: " + this.marca);
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Version de Android: " + this.version);
        }else{
            System.out.println("Oye! La tablet ya esta encendida...");
        }
    }

    public void apagar() {//creamos accion de apagar
        if (this.encendido==true) {//solo si la tablet esta encendida
            this.encendido=false;
            System.out.println("La tablet se ha apagado T-T");
        } else{
            System.out.println("Oye! La tablet ya esta apagada...");
        }
    }

    public String toString() {//toString hace que muestre lo que tiene la/el tablet por pantalla.
        String res = "\nCaracteristicas de la Tablet:\n";
        res += marca + " - " + modelo + "\n";
        res += "Version de Android  " + this.version + "\n";
        res += "Tamano  " + this.tam + " pulgadas.\n";
        res += "Pesa " + this.peso + " gramos.\n";
        res += "Camara con " + this.camara + " megapixeles.\n";
        if (this.encendido) {
            res += "La tablet esta encendida.\n";
        } else {
            res += "La tablet esta apagada.\n";
        }
        return res;
    }
}
