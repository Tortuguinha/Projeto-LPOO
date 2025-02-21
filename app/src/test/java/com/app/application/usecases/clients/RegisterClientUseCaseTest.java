package com.app.application.usecases.clients;

import com.app.domain.entities.client.ClientAddressEntity;
import com.app.domain.entities.client.ClientContactEntity;
import com.app.domain.entities.client.ClientEntity;
import com.app.domain.repositories.interfaces.IClientRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RegisterClientUseCaseTest {

    @Test
    void execute_SavesClientWithValidData() {
        IClientRepository clientRepository = Mockito.mock(IClientRepository.class);
        RegisterClientUseCase useCase = new RegisterClientUseCase(clientRepository);

        ClientEntity client = new ClientEntity("John Doe", "john.doe@example.com", "12345678901", true, new Date());
        ClientContactEntity contact = new ClientContactEntity("123456789", "contact@johndoe.com");
        ClientAddressEntity address = new ClientAddressEntity(123, "Main St", "Downtown", "Metropolis");

        useCase.execute(client, contact, address);

        Mockito.verify(clientRepository).save(client, contact, address);
    }

    @Test
    void execute_ThrowsException_WhenClientIsNull() {
        IClientRepository clientRepository = Mockito.mock(IClientRepository.class);
        RegisterClientUseCase useCase = new RegisterClientUseCase(clientRepository);

        ClientContactEntity contact = new ClientContactEntity("123456789", "contact@johndoe.com");
        ClientAddressEntity address = new ClientAddressEntity(123, "Main St", "Downtown", "Metropolis");

        assertThrows(IllegalArgumentException.class, () -> {
            useCase.execute(null, contact, address);
        });
    }

    @Test
    void execute_ThrowsException_WhenContactIsNull() {
        IClientRepository clientRepository = Mockito.mock(IClientRepository.class);
        RegisterClientUseCase useCase = new RegisterClientUseCase(clientRepository);

        ClientEntity client = new ClientEntity("John Doe", "john.doe@example.com", "12345678901", true, new Date());
        ClientAddressEntity address = new ClientAddressEntity(123, "Main St", "Downtown", "Metropolis");

        assertThrows(IllegalArgumentException.class, () -> {
            useCase.execute(client, null, address);
        });
    }

    @Test
    void execute_ThrowsException_WhenAddressIsNull() {
        IClientRepository clientRepository = Mockito.mock(IClientRepository.class);
        RegisterClientUseCase useCase = new RegisterClientUseCase(clientRepository);

        ClientEntity client = new ClientEntity("John Doe", "john.doe@example.com", "12345678901", true, new Date());
        ClientContactEntity contact = new ClientContactEntity("123456789", "contact@johndoe.com");

        assertThrows(IllegalArgumentException.class, () -> {
            useCase.execute(client, contact, null);
        });
    }

    @Test
    void execute_ThrowsException_WhenClientAlreadyExists() {
        IClientRepository clientRepository = Mockito.mock(IClientRepository.class);
        RegisterClientUseCase useCase = new RegisterClientUseCase(clientRepository);

        ClientEntity client = new ClientEntity("John Doe", "john.doe@example.com", "12345678901", true, new Date());
        ClientContactEntity contact = new ClientContactEntity("123456789", "contact@johndoe.com");
        ClientAddressEntity address = new ClientAddressEntity(123, "Main St", "Downtown", "Metropolis");

        Mockito.when(clientRepository.findByEmail("john.doe@example.com")).thenReturn(client);

        assertThrows(IllegalArgumentException.class, () -> {
            useCase.execute(client, contact, address);
        });
    }
}