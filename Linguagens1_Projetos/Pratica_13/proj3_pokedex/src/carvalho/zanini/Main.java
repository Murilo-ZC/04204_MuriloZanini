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
        Parent root = FXMLLoader.load(getClass().getResource("view/pokedexview.fxml"));
        primaryStage.setTitle("PokedexFX");
        primaryStage.setScene(new Scene(root, 354, 405));
        primaryStage.show();
    }
}
