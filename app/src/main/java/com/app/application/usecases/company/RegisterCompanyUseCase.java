package com.app.application.usecases.company;

import com.app.domain.entities.company.CompanyAddressEntity;
import com.app.domain.entities.company.CompanyContactEntity;
import com.app.domain.entities.company.CompanyEntity;
import com.app.domain.repositories.interfaces.ICompanyRepository;

public class RegisterCompanyUseCase {
	private final ICompanyRepository _companyRepository;
	
	public RegisterCompanyUseCase(ICompanyRepository companyRepository) {
		this._companyRepository = companyRepository;
	}
	
	public void execute(CompanyEntity company, CompanyContactEntity contact, CompanyAddressEntity address) {
		if (company == null || contact == null || address == null) {
			throw new IllegalArgumentException("Company, contact and address must be informed");
		}
		this._companyRepository.save(company, contact, address);
	}
}
