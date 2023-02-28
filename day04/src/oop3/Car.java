package oop3;

public class Car {

	private String name;
	private String color;
	private int size;
	private int fsize;
	private int cfsize;

//	
//	
//	//생성자 . (constructor)

	// (String name, String color, int size) 가 argument 라고 함
	// argument가 존재하는 컨스트럭트는 자동으로 추가하지 않는다. 디폴트 컨스트럭터를 기본으로 만들어주기.

	public Car() { // default constructor
	}

	public Car(String name, String color, int size, int fsize) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.fsize = fsize;

	}

	public Car(String name, String color, int size, int fsize, int cfsize) {
		this(name, color, size, fsize);
		this.cfsize = cfsize;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", size=" + size + ", fsize=" + fsize + ", cfsize=" + cfsize
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	// 기름을 넣는다.
	/*
	 * 기름을 넣는다. 기름통보다 많이 넣으면 - 다시 주유하세요 음수값이 들어가면 다시주유하세요
	 */

//	public void setCfsize(int size) {
//		cfsize = size;
//
////		if (cfsize < 0 || cfsize > 50 ) {
////			System.out.println("다시 주유하세요");
////			return;
//
////		}
//		// 반환값이 없어서 void, 기름 얼마나 넣을지, 기름통량보다 더 많으면 어떡할지 구현하는 필드임
//		if (size < 0) {
//			System.out.println("다시 주유 하세요");
//			return;
//		}
//		if (size > fsize - cfsize) {
//			//fsize(연료통) - cfsize : 더 주유할 수 있는 양 
//			System.out.println("다시 주유 하세요");
//			return;
//		}
//		System.out.println(size + "L주유되었습니다");
//		cfsize = size;
//	}
//	
	//강사님 답안
	public void setCfsize(int size) {
		if(size <= 0 || fsize < (cfsize + size)) {
			System.out.println("다시 주유하세요");
			return;
		}
		cfsize += size;
	}
	

	// 주행을 한다. current fuel
	// 1리터당 10km를 주행할 수 있다.
	public void go(int distance) {
//주행거리 distance임의의 값	
		if(cfsize <0 || cfsize < (distance/10)) {
			
			// distance : 100km를 가야한다. 그럼 10L가 필요하다.. 
			// DISTANCE를 10으로 나눈 값(앞으로 필요한 기름)보다 현재기름이 작으면.
			System.out.println("주유하시고 출발하세요");
			return;
		}
		System.out.printf("%s Go...", this.name, distance);
		cfsize= cfsize - (distance/10);
		
	}

	// 멈춘다.
	public void stop1() {
		// 주행거리 distance임의의 값
		System.out.printf("%s Stop...", this.name);
	}

	public void stop() {
		System.out.printf("%s, %s Stop car...", this.name, this.color);

	}
}
