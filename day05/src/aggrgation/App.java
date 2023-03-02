package aggrgation;

import aggregation.Car;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Human human = new Human("James");
			System.out.println(human);

			Car car = new Car("red", "red", 1000);
			human.setCar(car);
			System.out.println(human);
			
			human.drive();
			human.stopCar();
	}

}
