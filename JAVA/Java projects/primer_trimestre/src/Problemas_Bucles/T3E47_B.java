package Problemas_Bucles;
import java.util.Scanner;

public class T3E47_B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bolas;
        int RDM;
        int quitar;
        int quitarMAQ = 0;
        System.out.print("Introduzca el número de bolas con las que jugar: ");
        bolas = sc.nextInt();
        RDM = (int)(Math.random()*2+0);
        
        while (bolas <= 4){
            System.out.println("Déjate de tonterias.");
            bolas = sc.nextInt();
        }
        while (bolas>0){
            RDM = 1 - RDM;
            
            if (RDM == 1){
                System.out.print("Humano, elija una cantidad entre '1' y '3' a quitar: ");
                quitar = sc.nextInt();

                while ((quitar<1 || quitar>3)){  
                    System.out.println("Introduzca una cantidad correcta.");
                    quitar = sc.nextInt();
                }
                bolas -= quitar;
                if (bolas <= 0){
                    System.out.println("Pierde el humano.");
                }
            }
            else {
                if (bolas<=8){
                    
                    if (bolas == 5) {
                        quitarMAQ = 1;
                        bolas = bolas - quitarMAQ;
                    }       
                    else if (bolas == 4 || bolas == 8) {
                        quitarMAQ = 3;
                        bolas -= quitarMAQ;
                    }
                    else if (bolas == 3 || bolas == 7){
                        quitarMAQ = 2;
                        bolas -= quitarMAQ;
                    }
                    else if (bolas == 2 || bolas == 6){
                        quitarMAQ = 1;
                        bolas -= quitarMAQ;
                    }
                    else if (bolas == 1){
                        System.out.println("Mierda...");
                        quitarMAQ = 1;
                        bolas -= quitarMAQ;
                    }
                }
                else {
                    quitarMAQ = (int) (Math.random()*3+1);
                    bolas -= quitarMAQ;
                }
                System.out.println("Máquina quita " + quitarMAQ + " bolas, quedan " + bolas + ".");
                if (bolas <= 0){
                    System.out.println("Pierde la máquina.");
                }
            }
        }
    }
}