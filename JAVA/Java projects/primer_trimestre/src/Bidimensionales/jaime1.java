/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bidimensionales;

/**
 *
 * @author nuria
 */
public class jaime1 {//rellena una matriz con 1 y 0

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] patri = new int[4][3];
        for (int i = 0; i < patri.length; i++) {
            for (int m = 0; m < patri[i].length; m++) {
                 
if(i==m){
    patri[i][m]=1;
}
else{
    patri[i][m]=0;
}

            }
        }
    }
}
  