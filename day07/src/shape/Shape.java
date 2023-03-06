package shape;

public abstract class Shape {
//추상클래스 (삐딱선)
	protected int x;
	protected int y;
	// 상속관계에서 다른 패키지라 할지라도 자유롭게 접근이 가능함
	public Shape() {
	} // 디폴트
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;// xy초기화
	}
	//Abstract Method (함수의 모양이 없는,추상)
	public abstract double getArea();
	public abstract double getCircumn();
	
	public String getXY() {
		return x+ " , "+y;
	}

}
