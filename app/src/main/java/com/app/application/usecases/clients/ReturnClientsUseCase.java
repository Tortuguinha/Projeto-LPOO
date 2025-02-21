package com.app.application.usecases.clients;

import java.util.List;

import com.app.domain.entities.client.ClientEntity;
import com.app.domain.repositories.interfaces.IClientRepository;

public class ReturnClientsUseCase {
	
	private IClientRepository _clientRepository;
	
	public ReturnClientsUseCase(IClientRepository clientRepository) {
		this._clientRepository = clientRepository;
	}
	
	public List<ClientEntity> execute() {
		return this._clientRepository.allClients();
	}
}
