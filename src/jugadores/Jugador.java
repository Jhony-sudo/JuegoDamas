package src.jugadores;

public class Jugador {
    private String Nombre;
    private int Edad;
    private int PartidasGanadas;
    private int PartidasJugadas;

    public Jugador(String Nombre, int Edad) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.PartidasGanadas = 0;
        this.PartidasJugadas = 0;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getPartidasGanadas() {
        return PartidasGanadas;
    }

    public int getPartidasJugadas() {
        return PartidasJugadas;
    }

    public void MoverFicha() {

    }

}
