package variable;

import java.util.Random;
import java.util.Scanner;

//삼항연산
public class P81 {

	public static void main(String[] args) {
//		int a = 10;
//		String result (a>0)? "정상" : "비정상";
//		System.out.println(result);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");

		int num = Integer.parseInt(sc.next());
		String grade = (num > 0) ? "정상" : "비정상";
	    System.out.println(grade);
	    sc.close();
	}

}
