        package sample.game;

import javafx.scene.image.ImageView;

import java.util.Random;

public class  Map_Objects extends ImageView {

    private static int width;
    private static int height;

    private static Random random;

    // Constructor
    public Map_Objects() {
        this.random = new Random();
    }


    // Method to generate a random position within a specified bound
    public int aleatoryPositionY() {
        return random.nextInt((13));
    }

    public int aleatoryPositionX(){
        return random.nextInt((27));
    }
}