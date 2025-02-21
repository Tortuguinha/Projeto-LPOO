package com.app.application.usecases.company;

import java.util.List;

import com.app.domain.entities.company.CompanyEntity;
import com.app.domain.repositories.interfaces.ICompanyRepository;

public class ReturnCompanysUseCase {
	
	private ICompanyRepository _companyRepository;
	
	public ReturnCompanysUseCase(ICompanyRepository companyRepository) {
		this._companyRepository = companyRepository;
	}
	
	public List<CompanyEntity> execute() {
		return this._companyRepository.allCompanys();
	}
}
