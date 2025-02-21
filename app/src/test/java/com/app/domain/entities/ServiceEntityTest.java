package com.app.domain.entities;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ServiceEntityTest {

    @Test
    void getId_ReturnsCorrectId() {
        ServiceEntity service = new ServiceEntity("12345", LocalDate.now(), "Client A", "Description", "Open", 1000.0);
        service.setId(1);
        assertEquals(1, service.getId());
    }

    @Test
    void getNumero_ReturnsCorrectNumero() {
        ServiceEntity service = new ServiceEntity("12345", LocalDate.now(), "Client A", "Description", "Open", 1000.0);
        assertEquals("12345", service.getNumero());
    }

    @Test
    void getData_ReturnsCorrectData() {
        LocalDate date = LocalDate.now();
        ServiceEntity service = new ServiceEntity("12345", date, "Client A", "Description", "Open", 1000.0);
        assertEquals(date, service.getData());
    }

    @Test
    void getCliente_ReturnsCorrectCliente() {
        ServiceEntity service = new ServiceEntity("12345", LocalDate.now(), "Client A", "Description", "Open", 1000.0);
        assertEquals("Client A", service.getCliente());
    }

    @Test
    void getDescricao_ReturnsCorrectDescricao() {
        ServiceEntity service = new ServiceEntity("12345", LocalDate.now(), "Client A", "Description", "Open", 1000.0);
        assertEquals("Description", service.getDescricao());
    }

    @Test
    void getStatus_ReturnsCorrectStatus() {
        ServiceEntity service = new ServiceEntity("12345", LocalDate.now(), "Client A", "Description", "Open", 1000.0);
        assertEquals("Open", service.getStatus());
    }

    @Test
    void getValorTotal_ReturnsCorrectValorTotal() {
        ServiceEntity service = new ServiceEntity("12345", LocalDate.now(), "Client A", "Description", "Open", 1000.0);
        assertEquals(1000.0, service.getValorTotal());
    }

    @Test
    void toString_ReturnsCorrectStringRepresentation() {
        ServiceEntity service = new ServiceEntity("12345", LocalDate.now(), "Client A", "Description", "Open", 1000.0);
        service.setId(1);
        assertEquals("OrdemServico{id=1, numero='12345', data=" + LocalDate.now() + ", cliente='Client A', descricao='Description', status='Open', valorTotal=1000.0}", service.toString());
    }

    @Test
    void constructor_ThrowsException_WhenNumeroIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ServiceEntity(null, LocalDate.now(), "Client A", "Description", "Open", 1000.0);
        });
    }

    @Test
    void constructor_ThrowsException_WhenDataIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ServiceEntity("12345", null, "Client A", "Description", "Open", 1000.0);
        });
    }

    @Test
    void constructor_ThrowsException_WhenClienteIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ServiceEntity("12345", LocalDate.now(), null, "Description", "Open", 1000.0);
        });
    }

    @Test
    void constructor_ThrowsException_WhenDescricaoIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ServiceEntity("12345", LocalDate.now(), "Client A", null, "Open", 1000.0);
        });
    }

    @Test
    void constructor_ThrowsException_WhenStatusIsNull() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ServiceEntity("12345", LocalDate.now(), "Client A", "Description", null, 1000.0);
        });
    }

    @Test
    void constructor_ThrowsException_WhenValorTotalIsNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            new ServiceEntity("12345", LocalDate.now(), "Client A", "Description", "Open", -1000.0);
        });
    }
}