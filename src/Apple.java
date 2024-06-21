public class Apple extends Map_Objects {

    private int pos_x;
    private int pos_y;
    private int Health;


    public Apple(){
        pos_x=super.r.nextInt(1001);
        pos_y=super.r.nextInt(601);
    }
}