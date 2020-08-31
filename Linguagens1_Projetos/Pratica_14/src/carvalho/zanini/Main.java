package carvalho.zanini;

import carvalho.zanini.testes.Aplicacao;
import carvalho.zanini.testes.AplicacaoDAO;

public class Main {

    public static void main(String[] args) {
        AplicacaoDAO app = new AplicacaoDAO();
        app.run();
    }
}
