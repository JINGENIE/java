package ws0228;

public class Manager {

	
	/* Manager 는 보너스가 추가 됨
	연봉과 세금을 계산 하는 기능을 구현 하시오
	App.java를 통해 Application 을 구현 하시오
	Employee 5명을 배열로 만들어서 넣고 기본 정보를 출력 하시오
	Manager 5명을 배열로 만들어서 넣고 기본 정보를 출력 하시오
	Employee들의 연봉과 세금 정보를 출력 하시오
	Manager들의 연봉과 세금 정보를 출력 하시오 */
	
	private String name;
	private double salary;
	private double bonus;
	
	//생성자
	

	
	public Manager(String name, double salary, double bonus) {
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
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
	
	@Override //빠지면 기능을 못함 
	public String toString() {
		return "Manager [name=" + name + ", salary=" + salary + ", bonus="+ bonus +"]";
	}
	
	public double getAnnSalary() {
		return (salary * 12.0) + bonus;
	}

	public double getTax() {
		return (salary * 0.03) + (bonus * 0.03);
	}
	
}

	

