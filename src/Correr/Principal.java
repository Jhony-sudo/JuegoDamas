package src.Correr;

import src.tablero.*;
import src.jugadores.*;

public class Principal {

    public static void main(String[] args) {
        Jugador[] Jugadores = new Jugador[5];
        Jugadores[0] = new Jugador("Jhony", 19);
        Jugadores[1] = new Jugador("Jose", 29);
        Jugadores[2] = new Jugador("Karla", 21);
        Jugadores[3] = new Jugador("Oliver", 29);
        Jugadores[4] = new Jugador("Maria", 14);

        System.out.println("Bienvenidos al Juego de Damas");
        System.out.println("2. Jugar");
        System.out.println("3. Estadisticas\n");
        Tablero tablero = new Tablero();

    }
}
