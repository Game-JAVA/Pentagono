
import java.awt.*;
import javax.swing.JFrame;

public class Square extends JFrame implements Runnable {

    public Square() {
        setTitle("Square Example");
        setSize(1200, 1000);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);  // Chama a implementação original para limpar a tela
        g.setColor(Color.GREEN);
        g.drawRect(100, 50, 1000, 600);  // Desenha um quadrado em coordenadas específicas
        g.drawRect(100, 50, 40, 40);

            for (int i = 0; i < 15; i++) {
                for (int j = 0; j < 25; j++) {
                    g.drawRect(100 + (j * 40), 50+(i*40), 40, 40);
                }
            }
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


