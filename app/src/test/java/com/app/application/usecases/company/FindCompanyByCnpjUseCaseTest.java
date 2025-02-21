package com.app.application.usecases.company;

import com.app.domain.entities.company.CompanyEntity;
import com.app.domain.repositories.interfaces.ICompanyRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class FindCompanyByCnpjUseCaseTest {

    @Test
    void execute_ReturnsCompany_WhenCnpjExists() {
        ICompanyRepository companyRepository = Mockito.mock(ICompanyRepository.class);
        CompanyEntity expectedCompany = new CompanyEntity("Tech Corp", "info@techcorp.com", "12345678000199", true, new Date());
        Mockito.when(companyRepository.findByCNPJ("12345678000199")).thenReturn(expectedCompany);

        FindCompanyByCnpjUseCase useCase = new FindCompanyByCnpjUseCase(companyRepository);
        CompanyEntity result = useCase.execute("12345678000199");

        assertEquals(expectedCompany, result);
    }

    @Test
    void execute_ReturnsNull_WhenCnpjDoesNotExist() {
        ICompanyRepository companyRepository = Mockito.mock(ICompanyRepository.class);
        Mockito.when(companyRepository.findByCNPJ("00000000000000")).thenReturn(null);

        FindCompanyByCnpjUseCase useCase = new FindCompanyByCnpjUseCase(companyRepository);
        CompanyEntity result = useCase.execute("00000000000000");

        assertNull(result);
    }

    @Test
    void execute_ThrowsException_WhenCnpjIsInvalid() {
        ICompanyRepository companyRepository = Mockito.mock(ICompanyRepository.class);

        FindCompanyByCnpjUseCase useCase = new FindCompanyByCnpjUseCase(companyRepository);

        assertNull(useCase.execute("1234567800019"));
    }
}