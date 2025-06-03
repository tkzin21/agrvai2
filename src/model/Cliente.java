package model;

public class Cliente extends Servico {
    private String nome;
    private String cpf;
    private String telefone;

    public Cliente(){}

    public void CadastrarServico(String protocolo) {
        this.setProtocolo(protocolo);
    }

    public Cliente(String protocolo, String nome, String cpf, String telefone) {
        super(protocolo);
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;

    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
