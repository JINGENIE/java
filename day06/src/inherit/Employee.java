package inherit;

public class Employee {
	private String id;
	private String name;
	private double salary; // 상속되어서도 사용 가능한 protected
	// defaㅕlt컨스

	public Employee() {
	}

	public double getSalary() {
		return salary;
	}

	// 전부다 들어간 컨스
	public Employee(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//	}
	
	public String toString() {
		return id + " " + name+ " " +salary;
	}

	public double getAnnSalary() {
		// 이클래스에 의해 만들어지는 레퍼런스의 샐러리의 *12
		double result = 0.0;
		result = this.salary * 12;
		return result;

	}

}
