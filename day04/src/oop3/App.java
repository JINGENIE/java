package oop3;

public class App {

	public static void main(String[] args) {
		Car car = new Car("c1", "RED", 1000, 50);
		//자동차 이름/ 색상 / cc /기름통
		System.out.println(car.toString());
		car.go(0);
		car.setCfsize(30);
		car.go(10);
		System.out.println(car.toString());
	}

}
