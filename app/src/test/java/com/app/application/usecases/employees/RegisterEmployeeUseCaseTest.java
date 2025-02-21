package com.app.application.usecases.employees;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import com.app.application.usecases.employee.RegisterEmployeeUseCase;
import com.app.domain.entities.employee.EmployeeAddressEntity;
import com.app.domain.entities.employee.EmployeeContactEntity;
import com.app.domain.entities.employee.EmployeeEntity;
import com.app.domain.repositories.interfaces.IEmployeeRepository;
import org.junit.jupiter.api.Test;

import java.util.Date;

class RegisterEmployeeUseCaseTest {

    @Test
    public void execute_CallsRepositorySaveMethod_WhenEmployeeIsValid() {
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
        EmployeeContactEntity fakeContact = new EmployeeContactEntity("11999999999", "11999999999");
        EmployeeAddressEntity fakeAddress = new EmployeeAddressEntity(123, "Rua Teste", "Teste", "Teste");

        RegisterEmployeeUseCase useCase = new RegisterEmployeeUseCase(mockRepo);
        useCase.execute(fakeEmployee, fakeContact, fakeAddress);
    }

    @Test
    public void execute_ThrowsException_WhenEmployeeIsNull() {
        IEmployeeRepository mockRepo = mock(IEmployeeRepository.class);
        RegisterEmployeeUseCase useCase = new RegisterEmployeeUseCase(mockRepo);

        assertThrows(RuntimeException.class, () -> useCase.execute(null, null, null));
    }

    @Test
    public void execute_ThrowsException_WhenContactIsNull() {
        IEmployeeRepository mockRepo = mock(IEmployeeRepository.class);
        RegisterEmployeeUseCase useCase = new RegisterEmployeeUseCase(mockRepo);
        EmployeeEntity fakeEmployee = new EmployeeEntity(
                "Lewis Hamilton",
                "test\\@domain.com",
                "Test",
                "12345678900",
                EmployeeEntity.ROLE.TECNICO,
                new Date(),
                true
        );

        assertThrows(RuntimeException.class, () -> useCase.execute(fakeEmployee, null, null));
    }
}
