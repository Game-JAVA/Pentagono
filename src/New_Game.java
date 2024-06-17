import java.awt.*;
import java.util.Random;

public class New_Game extends javax.swing.JFrame implements Runnable {
private int squareSize;
    private int startX;
    private int startY;
    private int rows;
    private int cols;
    private boolean keyA;
    private boolean keyD;
    private boolean keyW;
    private boolean keyS;

    Random r = new Random();
    public New_Game() {
        setTitle("Square Example");
        setSize(1200, 1000);
        this.squareSize=40;
        this.startX=100;
        this.startY=50;
        this.rows=15;
        this.cols=25;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);  // Chama a implementação original para limpar a tela

        g.setColor(Color.BLACK);
        g.drawRect(startX, startY, cols * squareSize, rows * squareSize);  // Desenha o contorno grande
        g.drawRect(startX, startY, squareSize, squareSize); // Desenha o primeiro quadrado

        int number = 1;  // Número inicial a ser desenhado
        g.setFont(new Font("Arial", Font.PLAIN, 12));  // Define a fonte para o texto

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int x = startX + (j * squareSize);
                int y = startY + (i * squareSize);

                int [] array = {i, j};

                // Desenha o quadrado
                g.drawRect(x, y, squareSize, squareSize);


                // Calcula a posição do texto para centralizar dentro do quadrado
                int textX = x + squareSize / 2 - g.getFontMetrics().stringWidth(Integer.toString(number)) / 2;
                int textY = y + squareSize / 2 + g.getFontMetrics().getAscent() / 2 - 2;

                // Define a cor para o texto
                g.setColor(Color.BLACK);

                //Desenha o número
                g.drawString(Integer.toString(number), textX, textY);
                number++;  // Incrementa o número
                g.setColor(Color.BLACK);
                /*
                if (number>371) {
                    createApple(g);
                    g.setColor(Color.GREEN);
                }
                 */


            }
        }
    }

    public void createBoard(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.drawRect(r.nextInt(1000)+80, r.nextInt(600)+30, 20, 20);
    }

    @Override
    public void run() {
        setVisible(true);
        Map_Objects c1 = new Map_Objects(){};
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new New_Game());
    }

}