package sample.game;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Character extends ImageView {
    private String name;
    private int score = 0;
    private int speed = 10;
    private int health = 3;

    // Constructor
    public Character(String name, int pos_x, int pos_y, int width, int height, String imagePath) {
        this.name = name;
        this.setImage(new Image(imagePath));
        this.setX(pos_x);
        this.setY(pos_y);
        this.setFitWidth(width);
        this.setFitHeight(height);
    }

    // Methods
    public void setScore(int valor) {
        this.score += valor;
    }

    public void setSpeedMore(){
        this.speed += 10;
    }

    public void setSpeedLess(){
        this.speed -= 10;
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

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int value) {
        health += value;
    }

    public void updateImage(String imagePath) {
        this.setImage(new Image(imagePath));
    }

    public void scoreToZero(){
        this.score=0;
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
