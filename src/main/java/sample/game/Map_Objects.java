package sample.game;

public abstract class Map_Objects{
    //ATTRIBUTES

    private final int width;
    private final int height;


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