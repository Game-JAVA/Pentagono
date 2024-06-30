package sample.game;
<<<<<<< HEAD

=======
import javafx.scene.paint.Color;
>>>>>>> 880d580 (feat (design): heart)
import java.util.Random;

public class Boots extends Map_Objects{
    // attributes

<<<<<<< HEAD
    private double speed;
    private int pos_x;
    private int pos_y;

    Random r= new Random();
=======
    private double speed; // This speed must be innovative in the character class
    private int pos_x; //Position where square of the boots will be generated
    private int pos_y; //Position where square of the boots will be generated
    private Color color; //color of the square boots
    private Random r= new Random(); //Generate position random of the rectangle's
>>>>>>> 880d580 (feat (design): heart)

    // constructor


<<<<<<< HEAD
    public Boots(int width, int height, double speed, int pos_x, int pos_y) {
        super(width, height);
        this.speed = 1;
        this.pos_x = r.nextInt(1001);
        this.pos_y = r.nextInt(601);
=======
    public Boots(int width, int height, double speed, int pos_x, int pos_y, Color color) {
        this.speed = 1;
        this.pos_x = r.nextInt(1001);
        this.pos_y = r.nextInt(601);
        this.color=color;
>>>>>>> 880d580 (feat (design): heart)
    }

    // getters and setters


    public double getSpeed() {
        return speed;
    }

    public int getPos_x() {
        return pos_x;
    }

<<<<<<< HEAD
=======
    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

>>>>>>> 880d580 (feat (design): heart)
    public int getPos_y() {
        return pos_y;
    }

<<<<<<< HEAD
=======

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    public void setR(Random r) {
        this.r = r;
    }

>>>>>>> 880d580 (feat (design): heart)
    // methods
    public void increase_speed(){
        this.speed+=0.25;
    }

    //toString


    @Override
    public String toString() {
        return "Boots{" +
                "speed=" + speed +
                ", pos_x=" + pos_x +
                ", pos_y=" + pos_y +
                '}';
    }
}
