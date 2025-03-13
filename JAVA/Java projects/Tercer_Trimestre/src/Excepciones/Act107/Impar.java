package Excepciones.Act107;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Nuria
 */
public class Impar {

    int num;

    public Impar(int n) throws IllegalArgumentException {//sino lo pones la diferencia es el lugar donde ocurre con throws la esta pasando al main y ahi la controlas

        if (n % 2 == 0) {
            throw new IllegalArgumentException("Esto es par cateto");
        }
      
        this.num = n;

    }

    @Override
    public String toString() {
        return "Impar{" + "num=" + num + '}';
    }
}
