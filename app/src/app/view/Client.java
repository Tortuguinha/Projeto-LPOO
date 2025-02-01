package app.view;

// Client.java
public class Client {
    private int id;
    private String nome;
    private String email;
    private String telefone;
    private String status;

    public Client(int id, String nome, String email, String telefone, String status) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getStatus() {
        return status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
