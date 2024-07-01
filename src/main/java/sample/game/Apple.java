package sample.game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import java.util.Random;

public class Apple extends ImageView {
    // attributes
    private int score;
    private static Random random;

    // constructor
    public Apple(int width, int height, int score, int pos_x, int pos_y, String imagePath) {
        this.setImage(new Image(imagePath));
        this.score = score;
        this.setX(pos_x);
        this.setY(pos_y);
        this.setFitWidth(width);
        this.setFitHeight(height);
    }

    // getters and setters
    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getPos_x() {
        return (int) this.getX();
    }

    public void setPos_x(int pos_x) {
        this.setX(pos_x);
    }

    public int getPos_y() {
        return (int) this.getY();
    }

    public void setPos_y(int pos_y) {
        this.setY(pos_y);
    }

    // toString
    @Override
    public String toString() {
        return "Apple{" +
                "score=" + score +
                ", pos_x=" + getPos_x() +
                ", pos_y=" + getPos_y() +
                '}';
    }
}


