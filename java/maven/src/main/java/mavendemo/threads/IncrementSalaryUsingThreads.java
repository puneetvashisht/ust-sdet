package mavendemo.threads;

import mavendemo.entities.Employee;
import mavendemo.repos.EmployeeRepository;


class IncrementSalaryTask implements Runnable{

	Employee employee;
	
	
	public IncrementSalaryTask(Employee employee) {
		super();
		this.employee = employee;
	}


	@Override
	public void run() {
		
		EmployeeRepository repo = new EmployeeRepository();
		repo.incrementSalary(employee.getId(), 5000);
		System.out.println("Increment salary by thread " + Thread.currentThread().getName());
		System.out.println(employee);
	}
	
}

public class IncrementSalaryUsingThreads {

	public static void main(String[] args) {
		
//		EmployeeRepository.employees
		
//		Runnable runnable = () ->  {
//			System.out.println("Run by thread: "+ Thread.currentThread().getName());
//		};
		
		
		for(Employee e : EmployeeRepository.employees) {
//			System.out.println(e);
			Runnable runnable = new IncrementSalaryTask(e);
			Thread t = new Thread(runnable);
			t.start();
		}
		
		System.out.println("Run by thread: "+ Thread.currentThread().getName());
	}

}
