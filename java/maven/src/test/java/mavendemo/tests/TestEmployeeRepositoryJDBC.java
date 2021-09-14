package mavendemo.tests;

import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import mavendemo.entities.Employee;
import mavendemo.repos.EmployeeRepositoryJDBC;

public class TestEmployeeRepositoryJDBC {
	
	EmployeeRepositoryJDBC repo;
	
	@Before
	public void setUp() {
		repo = new EmployeeRepositoryJDBC();	
	}
	
	@After
	public void tearDown() {
		repo = null;	
	}

	@Test
	public void testfetchAllEmployees() {
		List<Employee> employees = repo.fetchAllEmployees();
		assertSame(4, employees.size());
	}
//	
//	@Test
	public void testDeleteEmployee() {
//		EmployeeRepository repo = new EmployeeRepository();
		int result = repo.deleteEmployee(5);
		assertSame(1, result);
	}
	
//	@Test
	public void testAddEmployee() {
//		EmployeeRepository repo = new EmployeeRepository();
		
		Employee employee = new Employee(7, "Roshi", 143433.44);
		Employee employee2 = new Employee(8, "Sanya", 243433.44);
		int result = repo.addEmployee(employee);
		int result2 = repo.addEmployee(employee2);
		assertSame(1, result);
		assertSame(1, result2);
	}
	
	
//	@Test
	public void testAddAllEmployee() {
//		EmployeeRepository repo = new EmployeeRepository();
		
		Employee employee = new Employee(7, "Roshi", 143433.44);
		Employee employee2 = new Employee(8, "Sanya", 243433.44);
		List<Employee> employees = new ArrayList<>();
		employees.add(employee2); employees.add(employee);
		
		int result = repo.addEmployee(employees);
		
		assertSame(2, result);
	}
	
//	@Test
	public void testIncrementSalaryOfEmployee() {
//		EmployeeRepository repo = new EmployeeRepository();
		
		
		int result = repo.incrementSalary(8, 5000);
		assertSame(1, result);
	}


}
