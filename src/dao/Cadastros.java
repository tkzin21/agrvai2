package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbc.ConexaoMySql;
import model.Cliente;
import model.Dispositivo;

public class Cadastros {

    public static boolean cadastrarServico(Cliente cliente, Dispositivo dispositivo) {

        String sql;
        sql = "INSERT INTO servico (protocolo, cliente, dispositivo, defeito, valorServico) ";
        sql += "VALUES (?, ?, ?, ?, ?)";

        try (Connection con = ConexaoMySql.getConexao()) {

            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, cliente.getProtocolo());
            ps.setString(2, cliente.getNome());
            ps.setString(3, dispositivo.getModelo());
            ps.setString(4, dispositivo.getDefeito());
            ps.setDouble(5, dispositivo.getValorServico());

            return (ps.executeUpdate() > 0);

        } catch (SQLException e) {
            System.out.println("ERRO AO INSERIR: " + e.getMessage());
            return false;
        }
    }

    public static boolean cadastrarCliente(Cliente cliente){
        String sql;
        sql = "INSERT INTO cliente (nome, cpf, telefone) ";
        sql += "VALUES (?, ?, ?)";        

        try (Connection con = ConexaoMySql.getConexao()) {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString (1, cliente.getNome()   );
            ps.setString   (2, cliente.getCpf() );
            ps.setString (3,cliente.getTelefone()   );
          System.out.println("Cliente cadastrado: " + cliente.getNome() + ", CPF: " + cliente.getCpf() + ", Telefone: " + cliente.getTelefone());
            // Executa a inserção e retorna true se for bem-sucedido

            return (ps.executeUpdate() > 0);

        } catch (SQLException e) {
            System.out.println("ERRO AO INSERIR: " + e.getMessage());
            return false;
        }
    }

     public static boolean cadastrarDispositivo(Dispositivo dispositivo, Cliente cliente) {
        String sql;
        sql = "INSERT INTO dispositivo (modelo, defeito, cliente, valorservico) ";
        sql += "VALUES (?, ?, ?, ?)";

        try (Connection con = ConexaoMySql.getConexao()) {

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, dispositivo.getModelo());
            ps.setString(2, dispositivo.getDefeito());
            ps.setString(3, cliente.getNome());
            ps.setDouble(4, dispositivo.getValorServico());
            

            return (ps.executeUpdate() > 0);

        } catch (SQLException e) {
            System.out.println("ERRO AO INSERIR: " + e.getMessage());
            return false;
        }

    }
}

