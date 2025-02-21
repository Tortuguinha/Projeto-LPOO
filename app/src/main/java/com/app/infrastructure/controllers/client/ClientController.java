package com.app.infrastructure.controllers.client;

import java.util.List;

import com.app.application.usecases.clients.FindClientByCpfUseCase;
import com.app.application.usecases.clients.RegisterClientOSUseCase;
import com.app.domain.entities.ServiceOrderEntity;
import com.app.domain.entities.client.ClientAddressEntity;
import com.app.domain.entities.client.ClientContactEntity;
import com.app.domain.entities.client.ClientEntity;
import com.app.domain.services.ClientService;
import com.app.infrastructure.controllers.interfaces.IClientController;

public class ClientController implements IClientController {
	
	private final ClientService _clientServices;
	private final FindClientByCpfUseCase _findClientByCPFUseCase;
	
	public ClientController(ClientService clientServices, 
			FindClientByCpfUseCase findClientByCPFUseCase) {
		this._clientServices = clientServices;
		this._findClientByCPFUseCase = findClientByCPFUseCase;
	}
	
	public void register(ClientEntity client, ClientContactEntity contact, ClientAddressEntity address) {
		try {
			this._clientServices.register(client, contact, address);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void createOS(ServiceOrderEntity serviceOrder) {
		this._clientServices.registerOs(serviceOrder);
	}
	
	public ClientEntity findClientByCpf(String cpf) {
		
		return this._findClientByCPFUseCase.execute(cpf);
	}

	public List<ClientEntity> returnAllClients() {

		return this._clientServices.allClients();
	}
}
