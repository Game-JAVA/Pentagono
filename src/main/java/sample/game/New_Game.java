package sample.game;
<<<<<<< HEAD

=======
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
>>>>>>> 880d580 (feat (design): heart)
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
<<<<<<< HEAD
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
=======
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.geometry.Pos;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

import java.awt.*;
>>>>>>> 880d580 (feat (design): heart)

public class New_Game extends Application {
    private int squareSize = 40;
    private int startX = 80;
    private int startY = 80;
    private int rows = 13;
    private int cols = 27;
<<<<<<< HEAD
=======
    private Label label2 = new Label("00:00");
    private Timeline timeline;
    private int secondsElapsed = 0;
    private Sound backgroundSound;
    private Sound themeSound;
>>>>>>> 880d580 (feat (design): heart)

    public static void main(String[] args) {
        launch();
    }

<<<<<<< HEAD
    @Override
    public void start(Stage primaryStage) {
        // Classes Instances
        VBox layout1 = new VBox(20);
        Pane layout2 = new Pane();

        Scene s1 = new Scene(layout1, 400, 500);
        Scene s2 = new Scene(layout2, 1200, 1000);

        // Components
        Rectangle r1 = new Rectangle(40, 40, Color.BLUE);
=======

    @Override
    public void start(Stage primaryStage) {
        // Classes Instances
        Map_Objects MO = new Map_Objects();
        Image backgroundImage = new Image("backgroundStartWindow.jpeg");
        ImageView backg = new ImageView(backgroundImage);
        Image backgroundImage2 = new Image("img.jpeg");
        ImageView backg2 = new ImageView(backgroundImage2);
        VBox layout1 = new VBox(10);
        Pane layout2 = new Pane();

        Scene s1 = new Scene(layout1, 400, 500);

        Scene s2 = new Scene(layout2, 1200, 1000);


        // Components
        Character character = new Character("Character", MO.aleatoryPositionX(), MO.aleatoryPositionY(), 40, 40, Color.BLUE);
        Apple a1 = new Apple(40, 40, 20, MO.aleatoryPositionX(), MO.aleatoryPositionY(), Color.YELLOW);
        Shield shield = new Shield(1200, 1000, Color.BLACK);
        Boots boots = new Boots(40, 40, 0, MO.aleatoryPositionX(), MO.aleatoryPositionY(), Color.PURPLE);

        // Convert Shield to a graphical object
        Rectangle shieldRectangle = new Rectangle(shield.getPos_x(), shield.getPos_y(), squareSize, squareSize);
        shieldRectangle.setFill(shield.getColor());

        //Implemented boots with Rectangle
        Rectangle bootsRectangle = new Rectangle(boots.getPos_x(), boots.getPos_y(), squareSize, squareSize);
        bootsRectangle.setFill(boots.getColor());
        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);
>>>>>>> 880d580 (feat (design): heart)

        Button b1 = new Button("New Game");
        Button b2 = new Button("Instructions");
        Button b3 = new Button("Return to Menu");

<<<<<<< HEAD
        Label label1 = new Label("Welcome to Page 1");
        Label label2 = new Label("Cronômetro");
=======
        VBox.setMargin(b1, new Insets(10, 20, 10, 155)); // cima, direita, baixo, esquerda
        VBox.setMargin(b2, new Insets(10, 20, 10, 155));
        VBox.setMargin(b3, new Insets(10, 20, 10, 155));
        vbox.getChildren().addAll(b1, b2, b3);

        String buttonStyle = "-fx-background-color: black;" +
                "-fx-text-fill: yellow;" +
                "-fx-font-size: 12px;" +
                "-fx-border-radius: 5;" +
                "-fx-background-radius: 5;" +
                "-fx-padding: 15 15 15 15;" +
                "-fx-border-color: yellow;" +
                "-fx-cursor: hand";

        b1.setStyle(buttonStyle);
        b2.setStyle(buttonStyle);
        b3.setStyle(buttonStyle);


        BackgroundSize backgroundSize = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true);

        BackgroundSize backgroundSize2 = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true);

        BackgroundImage background = new BackgroundImage(
                backgroundImage,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                backgroundSize
        );

        BackgroundImage background2 = new BackgroundImage(
                backgroundImage2,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                backgroundSize
        );

        layout1.setBackground(new Background(background));
        layout2.setBackground(new Background(background2));


        Label label1 = new Label("Welcome to Page 1");
        label1.setStyle(
                "-fx-text-fill: white;" +
                        "-fx-font-size: 26px;" +
                        "-fx-padding: 10 0 0 60"

        );

        Label label3 = new Label("SCORE:");
        Label label4 = new Label("00");
        Label label5 = new Label("TIMER:");


        // Initialize sounds
        /*try {
            String backgroundUrl = "https://www.dropbox.com/scl/fi/mb2oriy1rnqik15fwwpyt/741558_the_ramdom_cheese_echos-of-the-mead-hall-online-audio-converter.com.wav?rlkey=m6h0ag0awxvj71ftwrgenxa8p&dl=1";
            backgroundSound = new Sound(backgroundUrl);
            backgroundSound.setVolume(-15.0f);

            String themeUrl = "https://www.dropbox.com/scl/fi/ukaczgwifhx65tqhygqnw/646460_g-14_medieval-march-mp3-online-audio-converter.com.wav?rlkey=d77d8w0tlo4x4ib4dtakwybxp&st=c0d7uhj4&dl=1";
            themeSound = new Sound(themeUrl);
            themeSound.setVolume(-10.0f);
            themeSound.loop();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        */
