import java.awt.*;
import javax.swing.JFrame;
import java.util.Random;
public class Square extends JFrame implements Runnable {

    private int squareSize;
    private int startX;
    private int startY;
    private int rows;
    private int cols;

    Random r = new Random();
    public Square() {
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

        g.setColor(Color.GREEN);
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

                /*
                // Desenha o número
                g.drawString(Integer.toString(number), textX, textY);
                */
                number++;  // Incrementa o número
                g.setColor(Color.GREEN);
                /*
                if (number>371) {
                    createApple(g);
                    g.setColor(Color.GREEN);
                }
                 */


            }
        }
    }


    public void createApple(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.drawRect(r.nextInt(1000)+80, r.nextInt(600)+30, 20, 20);
    }

    @Override
    public void run() {
        setVisible(true);
    }

    public static void main(String[] args) {
        // Garante que a interface gráfica seja criada na Event Dispatch Thread
        java.awt.EventQueue.invokeLater(new Square());
    }
}
