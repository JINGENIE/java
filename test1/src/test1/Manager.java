package test1;

public class Manager {

	
	private String  name;
	private double  bonus;
	private double  salary;
	
	
	public Manager(String name, double bonus, double salary) {
		this.name = name;
		this.salary= salary;
		this.bonus= bonus;
	}





	public double getSalary() {
		return salary;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public double getTax() {
		return (salary+bonus)*0.03 ;
	}
	
	public double getAnnSalary() {
		return (salary*12) + bonus ;
	}
	@Override
	public String toString() {
		return "Manager [name=" + name + ", bonus=" + bonus + ", salary=" + salary + "]";
	}


}
