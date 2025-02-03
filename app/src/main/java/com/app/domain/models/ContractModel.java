package com.app.domain.models;

import java.time.LocalDate;

public class ContractModel {
    private String companyName;
    private String cnpj;
    private LocalDate startDate;
    private LocalDate endDate;
    private double contractValue;
    private String observations;

    public ContractModel(String companyName, String cnpj, LocalDate startDate, LocalDate endDate, double contractValue, String observations) {
        this.companyName = companyName;
        this.cnpj = cnpj;
        this.startDate = startDate;
        this.endDate = endDate;
        this.contractValue = contractValue;
        this.observations = observations;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getContractValue() {
        return contractValue;
    }

    public void setContractValue(double contractValue) {
        this.contractValue = contractValue;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return companyName + " - CNPJ: " + cnpj + " (Valor: R$" + contractValue + ")";
    }
}
