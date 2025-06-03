package controller;

import java.io.IOException;
import java.net.URL;

import dao.Cadastros;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import model.Cliente;

public class TelaClienteController {

    @FXML
    private Button btnCadastroCliente;

    @FXML
    private TextField txtcpf;

    @FXML
    private Button btnVoltar;

    @FXML
    private TextField txtnome;

    @FXML
    private TextField txttelefone;

    @FXML
    void acaCadastrarCliente(ActionEvent event) {
        Cliente cliente = new Cliente();
        cliente.setCpf(txtcpf.getText());
        cliente.setNome(txtnome.getText());
        cliente.setTelefone(txttelefone.getText());
        Cadastros.cadastrarCliente(cliente);
        // Aqui você pode adicionar lógica para salvar o cliente em um banco de dados ou lista

    }
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

}
