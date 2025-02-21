package com.app.infrastructure.controllers.company;

import java.util.List;

import com.app.application.usecases.company.FindCompanyByCnpjUseCase;
import com.app.domain.entities.ServiceOrderEntity;
import com.app.domain.entities.company.CompanyAddressEntity;
import com.app.domain.entities.company.CompanyContactEntity;
import com.app.domain.entities.company.CompanyEntity;
import com.app.domain.services.CompanyService;
import com.app.infrastructure.controllers.interfaces.ICompanyController;


public class CompanyController implements ICompanyController {

	private final CompanyService _companyServices;
	private final FindCompanyByCnpjUseCase _findCompanyByCNPJUseCase;
	
	public CompanyController(CompanyService companyServices, 
			FindCompanyByCnpjUseCase findCompanyByCNPJUseCase) {
		this._companyServices = companyServices;
		this._findCompanyByCNPJUseCase = findCompanyByCNPJUseCase;
	}
	
	public void register(CompanyEntity company, CompanyContactEntity contact, CompanyAddressEntity address) {
		try {
			this._companyServices.register(company, contact, address);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createOS(ServiceOrderEntity serviceOrder) {
		try {
			this._companyServices.registerOs(serviceOrder);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public CompanyEntity findCompanyByCNPJ(String cnpj) {
		return this._findCompanyByCNPJUseCase.execute(cnpj);
	}

	public List<CompanyEntity> returnAllCompanys() {
		return this._companyServices.allCompanys();
	}
	
}
