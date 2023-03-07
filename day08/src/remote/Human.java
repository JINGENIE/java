package remote;

public class Human {
	public static void main (String args[]) {
		//Remote remote = new Tv(); //이렇게하면 티비를 제어할수 있고
		Remote remote = new Audio(); //이렇게하면 오디오를 제어할수 있다. 스프링에서는 얘를 제어해준다. 레고블럭처럼 꼈다 뻈다.
		
		remote.turnOn();
		remote.turnOff();
		
	}
}
