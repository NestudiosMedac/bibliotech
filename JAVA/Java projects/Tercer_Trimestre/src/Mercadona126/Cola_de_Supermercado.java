/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mercadona126;

import java.util.ArrayList;

/**
 *
 * @author nuria
 */
public class Cola_de_Supermercado {

    //crear contructor con el array dentro
    private  ArrayList<Persona> cola;

    public Cola_de_Supermercado() {
        this.cola = new ArrayList<>();

    }

    public boolean EstaVacia() {

        //System.out.println("La cola esta vacia");
        return this.cola.isEmpty();//devuelve Verdadero o Falso si la cola está vacía o no.
    }

    public void Entrar(Persona a) {//mete una persona en la cola.
        this.cola.add(a);
    }

    public void Salir() {//saca una persona en la cola.Muestra la información de esa persona.
        System.out.println(this.cola.get(0));//da la info
        this.cola.remove(0);//la quita

    }

    public int Cantidad() {//devuelve el número de personas que hay en la cola
        int tam = this.cola.size();
        return tam;

    }

    public Persona Primero() {//este método devuelve una persona. La persona devuelta será la que está primera en la cola. Nota: No muestra nada por pantalla
        if (EstaVacia()) {
            return null;
        }
        return this.cola.get(0);
    }
}
