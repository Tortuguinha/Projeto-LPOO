package com.app.domain.entities.client;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ClientContactEntityTest {

    @Test
    void constructor_SetsAllFieldsCorrectly() {
        ClientContactEntity contact = new ClientContactEntity("123456789", "test@example.com");

        assertEquals("123456789", contact.getTelephone());
        assertEquals("test@example.com", contact.getEmail());
    }

    @Test
    void getTelephone_ReturnsCorrectTelephone() {
        ClientContactEntity contact = new ClientContactEntity("987654321", "example@test.com");

        assertEquals("987654321", contact.getTelephone());
    }

    @Test
    void getEmail_ReturnsCorrectEmail() {
        ClientContactEntity contact = new ClientContactEntity("555555555", "contact@example.com");

        assertEquals("contact@example.com", contact.getEmail());
    }

    @Test
    void constructor_AllowsEmptyTelephone() {
        ClientContactEntity contact = new ClientContactEntity("", "empty@example.com");

        assertEquals("", contact.getTelephone());
        assertEquals("empty@example.com", contact.getEmail());
    }

    @Test
    void constructor_AllowsEmptyEmail() {
        ClientContactEntity contact = new ClientContactEntity("123123123", "");

        assertEquals("123123123", contact.getTelephone());
        assertEquals("", contact.getEmail());
    }
}