package ws0228;

public class Employee {

	
	
	private String name;
	private double salary;
	
	//생성자
	

	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	
	//메소드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	public double getAnnSalary() {
		return salary * 12.0;
	}

	public double getTax() {
		return salary * 0.03;
	}
	
}
