package com.app.domain.repositories;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.app.domain.entities.company.CompanyEntity;
import com.app.domain.repositories.interfaces.ICompanyRepository;
import com.app.infrastructure.config.DatabaseConfig;

public class CompanyRepository implements ICompanyRepository {
    
    public void save(CompanyEntity company) {
        String sqlCompany = """
                INSERT INTO company (name, email, cnpj, status, createdAt)
                VALUES (?, ?, ?, ?, ?)
            """;

        try (Connection connection = DatabaseConfig.getConnection()) {
            PreparedStatement queryCompany = connection.prepareStatement(sqlCompany, PreparedStatement.RETURN_GENERATED_KEYS);
            
            queryCompany.setString(1, company.getCompanyName());
            queryCompany.setString(2, company.getEmail());
            queryCompany.setString(3, company.getCNPJ());
            queryCompany.setBoolean(5, company.getStatus());
            queryCompany.setDate(6, new Date(company.getCreatedAt().getTime()));
            queryCompany.execute();

            var generatedKeys = queryCompany.getGeneratedKeys();
            if (generatedKeys.next()) {
            	company.setId(generatedKeys.getInt(1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public CompanyEntity findByEmail(String email) {
        String sql = "SELECT id, name, email, cnpj, status, createdAt FROM company WHERE email = ?";
        
        try (Connection connection = DatabaseConfig.getConnection()) {
            PreparedStatement query = connection.prepareStatement(sql);
            query.setString(1, email);
            
            ResultSet resultSet = query.executeQuery();
            
            if (resultSet.next()) {
                int id = resultSet.getInt("id");
                String companyName = resultSet.getString("name");
                String companyEmail = resultSet.getString("email");
                String companyCNPJ = resultSet.getString("cnpj");
                Boolean companyStatus = resultSet.getBoolean("status");
                Date createdAt = resultSet.getDate("createdAt");
                
                CompanyEntity company = new CompanyEntity(companyName, companyEmail, companyCNPJ, companyStatus, createdAt);
                company.setId(id);
                
                return company;
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public CompanyEntity findByCNPJ(String cnpj) {
        String sql = "SELECT id, name, email, cnpj, status, createdAt FROM company WHERE cnpj = ?";
        
        try (Connection connection = DatabaseConfig.getConnection()) {
            PreparedStatement query = connection.prepareStatement(sql);
            query.setString(1, cnpj);
            
            ResultSet resultSet = query.executeQuery();
            
            if (resultSet.next()) {
            	int id = resultSet.getInt("id");
            	String companyName = resultSet.getString("name");
                String companyEmail = resultSet.getString("email");
                String companyCNPJ = resultSet.getString("cnpj");
                Boolean companyStatus = resultSet.getBoolean("status");
                Date createdAt = resultSet.getDate("createdAt");
                
                CompanyEntity company = new CompanyEntity(companyName, companyEmail, companyCNPJ, companyStatus, createdAt);
                company.setId(id);
                
                return company;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<CompanyEntity> allCompanys() {
        String sql = "SELECT id, name, email, cnpj, status, createdAt FROM company";
        List<CompanyEntity> companys = new ArrayList<>();

        try (Connection connection = DatabaseConfig.getConnection()) {
            PreparedStatement query = connection.prepareStatement(sql);
            ResultSet resultSet = query.executeQuery();
            
            while (resultSet.next()) {
            	int id = resultSet.getInt("id");
            	String companyName = resultSet.getString("name");
                String companyEmail = resultSet.getString("email");
                String companyCNPJ = resultSet.getString("cnpj");
                Boolean companyStatus = resultSet.getBoolean("status");
                Date createdAt = resultSet.getDate("createdAt");
                
                CompanyEntity company = new CompanyEntity(companyName, companyEmail, companyCNPJ, companyStatus, createdAt);
                company.setId(id);
                companys.add(company);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return companys;
    }
}
