package Mapas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author nuria
 */
public class Mapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Integer> mappy = new HashMap<>();
        Set<String> clavesitas = null;
        Collection<Integer> valores = null;

        ArrayList<Integer>lista=new ArrayList<>();
        mappy.put("Aurora", 3);
        mappy.put("Nuria", 15);
        mappy.put("Paula", 27);
        mappy.put("Ani", 34);
//mappy.size();

        Integer valor = mappy.get("Paula");
        System.out.println(valor);
        // System.out.println(mappy.containsKey("Isma"));
        //System.out.println(mappy.containsValue(3));
        // mappy.put("Alejita", 24);
        // mappy.put("Paula", 12);

        // mappy.remove("Paula");//borra y te devuelve lo que has borrado
        mappy.remove("Alejita", 45);//para borrar exactamente eso
        //.clear()
        //.isEmpty

        //  clavesitas=mappy.keySet();
        //  System.out.println(clavesitas);
        // valores=mappy.values();
        // System.out.println(valores);
        clavesitas = mappy.keySet();
        /* for (String ele : clavesitas) {//solo usar las claves
            System.out.println(ele);
            clavesitas = mappy.keySet();
        }*/
        for (HashMap.Entry<String, Integer> ele2 : mappy.entrySet()) {//entrySet te permite ver las tuplas
            System.out.println(ele2.getValue());//solo los valores
            System.out.println(ele2.getKey());//solo las claves
            System.out.println(ele2);//ambos valores
            
            Iterator<Integer> arnold=lista.iterator();
            //.hasNext()//devuelve verdadero si ve algo debajo suya y devuelve falso si no y devuelve y se muve
            //.remove()//elimina
            System.out.println(lista);
        }
    }

}
