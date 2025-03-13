/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Gomez_Martin_Nuria;
/**
 *
 * @author nuria
 */
import java.util.Scanner;

public class T1P3E1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int tam;
        System.out.println("APARTADO A");
        do {
            System.out.print("Introduce un valor mayor a 1: ");
            tam = teclado.nextInt(); //pide al usuario
            if (tam < 1) {//en esta condicion obligas a que sea mayor de 1 el num que mete el usu
                System.out.println("Error! El numero tiene que ser mayor que 1 bobx!");//Aqui te dice que te has confundido
            }
        } while (tam <= 1);//Al estar todo dentro de un bucle pues te va a pedir el numero hasta que sea mayor o igual a 1
        //APARTADO B NO SE MUESTRA
        int matriz[][] = new int[tam][tam]; //crea matriz del tamaño que mete el usu(mayor de 1)
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * (20 - 2 + 1) + 2); //aqui va introduciendo los valores del math random
            }
        }

       System.out.println("APARTADO C");

        for (int i = 0; i < matriz.length; i++) {//muestra la matriz por pantalla
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 10 ) {
                    System.out.print("0" + matriz[i][j] + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println("");
        }

        System.out.println("APARTADO D");

        int copia[][] = new int[tam][tam];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 10) {// es como en array literalmente, limitas a que solo entren los menores de 10
                    copia[i][j] = matriz[i][j];//y se crean la copia solo de esos valores
                } else {
                    copia[i][j] = 9;// coje esa copia y lo sustiuye por el nueve
                }
            }
        }
        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia[i].length; j++) {
                if (copia[i][j] < 10) {
                    System.out.print("0" + copia[i][j] + " ");
                } else {
                    System.out.print(copia[i][j] + " ");
                }
            }
            System.out.println("");
        }
        
         System.out.println("APARTADO E");//no funciona correctamente
       int mul;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                mul=matriz[i][j]*matriz[i][j];//aqui se van multiplicando los valores de la matriz como en array. 
                //mul=ultimo valor  valor y va quedando en el contedor hasta que se acaba de recorrer.
                System.out.println("La multiplicacion de los elementos de la matriz es: " + mul);//muestra la multiplicacion
            }
        }
     
        
       System.out.println("APARTADO F");

        int suma = 0;//en esta variable va a ser el apoyo(contendor)
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];//aqui sumando a "suma" los valores de la matriz. 
                //suma=ultimo valor + siguiente valor y va quedando en el contedor hasta que se acaba de recorrer.
            }
        }
        System.out.println("La suma de los elementos de la matriz es: " + suma);//muestra la suma

        

        for (int i = 0; i < copia.length; i++) { //aqui ya solo la recorre mostrandolo                
            for (int j = 0; j < copia[i].length; j++) {//igual que en el c pero es con copia
                if (copia[i][j] < 10) {
                    System.out.print("0" + copia[i][j] + " ");
                } else {
                    System.out.print(copia[i][j] + " ");
                }
            }
            System.out.println("");
        }

        System.out.println("APARTADO G");

        int num;
        do {
            System.out.print("Dime que fila debo intercambiar (1 a " + tam + "): ");
            num = teclado.nextInt();
            if (num < 1 || num > tam) {
                System.out.println("Que bobx! El numero tiene que ser de 1 a " + tam);
            }
        } while (num < 1 || num > tam);// En este bucle es como en el primer apartado, tambien te va a llamar bobx

        int extra;
        for (int i = 0; i < matriz[num - 1].length; i++){//en
            extra = copia[num - 1][i];
            copia[num - 1][i] = matriz[num - 1][i];
            matriz[num - 1][i] = extra;
        }

        System.out.println("Matriz:"); //muestra la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] < 10) {
                    System.out.print("0" + matriz[i][j] + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println("");
        }

        System.out.println("Copia:"); //muestra copia
        for (int i = 0; i < copia.length; i++) {
            for (int j = 0; j < copia[i].length; j++) {
                if (copia[i][j] < 10) {
                    System.out.print("0" + copia[i][j] + " ");
                } else {
                    System.out.print(copia[i][j] + " ");
                }
            }
            System.out.println("");
        }

        teclado.close();
    }
}

