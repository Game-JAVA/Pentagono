public class Character extends Map_Objects{
    private String name;
    private int health;
    private int score;
    private boolean statusItem;

    //Constructor
    public Character(int posX, int posY, int speed) {

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