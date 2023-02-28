package test1;

public class Employee {

	private String name;
	private double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	public Employee(double salary) {
		this.salary = salary;
	}

	public double getAnnSalary() {
		return salary * 12.0;
	}

	public double getTax() {
		return salary * 0.03;
	}

}
