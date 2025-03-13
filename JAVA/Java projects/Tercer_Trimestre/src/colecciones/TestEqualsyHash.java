/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

/**
 *
 * @author nuria
 */
public class TestEqualsyHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arma miarma=new Arma("miarma", 20, 30);
Guerrero Juan = new Guerrero("juan", 100, 50, 80, true,miarma);

Juan.hashCode();
Juan.equals("Otro");
Juan.getClass();//devuelve la clase
System.out.println(Juan.equals(Juan));
    }
    
}
