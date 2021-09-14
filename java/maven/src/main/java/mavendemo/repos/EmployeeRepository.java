package mavendemo.repos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import mavendemo.entities.Employee;



// Responsibility is any DB interactions
public class EmployeeRepository {
	
	public static List<Employee> employees = new ArrayList<>();
	
	static {
		Employee e1 = new Employee(23, "Sohini", 343433.44);
		Employee e2 = new Employee(13, "Priya", 243433.44);
		Employee e3 = new Employee(3, "Nidhi", 543433.44);
		Employee e4 = new Employee(2, "Sonia", 243433.44);

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		System.out.println(employees);
	}
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
		
	}
	
	public List<Employee> fetchAllEmployees() {
		return employees;
	}
	
	public void deleteEmployee(int id) {
		List<Employee> remainingEmployees = employees.stream()
		.filter((e)->e.getId() != id)
		.collect(Collectors.toList());
		
		this.employees = remainingEmployees;
	}
	
	public void incrementSalary(int id, int increaseBy) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		employees.stream()
		.filter((e)->e.getId() == id)
//		.map((e)-> {
//			e.setSalary(e.getSalary() + increaseBy);
//			return e;
//		})
		.forEach((e)-> {
			e.setSalary(e.getSalary() + increaseBy);
//			System.out.println(e);
		});
	}

}
