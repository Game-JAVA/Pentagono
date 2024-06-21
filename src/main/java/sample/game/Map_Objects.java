package sample.game;

import java.util.Random;

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


}