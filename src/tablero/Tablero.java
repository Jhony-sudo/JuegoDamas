package src.tablero;

public class Tablero {
    String[][] Tablero = new String[8][8];
    String black = "\033[30m";
    String reset = "\u001B[0m";
    String amar = "\u001B[33m";

    public Tablero() {

    }

    public void DibujarTabla() {
        System.out.println("_________________________________");
        for (int i = 0; i < Tablero.length; i++) {
            System.out.print("|");
            for (int j = 0; j < Tablero.length; j++) {
                System.out.print(Tablero[i][j]);
                System.out.print("|");
            }
            System.out.println("");
            System.out.println("_________________________________");
        }

    }

    public void LlenarTabla() {
        for (int i = 0; i <= 2; i++) {
            if (i % 2 == 0) {
                LlenarFilasPar(i, reset);
            } else {
                LlenarFilaImpar(i, reset);
            }
        }

        for (int i = 3; i <= 4; i++) {
            for (int j = 0; j < Tablero.length; j++) {
                Tablero[i][j] = "   ";
            }
        }

        for (int i = 5; i < Tablero.length; i++) {
            if (i % 2 == 0) {
                LlenarFilasPar(i, amar);
            } else {
                LlenarFilaImpar(i, amar);
            }

        }

    }

    public void LlenarFilasPar(int i, String Color) {
        for (int j = 0; j < Tablero.length; j++) {
            if (j % 2 == 0) {
                Tablero[i][j] = "   ";
            } else {
                Tablero[i][j] = Color + " O " + reset;
            }
        }

    }

    public void LlenarFilaImpar(int i, String Color) {
        for (int j = 0; j < Tablero.length; j++) {
            if (j % 2 == 0) {
                Tablero[i][j] = Color + " O " + reset;
            } else {
                Tablero[i][j] = "   ";
            }
        }

    }
}
