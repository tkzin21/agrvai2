package controller;

import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import model.Servico;

public class TelaInicialController {

    @FXML
    private Button btnCliente;

    @FXML
    private Button btnDispositivo;

    @FXML
    private Button btnservico;

    @FXML
    void acaotelacliente(ActionEvent event) {
        try {
            URL url = getClass().getResource("/view/TelaCliente.fxml");
            Parent root = FXMLLoader.load(url);
            btnCliente.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
            // Optionally, add user feedback or logging here
        }
    }

    @FXML
    void acaoteladispositivo(ActionEvent event) {
        try {
            URL url = getClass().getResource("/view/TelaDispositivo.fxml");
            Parent root = FXMLLoader.load(url);
            btnCliente.getScene().setRoot(root);
        } catch (IOException e) {
            e.printStackTrace();
            // Optionally, add user feedback or logging here
        }
    }
    @FXML
    void acaoservico(ActionEvent event) {

        Servico servico = new Servico() {
            
            @Override
            public void CadastrarServico(String protocolo) {
                // Implementação do método abstrato
                this.setProtocolo(protocolo);
            }
        };
    }

}
