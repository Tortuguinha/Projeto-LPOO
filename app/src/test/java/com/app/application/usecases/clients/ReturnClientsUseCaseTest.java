package com.app.application.usecases.clients;

import com.app.domain.entities.client.ClientEntity;
import com.app.domain.repositories.interfaces.IClientRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

class ReturnClientsUseCaseTest {

    @Test
    void execute_ReturnsAllClients_WhenClientsExist() {
        IClientRepository clientRepository = Mockito.mock(IClientRepository.class);
        List<ClientEntity> expectedClients = Arrays.asList(
            new ClientEntity("John Doe", "john.doe@example.com", "12345678901", true, new Date()),
            new ClientEntity("Jane Smith", "jane.smith@example.com", "98765432100", false, new Date())
        );
        Mockito.when(clientRepository.allClients()).thenReturn(expectedClients);

        ReturnClientsUseCase useCase = new ReturnClientsUseCase(clientRepository);
        List<ClientEntity> result = useCase.execute();

        assertEquals(expectedClients, result);
    }

    @Test
    void execute_ReturnsEmptyList_WhenNoClientsExist() {
        IClientRepository clientRepository = Mockito.mock(IClientRepository.class);
        Mockito.when(clientRepository.allClients()).thenReturn(Collections.emptyList());

        ReturnClientsUseCase useCase = new ReturnClientsUseCase(clientRepository);
        List<ClientEntity> result = useCase.execute();

        assertTrue(result.isEmpty());
    }
}