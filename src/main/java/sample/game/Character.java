package sample.game;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Character extends Rectangle {
    private String name;
    private int score = 0;
    private int speed = 10;

    // Constructor
    public Character(String name, int pos_x, int pos_y, int width, int height, Color color) {
        super(pos_x, pos_y, width, height);
        this.name = name;
        this.setFill(color);
    }

    // Methods
    public void setScore(int valor) {
        this.score += valor;
    }

    public void setSpeed(int speed){
        this.speed= speed;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getScore() {
        return this.score;
    }

    public int getPos_x() {
        return (int) this.getX();
    }

    public int getPos_y() {
        return (int) this.getY();
    }

    public void setPos_x(int pos_x) {
        this.setX(pos_x);
    }

    public void setPos_y(int pos_y) {
        this.setY(pos_y);
    }

    // toString
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", pos_x=" + getPos_x() +
                ", pos_y=" + getPos_y() +
                '}';
    }
}
