package Statics;

public class Test {

	public static void main(String[] args) {
		Car c1 = new Car("K1", "kia");
		System.out.println(c1);
		
		
		Car c2 = new Car("g10", Car.makerName);
		System.out.println(c2);
//static은 클래스꺼다.. 객체에 관여하지 않는다.
}
}