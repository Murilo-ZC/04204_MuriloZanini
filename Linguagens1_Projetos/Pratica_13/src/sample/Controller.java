package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Label labelSaida;
    @FXML
    private Button btnAction;
    @FXML
    private TextField txtEntrada;
    @FXML
    public void olaMundoCLI(){
        System.out.println("Ola Mundo CLI");
    }
}
