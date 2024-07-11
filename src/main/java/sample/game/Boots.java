package sample.game;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;

public class Boots extends Map_Objects{
    // attributes
    private int pos_x; //Position where square of the boots will be generated
    private int pos_y; //Position where square of the boots will be generated
    private Random r= new Random(); //Generate position random of the rectangle's

    // constructor


    public Boots(int width, int height,int pos_x, int pos_y, String ImagePath) {
        this.pos_x = r.nextInt(pos_x*40);
        this.pos_y = r.nextInt(pos_y*40);
        this.setImage(new Image(ImagePath));
    }


    // getters and setters

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

    //toString
    @Override
    public String toString() {
        return "Boots{" +
                "speed=" +
                ", pos_x=" + pos_x +
                ", pos_y=" + pos_y +
                '}';
    }
}