package oop1;

public class Car {

	public String name;
	public String color;
	public int size;
	
	
	
	//생성자 . (constructor) 클래스에 의해 객체가 될때 name,color등 셋팅해주는 기능
	public Car() {  
		//클래스와 동일. 리턴파일 존재하지 않음
		this.name = "k1";
		this.color = "red";
		this.size = 1000;
		
		
	}
	//컨스트럭터는 동일 이름
	
	public Car (String name, String color, int size) {
		this.name = name;
		this.color = color;
		this.size = size;
		
	}
	//(String name, String color, int size) 가 argument 라고 함
	
	
	public void go() {
		System.out.printf("%s, %s Go car..." , this.name, this.color);
		
	}
	
	public void stop() {
		System.out.printf("%s, %s Stop car..." , this.name, this.color);
		
	}
	}

