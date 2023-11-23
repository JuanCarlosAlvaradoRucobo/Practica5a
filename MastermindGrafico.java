import java.awt.Color;
import java.util.ArrayList;

public class MastermindGrafico {
    private ArrayList<Circle> pines;
    private ArrayList<Circle> tablero;
    private Canvas canvas;
    private int xPosTablero;
    private int yPosTablero;
    private int diameterTab;
    private int diameterPin;
    private int xPosPines;
    private int yPosPines;
    private Circle c;
    private int x;
    private int j;

    public MastermindGrafico() {
        pines = new ArrayList<Circle>();
        tablero = new ArrayList<Circle>();
        canvas = new Canvas("MASTERMIND", 600, 600, Color.white);
        xPosTablero = 20;
        yPosTablero = 10;
        diameterTab = 30;
        xPosPines = 250;
        yPosPines = 10;
        diameterPin = 10;
        x = 1;
        j = 0;
    }

    public void Tablero() {

        for (int i = 0; i < 90; i++) {
            Circle c = new Circle(Color.darkGray, xPosTablero, yPosTablero, diameterTab, canvas);
            c.changePosition(xPosTablero, yPosTablero, diameterTab);
            tablero.add(c);
            xPosTablero += 30;
            if ((i + 1) % 6 == 0) {
                xPosTablero = 20;
                yPosTablero += 30;
            }
        }
    }

    public void Pines() {

        for (int i = 0; i < 90; i++) {
            Circle c = new Circle(Color.darkGray, xPosPines, yPosPines, diameterPin, canvas);
            c.changePosition(xPosPines, yPosPines, diameterPin);
            pines.add(c);
            xPosPines += 10;
            if ((i + 1) % 3 == 0) {
                xPosPines = 250;
                yPosPines += 15;
            }
        }
    }

    public ArrayList<Circle> getPines() {
        return pines;
    }

    public ArrayList<Circle> getTablero() {
        return tablero;
    }

    public void resetPospin() {
        xPosPines = 250;
        yPosPines = 10;
    }

    public void pintarIntento(ArrayList<Circle> pin, int num) {
        pin = new ArrayList<>();
        if (num == 1) {
            c = new Circle(Color.BLACK, xPosPines, yPosPines, diameterPin, canvas);
        } else if (num == 2) {
            c = new Circle(Color.WHITE, xPosPines, yPosPines, diameterPin, canvas);
        } else {
            c = new Circle(Color.DARK_GRAY, xPosPines, yPosPines, diameterPin, canvas);
        }

        pin.add(c);
        c.draw();
        c.changePosition(xPosPines, yPosPines, diameterPin);
        xPosPines += 10;
        // Reset the x-coordinate after painting three circles
        if (x % 3 == 0) {
            xPosPines = 250;
            yPosPines += 15;
        }
        x++;
    }

    public void resetPostab() {
        xPosTablero = 20;
        yPosTablero = 10;
    }

    public void colocarIntento(ArrayList<Circle> fichas, ArrayList<String> intentos) {
        fichas = new ArrayList<Circle>();
        String color = intentos.get(j);

        switch (color) {
            case "amarillo":
            case "ama":
            case "am":
                c = new Circle(Color.YELLOW, xPosTablero, yPosTablero, diameterTab, canvas);
                break;
            case "azul":
            case "azu":
            case "az":
                c = new Circle(Color.BLUE, xPosTablero, yPosTablero, diameterTab, canvas);
                break;
            case "rojo":
            case "roj":
            case "ro":
                c = new Circle(Color.RED, xPosTablero, yPosTablero, diameterTab, canvas);
                break;
            case "rosa":
            case "ros":
            case "pi":
                c = new Circle(Color.PINK, xPosTablero, yPosTablero, diameterTab, canvas);
                break;
            case "verde":
            case "ver":
            case "ve":
                c = new Circle(Color.GREEN, xPosTablero, yPosTablero, diameterTab, canvas);
                break;

            case "naranja":
            case "nar":
            case "na":
                c = new Circle(Color.ORANGE, xPosTablero, yPosTablero, diameterTab, canvas);
                break;

            case "blanco":
            case "bla":
            case "bl":
                c = new Circle(Color.WHITE, xPosTablero, yPosTablero, diameterTab, canvas);
                break;

            case "negro":
            case "neg":
            case "ne":
                c = new Circle(Color.BLACK, xPosTablero, yPosTablero, diameterTab, canvas);
                break;
            default:
                System.out.println("WRONG!!");
        }

        fichas.add(c);
        c.draw();
        c.changePosition(xPosTablero, yPosTablero, diameterTab);
        xPosTablero += 30;

        if ((j + 1) % 6 == 0) {
            xPosTablero = 20;
            yPosTablero += 30;
        }
        j++;
    }
}
