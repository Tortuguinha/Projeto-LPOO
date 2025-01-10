package app.model;

import java.time.LocalDate;

public class ProtocolModel {
    private int id;
    private String numero;
    private LocalDate data;
    private String descricao;
    private String status;

    // Construtores
    public ProtocolModel() {}
    public ProtocolModel(String numero, LocalDate data, String descricao, String status) {
        this.numero = numero;
        this.data = data;
        this.descricao = descricao;
        this.status = status;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    @Override
    public String toString() {
        return "Protocolo{" +
               "id=" + id +
               ", numero='" + numero + '\'' +
               ", data=" + data +
               ", descricao='" + descricao + '\'' +
               ", status='" + status + '\'' +
               '}';
    }
}
