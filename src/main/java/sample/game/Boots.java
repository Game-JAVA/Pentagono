package sample.game;

import javafx.scene.paint.Color;

import java.util.Random;

public class Boots extends Map_Objects{
    // attributes

    private double speed;
    private int pos_x;
    private int pos_y;
    private int width=40;
    private int heigth=40;

    Random r = new Random();

    // constructor

    public Boots(int pos_x, int pos_y, Color red) {
        super();
        pos_x= super.aleatoryPositionX();
        pos_y= super.aleatoryPositionY();
    }

    // getters and setters

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    // methods
    public double increase_speed(){
        return 1.5;
    }

    //toString


    @Override
    public String toString() {
        return "Boots{" +
                "speed=" + speed +
                ", pos_x=" + pos_x +
                ", pos_y=" + pos_y +
                '}';
    }
}
