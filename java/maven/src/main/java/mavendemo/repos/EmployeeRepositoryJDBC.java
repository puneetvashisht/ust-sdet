package mavendemo.repos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import mavendemo.entities.Employee;



// Responsibility is any DB interactions
public class EmployeeRepositoryJDBC {
	
	static final String DB_URL = "jdbc:mysql://localhost/ustdb";
	static final String USER = "root";
	static final String PASS = "rootroot";
	
	public static Connection getConnection() throws SQLException {
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		return conn;
	}
	

	
	public int addEmployee(Employee employee) {
		int result = 0;
		try {
			Connection conn = getConnection();
			final String INSERT_QUERY = "INSERT INTO emp VALUES (?, ?, ?)";
			PreparedStatement stmt = conn.prepareStatement(INSERT_QUERY);
			stmt.setInt(1, employee.getId());
			stmt.setString(2, employee.getName());
			stmt.setDouble(3, employee.getSalary());
			
			result = stmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	public int addEmployee(List<Employee> employees) {
		int result = 0;
		try {
			Connection conn = getConnection();
			final String INSERT_QUERY = "INSERT INTO emp VALUES (?, ?, ?)";
			for(Employee e : employees) {
				
				PreparedStatement stmt = conn.prepareStatement(INSERT_QUERY);
				stmt.setInt(1, e.getId());
				stmt.setString(2, e.getName());
				stmt.setDouble(3, e.getSalary());
				result += stmt.executeUpdate();
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
		
	}
	
	public List<Employee> fetchAllEmployees() {
		ArrayList<Employee> employees = new ArrayList<>(); 
		try {
		
		Connection conn = getConnection();
		final String QUERY = "SELECT * FROM emp";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(QUERY);
	
		while (rs.next()) {
			// Retrieve by column name
			
			int id = rs.getInt("id");
			double salary = rs.getDouble("salary");
			String name = rs.getString("name");
			
			Employee employee  = new Employee(id, name, salary);
			System.out.println(employee);
			
			employees.add(employee);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return employees;
	}
	
	public int deleteEmployee(int id) {
		int result = 0;
		try {
			Connection conn = getConnection();
			final String DELETE_QUERY = "DELETE FROM emp where id=?";
			PreparedStatement stmt = conn.prepareStatement(DELETE_QUERY);
			stmt.setInt(1, id);
			
			result = stmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int incrementSalary(int id, int increaseBy) {
		int result = 0;
		try {
			Connection conn = getConnection();
			final String DELETE_QUERY = "UPDATE emp set salary=? where id=?";
			PreparedStatement stmt = conn.prepareStatement(DELETE_QUERY);
			stmt.setDouble(1, increaseBy);
			stmt.setInt(2, id);
			result = stmt.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return result;

	}

}
