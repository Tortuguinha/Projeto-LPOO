package com.app.domain.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.app.application.usecases.employee.AuthEmployeeUseCase;
import com.app.application.usecases.employee.RegisterEmployeeUseCase;
import com.app.application.usecases.employee.ReturnEmployeesUseCase;
import com.app.domain.entities.employee.EmployeeAddressEntity;
import com.app.domain.entities.employee.EmployeeContactEntity;
import com.app.domain.entities.employee.EmployeeEntity;
import com.app.domain.entities.employee.EmployeeEntity.ROLE;

import java.util.Date;

class EmployeeServiceTest {

    private EmployeeService employeeService;
    private RegisterEmployeeUseCase registerEmployeeUseCase;
    private AuthEmployeeUseCase authEmployeeUseCase;
    private ReturnEmployeesUseCase returnEmployeesUseCase;

    @BeforeEach
    void setUp() {
        registerEmployeeUseCase = mock(RegisterEmployeeUseCase.class);
        authEmployeeUseCase = mock(AuthEmployeeUseCase.class);
        returnEmployeesUseCase = mock(ReturnEmployeesUseCase.class);
        employeeService = new EmployeeService(registerEmployeeUseCase, authEmployeeUseCase, returnEmployeesUseCase);
    }

    @Test
    void register_CallsRegisterEmployeeUseCase() {
        EmployeeEntity employee = new EmployeeEntity(
            "John Doe",
            "john.doe@example.com",
            "password123",
            "12345678900",
            ROLE.ATENDENTE,
            new Date(),
            true
        );
        EmployeeContactEntity contact = new EmployeeContactEntity(
            "55998877",
            "contact@example.com"
        );
        EmployeeAddressEntity address = new EmployeeAddressEntity(
            123,
            "Main Street",
            "Downtown",
            "SampleCity"
        );

        employeeService.register(employee, contact, address);
        verify(registerEmployeeUseCase, times(1)).execute(employee, contact, address);
    }

    @Test
    void authenticate_ReturnsEmployeeWhenCredentialsAreCorrect() {
        String email = "john.doe@example.com";
        String password = "password123";
        EmployeeEntity employee = new EmployeeEntity(
            "John Doe",
            email,
            password,
            "12345678900",
            ROLE.ATENDENTE,
            new Date(),
            true
        );

        when(authEmployeeUseCase.execute(email, password)).thenReturn(employee);

        EmployeeEntity result = employeeService.authenticate(email, password);

        assertNotNull(result);
        assertEquals(email, result.getEmail());
    }

    @Test
    void authenticate_ReturnsNullWhenCredentialsAreIncorrect() {
        String email = "john.doe@example.com";
        String password = "wrongpassword";

        when(authEmployeeUseCase.execute(email, password)).thenReturn(null);

        EmployeeEntity result = employeeService.authenticate(email, password);

        assertNull(result);
    }

    @Test
    void allEmployee_ReturnsListOfEmployees() {
        EmployeeEntity employee1 = new EmployeeEntity(
            "Employee One",
            "one@example.com",
            "passOne",
            "11111111111",
            ROLE.ATENDENTE,
            new Date(),
            true
        );
        EmployeeEntity employee2 = new EmployeeEntity(
            "Employee Two",
            "two@example.com",
            "passTwo",
            "22222222222",
            ROLE.ATENDENTE,
            new Date(),
            false
        );
        List<EmployeeEntity> employees = Arrays.asList(employee1, employee2);

        when(returnEmployeesUseCase.execute()).thenReturn(employees);

        List<EmployeeEntity> result = employeeService.allEmployee();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(employee1, result.get(0));
        assertEquals(employee2, result.get(1));
    }

    @Test
    void allEmployee_ReturnsEmptyListWhenNoEmployees() {
        when(returnEmployeesUseCase.execute()).thenReturn(Arrays.asList());

        List<EmployeeEntity> result = employeeService.allEmployee();

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}