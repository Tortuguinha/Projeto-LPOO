package com.app.domain.repositories;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.domain.entities.ServiceOrderEntity;
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
        
		String sqlContact = """
				INSERT INTO contact (user_id, telephone, email)
				VALUES (?, ?, ?)
	        """;

	    String sqlAddress = """
	    		INSERT INTO address (user_id, number, street, district, city)
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
            	int clientId = generatedKeys.getInt(1);
            	
            	PreparedStatement queryContact = connection.prepareStatement(sqlContact);
            	queryContact.setInt(1, clientId);
 	            queryContact.setString(2, contact.getTelephone());
 	            queryContact.setString(3, contact.getEmail());
 	            queryContact.executeUpdate();
 	
 	            PreparedStatement queryAddress = connection.prepareStatement(sqlAddress);
 	            queryAddress.setInt(1, clientId);
 	            queryAddress.setInt(2, address.getNumber());
 	            queryAddress.setString(3, address.getStreet());
 	            queryAddress.setString(4, address.getDistrict());
 	            queryAddress.setString(5, address.getCity());
 	            queryAddress.executeUpdate();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void updateOS(ServiceOrderEntity serviceOrder) {
    	
    	String sql = """
                UPDATE service_order
                SET budget_code = ?, 
                    equip_desc = ?, 
                    model = ?, 
                    serial_num = ?, 
                    details = ?, 
                    problems = ?, 
                    urgency_level = ?, 
                    delivery_date = ?, 
                    tech_response = ?, 
                    final_cost = ?, 
                    payment_form = ?
                WHERE document_id = ?
            """;
    	try (Connection connection = DatabaseConfig.getConnection()) {
			
    		PreparedStatement query = connection.prepareStatement(sql);
    		
    		query.setString(1, serviceOrder.getBudgetCode());
    		query.setString(2, serviceOrder.getEquipDesc());
    		query.setString(3, serviceOrder.getModel());
    		query.setString(4, serviceOrder.getSerialNum());
    		query.setString(5, serviceOrder.getDetails());
    		query.setString(6, serviceOrder.getProblems());
    		query.setString(7, serviceOrder.getUrgencyLevel());
    		query.setDate(8, new Date(serviceOrder.getDelivaryDate().getTime()));
    		query.setString(9, serviceOrder.getTechResponse());
    		query.setString(10, serviceOrder.getFinalCoust());
    		query.setString(11, serviceOrder.getPaymentForm());
    		query.setString(12, serviceOrder.getDocumentID());
    		
    		query.executeUpdate();
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
