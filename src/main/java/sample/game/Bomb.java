package sample.game;
import javafx.scene.paint.Color;
import java.util.Random;

public class Bomb extends Map_Objects{

    private int explosion_range;
    private int explosion_diameter;
    private int explosion_damage;
    private int pos_x;
    private int pos_y;
    private Color color;
    Random r = new Random();

    // constructor
    public Bomb(int width, int height, int pos_x, int pos_y, Color color) {
        this.explosion_range = explosion_range;
        this.explosion_diameter = 40;
        this.explosion_damage = explosion_damage;
        this.pos_x = r.nextInt(width);
        this.pos_y = r.nextInt(height);
        this.color=color;
    }

    // getters and setters

    public int getExplosion_range() {
        return explosion_range;
    }

    public int getExplosion_diameter() {
        return explosion_diameter;
    }

    public int getExplosion_damage() {
        return explosion_damage;
    }

    public int getPos_x() {
        return pos_x;
    }
    public int getPos_y() {
        return pos_y;
    }

    public Color getColor() {
        return color;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public void setR(Random r) {
        this.r = r;
    }
    // methods

    public void explode(){

    }



    // toString


    @Override
    public String toString() {
        return "Bomb{" +
                "explosion_range=" + explosion_range +
                ", explosion_diameter=" + explosion_diameter +
                ", explosion_damage=" + explosion_damage +
                ", pos_x=" + pos_x +
                ", pos_y=" + pos_y +
                '}';
    }
}
