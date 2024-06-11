import java.awt.*;
import java.awt.event.KeyEvent;

public class Main extends javax.swing.JFrame implements Runnable{

    //Tamanho Tela
    private int height = 600;
    private int width = 1000;

    //Código
    @Override
    public void run() {
        Graphics g = getBufferStrategy().getDrawGraphics();
        g.clearRect(0, 0, getWidth(), getHeight());
        Move m = new Move(10,20,5);
        Character c = new Character(10,20,5);

    }
}