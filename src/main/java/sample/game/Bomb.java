package sample.game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import java.util.Random;

public class Bomb extends Map_Objects {

    private int explosion_range;
    private int explosion_diameter;
    private int explosion_damage;
    private int posx;
    private int posy;
    private int character_posx;
    private int character_posy;
    private String imagePath;
    Random r = new Random();

    // constructor
    public Bomb(int width, int height, int posx,int posy, String imagePath, int character_posx, int character_posy) {
        this.setFitHeight(height);
        this.setFitWidth(width);
        this.posx= posx*40;
        this.posy=posy*40;
        this.setImage(new Image(imagePath));
        this.character_posx=character_posx;
        this.character_posy=character_posy;
    }

    // getters and setters
    public int posxBomb() {
        return posx;
    }
    public int posyBomb() {
        return posy;
    }
    public void defineposxBomb(int pos_x) {
        this.posx = pos_x;
    }
    public void defineposyBomb(int pos_y) {
        this.posy = pos_y;
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