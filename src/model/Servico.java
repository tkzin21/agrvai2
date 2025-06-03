package model;

public abstract class Servico {
    private String protocolo;
    
    public Servico() {// construtor vazio
    }

    public Servico(String protocolo) { // contrustor protocolo
        this.protocolo = protocolo;
    }

    public abstract void CadastrarServico(String protocolo); // método abstrato de cadastro de serviço

    // getters e setters
    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

}
