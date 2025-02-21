package com.app.application.usecases.employees;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.app.application.usecases.employee.AuthEmployeeUseCase;
import com.app.domain.entities.employee.EmployeeEntity;
import com.app.domain.repositories.interfaces.IEmployeeRepository;
import org.junit.jupiter.api.Test;

import java.util.Date;

class AuthEmployeeUseCaseTest {

    @Test
    void execute_ReturnsEmployee_WhenValidCredentials() {
        IEmployeeRepository mockRepo = mock(IEmployeeRepository.class);
        EmployeeEntity fakeEmployee = new EmployeeEntity(
            "Lewis Hamilton",
            "test\\@domain.com",
            "Test",
            "123.456.789-00",
            EmployeeEntity.ROLE.TECNICO,
            new Date(),
            true
        );
        when(mockRepo.findByEmail("test\\@domain.com")).thenReturn(fakeEmployee);

        AuthEmployeeUseCase useCase = new AuthEmployeeUseCase(mockRepo);
        EmployeeEntity result = useCase.execute("test\\@domain.com", "Test");

        assertEquals("test\\@domain.com", result.getEmail());
    }

    @Test
    void execute_ThrowsException_WhenEmployeeNotFound() {
        IEmployeeRepository mockRepo = mock(IEmployeeRepository.class);
        when(mockRepo.findByEmail("invalid\\@domain.com")).thenReturn(null);

        AuthEmployeeUseCase useCase = new AuthEmployeeUseCase(mockRepo);

        assertThrows(RuntimeException.class, () ->
            useCase.execute("invalid\\@domain.com", "secret"));
    }

    @Test
    void execute_ThrowsException_WhenPasswordIsWrong() {
        IEmployeeRepository mockRepo = mock(IEmployeeRepository.class);
        EmployeeEntity fakeEmployee = new EmployeeEntity(
                "Lewis Hamilton",
                "test@domain.com",
                "Test",
                "123.456.789-00",
                EmployeeEntity.ROLE.TECNICO,
                new Date(),
                true
        );
        when(mockRepo.findByEmail("test\\@domain.com")).thenReturn(fakeEmployee);

        AuthEmployeeUseCase useCase = new AuthEmployeeUseCase(mockRepo);

        assertThrows(RuntimeException.class, () ->
            useCase.execute("test\\@domain.com", "wrongPass"));
    }
}