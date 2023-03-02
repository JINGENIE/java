package aggrgation;

import aggregation.Car;

public class Human {
	private String name;
	private Car car;

	public Human() {
	}

	public Human(String name) {
		this.name = name;
		// 자동차가 없는
	}

	public Human(String name, Car car) {
		this.name = name;
		this.car = car;

		// 자동차가 있는
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", car=" + car + "]";
	}

	public void drive() {
		// TODO Auto-generated method stub
		
	}

	public void stopCar1() {
		// TODO Auto-generated method stub
		
	}

	public void stopCar() {
		// TODO Auto-generated method stub
		
	}

}
