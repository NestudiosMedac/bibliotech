/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Poo;

/**
 *
 * @author nuria
 */
public class Heroe {

    //atributos de clase
    String nombre;
    double altura;
    int edad;
    boolean sexo; //true-fem ; false-masc
    //Atributos para controlar estados//atributos propios para funcionar
    boolean vida; //true-muerto; false-morido
    int energia; //controla los puntos de vida del heroe
    final int MAXENERGY=100;
    //metodo constructor

    public Heroe(String nombre, double altura, int edad, boolean sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.altura = altura;

        //atributos propios para funcionar
        this.vida = true;//siempre esta vivo
        this.energia = 100;
    }

    //metodo de clase-ACCIONES
    public void volar() {
        if (this.vida) {
            System.out.println(this.nombre + "esta volando!!");
            this.energia -= 10;
           this.comprobarmuerte();

        } else {
            System.out.println(this.nombre + "no puede volar porque esta morido");

        }
    }

    public void dormir() {
        if (this.vida) {
            System.out.println(this.nombre + "esta durmiendo.");
            this.energia += 20;//this.energia=MAXENERGY;
            if(this. energia>=this.MAXENERGY){
                this.energia=this.MAXENERGY;
            }
        } else {
            System.out.println(this.nombre + " está muerto");

        }
    }

    public void pelear() {
        if (this.vida) {
            if(this.energia>=30){
            System.out.println(this.nombre + "esta dandose de ostias con Evilcente");
            this.energia -= 30;
           this.comprobarmuerte();//invoca un metodo
            
           }else{
            System.out.println(this.nombre + " no tiene energia suficiente para pelear");
            }
            
        } else {
            System.out.println(this.nombre + " está muerto");

        }
    }

    public void comprobarmuerte() {
   if(this. energia<=0){
                this.vida=false;
                System.out.println(this.nombre + " ha muerto");

        }
    }
}
