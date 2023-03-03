package inherit;

public class Sales extends Employee {

	private String loc;
	private double rate;

	// 이름 사번 샐러리 다 상속받음 컨스트럭터는 상속이 안되니 만들자

	public Sales() {
	}

	public Sales(String loc, double rate) {
		this.loc = loc;
		this.rate = rate;
	}

	public Sales(String id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	public Sales(String id, String name, double salary, String loc, double rate) {
		super(id, name, salary);
		this.loc = loc;
		this.rate = rate;
	}

	@Override
	public String toString() {
		return super.toString() + " " + loc + " " + rate;
	}

	@Override
	public double getAnnSalary() {
		double result = 0.0;
		result = super.getAnnSalary() + (this.getIncentive() * 12);
		return result;

	}

	public double getIncentive() {
		double result = 0.0;
		result = getSalary() * this.rate;
		return result;
	}

}
