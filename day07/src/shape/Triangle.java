package shape;

public class Triangle extends Shape {

	private double width;
	private double height;

	// 속성과 기능을 상속받을 수 있음
	public Triangle() {
	}

	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public Triangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (width * height) / 2;
	}

	@Override
	public double getCircumn() {
		// TODO Auto-generated method stub
		double z = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
		return z + width + height;
	}

}
