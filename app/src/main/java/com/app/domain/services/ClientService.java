package com.app.domain.services;

import java.util.List;

import com.app.application.usecases.clients.RegisterClientOSUseCase;
import com.app.application.usecases.clients.RegisterClientUseCase;
import com.app.application.usecases.clients.ReturnClientsUseCase;
import com.app.domain.entities.ServiceOrderEntity;
import com.app.domain.entities.client.ClientAddressEntity;
import com.app.domain.entities.client.ClientContactEntity;
import com.app.domain.entities.client.ClientEntity;


public class ClientService {
	
	private final RegisterClientUseCase _registerClient;
	private final ReturnClientsUseCase _returnClients;
	private final RegisterClientOSUseCase _registerClientOS;
	
	public ClientService(
			RegisterClientUseCase registerClient,
			ReturnClientsUseCase returnClients,
			RegisterClientOSUseCase registerClientOS
			) {
		this._registerClient = registerClient;
		this._returnClients = returnClients;
		this._registerClientOS = registerClientOS;
	}

	public void register(ClientEntity client, ClientContactEntity contact, ClientAddressEntity address) {
		this._registerClient.execute(client, contact, address);
	}
	
	public void registerOs(ServiceOrderEntity serviceOrder) {
		this._registerClientOS.execute(serviceOrder);
	}
	
	public List<ClientEntity> allClients() {
		return this._returnClients.execute();
	}
	
}
