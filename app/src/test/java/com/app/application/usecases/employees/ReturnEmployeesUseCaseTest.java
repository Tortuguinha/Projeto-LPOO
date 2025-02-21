package com.app.application.usecases.employees;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.app.application.usecases.employee.ReturnEmployeesUseCase;
import com.app.domain.entities.employee.EmployeeEntity;
import com.app.domain.repositories.interfaces.IEmployeeRepository;

class ReturnEmployeesUseCaseTest {

    private IEmployeeRepository employeeRepository;
    private ReturnEmployeesUseCase returnEmployeesUseCase;

    @BeforeEach
    void setUp() {
        employeeRepository = mock(IEmployeeRepository.class);
        returnEmployeesUseCase = new ReturnEmployeesUseCase(employeeRepository);
    }

    @Test
    void execute_ReturnsListOfEmployees() {
        List<EmployeeEntity> employees = Arrays.asList(
            new EmployeeEntity("John Doe", "john@example.com", "Tester", "12345678900", EmployeeEntity.ROLE.TECNICO, new java.util.Date(), true),
            new EmployeeEntity("Jane Doe", "jane@example.com", "Developer", "09876543211", EmployeeEntity.ROLE.ADMINISTRADOR, new java.util.Date(), true)
        );
        when(employeeRepository.allEmployee()).thenReturn(employees);

        List<EmployeeEntity> result = returnEmployeesUseCase.execute();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals("John Doe", result.get(0).getName());
        assertEquals("Jane Doe", result.get(1).getName());
    }

    @Test
    void execute_ReturnsEmptyListWhenNoEmployees() {
        when(employeeRepository.allEmployee()).thenReturn(List.of());

        List<EmployeeEntity> result = returnEmployeesUseCase.execute();

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}