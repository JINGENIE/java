package variable;

import java.util.Scanner;

public class P73 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("명령어를 입력하시오(q,i,d,s)");
		String cmd = sc.next(); //입력된 값을 프로그램안으로 가져오겠다는 뜻
		System.out.printf("$s를 입력했습니다.", cmd);
		sc.close(); // close를 해줘야함..
	}

}
 