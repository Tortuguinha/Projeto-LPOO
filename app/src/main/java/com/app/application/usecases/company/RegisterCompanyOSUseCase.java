package com.app.application.usecases.company;

import com.app.domain.entities.ServiceOrderEntity;
import com.app.domain.repositories.interfaces.IClientRepository;
import com.app.domain.repositories.interfaces.ICompanyRepository;

public class RegisterCompanyOSUseCase {
	private ICompanyRepository _companyRepository;
	
	public RegisterCompanyOSUseCase(ICompanyRepository companyRepository) {
		this._companyRepository = companyRepository;
	}
	public void execute(ServiceOrderEntity serviceOrder) {
		this._companyRepository.updateOS(serviceOrder);
	}
}
