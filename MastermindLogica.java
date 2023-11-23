import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MastermindLogica {
    private String[] colores = new String[] { "amarillo", "rojo", "azul", "verde", "rosa", "naranja", "blanco",
            "negro" };
    private ArrayList<String> codigoSecreto;

    public MastermindLogica() {
        codigoSecreto = new ArrayList<String>();
    }

    public void codigoSecreto() {
        Random rmd = new Random();
        Set<String> coloresSeleccionados = new HashSet<>();
        for (int i = 0; i < 6; i++) {
            // Elegir un color aleatorio que no esté en coloresSeleccionados
            String color;
            do {
                color = colores[rmd.nextInt(7)];
            } while (coloresSeleccionados.contains(color));

            // Agregar el color al códigoSecreto y al conjunto de colores seleccionados
            codigoSecreto.add(color);
            coloresSeleccionados.add(color);
        }

    }

    public ArrayList<String> obtenerCodigoSecreto() {
        return codigoSecreto;
    }

    public int verificarIntento(ArrayList<String> intento, ArrayList<String> codigoSecreto, ArrayList<Circle> pin,
            MastermindGrafico mg) {
        int validar = 0;
        for (int i = 0; i < intento.size(); i++) {

            String colorIntento = intento.get(i);
            String colorCodigo = codigoSecreto.get(i);

            if (colorIntento.equals(colorCodigo)) {
                // Color en la posición correcta
                mg.pintarIntento(pin, 1);
                validar++;
            } else if (codigoSecreto.contains(colorIntento)) {
                // Color presente pero en la posición incorrecta
                mg.pintarIntento(pin, 2);
            } else {
                // Color no presente en la combinación
                mg.pintarIntento(pin, 3);
            }
        }
        return validar;

    }

}
