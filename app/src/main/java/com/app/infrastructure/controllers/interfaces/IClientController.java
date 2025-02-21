package com.app.infrastructure.controllers.interfaces;

import java.util.List;

import com.app.domain.entities.ServiceOrderEntity;
import com.app.domain.entities.client.ClientAddressEntity;
import com.app.domain.entities.client.ClientContactEntity;
import com.app.domain.entities.client.ClientEntity;

public interface IClientController {
	public void register(ClientEntity company, ClientContactEntity contact, ClientAddressEntity address);
	public void createOS(ServiceOrderEntity serviceOrder);
	ClientEntity findClientByCpf(String cpf);
	public List<ClientEntity> returnAllClients();
}
