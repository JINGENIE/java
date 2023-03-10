package Statics;

public class Car {
	private String name;
	private String maker;
	public static String makerName = "HD";

	public Car() {
	}

	public Car(String name, String maker) {
		this.name = name;
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", maker=" + maker + "]";
	}

}
