package app.infraestructure.repositories;

import app.infraestructure.repositories.interfaces.IEmployeeRepository;
import app.model.EmployeeModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

public class EmployeeRepository implements IEmployeeRepository  {
	private ArrayList<EmployeeModel> _employee = new ArrayList<>();
	
	private final DataSource _dataSource;
	
	public EmployeeRepository(DataSource datasource) {
		this._dataSource = datasource;
	}
	
    public void create(EmployeeModel Employee) {
    	String sql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";
    	try(Connection connection = this._dataSource.getConnection()) {
    		
    		PreparedStatement statement = connection.prepareStatement(sql);
    		
    		statement.setString(1, Employee.getName());
    		statement.setString(2, Employee.getEmail());
    		statement.executeUpdate();
    		
    	} catch (Exception e) {
			e.printStackTrace();
		}
    }

    public EmployeeModel findByEmail(String email) {
    	String sql = "SELECT * FROM users";
		try(Connection connection = this._dataSource.getConnection()) {
			
			PreparedStatement statement = connection.prepareStatement(sql);

			statement.setString(1, email);
			
			try(ResultSet resultSet = statement.executeQuery()) {
				if(resultSet.next()) {
					return new EmployeeModel(
							resultSet.getInt("Id"), 
							resultSet.getString("name"), 
							resultSet.getString("email"));
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}
}
