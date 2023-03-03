package inherit2;

public class Manager extends Employee {
//extends를 통해 상속관계 표현 (id,name, salary, getAnnSalary, toString상속된 상태
	// ctrl누르면 해당 클래스로 바로 간다 ~
	private double bonus;
	// Constructor는 상속 안되니까 다 써야함

	// source > Constructor from superclass통해 작성
	// 위에있는 Constructor 사용하기 ~

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, double salary) {
		super(id, name, salary);
		// TODO Auto-generated constructor stub
	}

	public Manager(String id, String name, double salary, double bonus) {
		super(id, name, salary);
		this.bonus = bonus;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public double getAnnSalary() {

		double result = 0.0;
		result = (this.getSalary() + this.bonus) * 12;
		//= result = super.getAnnSalry() + (this.bonus *12)
		// protected 로 해서 this.salary해도 되지만, 코드꼬일 수있으니.private 지키고. get을 employee에 추가해서
		// getsalary를 가져오기

		return result;
	}

	@Override
	public String toString() {
	//	return "Manager [bonus=" + bonus + ", toString()=" + super.toString() + "]";
		return super.toString() + "" + bonus;
	}

//to string 부분을 재정의한다(overriding) *필요시 재정의해서 사용하기 가능

}
