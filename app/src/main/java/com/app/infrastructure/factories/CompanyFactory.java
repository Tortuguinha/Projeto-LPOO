package com.app.infrastructure.factories;

import com.app.application.usecases.company.FindCompanyByCnpjUseCase;
import com.app.application.usecases.company.RegisterCompanyUseCase;
import com.app.application.usecases.company.ReturnCompanysUseCase;
import com.app.domain.repositories.CompanyRepository;
import com.app.domain.repositories.interfaces.ICompanyRepository;
import com.app.domain.services.CompanyService;
import com.app.infrastructure.controllers.company.CompanyController;
import com.app.infrastructure.controllers.interfaces.ICompanyController;

public class CompanyFactory {
	
	private static ICompanyController instance;
	
	private CompanyFactory() { }
	
	public static ICompanyController getInstance() {
		if(instance == null) {
			 ICompanyRepository companyRepository = new CompanyRepository();

			 RegisterCompanyUseCase registerCompanyUseCase = new RegisterCompanyUseCase(companyRepository);
	         ReturnCompanysUseCase returnCompanyUseCase = new ReturnCompanysUseCase(companyRepository);
	         FindCompanyByCnpjUseCase findCompanyByCnpjUseCase = new FindCompanyByCnpjUseCase(companyRepository);

	         CompanyService companyService = new CompanyService(registerCompanyUseCase, returnCompanyUseCase);
	         instance = new CompanyController(companyService, findCompanyByCnpjUseCase);
		}
		
		return instance;
	}
}
