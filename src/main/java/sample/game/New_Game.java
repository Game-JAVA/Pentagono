package sample.game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class New_Game extends Application {
    private int squareSize = 40;
    private int startX = 80;
    private int startY = 80;
    private int rows = 13;
    private int cols = 27;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        // Classes Instances
        VBox layout1 = new VBox(20);
        Pane layout2 = new Pane();

        Scene s1 = new Scene(layout1, 400, 500);
        Scene s2 = new Scene(layout2, 1200, 1000);

        // Components
        Rectangle r1 = new Rectangle(40, 40, Color.BLUE);

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
        layout2.getChildren().addAll(label2, b3, r1);

        // Set initial position of the rectangle
        r1.setY(360);
        r1.setX(640);

        // Create the board of squares
        createBoard(layout2);

        // Rectangle's Movement
        s2.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case W:
                    if(r1.getY() > startY) {
                        r1.setY(r1.getY() - 40);
                    }
                    break;
                case S:
                    if(r1.getY() < (squareSize * (rows-1)) + startY) {
                        r1.setY(r1.getY() + 40);
                    }
                    break;
                case A:
                    if(r1.getX() > startX) {
                        r1.setX(r1.getX() - 40);
                    }
                    break;
                case D:
                    if(r1.getX() < (squareSize * (cols-1)) + startX) {
                        r1.setX(r1.getX() + 40);
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
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
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
