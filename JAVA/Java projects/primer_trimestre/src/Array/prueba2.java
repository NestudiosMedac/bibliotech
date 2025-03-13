/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Array;

/**
 *
 * @author Nuria
 */
public class prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      import java.util.Scanner;

public class Aparcamiento {

    private static final int VACIO = 0;
    private static final int PEQUENA = 1;
    private static final int GRANDE = 2;
    private static final int TOTAL_PLAZAS = 24;
    private static final int PLAZAS_PEQUENAS = 14;
    private static final int PLAZAS_GRANDES = 10;

    private static int[] aparcamiento = new int[TOTAL_PLAZAS];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Menú:");
            System.out.println("1. Aparcar vehículo");
            System.out.println("2. Sacar vehículo");
            System.out.println("3. Mostrar aparcamiento");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    aparcarVehiculo();
                    break;
                case 2:
                    sacarVehiculo();
                    break;
                case 3:
                    mostrarAparcamiento();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 4);
        scanner.close();
    }

    private static void inicializarAparcamiento() {
        for (int i = 0; i < TOTAL_PLAZAS; i++) {
            aparcamiento[i] = VACIO;
        }
    }

    private static void aparcarVehiculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tamaño del vehículo (1 para pequeño, 2 para grande): ");
        int tamano = scanner.nextInt();
        int plaza = -1;

        if (tamano == PEQUENA && hayPlazasLibres(PEQUENA)) {
            plaza = encontrarPrimeraPlazaLibre(PEQUENA);
        } else if (tamano == GRANDE && hayPlazasLibres(GRANDE)) {
            plaza = encontrarPrimeraPlazaLibre(GRANDE);
        } else {
            System.out.println("No hay plazas disponibles para este tipo de vehículo.");
            return;
        }

        aparcamiento[plaza] = tamano;
        System.out.println("Vehículo aparcado en la plaza " + (plaza + 1));
    }

    private static boolean hayPlazasLibres(int tamano) {
        int contador = 0;
        for (int i = 0; i < TOTAL_PLAZAS; i++) {
            if (aparcamiento[i] == VACIO && (i < PLAZAS_PEQUENAS || tamano == GRANDE)) {
                contador++;
            }
        }
        return contador > 0;
    }

    private static int encontrarPrimeraPlazaLibre(int tamano) {
        for (int i = 0; i < TOTAL_PLAZAS; i++) {
            if (aparcamiento[i] == VACIO && (i < PLAZAS_PEQUENAS || tamano == GRANDE)) {
                return i;
            }
        }
        return -1;
    }

    private static void sacarVehiculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de plaza a liberar: ");
        int plaza = scanner.nextInt() - 1;

        if (plaza >= 0 && plaza < TOTAL_PLAZAS) {
            if (aparcamiento[plaza] != VACIO) {
                aparcamiento[plaza] = VACIO;
                System.out.println("Plaza " + (plaza + 1) + " liberada.");
            } else {
                System.out.println("La plaza seleccionada ya está libre.");
            }
        } else {
            System.out.println("Número de plaza no válido.");
        }
    }

    private static void mostrarAparcamiento() {
        for (int i = 0; i < TOTAL_PLAZAS; i++) {
            System.out.print("Plaza " + (i + 1) + ": ");
            if (aparcamiento[i] == VACIO) {
                System.out.println("Libre");
            } else if (aparcamiento[i] == PEQUENA) {
                System.out.println("Pequeño");
            } else if (aparcamiento[i] == GRANDE) {
                System.out.println("Grande");
            }
        }
    }
}

   