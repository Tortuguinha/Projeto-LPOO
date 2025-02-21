package com.app.domain.entities.client;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Date;

class ClientEntityTest {

    @Test
    void constructor_SetsAllFieldsCorrectly() {
        Date now = new Date();
        ClientEntity client = new ClientEntity("John Doe", "john@example.com", "12345678900", true, now);

        assertEquals("John Doe", client.getNome());
        assertEquals("john@example.com", client.getEmail());
        assertEquals("12345678900", client.getCPF());
        assertTrue(client.getStatus());
        assertEquals(now, client.getCreatedAt());
    }

    @Test
    void getId_ReturnsCorrectId() {
        ClientEntity client = new ClientEntity("Jane Doe", "jane@example.com", "09876543211", false, new Date());
        client.setId(1);

        assertEquals(1, client.getId());
    }

    @Test
    void getNome_ReturnsCorrectName() {
        ClientEntity client = new ClientEntity("Alice", "alice@example.com", "11122233344", true, new Date());

        assertEquals("Alice", client.getNome());
    }

    @Test
    void getEmail_ReturnsCorrectEmail() {
        ClientEntity client = new ClientEntity("Bob", "bob@example.com", "55566677788", false, new Date());

        assertEquals("bob@example.com", client.getEmail());
    }

    @Test
    void getCPF_ReturnsCorrectCPF() {
        ClientEntity client = new ClientEntity("Charlie", "charlie@example.com", "99988877766", true, new Date());

        assertEquals("99988877766", client.getCPF());
    }

    @Test
    void getStatus_ReturnsCorrectStatus() {
        ClientEntity client = new ClientEntity("Dave", "dave@example.com", "44455566677", false, new Date());

        assertFalse(client.getStatus());
    }

    @Test
    void getCreatedAt_ReturnsCorrectCreatedAt() {
        Date now = new Date();
        ClientEntity client = new ClientEntity("Eve", "eve@example.com", "33322211100", true, now);

        assertEquals(now, client.getCreatedAt());
    }
}