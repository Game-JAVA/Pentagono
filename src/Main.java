import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Welcome to the game! ");
        this.primaryStage = primaryStage;

        // Criação do botão "New Game"
        Button newGameButton = new Button();
        newGameButton.setText("New Game");
        newGameButton.setOnAction(event -> {
            openTestScreen();
            primaryStage.close();
        });

        // Criação do botão "Options"
        Button optionsButton = new Button();
        optionsButton.setText("Options");
        optionsButton.setOnAction(event -> {
            openOptionsScreen();
            primaryStage.close();
        });

        // Usando VBox para dispor os botões verticalmente
        VBox vbox = new VBox(10); // 10 é o espaçamento entre os botões
        vbox.getChildren().addAll(newGameButton, optionsButton);

        // Centraliza os elementos dentro do VBox
        vbox.setAlignment(Pos.CENTER);

        // Adiciona um preenchimento ao VBox
        vbox.setPadding(new Insets(20));

        // Adiciona uma classe ao VBox para estilização
        vbox.getStyleClass().add("root");

        // Configuração da cena e do palco
        Scene scene = new Scene(vbox, 600, 450);

        // Carrega e aplica o CSS
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void openTestScreen() {
        Stage testStage = new Stage();
        testStage.setTitle("Game Screen");

        // Usando BorderPane para permitir posicionamento flexível
        BorderPane testRoot = new BorderPane();

        // Criação do botão "Back"
        Button backButton = new Button("Back");
        backButton.setOnAction(event -> {
            testStage.close();
            primaryStage.show();
        });

        // Colocando o botão "Back" na parte superior direita
        BorderPane.setAlignment(backButton, Pos.TOP_RIGHT);
        testRoot.setTop(backButton);
        BorderPane.setMargin(backButton, new Insets(10));

        Scene testScene = new Scene(testRoot, 1200, 600);
        testScene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        testStage.setScene(testScene);
        testStage.show();
    }

    private void openOptionsScreen() {
        Stage optionsStage = new Stage();
        optionsStage.setTitle("Options Screen");

        // Usando BorderPane para permitir posicionamento flexível
        BorderPane optionsRoot = new BorderPane();

        // Criação do botão "Back"
        Button backButton = new Button("Back");
        backButton.setOnAction(event -> {
            optionsStage.close();
            primaryStage.show();
        });

        // Colocando o botão "Back" na parte inferior direita
        BorderPane.setAlignment(backButton, Pos.BOTTOM_RIGHT);
        optionsRoot.setBottom(backButton);
        BorderPane.setMargin(backButton, new Insets(10));

        Scene optionsScene = new Scene(optionsRoot, 600, 450);
        optionsScene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());

        optionsStage.setScene(optionsScene);
        optionsStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
