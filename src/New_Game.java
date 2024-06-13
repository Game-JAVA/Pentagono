import java.awt.*;
import java.awt.event.KeyEvent;

public class Main extends javax.swing.JFrame implements Runnable {

    //Tamanho Tela
    private int height = 600;
    private int width = 1000;

    private boolean keyA;
    private boolean keyD;
    private boolean keyW;
    private boolean keyS;

    //Constructor
    public Main() {
        // Chama o metodo que realiza todas as configurações iniciais necessárias
        initComponents();

        // Mecanismo de execução paralela
        createBufferStrategy(2);
        Thread t = new Thread(this);
        t.start();
    }
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Chama os métodos de Scaneamento de teclas (tecla pressionada / solta)
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        // Configura o layout da tela
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        // Largura
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, width, Short.MAX_VALUE)
        );
        // Altura
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, height, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método que verifica se as teclas foram soltas
    private void formKeyPressed(java.awt.event.KeyEvent evt) {
        // Verifica se a tecla A foi pressiona
        if (evt.getKeyCode() == KeyEvent.VK_A) {
            // coloca o valor da variavel A em true enquanto a tecla estiver pressionada
            keyA = true;
        }
        // Verifica se a tecla D foi pressiona
        else if (evt.getKeyCode() == KeyEvent.VK_D) {
            // coloca o valor da variavel D em true enquanto a tecla estiver pressionada
            keyD = true;
        }
        // Verifica se a tecla W foi pressiona
        else if (evt.getKeyCode() == KeyEvent.VK_W) {
            // coloca o valor da variavel W em true enquanto a tecla estiver pressionada
            keyW = true;
        }
        // Verifica se a tecla S foi pressiona
        else if (evt.getKeyCode() == KeyEvent.VK_S) {
            // coloca o valor da variavel S em true enquanto a tecla estiver pressionada
            keyS = true;
        }
    }

    // Método que verifica se as teclas foram soltas
    private void formKeyReleased(java.awt.event.KeyEvent evt){
    // Verifica se a tecla A foi pressiona
        if(evt.getKeyCode()==KeyEvent.VK_A)

        {
        // coloca o valor da variavel A em true enquanto a tecla estiver pressionada
        keyA = false;
         }
    // Verifica se a tecla D foi pressiona
        else if(evt.getKeyCode()==KeyEvent.VK_D)

        {
        // coloca o valor da variavel D em true enquanto a tecla estiver pressionada
        keyD = false;
        }
    // Verifica se a tecla W foi pressiona
        else if(evt.getKeyCode()==KeyEvent.VK_W)

        {
        // coloca o valor da variavel W em true enquanto a tecla estiver pressionada
        keyW = false;
        }
    // Verifica se a tecla S foi pressiona
        else if(evt.getKeyCode()==KeyEvent.VK_S)

        {
        // coloca o valor da variavel S em true enquanto a tecla estiver pressionada
        keyS = false;
        }
    }

        //Inicializar tarefa
        public static void main (String[]args){
            try {
                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
            } catch (ClassNotFoundException ex) {
                java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            java.awt.EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Main().setVisible(true);
                }
            });
        }

    public void run() {
        Graphics g = getBufferStrategy().getDrawGraphics();
        g.clearRect(0, 0, getWidth(), getHeight());


        //Instancie os objetos

        while (true) {
            // Atualiza g
            g = getBufferStrategy().getDrawGraphics();
            //limpa tela
            g.clearRect(0, 0, getWidth(), getHeight());

            // Implemente sua animação aqui.

            /*for (Shape shape : s) {
                shape.draw(g);
                shape.move(width, height);
            }*/

            // Exibe a tela
            getBufferStrategy().show();

            // Unidade de tempo da animação
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
            }
        }
    }// Fim do Run
}