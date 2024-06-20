package sample.game;

import java.util.Random;

public class Bomb extends Map_Objects{

    private int explosion_range;
    private int explosion_diameter;

    private int explosion_damage;
    private int pos_x;
    private int pos_y;
    Random r = new Random();

    // constructor


    public Bomb(int width, int height, int explosion_range, int explosion_diameter, int explosion_damage, int pos_x, int pos_y) {
        super();
        this.explosion_range = explosion_range;
        this.explosion_diameter = 40;
        this.explosion_damage = explosion_damage;
        this.pos_x = r.nextInt(1001);
        this.pos_y = r.nextInt(601);
    }

    // getters and setters

    public int getExplosion_range() {
        return explosion_range;
    }

    public int getExplosion_diameter() {
        return explosion_diameter;
    }

    public int getExplosion_damage() {
        return explosion_damage;
    }

    public int getPos_x() {
        return pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    // methods

    public void explode(){

    }

    // toString


    @Override
    public String toString() {
        return "Bomb{" +
                "explosion_range=" + explosion_range +
                ", explosion_diameter=" + explosion_diameter +
                ", explosion_damage=" + explosion_damage +
                ", pos_x=" + pos_x +
                ", pos_y=" + pos_y +
                '}';
    }
}
