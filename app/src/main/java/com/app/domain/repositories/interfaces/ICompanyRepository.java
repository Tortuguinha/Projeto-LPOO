package com.app.domain.repositories.interfaces;

import java.util.List;

import com.app.domain.entities.company.CompanyAddressEntity;
import com.app.domain.entities.company.CompanyContactEntity;
import com.app.domain.entities.company.CompanyEntity;

public interface ICompanyRepository {
	public void save(CompanyEntity company, CompanyContactEntity contact, CompanyAddressEntity address);
	public CompanyEntity findByEmail(String email);
	public CompanyEntity findByCNPJ(String cnpj);
	public List<CompanyEntity> allCompanys();
}
