package app.view;

public class ServiceOrder {
    private String numero;
    private String data;
    private String cliente;
    private String descricao;
    private String status;
    private double valorTotal;

    public ServiceOrder(String numero, String data, String cliente, String descricao, String status, double valorTotal) {
        this.numero = numero;
        this.data = data;
        this.cliente = cliente;
        this.descricao = descricao;
        this.status = status;
        this.valorTotal = valorTotal;
    }

    public String getNumero() {
        return numero;
    }

    public String getData() {
        return data;
    }

    public String getCliente() {
        return cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus() {
        return status;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
