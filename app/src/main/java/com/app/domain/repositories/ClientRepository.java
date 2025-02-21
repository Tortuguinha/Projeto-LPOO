package com.app.domain.repositories;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.domain.entities.client.ClientAddressEntity;
import com.app.domain.entities.client.ClientContactEntity;
import com.app.domain.entities.client.ClientEntity;
import com.app.domain.repositories.interfaces.IClientRepository;
import com.app.infrastructure.config.DatabaseConfig;

public class ClientRepository implements IClientRepository {
    
    public void save(ClientEntity client, ClientContactEntity contact, ClientAddressEntity address) {
        String sqlClient = """
                INSERT INTO client (name, email, cpf, status, createdAt)
                VALUES (?, ?, ?, ?, ?)
            """;

        try (Connection connection = DatabaseConfig.getConnection()) {
            PreparedStatement queryClient = connection.prepareStatement(sqlClient, PreparedStatement.RETURN_GENERATED_KEYS);
            
            queryClient.setString(1, client.getNome());
            queryClient.setString(2, client.getEmail());
            queryClient.setString(3, client.getCPF());
            queryClient.setBoolean(4, client.getStatus());
            queryClient.setDate(5, new Date(client.getCreatedAt().getTime()));
            queryClient.execute();

            var generatedKeys = queryClient.getGeneratedKeys();
            if (generatedKeys.next()) {
                client.setId(generatedKeys.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ClientEntity findByEmail(String email) {
        String sql = "SELECT id, name, email, cpf, status, createdAt FROM client WHERE email = ?";
        
        try (Connection connection = DatabaseConfig.getConnection()) {
            PreparedStatement query = connection.prepareStatement(sql);
            query.setString(1, email);
            
            ResultSet resultSet = query.executeQuery();
            
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String clientName = resultSet.getString("name");
                String clientEmail = resultSet.getString("email");
                String clientCPF = resultSet.getString("cpf");
                Boolean clientStatus = resultSet.getBoolean("status");
                Date createdAt = resultSet.getDate("createdAt");
                
                ClientEntity client = new ClientEntity(clientName, clientEmail, clientCPF, clientStatus, createdAt);
                client.setId(id);
                
                return client;
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public ClientEntity findByCPF(String cpf) {
        String sql = "SELECT id, name, email, cpf, status, createdAt FROM client WHERE cpf = ?";
        
        try (Connection connection = DatabaseConfig.getConnection()) {
            PreparedStatement query = connection.prepareStatement(sql);
            query.setString(1, cpf);
            
            ResultSet resultSet = query.executeQuery();
            
            if (resultSet.next()) {
            	int id = resultSet.getInt("id");
            	String clientName = resultSet.getString("name");
                String clientEmail = resultSet.getString("email");
                String clientCPF = resultSet.getString("cpf");
                Boolean clientStatus = resultSet.getBoolean("status");
                Date createdAt = resultSet.getDate("createdAt");
                
                ClientEntity client = new ClientEntity(clientName, clientEmail, clientCPF, clientStatus, createdAt);
                client.setId(id);
                
                return client;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<ClientEntity> allClients() {
        String sql = "SELECT id, name, email, cpf, status, createdAt FROM client";
        List<ClientEntity> clients = new ArrayList<>();

        try (Connection connection = DatabaseConfig.getConnection()) {
            PreparedStatement query = connection.prepareStatement(sql);
            ResultSet resultSet = query.executeQuery();
            
            while (resultSet.next()) {
            	int id = resultSet.getInt("id");
            	String clientName = resultSet.getString("name");
                String clientEmail = resultSet.getString("email");
                String clientCPF = resultSet.getString("cpf");
                Boolean clientStatus = resultSet.getBoolean("status");
                Date createdAt = resultSet.getDate("createdAt");
                
                ClientEntity client = new ClientEntity(clientName, clientEmail, clientCPF, clientStatus, createdAt);
                client.setId(id);
                clients.add(client);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clients;
    }
}
