/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjColecciones;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 1.-Escribe un programa en Java que tome un arrayList de números enteros (con
 * numeros repetidos) y elimine los elementos duplicados dejando uno de ellos y
 * utilizando conjuntos. Luego, imprime la lista resultante sin duplicados,
 * usando conjuntos.
 *
 * @author Nuria
 */
public class act1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();//int es un tipo integer es una clase
        lista.add(1);
        lista.add(19);
        lista.add(78);
        lista.add(9);
        lista.add(1);
        lista.add(1);
        lista.add(19);
        lista.add(8);
        lista.add(3);
        System.out.println(lista);//como en python
        HashSet<Integer> filtro=new HashSet<>();
        for (int i = 0; i < lista.size(); i++) {
               filtro.add(lista.get(i));
        }
        
        System.out.println(filtro);
        
    }

}
