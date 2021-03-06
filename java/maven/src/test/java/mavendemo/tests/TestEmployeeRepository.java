package mavendemo.tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import mavendemo.entities.Employee;
import mavendemo.repos.EmployeeRepository;
//import mavendemo.threads.IncrementSalaryTask;

public class TestEmployeeRepository {
	
	static EmployeeRepository repo;
	
//	@BeforeClass
//	public static void setUp() {
//		System.out.println("***** Before all test cases .. but just once .. *****");
//		repo = new EmployeeRepository();	
//	}
	
	@Before
	public void setUp() {
		System.out.println("***** Before every test cases.. *****");
		repo = new EmployeeRepository();	
	}

//	@Test
	public void testfetchAllEmployees() {
		List<Employee> employees = repo.fetchAllEmployees();
		assertSame(3, employees.size());
	}
	
//	@Test
	public void testDeleteEmployee() {
//		EmployeeRepository repo = new EmployeeRepository();
		repo.deleteEmployee(2);
		assertSame(3, repo.employees.size());
	}
	
	@Test(expected = RuntimeException.class)
	public void testDeleteEmployeeWhichDoesntExist() {
//		EmployeeRepository repo = new EmployeeRepository();
		Integer id = -99;
		repo.deleteEmployee(id);
		assertSame(3, repo.employees.size());
	}
	
//	@Test
	public void testAddEmployee() {
//		EmployeeRepository repo = new EmployeeRepository();
		
		Employee employee = new Employee(5, "Manisha", 243433.44);
		repo.addEmployee(employee);
		
		assertSame(5, repo.employees.size());
	}
	
//	@Test
	public void testIncrementSalaryOfEmployee() {
//		EmployeeRepository repo = new EmployeeRepository();
		
		for(Employee e : EmployeeRepository.employees) {
//			System.out.println(e);
			repo.incrementSalary(e.getId(), 5000);
			System.out.println(e);
			
		}
		
		
		
//		assertEquals( 348433.44, repo.employees.get(0).getSalary(), 0.01);
	}


}
