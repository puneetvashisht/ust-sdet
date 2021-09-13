package mavendemo;

public class Employee {
	
	int id;
	String name;
	String last;
	int age;
	public Employee(int id, String name, String last, int age) {
		super();
		this.id = id;
		this.name = name;
		this.last = last;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", last=" + last + ", age=" + age + "]";
	}
	
	

}
