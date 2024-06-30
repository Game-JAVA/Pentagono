package sample.game;

<<<<<<< HEAD
import java.util.Random;

public class Apple extends Map_Objects{
    // attributes
    private int score;
    private int pos_x;
    private int pos_y;

    Random r = new Random();

    // constructor



    public Apple(int width, int height, int score, int pos_x, int pos_y) {
        super(width, height);
        this.score = 2;
        this.pos_x = r.nextInt(1001);
        this.pos_y = r.nextInt(601);
    }

    // getters and setters


    public int getScore() {
        return score;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    // methods

    public void increase_Score(){
        this.score+=20;
    }

    //toString


=======
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import java.util.Random;

public class Apple extends Rectangle {
    // attributes
    private int score;
    private static Random random;

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
>>>>>>> 880d580 (feat (design): heart)
    @Override
    public String toString() {
        return "Apple{" +
                "score=" + score +
<<<<<<< HEAD
                ", pos_x=" + pos_x +
                ", pos_y=" + pos_y +
                '}';
    }
}
=======
                ", pos_x=" + getPos_x() +
                ", pos_y=" + getPos_y() +
                '}';
    }
}


>>>>>>> 880d580 (feat (design): heart)
