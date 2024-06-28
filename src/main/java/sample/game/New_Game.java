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
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;

public class New_Game extends Application {
    private int squareSize = 40;
    private int startX = 80;
    private int startY = 80;
    private int rows = 13;
    private int cols = 27;
    private Label label2 = new Label("00:00");
    private Timeline timeline;
    private int secondsElapsed = 0;
    private Sound backgroundSound;
    private Sound themeSound;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        // Classes Instances
        Map_Objects MO = new Map_Objects();
        Image backgroundImage = new Image("backgroundStartWindow.jpeg");
        ImageView backg = new ImageView(backgroundImage);
        Image backgroundImage2 = new Image("imgtela2.jpeg");
        ImageView backg2 = new ImageView(backgroundImage2);
        VBox layout1 = new VBox(10);
        Pane layout2 = new Pane();

        Scene s1 = new Scene(layout1, 400, 500);
        Scene s2 = new Scene(layout2, 1200, 1000);

        // Components
        Character character = new Character("Character", MO.aleatoryPositionX(), MO.aleatoryPositionY(), 40, 40, Color.BLUE);
        Apple a1 = new Apple(40, 40, 20, MO.aleatoryPositionX(), MO.aleatoryPositionY(), Color.YELLOW);
        Shield shield = new Shield(1200, 1000, Color.BLACK);
        Boots boots = new Boots(40, 40,0, MO.aleatoryPositionX(), MO.aleatoryPositionY(), Color.PURPLE);
        Bomb bomb = new Bomb(40, 40,3,3,1, MO.aleatoryPositionX(), MO.aleatoryPositionY(), Color.BLUEVIOLET);


        // Convert Shield to a graphical object
        Rectangle shieldRectangle = new Rectangle(shield.getPos_x(), shield.getPos_y(), squareSize, squareSize);
        shieldRectangle.setFill(shield.getColor());

        //Implemented boots with Rectangle
        Rectangle bootsRectangle = new Rectangle(boots.getPos_x(), boots.getPos_y(), squareSize, squareSize);
        bootsRectangle.setFill(boots.getColor());


        //BOMB IMPLEMENTATION
        Rectangle bombRectangle = new Rectangle(bomb.getPos_x(), bomb.getPos_y(), squareSize, squareSize);
        bombRectangle.setFill(bomb.getColor());


        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);

        Button b1 = new Button("New Game");
        Button b2 = new Button("Instructions");
        Button b3 = new Button("Return to Menu");

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
                "-fx-border-color: yellow;"+
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
                "-fx-text-fill: white;"+
                        "-fx-font-size: 26px;"+
                        "-fx-padding: 10 0 0 60"

        );

        Label label3 = new Label("SCORE:");
        Label label4 = new Label("00");
        Label label5 = new Label("TIMER:");

        // Initialize sounds
        try {
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

        // Button b1 to Scene s2
        b1.setOnAction(e -> {
            primaryStage.setScene(s2);
            primaryStage.setX(40);
            primaryStage.setY(0);
            startTimer();/*
            stopThemeSound();
            startBackgroundSound();*/
        });

        // Button b3 to Scene s1
        b3.setOnAction(e -> {
            primaryStage.setScene(s1);
            primaryStage.setX(435);
            primaryStage.setY(45);
            stopTimer();/*
            stopBackgroundSound();
            startThemeSound();*/
        });

        // Scene/Layout 1
        layout1.getChildren().addAll(label1, b1, b2);

        // Set the position of the label2
        label2.setLayoutX(1100);
        label2.setLayoutY(30);

        label2.setStyle(
                "-fx-text-fill: black;"+
                        "-fx-font-size: 26px;"+
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
        layout2.getChildren().addAll(label2, label3, label4, label5, b3, character, a1,shieldRectangle, bootsRectangle, bombRectangle);

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


        //BOMB IMPLEMENTATION

        bomb.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
        bomb.setPos_x(MO.aleatoryPositionX() * squareSize + startX);

        bombRectangle.setX(bomb.getPos_x());
        bombRectangle.setY(bomb.getPos_y());



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
                        character.setPos_y(character.getPos_y() - character.getSpeed());
                    }
                    break;
                case S:
                    if (character.getPos_y() < (squareSize * (rows - 1)) + startY) {
                        character.setPos_y(character.getPos_y() + character.getSpeed());
                    }
                    break;
                case A:
                    if (character.getPos_x() > startX) {
                        character.setPos_x(character.getPos_x() - character.getSpeed());
                    }
                    break;
                case D:
                    if (character.getPos_x() < (squareSize * (cols - 1)) + startX) {
                        character.setPos_x(character.getPos_x() + character.getSpeed());
                    }
                    break;
                default:
                    break;
            }

            // Check if character and apple occupy the same square
            if (characterPosX == applePosX && characterPosY == applePosY) {
                // Reset apple position
                character.setScore(a1.getScore());
                label4.setText(String.valueOf(character.getScore()));
                a1.setVisible(false);
                Timeline delayTimeline = new Timeline(
                        new KeyFrame(Duration.seconds(3), e -> {
                            a1.setPos_x(MO.aleatoryPositionX() * squareSize + startX);
                            a1.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
                            a1.setVisible(true);
                        })
                );
                delayTimeline.play();
            }

            if(characterPosX == bootsRectangle.getX() && characterPosY == bootsRectangle.getY()){
                bootsRectangle.setVisible(false);
                character.setSpeedMore();
                Timeline delayTimeline = new Timeline(
                        new KeyFrame(Duration.seconds(3), e -> {
                            boots.setPos_x(MO.aleatoryPositionX() * squareSize + startX);
                            boots.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
                            character.setSpeedLess();
                            bootsRectangle.setVisible(true);
                        })
                );
                delayTimeline.play();
            }

            if(characterPosX == shieldRectangle.getX() && characterPosY == shieldRectangle.getY()){
                shieldRectangle.setX(MO.aleatoryPositionX()*squareSize + startY);
                shieldRectangle.setY(MO.aleatoryPositionY()*squareSize + startX);
                shieldRectangle.setVisible(false);
                Timeline delayTimeline = new Timeline(
                        new KeyFrame(Duration.seconds(3), e -> {
                            shield.setPos_x(MO.aleatoryPositionX() * squareSize + startX);
                            shield.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
                            shieldRectangle.setVisible(true);
                        })
                );
                delayTimeline.play();
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