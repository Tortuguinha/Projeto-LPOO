package com.app.domain.entities.client;

import java.util.Date;

public class ClientEntity {
    private int id;
    private String name;
    private String email;
    private String cpf;
    private Boolean status;
    private Date createdAt;

    public ClientEntity(String name, String email, String cpf, boolean status, Date createdAt) {
        this.name = name;
        this.email = email;
        this.cpf = cpf;
        this.status = status;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return this.name;
    }


    public String getEmail() {
        return this.email;
    }

    public String getCPF() {
        return this.cpf;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public Date getCreatedAt() {
    	return this.createdAt;
    }
    
    public void setId(int id) {
    	this.id = id;
    }
}