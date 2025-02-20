package com.app.domain.entities.company;

import java.util.Date;

public class CompanyEntity {
	private int id;
    private String companyName;
    private String email;
    private String cnpj;
    private Boolean status;
    private Date createdAt;

    public CompanyEntity(String companyName, String email, String cnpj, boolean status, Date createdAt) {
        this.companyName = companyName;
        this.email = email;
        this.cnpj = cnpj;
        this.status = status;
        this.createdAt = createdAt;
        }

    // Getters e Setters
    public String getCompanyName() {
        return this.companyName;
    }

    public String getCNPJ() {
        return this.cnpj;
    }

    public String getEmail() {
        return this.email;
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
