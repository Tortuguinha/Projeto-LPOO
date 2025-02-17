package com.app.domain.repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.app.domain.entities.client.ClientEntity;
import com.app.domain.repositories.interfaces.IClientRepository;
import com.app.infrastructure.config.DatabaseConfig;

public class ClientRepository implements IClientRepository {
	public void save(ClientEntity client) {
		String sqlEmployee = """
				INSERT INTO client (name, email, cpf, telephone, status)
				VALUES (?, ?, ?, ?, ?)
            """;
		
		
		try (Connection connection = DatabaseConfig.getConnection()) {
			
			PreparedStatement queryClient = connection.prepareStatement(sqlEmployee);
			
			queryClient.setString(1, client.getNome());
			queryClient.setString(2, client.getEmail());
			queryClient.setString(3, client.getCPF());
			queryClient.setString(4, client.getTelefone());
			queryClient.setBoolean(5, client.getStatus());
			
			queryClient.execute();

		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
