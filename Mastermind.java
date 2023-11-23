//Carlo Author's

import java.util.ArrayList;

public class Mastermind {

    public static void main(String[] args) {
        int z = 0;
        int gano = 0;
        MastermindGrafico mg = new MastermindGrafico();
        mg.Tablero();
        mg.Pines();
        MastermindLogica ml = new MastermindLogica();
        ml.codigoSecreto();
        ArrayList<String> secreto = new ArrayList<String>();
        secreto = ml.obtenerCodigoSecreto();
        ArrayList<String> intentos = new ArrayList<String>();
        ArrayList<Circle> pin = new ArrayList<Circle>();
        ArrayList<Circle> fichas = new ArrayList<Circle>();
        MostrarConsola mc = new MostrarConsola();
        Teclado t = new Teclado();
        pin = mg.getPines();
        mc.mostrarCodigo(secreto);
        mg.resetPospin();
        mg.resetPostab();
        // ciclo de 15
        while (z != 14) {
            for (int i = 0; i < 6; i++) {
                t.ingresarIntento();
                intentos = t.getColor();
            }
            for (int i = 0; i < 6; i++) {
                mg.colocarIntento(fichas, intentos);
            }
            gano = ml.verificarIntento(intentos, secreto, pin, mg);
            mc.mostrarIntento(intentos);

            z++;
            if (gano == 5) {
                z = 14;
                mc.mostrarGanaste();
            }

            if (gano < 5 && z >= 13) {
                mc.mostrarPerdiste();
            }

        }
    }
}