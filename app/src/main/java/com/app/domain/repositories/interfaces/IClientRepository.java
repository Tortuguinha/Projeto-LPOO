package com.app.domain.repositories.interfaces;

import com.app.domain.entities.client.ClientEntity;

public interface IClientRepository {
	public void save(ClientEntity client);
}
