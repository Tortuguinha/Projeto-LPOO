package com.app.application.usecases.clients;

import com.app.domain.entities.client.ClientAddressEntity;
import com.app.domain.entities.client.ClientContactEntity;
import com.app.domain.entities.client.ClientEntity;
import com.app.domain.repositories.interfaces.IClientRepository;


public class RegisterClientUseCase {
	private final IClientRepository _clientRepository;
	
	public RegisterClientUseCase(IClientRepository clientRepository) {
		this._clientRepository = clientRepository;
	}
	
	public void execute(ClientEntity client, ClientContactEntity contact, ClientAddressEntity address) {
		this._clientRepository.save(client, contact, address);
	}
}
