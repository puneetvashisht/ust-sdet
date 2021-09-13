package mavendemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.OptionalInt;

public class JDBCDemo {
	static final String DB_URL = "jdbc:mysql://localhost/ustdb";
	static final String USER = "root";
	static final String PASS = "root";
	static final String QUERY = "SELECT id, first, last, age FROM employees";

	static final String INSERT_QUERY = "INSERT INTO employees VALUES (101, 'Mahnaz', 'Fatma', 25)";
	
	public static void main(String[] args) {
		// 1. Open a connection
//		2. Create a statement
//		3. execute the statement
//		4. loop and extract, execute update 
//		5. close connection
		
		try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		         Statement stmt = conn.createStatement();
		      ) {		      
		         String sql = "UPDATE employees " +
		                 "SET age = 24 WHERE first='Priya'";
		         int result = stmt.executeUpdate(sql);
		         System.out.println(result);
//		         ResultSet rs = stmt.executeQuery(QUERY);
//		         while(rs.next()){
//		            //Display values
//		            System.out.print("ID: " + rs.getInt("id"));
//		            System.out.print(", Age: " + rs.getInt("age"));
//		            System.out.print(", First: " + rs.getString("first"));
//		            System.out.println(", Last: " + rs.getString("last"));
//		         }
//		         rs.close();
		      } catch (SQLException e) {
		         e.printStackTrace();
		      } 
		
//		Statement stmt;
//		try {
//			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//			stmt = conn.createStatement();
//			int rs = stmt.executeUpdate(INSERT_QUERY);
//			System.out.println(rs);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		

//		try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
//				Statement stmt = conn.createStatement();
//				ResultSet rs = stmt.executeQuery(QUERY);){
//			
//			ArrayList<Employee> employees = new ArrayList<>();
//			while (rs.next()) {
//				// Retrieve by column name
//				
//				int id = rs.getInt("id");
//				int age = rs.getInt("age");
//				String name = rs.getString("first");
//				String last = rs.getString("last");
////				System.out.print("ID: " + rs.getInt("id"));
////				System.out.print(", Age: " + rs.getInt("age"));
////				System.out.print(", First: " + rs.getString("name"));
////				System.out.println(", Last: " + rs.getString("last"));
//				
//				Employee employee  = new Employee(id, name, last, age);
//				System.out.println(employee);
//				
//				employees.add(employee);
//			}
//			
//			System.out.println(employees);
			
//			employees.stream()
//			.filter((e)->e.id == 3)
//			.forEach((e)-> System.out.println(e));
//			
//			
//			OptionalInt minimumAgeEmployee = employees.stream()
//			.mapToInt((e)-> e.age)
//			.min();
//			
//			if(minimumAgeEmployee.isPresent()) {
//				System.out.println(minimumAgeEmployee.getAsInt());
//			}
			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
	}
}
