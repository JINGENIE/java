package p214;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Input num.");
		int num = 0;
		// 선언 먼저하고 안에다가 변수 넣기
		try (Scanner sc = new Scanner(System.in)){
			num = Integer.parseInt(sc.next());
			int result = 10 / num;
			System.out.println(result);

		System.out.println("End app..");
	}
}
}