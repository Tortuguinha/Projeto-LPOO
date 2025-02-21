package com.app.application.usecases.company;

import com.app.domain.entities.company.CompanyAddressEntity;
import com.app.domain.entities.company.CompanyContactEntity;
import com.app.domain.entities.company.CompanyEntity;
import com.app.domain.repositories.interfaces.ICompanyRepository;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class RegisterCompanyUseCaseTest {

    @Test
    void execute_SavesCompanyWithValidData() {
        ICompanyRepository companyRepository = Mockito.mock(ICompanyRepository.class);
        RegisterCompanyUseCase useCase = new RegisterCompanyUseCase(companyRepository);

        CompanyEntity company = new CompanyEntity("Tech Corp", "info@techcorp.com", "12345678000199", true, new Date());
        CompanyContactEntity contact = new CompanyContactEntity("123456789", "contact@techcorp.com");
        CompanyAddressEntity address = new CompanyAddressEntity(123, "Main St", "Downtown", "Metropolis");

        useCase.execute(company, contact, address);

        Mockito.verify(companyRepository).save(company, contact, address);
    }

    @Test
    void execute_ThrowsException_WhenCompanyIsNull() {
        ICompanyRepository companyRepository = Mockito.mock(ICompanyRepository.class);
        RegisterCompanyUseCase useCase = new RegisterCompanyUseCase(companyRepository);

        CompanyContactEntity contact = new CompanyContactEntity("123456789", "contact@techcorp.com");
        CompanyAddressEntity address = new CompanyAddressEntity(123, "Main St", "Downtown", "Metropolis");

        assertThrows(IllegalArgumentException.class, () -> {
            useCase.execute(null, contact, address);
        });
    }

    @Test
    void execute_ThrowsException_WhenContactIsNull() {
        ICompanyRepository companyRepository = Mockito.mock(ICompanyRepository.class);
        RegisterCompanyUseCase useCase = new RegisterCompanyUseCase(companyRepository);

        CompanyEntity company = new CompanyEntity("Tech Corp", "info@techcorp.com", "12345678000199", true, new Date());
        CompanyAddressEntity address = new CompanyAddressEntity(123, "Main St", "Downtown", "Metropolis");

        assertThrows(IllegalArgumentException.class, () -> {
            useCase.execute(company, null, address);
        });
    }

    @Test
    void execute_ThrowsException_WhenAddressIsNull() {
        ICompanyRepository companyRepository = Mockito.mock(ICompanyRepository.class);
        RegisterCompanyUseCase useCase = new RegisterCompanyUseCase(companyRepository);

        CompanyEntity company = new CompanyEntity("Tech Corp", "info@techcorp.com", "12345678000199", true, new Date());
        CompanyContactEntity contact = new CompanyContactEntity("123456789", "contact@techcorp.com");

        assertThrows(IllegalArgumentException.class, () -> {
            useCase.execute(company, contact, null);
        });
    }
}