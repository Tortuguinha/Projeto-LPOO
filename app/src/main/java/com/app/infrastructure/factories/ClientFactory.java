package com.app.infrastructure.factories;

import com.app.application.usecases.clients.FindClientByCpfUseCase;
import com.app.application.usecases.clients.RegisterClientUseCase;
import com.app.application.usecases.clients.ReturnClientsUseCase;
import com.app.application.usecases.company.FindCompanyByCnpjUseCase;
import com.app.domain.repositories.ClientRepository;
import com.app.domain.repositories.interfaces.IClientRepository;
import com.app.domain.services.ClientService;
import com.app.infrastructure.controllers.client.ClientController;
import com.app.infrastructure.controllers.interfaces.IClientController;

public class ClientFactory {
	
	private static IClientController instance;
	
	private ClientFactory() { }
	
	public static IClientController getInstance() {
		if(instance == null) {
			 IClientRepository clientRepository = new ClientRepository();

			 RegisterClientUseCase registerClientUseCase = new RegisterClientUseCase(clientRepository);
	         ReturnClientsUseCase returnClientUseCase = new ReturnClientsUseCase(clientRepository);
	         FindClientByCpfUseCase findClientByCPFUseCase = new FindClientByCpfUseCase(clientRepository);

	         ClientService clientService = new ClientService(registerClientUseCase, returnClientUseCase);
	          instance = new ClientController(clientService, findClientByCPFUseCase);
		}
		
		return instance;
	}
}
