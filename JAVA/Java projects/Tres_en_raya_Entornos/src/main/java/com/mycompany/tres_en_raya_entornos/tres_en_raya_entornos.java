package com.mycompany.tres_en_raya_entornos;

import java.util.Scanner;

public class tres_en_raya_entornos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ficha jugador = new Ficha("[x]");
        JugadorHumano jorge = new JugadorHumano("Jugador");
        ControlJuego controlJuego = new ControlJuego();
        boolean salir = false;

        do {
            System.out.println("\nMenú:");
            System.out.println("1. Iniciar partida");
            System.out.println("2. Hacer movimiento");
            System.out.println("3. Ver tablero");
            System.out.println("4. Consejo de la IA");
            System.out.println("5. cambiar nombre del jugador");
            System.out.println("6. cambiar forma de la ficha");
            System.out.println("7.ver nombre del jugador");
            System.out.println("8. ver forma de la ficha");
            System.out.println("9. Finalizar partida");
            System.out.println("0. Salir");
            System.out.print("Ingrese la opción deseada: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    controlJuego.iniciarPartida();
                    break;
                case 2:
                    System.out.println("Pon las coordenadas del movimiento (x y): ");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    controlJuego.hacerMovimiento(x, y);
                    break;
                case 3:
                    System.out.println("Estado del tablero:");
                    controlJuego.verTablero();
                    break;
                case 4:
                    System.out.println("Consejo de la IA:");
                    System.out.println("No hay consejo en este momento.");
                    break;
                case 5:

                    jorge.setNombre("Jorge");
                    System.out.println("Has cambiado el nombre");
                    break;
                case 6:
                    jugador.setForma("[O]");
                    System.out.println("Has cambiado la forma");
                    break;
                case 7:
                    System.out.println(jorge.getNombre());
                    break;
                case 8:
                    System.out.println(jugador.getForma());
                    break;
                case 9:
                    controlJuego.finalizarPartida();
                    break;
                case 0:
                    salir = true;
                    System.out.println("Saliendo del juego...");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (!salir);

        scanner.close();
    }
}
