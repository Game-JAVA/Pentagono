import java.util.Random;

public abstract class Map_Objects extends Move{
    //ATTRIBUTES
    private String object_name;
    private int pos_x;
    private int pos_y;

    Random r = new Random();

    //CONSTRUCTOR METHOD
    public Map_Objects(){
        this.object_name=object_name;
        this.pos_x= r.nextInt();
        this.pos_y= r.nextInt();
    }

    //METHODS



    //GERAR POSIÇÃO






}