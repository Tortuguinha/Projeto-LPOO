package com.app.domain.entities.employee;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeEntityTest {

    @Test
    void getId_ReturnsCorrectId() {
        EmployeeEntity employee = new EmployeeEntity("John Doe", "john.doe@example.com", "password123", "12345678901", EmployeeEntity.ROLE.ADMINISTRADOR, new Date(), true);
        employee.setId(1);
        assertEquals(1, employee.getId());
    }

    @Test
    void getName_ReturnsCorrectName() {
        EmployeeEntity employee = new EmployeeEntity("John Doe", "john.doe@example.com", "password123", "12345678901", EmployeeEntity.ROLE.ADMINISTRADOR, new Date(), true);
        assertEquals("John Doe", employee.getName());
    }

    @Test
    void getEmail_ReturnsCorrectEmail() {
        EmployeeEntity employee = new EmployeeEntity("John Doe", "john.doe@example.com", "password123", "12345678901", EmployeeEntity.ROLE.ADMINISTRADOR, new Date(), true);
        assertEquals("john.doe@example.com", employee.getEmail());
    }

    @Test
    void getPassword_ReturnsCorrectPassword() {
        EmployeeEntity employee = new EmployeeEntity("John Doe", "john.doe@example.com", "password123", "12345678901", EmployeeEntity.ROLE.ADMINISTRADOR, new Date(), true);
        assertEquals("password123", employee.getPassword());
    }

    @Test
    void getCPF_ReturnsCorrectCPF() {
        EmployeeEntity employee = new EmployeeEntity("John Doe", "john.doe@example.com", "password123", "12345678901", EmployeeEntity.ROLE.ADMINISTRADOR, new Date(), true);
        assertEquals("12345678901", employee.getCPF());
    }

    @Test
    void getRole_ReturnsCorrectRole() {
        EmployeeEntity employee = new EmployeeEntity("John Doe", "john.doe@example.com", "password123", "12345678901", EmployeeEntity.ROLE.ADMINISTRADOR, new Date(), true);
        assertEquals(EmployeeEntity.ROLE.ADMINISTRADOR, employee.getRole());
    }

    @Test
    void getStatus_ReturnsCorrectStatus() {
        EmployeeEntity employee = new EmployeeEntity("John Doe", "john.doe@example.com", "password123", "12345678901", EmployeeEntity.ROLE.ADMINISTRADOR, new Date(), true);
        assertTrue(employee.getStatus());
    }

    @Test
    void getAdmissionDate_ReturnsCorrectAdmissionDate() {
        Date admissionDate = new Date();
        EmployeeEntity employee = new EmployeeEntity("John Doe", "john.doe@example.com", "password123", "12345678901", EmployeeEntity.ROLE.ADMINISTRADOR, admissionDate, true);
        assertEquals(admissionDate, employee.getAdmissionDate());
    }

    @Test
    void constructor_SetsDefaultRole_WhenRoleIsNull() {
        EmployeeEntity employee = new EmployeeEntity("John Doe", "john.doe@example.com", "password123", "12345678901", null, new Date(), true);
        assertEquals(EmployeeEntity.ROLE.ATENDENTE, employee.getRole());
    }

    @Test
    void constructor_SetsDefaultAdmissionDate_WhenAdmissionDateIsNull() {
        EmployeeEntity employee = new EmployeeEntity("John Doe", "john.doe@example.com", "password123", "12345678901", EmployeeEntity.ROLE.ADMINISTRADOR, null, true);
        assertNotNull(employee.getAdmissionDate());
    }

    @Test
    void constructor_SetsDefaultStatus_WhenStatusIsNull() {
        EmployeeEntity employee = new EmployeeEntity("John Doe", "john.doe@example.com", "password123", "12345678901", EmployeeEntity.ROLE.ADMINISTRADOR, new Date(), null);
        assertTrue(employee.getStatus());
    }
}