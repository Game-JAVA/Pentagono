package sample.game;

import java.util.Random;

public class  Map_Objects{

    private static int width;
    private static int height;

    private static Random random;

    // Constructor
    public Map_Objects() {
        this.random = new Random();
    }

    // Method to generate a random position within a specified bound
    public int aleatoryPositionY() {
        return random.nextInt(2+(13));
    }

    public int aleatoryPositionX(){
        return random.nextInt(2+(27));
    }


}
