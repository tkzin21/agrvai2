package controller;

import java.io.IOException;
import java.net.URL;

import dao.Cadastros;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.Cliente;
import model.Dispositivo;

public class TelaDispositivoController {

    @FXML
    private Button btnCadastroDispositivo;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtcliente;

    @FXML
    private TextArea txtdefeito;

    @FXML
    private TextField txtmodelo;

    @FXML
    private TextField txtvlrservico;

    @FXML
    void Acaovoltar(ActionEvent event) {
        try {
            URL url = getClass().getResource("/view/TelaIncial.fxml");
            Parent root = FXMLLoader.load(url);
            btnVoltar.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
            // Optionally, add user feedback or logging here
        }
    }

    @FXML
    void acaCadastrarDispositivo(ActionEvent event) {
        // Aqui você pode implementar a lógica para cadastrar o dispositivo
      Cliente cliente = new Cliente();
    Dispositivo dispositivo = new Dispositivo();
     dispositivo.setModelo(txtmodelo.getText());
    dispositivo.setDefeito(txtdefeito.getText());
    dispositivo.setValorServico(Double.parseDouble(txtvlrservico.getText()));
    cliente.setNome(txtcliente.getText());
    // Chama o método de cadastro no DAO

        Cadastros.cadastrarDispositivo(dispositivo,cliente );
    }

}
