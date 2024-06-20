package sample.game;

import java.util.Random;

public class Shield extends Map_Objects{

    private int shield;

    private int pos_x;
    private int pos_y;

    Random r = new Random();

    // constructor


    public Shield(int width, int height, int shield, int pos_x, int pos_y) {
        super();
        this.shield = 0;
        this.pos_x = r.nextInt(1001);
        this.pos_y = r.nextInt(601);
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

    // methods

    public void increase_shield() {
        this.shield+=1;
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
