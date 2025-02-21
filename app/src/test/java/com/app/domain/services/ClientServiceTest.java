package com.app.domain.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.app.application.usecases.clients.RegisterClientUseCase;
import com.app.application.usecases.clients.ReturnClientsUseCase;
import com.app.domain.entities.client.ClientAddressEntity;
import com.app.domain.entities.client.ClientContactEntity;
import com.app.domain.entities.client.ClientEntity;

class ClientServiceTest {

    private ClientService clientService;
    private RegisterClientUseCase registerClientUseCase;
    private ReturnClientsUseCase returnClientsUseCase;

    @BeforeEach
    void setUp() {
        registerClientUseCase = mock(RegisterClientUseCase.class);
        returnClientsUseCase = mock(ReturnClientsUseCase.class);
        clientService = new ClientService(registerClientUseCase, returnClientsUseCase);
    }

    @Test
    void register_CallsRegisterClientUseCase() {
        ClientEntity client = new ClientEntity(
            "John Doe",
            "bru.rdgz@gmail.com",
            "12345678900",
            true,
            new java.util.Date()
        );
        ClientContactEntity contact = new ClientContactEntity(
            "55998877",
            "contact@example.com"
        );
        ClientAddressEntity address = new ClientAddressEntity(
            123,
            "Main Street",
            "Downtown",
            "SampleCity"
        );

        clientService.register(client, contact, address);
        verify(registerClientUseCase, times(1)).execute(client, contact, address);
    }

    @Test
    void allClients_ReturnsListOfClients() {
        ClientEntity client1 = new ClientEntity(
            "Client One",
            "one@example.com",
            "11111111111",
            true,
            new java.util.Date()
        );
        ClientEntity client2 = new ClientEntity(
            "Client Two",
            "two@example.com",
            "22222222222",
            false,
            new java.util.Date()
        );
        java.util.List<ClientEntity> clients = java.util.Arrays.asList(client1, client2);

        when(returnClientsUseCase.execute()).thenReturn(clients);
        java.util.List<ClientEntity> result = clientService.allClients();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(client1, result.get(0));
        assertEquals(client2, result.get(1));
    }

    @Test
    void allClients_ReturnsEmptyListWhenNoClients() {
        when(returnClientsUseCase.execute()).thenReturn(List.of());

        List<ClientEntity> result = clientService.allClients();

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}