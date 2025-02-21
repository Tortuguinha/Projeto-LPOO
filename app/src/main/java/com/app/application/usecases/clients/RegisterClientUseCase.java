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
			    if (client == null) {
	        throw new IllegalArgumentException("O cliente não pode ser nulo");
	    }
	    if (contact == null) {
	        throw new IllegalArgumentException("O contato não pode ser nulo");
	    }
	    if (address == null) {
	        throw new IllegalArgumentException("O endereço não pode ser nulo");
	    }
		if (_clientRepository.findByEmail(client.getEmail()) != null) {
		    throw new IllegalArgumentException("Cliente já cadastrado");
		}
		this._clientRepository.save(client, contact, address);
	}
}
