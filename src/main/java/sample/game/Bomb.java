package sample.game;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import java.util.Random;

public class Bomb extends ImageView {

    private int explosion_range;
    private int explosion_diameter;
    private int explosion_damage;
    private int posx;
    private int posy;
    private int char_posx;
    private int char_posy;
    private String imagePath;
    Random r = new Random();

    // constructor
    public Bomb(int width, int height, int posx,int posy, String imagePath) {
        this.setFitHeight(height);
        this.setFitWidth(width);
        this.setImage(new Image(imagePath));
        this.setX(posx*40);
        this.setY(posy*40);
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
        return posx;
    }
    public int getPos_y() {
        return posy;
    }


    public void setPos_x(int pos_x) {
        this.posx = pos_x;
    }

    public void setPos_y(int pos_y) {
        this.posy = pos_y;
    }

    public void setR(Random r) {
        this.r = r;
    }
    // methods

    public void explosion(){
            System.out.println("você morreu");
    }




    // toString


    @Override
    public String toString() {
        return "Bomb{" +
                "explosion_range=" + explosion_range +
                ", explosion_diameter=" + explosion_diameter +
                ", explosion_damage=" + explosion_damage +
                ", posx=" + posx +
                ", posy=" + posy +
                '}';
    }
}