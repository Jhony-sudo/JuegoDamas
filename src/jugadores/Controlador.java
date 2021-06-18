package src.jugadores;

import src.tablero.*;

public class Controlador {
    private Jugador Jugador1;
    private Jugador Jugador2;
    private Tablero Tablero;

    public Controlador(Jugador Jugador1, Jugador Jugador2, Tablero tablero) {
        this.Jugador1 = Jugador1;
        this.Jugador2 = Jugador2;
        this.Tablero = tablero;
        Jugar();
    }

    public void RevisarMovimiento() {

    }

    public void RevisarPosicion() {

    }

    public boolean FinalizarPartida() {
        return true;

    }

    public void Jugar() {
        System.out.println(Jugador1.getNombre() + " vs " + Jugador2.getNombre());
        Tablero.LlenarTabla();
        Tablero.DibujarTabla();
    }

}
