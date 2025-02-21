package com.app.application.usecases.employees;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.app.application.usecases.employee.FindEmployeeByCPFUseCase;
import com.app.domain.entities.employee.EmployeeEntity;
import com.app.domain.repositories.interfaces.IEmployeeRepository;
import org.junit.jupiter.api.Test;

import java.util.Date;

class FindEmployeeByCPFUseCaseTest {

    @Test
    void execute_ReturnsEmployee_WhenCPFExists() {
        IEmployeeRepository mockRepo = mock(IEmployeeRepository.class);
        EmployeeEntity fakeEmployee = new EmployeeEntity(
                "Lewis Hamilton",
                "test\\@domain.com",
                "Test",
                "12345678900",
                EmployeeEntity.ROLE.TECNICO,
                new Date(),
                true
        );

        when(mockRepo.findByCPF("12345678900")).thenReturn(fakeEmployee);

        FindEmployeeByCPFUseCase useCase = new FindEmployeeByCPFUseCase(mockRepo);
        EmployeeEntity result = useCase.execute("12345678900");

        assertEquals("12345678900", result.getCPF());
    }

    @Test
    void execute_ReturnsNull_WhenCPFDoesNotExist() {
        IEmployeeRepository mockRepo = mock(IEmployeeRepository.class);
        when(mockRepo.findByCPF("00000000000")).thenReturn(null);

        FindEmployeeByCPFUseCase useCase = new FindEmployeeByCPFUseCase(mockRepo);
        EmployeeEntity result = useCase.execute("00000000000");

        assertNull(result);
    }

    @Test
    void execute_ThrowsException_WhenCPFIsNull() {
        IEmployeeRepository mockRepo = mock(IEmployeeRepository.class);

        FindEmployeeByCPFUseCase useCase = new FindEmployeeByCPFUseCase(mockRepo);

        assertThrows(IllegalArgumentException.class, () -> {
            useCase.execute(null);
        });
    }

    @Test
    void execute_ThrowsException_WhenCPFIsEmpty() {
        IEmployeeRepository mockRepo = mock(IEmployeeRepository.class);

        FindEmployeeByCPFUseCase useCase = new FindEmployeeByCPFUseCase(mockRepo);

        assertThrows(IllegalArgumentException.class, () -> {
            useCase.execute("");
        });
    }

    @Test
    void execute_ThrowsException_WhenCPFIsInvalid() {
        IEmployeeRepository mockRepo = mock(IEmployeeRepository.class);

        FindEmployeeByCPFUseCase useCase = new FindEmployeeByCPFUseCase(mockRepo);

        assertThrows(IllegalArgumentException.class, () -> {
            useCase.execute("1234567890");
        });
    }
}