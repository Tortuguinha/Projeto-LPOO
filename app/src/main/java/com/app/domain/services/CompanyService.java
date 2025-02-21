package com.app.domain.services;

import java.util.List;

import com.app.application.usecases.company.RegisterCompanyUseCase;
import com.app.application.usecases.company.ReturnCompanysUseCase;
import com.app.domain.entities.company.CompanyAddressEntity;
import com.app.domain.entities.company.CompanyContactEntity;
import com.app.domain.entities.company.CompanyEntity;

public class CompanyService {
	private final RegisterCompanyUseCase _registerCompany;
	private final ReturnCompanysUseCase _returnCompanys;
	
	public CompanyService(
			RegisterCompanyUseCase registerCompany,
			ReturnCompanysUseCase returnCompany
			) {
		this._registerCompany = registerCompany;
		this._returnCompanys = returnCompany;
	}

	public void register(CompanyEntity company, CompanyContactEntity contact, CompanyAddressEntity address) {
		this._registerCompany.execute(company, contact, address);
	}
	
	public List<CompanyEntity> allCompanys() {
		return this._returnCompanys.execute();
	}
	
}
