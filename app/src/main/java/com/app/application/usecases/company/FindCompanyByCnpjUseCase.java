package com.app.application.usecases.company;

import com.app.domain.entities.company.CompanyEntity;
import com.app.domain.repositories.interfaces.ICompanyRepository;

public class FindCompanyByCnpjUseCase {
	private ICompanyRepository _companyRepository;
	
	public FindCompanyByCnpjUseCase(ICompanyRepository companyRepository) {
		this._companyRepository = companyRepository;
	}
	
	public CompanyEntity execute(String cnpj) {
		CompanyEntity company = this._companyRepository.findByCNPJ(cnpj);
		
		return company;
	}
	 
}
