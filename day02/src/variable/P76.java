package variable;

import java.util.Random;
import java.util.Scanner;

public class P76 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오(10~100)");
		int cmd = sc.nextInt(); //타입변환 해도됨
	    Random r = new Random(); 
	    int printNum = r.nextInt(cmd);
	    System.out.println(printNum);
	    
//System.out.println(rndNum);
//		String cmd = sc.next(); //입력된 값을 프로그램안으로 가져오겠다는 뜻
//		//10에서 100사이의 정수를 입력 받는다
//		// 1부터 입력받은 숫자까지의 범위에서 랜덤한 숫자를 발생하시오
//		sc.close(); // close를 해줘야함..
	    
	    
//	    Scanner sc = new Scanner(System.in);
//		System.out.println("숫자를 입력하시오(10~100)");
//		String cmd = sc.next();
//		Random r = new Random();
//		int num = Integer.parseInt(cmd);
//		int rndNUM = r.nextInt(num)+1;
//		System.out.println(rndNum);
//		sc.close();
	}

}