>>>>>>> 880d580 (feat (design): heart)

        // Button b1 to Scene s2
        b1.setOnAction(e -> {
            primaryStage.setScene(s2);
<<<<<<< HEAD
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
=======
            primaryStage.setX(40);
            primaryStage.setY(0);
            startTimer();
            //stopThemeSound();
            //startBackgroundSound();
        });

        // Button b3 to Scene s1
        b3.setOnAction(e -> {
            primaryStage.setScene(s1);
            primaryStage.setX(435);
            primaryStage.setY(45);
            stopTimer();
            //stopBackgroundSound();
            //startThemeSound();
        });

        // Scene/Layout 1
        layout1.getChildren().addAll(label1, b1, b2);

        // Set the position of the label2
        label2.setLayoutX(1100);
        label2.setLayoutY(30);

        label2.setStyle(
                "-fx-text-fill: black;" +
                        "-fx-font-size: 26px;" +
                        "-fx-padding: 10 0 0 10"

        );


        // Set the position of the label3
        label3.setLayoutX(800);
        label3.setLayoutY(10);

        // Set the position of the label4
        label4.setLayoutX(800);
        label4.setLayoutY(30);

        // Set the position of the label5
        label5.setLayoutX(1100);
        label5.setLayoutY(10);


        // Scene/Layout 2
        layout2.getChildren().addAll(label2, label3, label4, label5, b3, character, a1, shieldRectangle, bootsRectangle);


        // Set initial position of the character
        character.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
        character.setPos_x(MO.aleatoryPositionX() * squareSize + startX);


        // Set initial position of the apple
        a1.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
        a1.setPos_x(MO.aleatoryPositionX() * squareSize + startX);


        //Implemented Shield in Window

        shield.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
        shield.setPos_x(MO.aleatoryPositionX() * squareSize + startX);

        shieldRectangle.setX(shield.getPos_x());
        shieldRectangle.setY(shield.getPos_y());


        //Implemented Boots in window.

        boots.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
        boots.setPos_x(MO.aleatoryPositionX() * squareSize + startX);

        bootsRectangle.setX(boots.getPos_x());
        bootsRectangle.setY(boots.getPos_y());


        // Log positions
        System.out.println("Character initial position: x = " + character.getPos_x() + ", y = " + character.getPos_y());
        System.out.println("Apple initial position: x = " + a1.getPos_x() + ", y = " + a1.getPos_y());
>>>>>>> 880d580 (feat (design): heart)

        // Create the board of squares
        createBoard(layout2);

        // Rectangle's Movement
        s2.setOnKeyPressed(event -> {
<<<<<<< HEAD
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
=======
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
>>>>>>> 880d580 (feat (design): heart)
                    }
                    break;
                default:
                    break;
            }
<<<<<<< HEAD
        });

=======

            // Check if character and apple occupy the same square
            if (characterPosX == applePosX && characterPosY == applePosY) {
                // Reset apple position
                character.setScore(a1.getScore());
                label4.setText(String.valueOf(character.getScore()));
                a1.setPos_x(MO.aleatoryPositionX() * squareSize + startX);
                a1.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
            }

            if (characterPosX == bootsRectangle.getX() && characterPosY == bootsRectangle.getY()) {
                bootsRectangle.setX(MO.aleatoryPositionX() * squareSize + startY);
                bootsRectangle.setY(MO.aleatoryPositionY() * squareSize + startX);
            }

            if (characterPosX == shieldRectangle.getX() && characterPosY == shieldRectangle.getY()) {
                shieldRectangle.setX(MO.aleatoryPositionX() * squareSize + startY);
                shieldRectangle.setY(MO.aleatoryPositionY() * squareSize + startX);
            }


            // Log position after movement
            System.out.println("Character moved to: x = " + character.getPos_x() + ", y = " + character.getPos_y() + ", Score = " + character.getScore());
            System.out.println("Apple position is : x = " + a1.getPos_x() + ", y = " + a1.getPos_y());


        });




        /*
        try {
            String css = getClass().getResource("style.css").toExternalForm();
            s1.getStylesheets().add(css);
            s2.getStylesheets().add(css);
        } catch (NullPointerException e) {
            System.err.println("Arquivo CSS não encontrado. Verifique o caminho: " + e.getMessage());
            e.printStackTrace();
        }

        */


>>>>>>> 880d580 (feat (design): heart)
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
<<<<<<< HEAD
                square.setFill(null);  // No fill
                square.setStroke(Color.BLACK);  // Black border

                // Create a label to display the number
                Label numberLabel = new Label(Integer.toString(number));
                numberLabel.setLayoutX(x + squareSize / 2 - 10);  //
                numberLabel.setLayoutY(y + squareSize / 2 - 10);  //
=======
                square.setFill(null);
                square.setStroke(Color.BLACK);

                // Create a label to display the number
                Label numberLabel = new Label(Integer.toString(number));
                numberLabel.setLayoutX(x + squareSize / 2 - 10);
                numberLabel.setLayoutY(y + squareSize / 2 - 10);
>>>>>>> 880d580 (feat (design): heart)

                pane.getChildren().addAll(square, numberLabel);
                number++;
            }
        }
    }
<<<<<<< HEAD
}
=======

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


   /*
    private void stopBackgroundSound() {
        if (backgroundSound != null) {
            backgroundSound.stop();
        }
    }
    private void startBackgroundSound() {
        if (backgroundSound != null) {
            backgroundSound.stop();
            backgroundSound.play();
            backgroundSound.loop();
        }
    }

    private void startThemeSound() {
        if (themeSound != null) {
            themeSound.stop();
            themeSound.play();
            themeSound.loop();
        }
    }

    private void stopThemeSound() {
        if (themeSound != null) {
            themeSound.stop();
        }
    }
    */
}
>>>>>>> 880d580 (feat (design): heart)
