package shape;

public class Rectangle extends Shape {

	private double width;
	private double height;

	// 속성과 기능을 상속받을 수 있음
	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	} // 비로소 특정위치의 사각혐이 됨.

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getCircumn() {
		return (width + height) * 2;
	}

}
