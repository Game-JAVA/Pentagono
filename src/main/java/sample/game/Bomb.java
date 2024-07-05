package sample.game;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import java.util.Random;

public class Bomb extends ImageView {
    private int posx;
    private int posy;
    private int character_posx;
    private int character_posy;
    private int testex;
    private String imagePath;
    Random r = new Random();

    // constructor
    public Bomb(int width, int height, int posx,int posy, String imagePath, int character_posx, int character_posy) {
        this.setFitHeight(height);
        this.setFitWidth(width);
        this.setImage(new Image(imagePath));
        this.setX(posx*40);
        this.setY(posy*40);
        this.character_posx=character_posx;
        this.character_posy=character_posy;
        this.testex=width;
    }

    // getters and setters
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
            if(character_posx==posx && character_posy == posy){
                System.out.println("você perdeu!");
            }
    }
    // toString


    @Override
    public String toString() {
        return "Bomb{" +
                ", posx=" + posx +
                ", posy=" + posy +
                '}';
    }
}