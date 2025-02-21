package com.app.domain.entities;

import java.time.LocalDate;

public class ContractEntity {
    private String companyName;
    private String cnpj;
    private LocalDate startDate;
    private LocalDate endDate;
    private double contractValue;
    private String observations;

    public ContractEntity(String companyName, String cnpj, LocalDate startDate, LocalDate endDate, double contractValue, String observations) {
        if (companyName == null || companyName.isEmpty()) {
            throw new IllegalArgumentException("Company name cannot be null or empty");
        }
        if (cnpj == null || cnpj.isEmpty()) {
            throw new IllegalArgumentException("CNPJ cannot be null or empty");
        }
        if (startDate == null) {
            throw new IllegalArgumentException("Start date cannot be null");
        }
        if (endDate == null) {
            throw new IllegalArgumentException("End date cannot be null");
        }
        if (contractValue < 0) {
            throw new IllegalArgumentException("Contract value cannot be negative");
        }
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
