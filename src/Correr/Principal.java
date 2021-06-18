package src.Correr;

import src.tablero.*;
import src.jugadores.*;
import java.util.Scanner;

public class Principal {

    Jugador[] Jugadores = new Jugador[5];
    Tablero tablero = new Tablero();
    Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        Principal principal = new Principal();

    }

    public Principal() {
        Jugadores[0] = new Jugador("Jhony", 19);
        Jugadores[1] = new Jugador("Jose", 29);
        Jugadores[2] = new Jugador("Karla", 21);
        Jugadores[3] = new Jugador("Oliver", 29);
        Jugadores[4] = new Jugador("Maria", 14);

        int Opcion;
        int Seleccion;
        int Seleccion2;

        do {

            System.out.println("Bienvenidos al Juego de Damas");
            System.out.println("1. Jugar");
            System.out.println("2. Estadisticas");
            System.out.println("3. Salir\n");
            Opcion = leer.nextInt();

            switch (Opcion) {
                case 1:
                    System.out.println("Elija a los jugadores");
                    MostrarJugadores();
                    Seleccion = leer.nextInt();
                    Seleccion2 = leer.nextInt();
                    Controlador controlador = new Controlador(Jugadores[Seleccion], Jugadores[Seleccion2], tablero);
                    break;

                case 2:
                    break;
                case 3:
                    System.out.println("Adios");
                    break;

                default:
                    System.out.println("Ingrese una opcion Correcta");
                    break;
            }
        } while (Opcion != 3);

    }

    public void MostrarJugadores() {
        for (int i = 0; i < Jugadores.length; i++) {
            System.out.println(i + "Nombre: " + Jugadores[i].getNombre());
        }
    }
}
