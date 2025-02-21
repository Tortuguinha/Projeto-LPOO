package com.app.application.usecases.clients;

import com.app.domain.entities.client.ClientEntity;
import com.app.domain.repositories.interfaces.IClientRepository;

public class FindClientByCpfUseCase {
	private IClientRepository _clientRepository;
	
	public FindClientByCpfUseCase(IClientRepository clientRepository) {
		this._clientRepository = clientRepository;
	}
	
	public ClientEntity execute(String cpf) {
		if (cpf == null) {
			throw new IllegalArgumentException("O CPF não pode ser nulo");
		}
		if (cpf.isEmpty()) {
			throw new IllegalArgumentException("O CPF não pode ser vazio");
		}
		if (!cpf.matches("\\d{11}")) {
			throw new IllegalArgumentException("O CPF deve conter 11 dígitos numéricos");
		}
		 ClientEntity client = this._clientRepository.findByCPF(cpf);
		
		return client;
	}
	 
}
