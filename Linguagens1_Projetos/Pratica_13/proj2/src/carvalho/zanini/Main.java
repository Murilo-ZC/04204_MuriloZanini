package carvalho.zanini;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("ViewInterface.fxml"));
        primaryStage.setTitle("Segunda Aplicação JavaFX");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
}
