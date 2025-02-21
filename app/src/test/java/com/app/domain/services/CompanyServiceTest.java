package com.app.domain.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.app.application.usecases.company.RegisterCompanyUseCase;
import com.app.application.usecases.company.ReturnCompanysUseCase;
import com.app.domain.entities.company.CompanyAddressEntity;
import com.app.domain.entities.company.CompanyContactEntity;
import com.app.domain.entities.company.CompanyEntity;

class CompanyServiceTest {

    private CompanyService companyService;
    private RegisterCompanyUseCase registerCompanyUseCase;
    private ReturnCompanysUseCase returnCompanysUseCase;

    @BeforeEach
    void setUp() {
        registerCompanyUseCase = mock(RegisterCompanyUseCase.class);
        returnCompanysUseCase = mock(ReturnCompanysUseCase.class);
        companyService = new CompanyService(registerCompanyUseCase, returnCompanysUseCase);
    }

    @Test
    void register_CallsRegisterCompanyUseCase() {
        CompanyEntity company = new CompanyEntity(
            "Sample Company",
            "info@sample.com",
            "12345678000199",
            true,
            new java.util.Date()
        );
        CompanyContactEntity contact = new CompanyContactEntity(
            "55998877",
            "contact@sample.com"
        );
        CompanyAddressEntity address = new CompanyAddressEntity(
            123,
            "Main Street",
            "Downtown",
            "SampleCity"
        );

        companyService.register(company, contact, address);

        verify(registerCompanyUseCase, times(1)).execute(company, contact, address);
    }

    @Test
    void allCompanys_ReturnsListOfCompanys() {
        CompanyEntity company1 = new CompanyEntity(
            "Company One",
            "one@company.com",
            "11111111000111",
            true,
            new java.util.Date()
        );
        CompanyEntity company2 = new CompanyEntity(
            "Company Two",
            "two@company.com",
            "22222222000122",
            false,
            new java.util.Date()
        );
        List<CompanyEntity> companys = Arrays.asList(company1, company2);

        when(returnCompanysUseCase.execute()).thenReturn(companys);

        List<CompanyEntity> result = companyService.allCompanys();

        assertNotNull(result);
        assertEquals(2, result.size());
        assertEquals(company1, result.get(0));
        assertEquals(company2, result.get(1));
    }

    @Test
    void allCompanys_ReturnsEmptyListWhenNoCompanys() {
        when(returnCompanysUseCase.execute()).thenReturn(Arrays.asList());

        List<CompanyEntity> result = companyService.allCompanys();

        assertNotNull(result);
        assertTrue(result.isEmpty());
    }
}