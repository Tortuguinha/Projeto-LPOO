package com.app.infrastructure.controllers.interfaces;

import java.util.List;

import com.app.domain.entities.ServiceOrderEntity;
import com.app.domain.entities.company.CompanyAddressEntity;
import com.app.domain.entities.company.CompanyContactEntity;
import com.app.domain.entities.company.CompanyEntity;

public interface ICompanyController {
	public void register(CompanyEntity company, CompanyContactEntity contact, CompanyAddressEntity address);
	public void createOS(ServiceOrderEntity serviceOrder);
	CompanyEntity findCompanyByCNPJ(String cnpj);
	public List<CompanyEntity> returnAllCompanys();
}
