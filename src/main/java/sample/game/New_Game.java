package sample.game;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class New_Game extends Application {
    private int squareSize = 40;
    private int startX = 80;
    private int startY = 80;
    private int rows = 13;
    private int cols = 27;
    private Label label2 = new Label("00:00");
    private Timeline timeline;
    private int secondsElapsed = 0;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        // Classes Instances
        Map_Objects MO = new Map_Objects();
        Image backgroundImage = new Image("backgroundStartWindow.jpeg");
        ImageView backg = new ImageView(backgroundImage);
        VBox layout1 = new VBox(10);
        Pane layout2 = new Pane();

        Scene s1 = new Scene(layout1, 400, 500);
        Scene s2 = new Scene(layout2, 1200, 1000);


        // Tentar carregar o CSS e adicionar às cenas
        try {
            String css = getClass().getResource("/style.css").toExternalForm();
            s1.getStylesheets().add(css);
            s2.getStylesheets().add(css);
        } catch (NullPointerException e) {
            System.err.println("Arquivo CSS não encontrado. Verifique o caminho: " + e.getMessage());
            e.printStackTrace();
        }

        // Components
        Character character = new Character("Character", MO.aleatoryPositionX(), MO.aleatoryPositionY(), 40, 40, Color.BLUE);
        Apple a1 = new Apple(40, 40, 20, MO.aleatoryPositionX(), MO.aleatoryPositionY(), Color.YELLOW);
        Shield shield = new Shield(1200, 1000, Color.BLACK);

        // Convert Shield to a graphical object
        Rectangle shieldRectangle = new Rectangle(shield.getPos_x(), shield.getPos_y(), squareSize, squareSize);
        shieldRectangle.setFill(shield.getColor());


        Button b1 = new Button("New Game");
        Button b2 = new Button("Instructions");
        Button b3 = new Button("Return to Menu");

        Label label1 = new Label("Welcome to Page 1");

        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage background = new BackgroundImage(backgroundImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        layout1.setBackground(new Background(background));

        // Button b1 to Scene s2
        b1.setOnAction(e -> {
            primaryStage.setScene(s2);
            primaryStage.setX(40);
            primaryStage.setY(0);
            startTimer();
        });

        // Button b3 to Scene s1
        b3.setOnAction(e -> {
            primaryStage.setScene(s1);
            primaryStage.setX(435);
            primaryStage.setY(45);
            stopTimer();
        });

        // Scene/Layout 1
        layout1.getChildren().addAll(label1, b1, b2);

        // Set the position of the label2
        label2.setLayoutX(1100);
        label2.setLayoutY(10);

        // Scene/Layout 2
        layout2.getChildren().addAll(label2, b3, character, a1,shieldRectangle);

        // Set initial position of the character
        character.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
        character.setPos_x(MO.aleatoryPositionX() * squareSize + startX);

        // Set initial position of the apple
        a1.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
        a1.setPos_x(MO.aleatoryPositionX() * squareSize + startX);

        shield.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
        shield.setPos_x(MO.aleatoryPositionX() * squareSize + startX);

        shieldRectangle.setX(shield.getPos_x());
        shieldRectangle.setY(shield.getPos_y());

        // Log positions
        System.out.println("Character initial position: x = " + character.getPos_x() + ", y = " + character.getPos_y());
        System.out.println("Apple initial position: x = " + a1.getPos_x() + ", y = " + a1.getPos_y());

        // Create the board of squares
        createBoard(layout2);

        // Rectangle's Movement
        s2.setOnKeyPressed(event -> {
            int characterPosX = character.getPos_x();
            int characterPosY = character.getPos_y();
            int applePosX = a1.getPos_x();
            int applePosY = a1.getPos_y();

            switch (event.getCode()) {
                case W:
                    if (character.getPos_y() > startY) {
                        character.setPos_y(character.getPos_y() - squareSize);
                    }
                    break;
                case S:
                    if (character.getPos_y() < (squareSize * (rows - 1)) + startY) {
                        character.setPos_y(character.getPos_y() + squareSize);
                    }
                    break;
                case A:
                    if (character.getPos_x() > startX) {
                        character.setPos_x(character.getPos_x() - squareSize);
                    }
                    break;
                case D:
                    if (character.getPos_x() < (squareSize * (cols - 1)) + startX) {
                        character.setPos_x(character.getPos_x() + squareSize);
                    }
                    break;
                default:
                    break;
            }

            // Check if character and apple occupy the same square
            if (characterPosX == applePosX && characterPosY == applePosY) {
                // Reset apple position
                character.setScore(a1.getScore());
                a1.setPos_x(MO.aleatoryPositionX() * squareSize + startX);
                a1.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
            }

            // Log position after movement
            System.out.println("Character moved to: x = " + character.getPos_x() + ", y = " + character.getPos_y() + ", Score = " + character.getScore());
            System.out.println("Apple position is : x = " + a1.getPos_x() + ", y = " + a1.getPos_y());
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
                square.setFill(null);
                square.setStroke(Color.BLACK);

                // Create a label to display the number
                Label numberLabel = new Label(Integer.toString(number));
                numberLabel.setLayoutX(x + squareSize / 2 - 10);
                numberLabel.setLayoutY(y + squareSize / 2 - 10);

                pane.getChildren().addAll(square, numberLabel);
                number++;
            }
        }
    }

    private void startTimer() {
        secondsElapsed = 0;
        timeline = new Timeline(
                new KeyFrame(Duration.seconds(1), event -> {
                    secondsElapsed++;
                    updateTimerLabel();
                    if (secondsElapsed >= 3599) {
                        timeline.stop();
                    }
                })
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }

    private void stopTimer() {
        if (timeline != null) {
            timeline.stop();
        }
    }

    private void updateTimerLabel() {
        int minutes = secondsElapsed / 60;
        int seconds = secondsElapsed % 60;
        label2.setText(String.format("%02d:%02d", minutes, seconds));
    }
}
