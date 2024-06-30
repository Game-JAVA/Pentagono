package sample.game;

import java.util.Random;

<<<<<<< HEAD
public abstract class Map_Objects{
    //ATTRIBUTES

    private int width;
    private int height;


    //CONSTRUCTOR

    public Map_Objects(int width, int height) {
        this.width = width;
        this.height = height;
    }



    //getters and setters

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    //methods


=======
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
        return random.nextInt((13));
    }

    public int aleatoryPositionX(){
        return random.nextInt((27));
    }
>>>>>>> 880d580 (feat (design): heart)
}