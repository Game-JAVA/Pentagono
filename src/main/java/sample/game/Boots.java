package sample.game;

import java.util.Random;

public class Boots extends Map_Objects{
    // attributes

    private double speed;
    private int pos_x;
    private int pos_y;

    Random r= new Random();

    // constructor


    public Boots(int width, int height, double speed, int pos_x, int pos_y) {
        this.speed = 1;
        this.pos_x = r.nextInt(1001);
        this.pos_y = r.nextInt(601);
    }

    // getters and setters


    public double getSpeed() {
        return speed;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    // methods
    public void increase_speed(){
        this.speed+=0.25;
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
