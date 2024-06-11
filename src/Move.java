public class Move{
    private int posX;
    private int posY;
    private int speed;

    //Constructor
    public Move(int posX, int posY, int speed) {
        this.posX = posX;
        this.posY = posY;
        this.speed = speed;
    }

    //Methods
    public void movement(){
        this.posX += speed;
        this.posY += speed;
    }

    //Get and Setters

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
