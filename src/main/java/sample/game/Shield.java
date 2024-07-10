package sample.game;

import javafx.scene.paint.Color;

import java.util.Random;

public class Shield extends Map_Objects {

    private int shield;

    private int pos_x;
    private int pos_y;

    Random r = new Random();

    // constructor
    public Shield(int width, int height) {
        this.shield = 0;
        this.pos_x = r.nextInt(width);
        this.pos_y = r.nextInt(height);
    }

    // getters and setters
    public int getShield() {
         return shield;
    }

    public int getPos_x() {
        return pos_x;
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
    public void increase_shield() {
        this.shield += 1;
    }

    // toString
    @Override
    public String toString() {
        return "Shield{" +
                "shield=" + shield +
                ", pos_x=" + pos_x +
                ", pos_y=" + pos_y +
                '}';
    }
}
