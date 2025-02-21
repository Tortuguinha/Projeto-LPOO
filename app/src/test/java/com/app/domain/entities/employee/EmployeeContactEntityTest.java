package com.app.domain.entities.employee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeContactEntityTest {

    @Test
    void getTelephone_ReturnsCorrectTelephone() {
        EmployeeContactEntity contact = new EmployeeContactEntity("123456789", "contact@employee.com");
        assertEquals("123456789", contact.getTelephone());
    }

    @Test
    void getEmail_ReturnsCorrectEmail() {
        EmployeeContactEntity contact = new EmployeeContactEntity("123456789", "contact@employee.com");
        assertEquals("contact@employee.com", contact.getEmail());
    }

    @Test
    void constructor_ThrowsException_WhenTelephoneIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmployeeContactEntity(null, "contact@employee.com");
        });
    }

    @Test
    void constructor_ThrowsException_WhenEmailIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmployeeContactEntity("123456789", null);
        });
    }

    @Test
    void constructor_ThrowsException_WhenTelephoneIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmployeeContactEntity("", "contact@employee.com");
        });
    }

    @Test
    void constructor_ThrowsException_WhenEmailIsEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            new EmployeeContactEntity("123456789", "");
        });
    }
}