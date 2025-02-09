package app.model;

import java.time.LocalDate;

public class ServiceModel {
    private int id;
    private String numero;
    private LocalDate data;
    private String cliente;
    private String descricao;
    private String status;
    private double valorTotal;

    // Construtores
    public ServiceModel() {}
    public ServiceModel(String numero, LocalDate data, String cliente, String descricao, String status, double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.descricao = descricao;	
        this.status = status;
        this.valorTotal = valorTotal;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }

    @Override
    public String toString() {
        return "OrdemServico{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", data=" + data +
                ", cliente='" + cliente + '\'' +
                ", descricao='" + descricao + '\'' +
                ", status='" + status + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }
}
