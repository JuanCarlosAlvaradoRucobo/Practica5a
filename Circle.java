import java.awt.Color;

/**
 *
 * @author Carlo
 */
public class Circle {
    private Color color;
    private int diameter;
    private int xPosition;
    private int yPosition;
    private Canvas canvas;

    public Circle(Canvas drawingCanvas) {
        color = Color.BLACK;
        xPosition = 0;
        yPosition = 0;
        diameter = 35;
        canvas = drawingCanvas;
    }

    public Circle(Color color, int xPos, int yPos, int diameter, Canvas drawingCanvas) {
        this.color = color;
        this.xPosition = xPos;
        this.yPosition = yPos;
        this.diameter = diameter;
        this.canvas = drawingCanvas;
    }

    /**
     * Draw this ball at its current position onto the canvas.
     **/
    public void draw() {
        canvas.setForegroundColor(color);
        canvas.fillCircle(xPosition, yPosition, diameter);
    }

    /**
     * Erase this ball at its current position.
     **/
    public void erase() {
        canvas.eraseCircle(xPosition, yPosition, diameter);
    }

    /**
     * return the horizontal position of this ball
     */
    public int getXPosition() {
        return xPosition;
    }

    /**
     * return the vertical position of this ball
     */
    public int getYPosition() {
        return yPosition;
    }

    public void changePosition(int xPosition, int yPosition, int diameter) {
        erase();

        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.diameter = diameter;

        draw();
    }

}