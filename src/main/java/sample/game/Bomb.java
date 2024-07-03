package sample.game;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import java.util.Random;

public class Bomb extends ImageView {

    private int explosion_range;
    private int explosion_diameter;
    private int explosion_damage;
    private int pos_x;
    private int pos_y;
    Random r = new Random();

    // constructor
    public Bomb(int width, int height, int pos_x, int pos_y,String imagePath) {
        this.setImage(new Image(imagePath));
        this.setX(pos_x);
        this.setY(pos_y);
        this.setFitWidth(width);
        this.setFitHeight(height);
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

    public void set_x(int pos_x) {
        this.setX(pos_x);
    }

    public void set_y(int pos_y) {
        this.setY(pos_y);
    }

    public void setR(Random r) {
        this.r = r;
    }
    // methods

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