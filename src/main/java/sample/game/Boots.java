package sample.game;
import javafx.scene.paint.Color;
import java.util.Random;

public class Boots extends Map_Objects{
    // attributes

    private int pos_x; //Position where square of the boots will be generated
    private int pos_y; //Position where square of the boots will be generated
    private Color color; //color of the square boots
    private Random r= new Random(); //Generate position random of the rectangle's

    // constructor


    public Boots(int width, int height, int pos_x, int pos_y, Color color) {

        this.pos_x = r.nextInt(width);
        this.pos_y = r.nextInt(height);
        this.color=color;
    }

    // getters and setters

    public int getPos_x() {
        return pos_x;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public int getPos_y() {
        return pos_y;
    }


    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }


    // methods

    //toString


    @Override
    public String toString() {
        return "Boots{" +
                "speed=" +
                ", pos_x=" + pos_x +
                ", pos_y=" + pos_y +
                '}';
    }
}