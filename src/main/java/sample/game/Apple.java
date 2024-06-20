package sample.game;

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


    @Override
    public String toString() {
        return "Apple{" +
                "score=" + score +
                ", pos_x=" + pos_x +
                ", pos_y=" + pos_y +
                '}';
    }
}