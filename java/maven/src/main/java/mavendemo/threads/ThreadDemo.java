package mavendemo.threads;

import mavendemo.repos.EmployeeRepository;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		System.out.println("Run by thread: "+ Thread.currentThread().getName());
		
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {
		
//		EmployeeRepository.employees
		
		for(int i=0; i<10;i++) {
			Thread t = new Thread(new MyRunnable());
			t.start();
		}
		
		System.out.println("Run by thread: "+ Thread.currentThread().getName());
	}

}
