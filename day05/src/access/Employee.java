package access;

public class Employee {
	
	
	private String id;
	protected String name;
	int salary; //아무것도 안쓰면 default
	
	
	public Employee() {
		
		
	}
	
	public Employee(String id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	
	
	
	public double getTax() {
		double result = 0.0; //초기화
		result = this.salary * 0.17;
		return result;
		
	}

	

	private int getAnnSalary() { //app에서 사용못함(private)로 막아놔서 해당 class에서만 사용가능
		int result =0; //local variable
		result = this.salary *12;
		
		return result;
	}
	
	
	protected double getAnnTax() {
		double result = 0.0;
		result = this.getAnnSalary() *0.17;
		return result;
		
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
