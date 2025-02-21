package com.app.domain.services;

import java.util.List;

import com.app.application.usecases.clients.RegisterClientUseCase;
import com.app.application.usecases.clients.ReturnClientsUseCase;
import com.app.domain.entities.client.ClientAddressEntity;
import com.app.domain.entities.client.ClientContactEntity;
import com.app.domain.entities.client.ClientEntity;


public class ClientService {
	
	private final RegisterClientUseCase _registerClient;
	private final ReturnClientsUseCase _returnClients;
	
	public ClientService(
			RegisterClientUseCase registerClient,
			ReturnClientsUseCase returnClients
			) {
		this._registerClient = registerClient;
		this._returnClients = returnClients;
	}

	public void register(ClientEntity client, ClientContactEntity contact, ClientAddressEntity address) {
		this._registerClient.execute(client, contact, address);
	}
	
	public List<ClientEntity> allClients() {
		return this._returnClients.execute();
	}
	
}
