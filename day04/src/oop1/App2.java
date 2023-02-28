package oop1;

public class App2 {

	public static void main(String[] args) {
		Car car1  = new Car("k2", "blue" ,2000);
		car1.go();
		car1.stop();
		
//car1은 주소가 들어가야하고 주소를 기반으로 데이터가 들어가야함 
		
		System.out.println("----------------------");
		Car car2  = new Car("k3", "white", 3000);
		car2.go();
		car2.stop();


	}

}
