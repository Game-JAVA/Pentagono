package sample.game;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import static eu.hansolo.tilesfx.tools.Location.CardinalDirection.W;

public class Character {
    private String name;
    private int health;
    private int score;
    private boolean statusItem;
    private int pos_x;
    private int pos_y;


    //Constructor
public Character(String name, int pos_x, int pos_y, int width, int height, Color color){

    Rectangle character = new Rectangle(width, height);

}


    //Methods

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

//to String

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", score=" + score +
                ", statusItem=" + statusItem +
                '}';
    }
}