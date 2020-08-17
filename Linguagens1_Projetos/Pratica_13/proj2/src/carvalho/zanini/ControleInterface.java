package carvalho.zanini;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class ControleInterface {
    @FXML
    private Label lblSaida;
    @FXML
    private Button btnBotao1;
    @FXML
    private TextField txtEntrada;

    @FXML
    public void exibirNome(){
        String nome = txtEntrada.getText();
        lblSaida.setText(nome);
    }

}
