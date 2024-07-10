package sample.game;
import java.util.Random;

public class Shield extends Map_Objects {
<<<<<<< HEAD
    private boolean shield;
=======

    private int shield;

>>>>>>> 783e63c90885079cf9a9f2da2edec5da01e208a4
    private int pos_x;
    private int pos_y;
    Random r = new Random();

    // constructor
    public Shield(int width, int height) {
<<<<<<< HEAD
        this.shield = false;
=======
        this.shield = 0;
>>>>>>> 783e63c90885079cf9a9f2da2edec5da01e208a4
        this.pos_x = r.nextInt(width);
        this.pos_y = r.nextInt(height);
    }

    // getters and setters
    public boolean getShield() {
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
    public void increase_shield(boolean value) {
        this.shield = value;
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
