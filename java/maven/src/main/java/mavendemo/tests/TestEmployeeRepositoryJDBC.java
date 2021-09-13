package mavendemo.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.List;

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

//	@Test
	public void testfetchAllEmployees() {
		List<Employee> employees = repo.fetchAllEmployees();
		assertSame(2, employees.size());
	}
//	
	@Test
	public void testDeleteEmployee() {
//		EmployeeRepository repo = new EmployeeRepository();
		int result = repo.deleteEmployee(5);
		assertSame(1, result);
	}
	
//	@Test
	public void testAddEmployee() {
//		EmployeeRepository repo = new EmployeeRepository();
		
		Employee employee = new Employee(5, "Manisha", 243433.44);
		int result = repo.addEmployee(employee);
		
		assertSame(1, result);
	}
	
//	@Test
//	public void testIncrementSalaryOfEmployee() {
////		EmployeeRepository repo = new EmployeeRepository();
//		
//		
//		repo.incrementSalary(23, 5000);
//		
//		assertEquals( 348433.44, repo.employees.get(0).getSalary(), 0.01);
//	}


}
