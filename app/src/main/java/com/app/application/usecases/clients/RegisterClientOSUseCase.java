package com.app.application.usecases.clients;

import com.app.domain.entities.ServiceOrderEntity;
import com.app.domain.repositories.interfaces.IClientRepository;

public class RegisterClientOSUseCase {
private IClientRepository _clientRepository;
	
	public RegisterClientOSUseCase(IClientRepository clientRepository) {
		this._clientRepository = clientRepository;
	}
	public void execute(ServiceOrderEntity serviceOrder) {
		this._clientRepository.updateOS(serviceOrder);
	}
}
