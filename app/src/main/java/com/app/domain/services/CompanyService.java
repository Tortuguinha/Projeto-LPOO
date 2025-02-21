package com.app.domain.services;

import java.util.List;

import com.app.application.usecases.company.RegisterCompanyOSUseCase;
import com.app.application.usecases.company.RegisterCompanyUseCase;
import com.app.application.usecases.company.ReturnCompanysUseCase;
import com.app.domain.entities.ServiceOrderEntity;
import com.app.domain.entities.company.CompanyAddressEntity;
import com.app.domain.entities.company.CompanyContactEntity;
import com.app.domain.entities.company.CompanyEntity;

public class CompanyService {
	private final RegisterCompanyUseCase _registerCompany;
	private final ReturnCompanysUseCase _returnCompanys;
	private final RegisterCompanyOSUseCase _registerCompanyOS;
	
	public CompanyService(
			RegisterCompanyUseCase registerCompany,
			ReturnCompanysUseCase returnCompany,
			RegisterCompanyOSUseCase registerCompanyOS
			) {
		this._registerCompany = registerCompany;
		this._returnCompanys = returnCompany;
		this._registerCompanyOS = registerCompanyOS;
	}

	public void register(CompanyEntity company, CompanyContactEntity contact, CompanyAddressEntity address) {
		this._registerCompany.execute(company, contact, address);
	}
	
	public void registerOs(ServiceOrderEntity serviceOrder) {
		this._registerCompanyOS.execute(serviceOrder);
	}
	
	public List<CompanyEntity> allCompanys() {
		return this._returnCompanys.execute();
	}
	
}
