package com.app.domain.entities.company;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CompanyContactEntityTest {

    @Test
    void constructor_SetsAllFieldsCorrectly() {
        CompanyContactEntity contact = new CompanyContactEntity("123456789", "test@example.com");

        assertEquals("123456789", contact.getTelephone());
        assertEquals("test@example.com", contact.getEmail());
    }

    @Test
    void getTelephone_ReturnsCorrectTelephone() {
        CompanyContactEntity contact = new CompanyContactEntity("987654321", "example@test.com");

        assertEquals("987654321", contact.getTelephone());
    }

    @Test
    void getEmail_ReturnsCorrectEmail() {
        CompanyContactEntity contact = new CompanyContactEntity("555555555", "contact@example.com");

        assertEquals("contact@example.com", contact.getEmail());
    }

    @Test
    void constructor_AllowsEmptyTelephone() {
        CompanyContactEntity contact = new CompanyContactEntity("", "empty@example.com");

        assertEquals("", contact.getTelephone());
        assertEquals("empty@example.com", contact.getEmail());
    }

    @Test
    void constructor_AllowsEmptyEmail() {
        CompanyContactEntity contact = new CompanyContactEntity("123123123", "");

        assertEquals("123123123", contact.getTelephone());
        assertEquals("", contact.getEmail());
    }
}