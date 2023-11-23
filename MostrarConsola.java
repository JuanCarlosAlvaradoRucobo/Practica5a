import java.util.ArrayList;

public class MostrarConsola {

    public MostrarConsola() {
    }

    public void mostrarIntento(ArrayList<String> color) {
        for (int i = 0; i < 6; i++) {
            System.out.print(color.get(i) + " ");
        }

    }

    public void mostrarCodigo(ArrayList<String> secreto) {
        System.out.println(secreto);
    }

    public void mostrarGanaste() {
        System.out.println("YOU WIN!");
    }

    public void mostrarPerdiste() {
        System.out.println("YOU LOSE!");
    }
}
