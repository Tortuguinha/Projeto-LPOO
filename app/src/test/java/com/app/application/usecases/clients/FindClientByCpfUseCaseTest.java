package com.app.application.usecases.clients;

import com.app.domain.entities.client.ClientEntity;
import com.app.domain.repositories.interfaces.IClientRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

class FindClientByCpfUseCaseTest {

    @Test
    void execute_ReturnsClient_WhenCpfExists() {
        IClientRepository clientRepository = Mockito.mock(IClientRepository.class);
        ClientEntity expectedClient = new ClientEntity("John Doe", "john.doe@example.com", "12345678901", true, new Date());
        Mockito.when(clientRepository.findByCPF("12345678901")).thenReturn(expectedClient);

        FindClientByCpfUseCase useCase = new FindClientByCpfUseCase(clientRepository);
        ClientEntity result = useCase.execute("12345678901");

        assertEquals(expectedClient, result);
    }

    @Test
    void execute_ReturnsNull_WhenCpfDoesNotExist() {
        IClientRepository clientRepository = Mockito.mock(IClientRepository.class);
        Mockito.when(clientRepository.findByCPF("00000000000")).thenReturn(null);

        FindClientByCpfUseCase useCase = new FindClientByCpfUseCase(clientRepository);
        ClientEntity result = useCase.execute("00000000000");

        assertNull(result);
    }

    @Test
    void execute_ThrowsException_WhenCpfIsInvalid() {
        IClientRepository clientRepository = Mockito.mock(IClientRepository.class);

        FindClientByCpfUseCase useCase = new FindClientByCpfUseCase(clientRepository);

        assertThrows(IllegalArgumentException.class, () -> {
            useCase.execute("invalid_cpf");
        });
    }
}