import java.util.ArrayList;
import java.util.Scanner;

public class Teclado {
    private ArrayList<String> color;

    public Teclado() {
        color = new ArrayList<String>();
    }

    public void ingresarIntento() {
        Scanner sc = new Scanner(System.in);
        String variable;

        variable = sc.nextLine().toLowerCase();

        switch (variable) {
            case "azul":
            case "azu":
            case "az":
                color.add(variable);
                break;

            case "amarillo":
            case "ama":
            case "am":
                color.add(variable);
                break;

            case "rosa":
            case "ros":
            case "pi":
                color.add(variable);
                break;

            case "rojo":
            case "roj":
            case "ro":
                color.add(variable);
                break;

            case "verde":
            case "ver":
            case "ve":
                color.add(variable);
                break;

            case "naranja":
            case "nar":
            case "na":
                color.add(variable);
                break;

            case "blanco":
            case "bla":
            case "bl":
                color.add(variable);
                break;

            case "negro":
            case "neg":
            case "ne":
                color.add(variable);
                break;

            default:
                System.out.println("Favor de ingresar una opcion correcta");

        }

    }

    public ArrayList<String> getColor() {
        return color;
    }
}
