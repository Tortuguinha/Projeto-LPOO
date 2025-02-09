package com.app.domain.models;

public class CompanyModel {
    private String companyName;
    private String cnpj;
    private String phone;
    private String address;
    private String email;

    public CompanyModel(String companyName, String cnpj, String phone, String address, String email) {
        this.companyName = companyName;
        this.cnpj = cnpj;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    // Getters e Setters
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return companyName + " - CNPJ: " + cnpj + " (Telefone: " + phone + ")";
    }
}
