package com.app.application.usecases.clients;

import com.app.domain.entities.client.ClientEntity;
import com.app.domain.repositories.interfaces.IClientRepository;

public class FindClientByCpfUseCase {
	private IClientRepository _clientRepository;
	
	public FindClientByCpfUseCase(IClientRepository clientRepository) {
		this._clientRepository = clientRepository;
	}
	
	public ClientEntity execute(String cpf) {
		 ClientEntity client = this._clientRepository.findByCPF(cpf);
		
		return client;
	}
	 
}
