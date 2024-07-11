
package sample.game;
import java.util.Random;

public class Shield extends Map_Objects {

    private boolean shield;
    private int pos_x;
    private int pos_y;

    Random r = new Random();

    // constructor
    public Shield(int width, int height) {
        this.shield = false;
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
    public boolean increase_shield(boolean value) {
        return shield = value;
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