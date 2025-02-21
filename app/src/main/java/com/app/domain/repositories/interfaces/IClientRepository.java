package com.app.domain.repositories.interfaces;

import java.util.List;

import com.app.domain.entities.client.ClientAddressEntity;
import com.app.domain.entities.client.ClientContactEntity;
import com.app.domain.entities.client.ClientEntity;

public interface IClientRepository {
	public void save(ClientEntity client,  ClientContactEntity contact, ClientAddressEntity address);
	public ClientEntity findByEmail(String email);
	public ClientEntity findByCPF(String cpf);
	public List<ClientEntity> allClients();
}
