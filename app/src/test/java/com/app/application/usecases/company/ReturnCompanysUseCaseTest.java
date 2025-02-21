package com.app.application.usecases.company;

import com.app.domain.entities.company.CompanyEntity;
import com.app.domain.repositories.interfaces.ICompanyRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;

class ReturnCompanysUseCaseTest {

    @Test
    void execute_ReturnsAllCompanies_WhenCompaniesExist() {
        ICompanyRepository companyRepository = Mockito.mock(ICompanyRepository.class);
        List<CompanyEntity> expectedCompanies = Arrays.asList(
            new CompanyEntity("Tech Corp", "info@techcorp.com", "12345678000199", true, new Date()),
            new CompanyEntity("Biz Inc", "contact@bizinc.com", "98765432000188", false, new Date())
        );
        Mockito.when(companyRepository.allCompanys()).thenReturn(expectedCompanies);

        ReturnCompanysUseCase useCase = new ReturnCompanysUseCase(companyRepository);
        List<CompanyEntity> result = useCase.execute();

        assertEquals(expectedCompanies, result);
    }

    @Test
    void execute_ReturnsEmptyList_WhenNoCompaniesExist() {
        ICompanyRepository companyRepository = Mockito.mock(ICompanyRepository.class);
        Mockito.when(companyRepository.allCompanys()).thenReturn(Collections.emptyList());

        ReturnCompanysUseCase useCase = new ReturnCompanysUseCase(companyRepository);
        List<CompanyEntity> result = useCase.execute();

        assertTrue(result.isEmpty());
    }
}