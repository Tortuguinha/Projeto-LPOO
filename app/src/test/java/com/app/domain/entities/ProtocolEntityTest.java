package com.app.domain.entities;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ProtocolEntityTest {

    @Test
    void getId_ReturnsCorrectId() {
        ProtocolEntity protocol = new ProtocolEntity("12345", LocalDate.now(), "Description", "Open");
        protocol.setId(1);
        assertEquals(1, protocol.getId());
    }

    @Test
    void getNumero_ReturnsCorrectNumero() {
        ProtocolEntity protocol = new ProtocolEntity("12345", LocalDate.now(), "Description", "Open");
        assertEquals("12345", protocol.getNumero());
    }

    @Test
    void getData_ReturnsCorrectData() {
        LocalDate date = LocalDate.now();
        ProtocolEntity protocol = new ProtocolEntity("12345", date, "Description", "Open");
        assertEquals(date, protocol.getData());
    }

    @Test
    void getDescricao_ReturnsCorrectDescricao() {
        ProtocolEntity protocol = new ProtocolEntity("12345", LocalDate.now(), "Description", "Open");
        assertEquals("Description", protocol.getDescricao());
    }

    @Test
    void getStatus_ReturnsCorrectStatus() {
        ProtocolEntity protocol = new ProtocolEntity("12345", LocalDate.now(), "Description", "Open");
        assertEquals("Open", protocol.getStatus());
    }

    @Test
    void toString_ReturnsCorrectStringRepresentation() {
        ProtocolEntity protocol = new ProtocolEntity("12345", LocalDate.now(), "Description", "Open");
        protocol.setId(1);
        assertEquals("Protocolo{id=1, numero='12345', data=" + LocalDate.now() + ", descricao='Description', status='Open'}", protocol.toString());
    }

    @Test
    void constructor_ThrowsException_WhenNumeroIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProtocolEntity(null, LocalDate.now(), "Description", "Open");
        });
    }

    @Test
    void constructor_ThrowsException_WhenDataIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProtocolEntity("12345", null, "Description", "Open");
        });
    }

    @Test
    void constructor_ThrowsException_WhenDescricaoIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProtocolEntity("12345", LocalDate.now(), null, "Open");
        });
    }

    @Test
    void constructor_ThrowsException_WhenStatusIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ProtocolEntity("12345", LocalDate.now(), "Description", null);
        });
    }
}