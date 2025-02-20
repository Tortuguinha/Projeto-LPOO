package com.app.domain.repositories.interfaces;

import java.util.List;

import com.app.domain.entities.company.CompanyEntity;

public interface ICompanyRepository {
	public void save(CompanyEntity client);
	public CompanyEntity findByEmail(String email);
	public CompanyEntity findByCNPJ(String cpf);
	public List<CompanyEntity> allCompanys();
}
