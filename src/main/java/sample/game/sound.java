package sample.game;

import kotlin.time.ExperimentalTime;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class sound extends JFrame {
    JButton tocar = new JButton("Sound");

    public PlaySound(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(200,200);
    }
}
