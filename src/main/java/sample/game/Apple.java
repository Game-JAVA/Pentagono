package sample.game;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Apple extends Rectangle {
    // attributes
    private int score;

    // constructor
    public Apple(int width, int height, int score, int pos_x, int pos_y, Color color) {
        super(width, height, color);
        this.score = score;
        this.setX(pos_x);
        this.setY(pos_y);
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


