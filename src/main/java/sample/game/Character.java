package sample.game;

public class Character extends Map_Objects{
    private String name;
    private int health;
    private int score;
    private boolean statusItem;

    //Constructor

    public Character(int width, int height, String name, int health, int score) {
        super(width, height);
        this.name = name;
        this.health = health;
        this.score = score;
    }


    //Methods
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