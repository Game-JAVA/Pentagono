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
    public void start(Stage primaryStage) throws Exception {
        // Classes Instances
        Map_Objects MO = new Map_Objects();
        Image backgroundImage = new Image("backgroundMenu.png");
        Image backgroundImage2 = new Image("Board.png");
        Image backgroundImage3 = new Image("backgroundscene3.jpg");
        Image keys = new Image("wasdImage.jpg");
        ImageView keysImageView = new ImageView(keys);
        VBox layout1 = new VBox(10);
        Pane layout2 = new Pane();
        Pane layout3 = new Pane();

        Scene s1 = new Scene(layout1, 400, 500);
        Scene s2 = new Scene(layout2, 1200, 1000);
        Scene s3 = new Scene(layout3, 800, 500);

        // Components
        Character character = new Character("Character", MO.aleatoryPositionX(), MO.aleatoryPositionY(), 40, 40, "Main.png");
        Apple a1 = new Apple(40, 40, 20, MO.aleatoryPositionX(), MO.aleatoryPositionY(), "Apple.png");
        Shield shield = new Shield(40, 40, MO.aleatoryPositionX(), MO.aleatoryPositionY(), "Shield.png");
        Boots boots = new Boots(40, 40, MO.aleatoryPositionX(), MO.aleatoryPositionY(), "Boot.png");
        Bomb bombast = new Bomb(120, 120, MO.aleatoryPositionX(), MO.aleatoryPositionY(), "MagicAnimation.gif", character.getPos_y(), character.getPos_x());

        // Create ImageView for the first character's heart
        ImageView heartFull1 = new ImageView(new Image("HeartFull.png"));
        heartFull1.setFitHeight(60);
        heartFull1.setFitWidth(60);
        heartFull1.setX(130); //POSITION IN WINDOWN
        heartFull1.setY(10); // POSITION IN WINDOWN
        heartFull1.setVisible(true); // DEFINE HOW VISIBLE

        // Create ImageView for the second character's heart
        ImageView heartFull2 = new ImageView(new Image("HeartFull.png"));
        heartFull2.setFitHeight(60);
        heartFull2.setFitWidth(60);
        heartFull2.setX(230);
        heartFull2.setY(10);
        heartFull2.setVisible(true);

        // Create ImageView for the third character's heart
        ImageView heartFull3 = new ImageView(new Image("HeartFull.png"));
        heartFull3.setFitHeight(60);
        heartFull3.setFitWidth(60);
        heartFull3.setX(330);
        heartFull3.setY(10);
        heartFull3.setVisible(true);

        // Create ImageView for the third character's Empyt heart
        ImageView heartEmpty3 = new ImageView(new Image("HeartEmpty.png"));
        heartEmpty3.setFitHeight(60);
        heartEmpty3.setFitWidth(60);
        heartEmpty3.setX(330);
        heartEmpty3.setY(10);
        heartEmpty3.setVisible(false);

        // Create ImageView for the second character's Empyt heart
        ImageView heartEmpty2 = new ImageView(new Image("HeartEmpty.png"));
        heartEmpty2.setFitHeight(60);
        heartEmpty2.setFitWidth(60);
        heartEmpty2.setX(230);
        heartEmpty2.setY(10);
        heartEmpty2.setVisible(false);

        // Create ImageView for the first character's Empyt heart
        ImageView heartEmpty1 = new ImageView(new Image("HeartEmpty.png"));
        heartEmpty1.setFitHeight(60);
        heartEmpty1.setFitWidth(60);
        heartEmpty1.setX(130);
        heartEmpty1.setY(10);
        heartEmpty1.setVisible(false);

        // Create ImageView for the character's heartShield
        ImageView heartShield3 = new ImageView(new Image("HeartShield.png"));
        heartShield3.setFitHeight(60);
        heartShield3.setFitWidth(60);
        heartShield3.setX(330);
        heartShield3.setY(10);
        heartShield3.setVisible(false);

        // Create ImageView for the second character's heart
        ImageView heartShield2 = new ImageView(new Image("HeartShield.png"));
        heartShield2.setFitHeight(60);
        heartShield2.setFitWidth(60);
        heartShield2.setX(230);
        heartShield2.setY(10);
        heartShield2.setVisible(false);

        // Create ImageView for the third character's heart
        ImageView heartShield1 = new ImageView(new Image("HeartShield.png"));
        heartShield1.setFitHeight(60);
        heartShield1.setFitWidth(60);
        heartShield1.setX(130);
        heartShield1.setY(10);
        heartShield1.setVisible(false);

        VBox vbox = new VBox(10);
        vbox.setAlignment(Pos.CENTER);

        Button b1 = new Button("New Game");
        Button b2 = new Button("Instructions");
        Button b3 = new Button("Return to Menu");
        Button b4 = new Button("Return to Menu");

        VBox.setMargin(b1, new Insets(150, 20, 10, 155)); // cima, direita, baixo, esquerda
        VBox.setMargin(b2, new Insets(10, 20, 10, 155));
        VBox.setMargin(b3, new Insets(10, 20, 10, 155));
        VBox.setMargin(b3, new Insets(500, 10, 10, 300));

        vbox.getChildren().addAll(b1, b2, b3, b4);

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
        b4.setStyle(buttonStyle);

        BackgroundSize backgroundSize = new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true);

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

        BackgroundImage background3 = new BackgroundImage(
                backgroundImage3,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.CENTER,
                backgroundSize
        );

        layout1.setBackground(new Background(background));
        layout2.setBackground(new Background(background2));
        layout3.setBackground(new Background(background3));

        Label label3 = new Label("SCORE:");
        Label label4 = new Label("00");
        Label label5 = new Label("TIMER:");
        Label label6 = new Label("Instructions");

        Label label7 = new Label("Game Objective:\n");
        Label label9 = new Label("The main objective is to get the character through the levels without being blown up by the bombs.\n" +
                "The difficulty increases as the player's score goes up.\nMore magical attacks appear on the screen as you progress;\n" +
                "The game ends when you are hit by an attack and have no more lives left;\n" +
                "There are some items to help:\n" +
                "Apple: increases the character's score;\n" +
                "Shield: Gives the character extra life;\n" +
                "Boots: increases the character's speed.\n");
        Label label10 = new Label("W - Move forward;\n" +
                "A - Move left;\n" +
                "S - Move down;\n" +
                "D - Move right.");

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
            startTimer();
            stopThemeSound();
            startBackgroundSound();
        });

        // Button b3 to Scene s1
        b3.setOnAction(e -> {
            primaryStage.setScene(s1);
            primaryStage.setX(435);
            primaryStage.setY(45);
            character.resetScore();
            stopTimer();
            label4.setText(String.valueOf(character.getScore()));
            character.setPos_y(MO.aleatoryPositionY() * squareSize + startY);
            character.setPos_x(MO.aleatoryPositionX() * squareSize + startX);
            stopBackgroundSound();
            startThemeSound();
        });

        b2.setOnAction(e -> {
            primaryStage.setScene(s3);
        });

        b4.setOnAction(e -> {
            primaryStage.setScene(s1);

        });

        keysImageView.setFitWidth(150); // Defina a largura desejada
        keysImageView.setFitHeight(110); // Defina a altura desejada

        // Definir a posição da imagem na layout
        keysImageView.setLayoutX(200);
        keysImageView.setLayoutY(325);

        // Scene/Layout 1
        layout1.getChildren().addAll(b1, b2);

        layout3.getChildren().addAll(label6, label7, b4, label9, label10, keysImageView);

        layout2.getChildren().addAll(
                label2,
                label3,
                label4,
                label5,
                b3,
                character,
                a1,
                shield,
                boots,
                bombast,
                heartFull1,
                heartFull2,
                heartFull3,
                heartEmpty3,
                heartEmpty2,
                heartEmpty1,
                heartShield1,
                heartShield2,
                heartShield3
        );

        // Scene/Layout 3
        b4.setLayoutX(680);  // Ajuste a posição X conforme necessário
        b4.setLayoutY(450);  // Ajuste a posição Y conforme necessário

        // Set the position of the label2
        label2.setLayoutX(1100);
        label2.setLayoutY(30);

        label2.setStyle(
                        "-fx-text-fill: white;" +
                        "-fx-font-size: 20px;" +
                        "-fx-padding: 10 0 0 10"
        );
        label3.setStyle(
                "-fx-text-fill: white;" +
                        "-fx-font-size: 20px;" +
                        "-fx-padding: 10 0 0 10"
        );

        label4.setStyle(
                "-fx-text-fill: white;" +
                        "-fx-font-size: 20px;" +
                        "-fx-padding: 10 0 0 10"
        );

        label5.setStyle(
                "-fx-text-fill: white;" +
                        "-fx-font-size: 20px;" +
                        "-fx-padding: 10 0 0 10"
        );

        // Set the position of the label3
        label3.setLayoutX(800);
        label3.setLayoutY(8);

        label3.setStyle(
                "-fx-text-fill: white;" +
                        "-fx-font-size: 18px;" +
                        "-fx-padding: 10 0 0 10"
        );

        // Set the position of the label4
        label4.setLayoutX(800);
        label4.setLayoutY(30);

        label4.setStyle(
                "-fx-text-fill: white;" +
                        "-fx-font-size: 22px;" +
                        "-fx-padding: 10 0 0 10"
        );

        // Set the position of the label5
        label5.setLayoutX(1100);
        label5.setLayoutY(8);

        label5.setStyle(
                "-fx-text-fill: white;" +
                        "-fx-font-size: 18px;" +
                        "-fx-padding: 10 0 0 10"
        );

        // Set the position of the label6
        label6.setLayoutX(350);
        label6.setLayoutY(10);

        label6.setStyle(
                "-fx-text-fill: yellow;" +
                        "-fx-font-size: 26px;"
        );

        // Set the position of the label7
        label7.setLayoutX(20);
        label7.setLayoutY(40);

        label7.setStyle(
                "-fx-text-fill: yellow;" +
                        "-fx-font-size: 22px;"
        );

        // Set the position of the label9
        label9.setLayoutX(20);
        label9.setLayoutY(75);

        label9.setStyle(
                "-fx-text-fill: white;" +
                        "-fx-font-size: 16px;"
        );

        // Set the position of the label10
        label10.setLayoutX(20);
        label10.setLayoutY(340);

        label10.setStyle(
                "-fx-text-fill: white;" +
                        "-fx-font-size: 16px;"
        );

        // Set initial position of the character
        character.initialPosition(character, MO, squareSize, startX, startY);

        // Set initial position of the apple
        a1.initialPosition(a1, MO, squareSize, startX, startY);

        //Implemented Shield in Window
        shield.initialPosition(shield, MO, squareSize, startX, startY);

        //Implemented Boots in window.
        boots.initialPosition(boots, MO, squareSize, startX, startY);

        //Implemented Bomb in window.
        bombast.initialPosition(bombast, MO, squareSize, startX, startY);

        // Create the board of squares
        //createBoard(layout2);

        // Character's Movement
        s2.setOnKeyPressed(event -> {
            character.moveCharacter(character, rows, event, cols, squareSize, startX, startY);

            // Check if character and apple occupy the same square
            a1.colisionCharacter(character, a1, label4, MO, squareSize, startX, startY);

            boots.colisionCharacter(character, boots, MO, squareSize, startX, startY);

            shield.colisionCharacter(character, shield, MO, squareSize, startX, startY);

            // Log position after movement
            System.out.println("Char: x = " + character.getPos_x() + ", y = " + character.getPos_y() + ", Score = " + character.getScore() + ", heart = " + character.getHealth());
            System.out.println("Appl: x = " + a1.getPos_x() + ", y = " + a1.getPos_y());
            System.out.println("Shie: x = " + shield.getPos_x() + ", y = " + shield.getPos_y());
            System.out.println(" ");

            //heart's conditions
            character.heartCharacter(character, shield, heartFull1, heartFull2, heartFull3, heartEmpty1, heartEmpty2, heartEmpty3,
                    heartShield1, heartShield2, heartShield3);
        });

        // Build the Window
        primaryStage.setScene(s1);
        primaryStage.setTitle("Pentagon Blast");
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
}