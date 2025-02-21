package com.app.domain.entities;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ContractEntityTest {

    @Test
    void getCompanyName_ReturnsCorrectCompanyName() {
        ContractEntity contract = new ContractEntity("Company A", "12345678000199", LocalDate.now(), LocalDate.now().plusDays(30), 10000.0, "Observation");
        assertEquals("Company A", contract.getCompanyName());
    }

    @Test
    void getCnpj_ReturnsCorrectCnpj() {
        ContractEntity contract = new ContractEntity("Company A", "12345678000199", LocalDate.now(), LocalDate.now().plusDays(30), 10000.0, "Observation");
        assertEquals("12345678000199", contract.getCnpj());
    }

    @Test
    void getStartDate_ReturnsCorrectStartDate() {
        LocalDate startDate = LocalDate.now();
        ContractEntity contract = new ContractEntity("Company A", "12345678000199", startDate, LocalDate.now().plusDays(30), 10000.0, "Observation");
        assertEquals(startDate, contract.getStartDate());
    }

    @Test
    void getEndDate_ReturnsCorrectEndDate() {
        LocalDate endDate = LocalDate.now().plusDays(30);
        ContractEntity contract = new ContractEntity("Company A", "12345678000199", LocalDate.now(), endDate, 10000.0, "Observation");
        assertEquals(endDate, contract.getEndDate());
    }

    @Test
    void getContractValue_ReturnsCorrectContractValue() {
        ContractEntity contract = new ContractEntity("Company A", "12345678000199", LocalDate.now(), LocalDate.now().plusDays(30), 10000.0, "Observation");
        assertEquals(10000.0, contract.getContractValue());
    }

    @Test
    void getObservations_ReturnsCorrectObservations() {
        ContractEntity contract = new ContractEntity("Company A", "12345678000199", LocalDate.now(), LocalDate.now().plusDays(30), 10000.0, "Observation");
        assertEquals("Observation", contract.getObservations());
    }

    @Test
    void toString_ReturnsCorrectStringRepresentation() {
        ContractEntity contract = new ContractEntity("Company A", "12345678000199", LocalDate.now(), LocalDate.now().plusDays(30), 10000.0, "Observation");
        assertEquals("Company A - CNPJ: 12345678000199 (Valor: R$10000.0)", contract.toString());
    }

    @Test
    void constructor_ThrowsException_WhenCompanyNameIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ContractEntity(null, "12345678000199", LocalDate.now(), LocalDate.now().plusDays(30), 10000.0, "Observation");
        });
    }

    @Test
    void constructor_ThrowsException_WhenCnpjIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ContractEntity("Company A", null, LocalDate.now(), LocalDate.now().plusDays(30), 10000.0, "Observation");
        });
    }

    @Test
    void constructor_ThrowsException_WhenStartDateIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ContractEntity("Company A", "12345678000199", null, LocalDate.now().plusDays(30), 10000.0, "Observation");
        });
    }

    @Test
    void constructor_ThrowsException_WhenEndDateIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ContractEntity("Company A", "12345678000199", LocalDate.now(), null, 10000.0, "Observation");
        });
    }

    @Test
    void constructor_ThrowsException_WhenContractValueIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ContractEntity("Company A", "12345678000199", LocalDate.now(), LocalDate.now().plusDays(30), -10000.0, "Observation");
        });
    }
}