package sample.game;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Random;

public class New_Game extends Application {
    private int squareSize = 40; // Tamanho dos Quadrados do Tabuleiro
    private int startX = 80; //Eixo X onde Começa o Tabuleiro
    private int startY = 80; // Eixo Y onde Começa o Tabuleiro
    private int rows = 13; // Número de Linhas do Tabuleiro
    private int cols = 27; // Número de Colunas do Tabuleiro
    private int aux = 0; // Implementar a Aleatoriedade dos Quadrados

    Random positionX = new Random();
    Random positionY = new Random();
    int position_Xx = positionX.nextInt(2+(29));
    int position_Yy = positionY.nextInt(2+(15));
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {


        // Classes Instances

        Map_Objects MO = new Map_Objects();

        VBox layout1 = new VBox(20);
        Pane layout2 = new Pane();

        Scene s1 = new Scene(layout1, 400, 500);
        Scene s2 = new Scene(layout2, 1200, 1000);
        

        // Components

                    // Rectangle r1 = new Rectangle(40, 40, Color.BLUE);
        Boots boots = new Boots(MO.aleatoryPositionX(), MO.aleatoryPositionY(), Color.RED);
        Character character = new Character("Eliezer", MO.aleatoryPositionX(), MO.aleatoryPositionY(), 40, 40, Color.BLUE);

        Button b1 = new Button("New Game");
        Button b2 = new Button("Instructions");
        Button b3 = new Button("Return to Menu");

        Label label1 = new Label("Welcome to Page 1");
        Label label2 = new Label("Cronômetro");

        // Button b1 to Scene s2
        b1.setOnAction(e -> {
            primaryStage.setScene(s2);
        });

        // Button b3 to Scene s1
        b3.setOnAction(e -> primaryStage.setScene(s1));

        // Layout 1
        layout1.getChildren().addAll(label1, b1, b2);

        // Layout 2
        layout2.getChildren().addAll(label2, b3);


        // Set initial position of the rectangle

        /*

        r1.setY(MO.aleatoryPositionY()*40);//360

        r1.setX(MO.aleatoryPositionX()*40);//640

        */



        // Create the board of squares
        createBoard(layout2);

        // Rectangle's Movement

        s2.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case W:
                    if(character.getPos_x() > startY) {
                        character.setPos_y(character.getPos_y() - 40);
                    }
                    break;
                case S:
                    if(character.getPos_x() < (squareSize * (rows-1)) + startY) {
                        character.setPos_y(character.getPos_y() + 40);
                    }
                    break;
                case A:
                    if(character.getPos_x() > startX) {
                        character.setPos_x(character.getPos_x() - 40);
                    }
                    break;
                case D:
                    if(character.getPos_x() < (squareSize * (cols-1)) + startX) {
                        character.setPos_x(character.getPos_x() + 40);
                    }
                    break;
                default:
                    break;
            }
        });


        // Build the Window
        primaryStage.setScene(s1);
        primaryStage.setTitle("Hello!");
        primaryStage.show();
    }

    private void createBoard(Pane pane) {
        int number = 1;
        for (int i = 0; i < rows; i++) { // Gera o número de Quadrados da Linhas do Tabuleiro
            for (int j = 0; j < cols; j++) { // Gera o Número de Quadrados da Coluna do Tabuleiro
                int x = startX + (j * squareSize);
                int y = startY + (i * squareSize);

                Rectangle square = new Rectangle(x, y, squareSize, squareSize);
                square.setFill(null);  // No fill
                square.setStroke(Color.BLACK);  // Black border

                // Create a label to display the number
                Label numberLabel = new Label(Integer.toString(number));
                numberLabel.setLayoutX(x + squareSize / 2 - 10);  //
                numberLabel.setLayoutY(y + squareSize / 2 - 10);  //

                pane.getChildren().addAll(square, numberLabel);
                number++;
            }
        }
    }
}
