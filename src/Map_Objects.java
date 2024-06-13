import java.util.Random;

public abstract class Map_Objects{
    //ATTRIBUTES
    private String object_name;
    private int pos_x;
    private int pos_y;

    Random r = new Random();

    //CONSTRUCTOR


    //METHODS

    public String getObject_name() {
        return object_name;
    }

    public void setObject_name(String object_name) {
        this.object_name = object_name;
    }

    public int getPos_x() {
        return pos_x;
    }

    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    public int getPos_y() {
        return pos_y;
    }

    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }


    //GERAR POSIÇÃO






}