/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Repaso1;

/**
 *
 * @author Nuria 49.- Sea el array flags con los valores:
 * 0,1,0,-1,0,-1,-1,-1,0,0,-1. Crea un nuevo array llamado tivic que sea copia
 * del anterior. A continuación recorre el primer array (flags) y cambia todos
 * los valores negativos por el valor 8
 */
public class act49 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*int[] flags = {0, 1, 0, -1, 0, -1, -1, -1, 0, 0, -1};
        int[] tivic = new int[flags.length];

        for (int i = 0; i < flags.length; i++) {
            tivic[i] = flags[i];
            {
        for (int j = 0; j < tivic.length; j++) {
            System.out.println("" + tivic[j]);
        }*///Asi se copia un puñetero array a otro
        int[] flags = {0, 1, 0, -1, 0, -1, -1, -1, 0, 0, -1};
        int[] tivic = new int[flags.length];

        for (int i = 0; i < flags.length; i++) {
            tivic[i] = flags[i];
            if (flags[i] < 0) {
                flags[i] = 8; // Puedes cambiar esto a otro valor según tu necesidad
            }
            System.out.print(flags[i] + ",");
        }

    }

}

}
