package com.app.domain.entities.client;


public class ClientEntity {
    private int id;
    private String name;
    private String email;
    private String cpf;
    private String telephone;
    private Boolean status;

    public ClientEntity(int id, String name, String email, String cpf, String telephone, boolean status) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.telephone = telephone;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return this.name;
    }

    public void setNome(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCPF() {
        return this.cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return this.telephone;
    }

    public void setTelefone(String telephone) {
        this.telephone = telephone;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}