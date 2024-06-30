package sample.game;

<<<<<<< HEAD
import java.util.Random;

public class Shield extends Map_Objects{

    private int shield;

=======
import javafx.scene.paint.Color;

import java.util.Random;

public class Shield extends Map_Objects {

    private int shield;
    private Color color;
>>>>>>> 880d580 (feat (design): heart)
    private int pos_x;
    private int pos_y;

    Random r = new Random();

    // constructor
<<<<<<< HEAD


    public Shield(int width, int height, int shield, int pos_x, int pos_y) {
        super(width, height);
        this.shield = 0;
        this.pos_x = r.nextInt(1001);
        this.pos_y = r.nextInt(601);
    }

    // getters and setters


=======
    public Shield(int width, int height, Color color) {
        this.shield = 0;
        this.pos_x = r.nextInt(width);
        this.pos_y = r.nextInt(height);
        this.color = color;
    }

    // getters and setters
>>>>>>> 880d580 (feat (design): heart)
    public int getShield() {
        return shield;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

<<<<<<< HEAD
    // methods

    public void increase_shield() {
        this.shield+=1;
    }

    // toString

=======
    public Color getColor() {
        return color;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    // methods
    public void increase_shield() {
        this.shield += 1;
    }

    // toString
>>>>>>> 880d580 (feat (design): heart)
    @Override
    public String toString() {
        return "Shield{" +
                "shield=" + shield +
                ", pos_x=" + pos_x +
                ", pos_y=" + pos_y +
<<<<<<< HEAD
=======
                ", color=" + color +
>>>>>>> 880d580 (feat (design): heart)
                '}';
    }
}
