package p214;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input num.");
		int num = 0;
		// 선언 먼저하고 안에다가 변수 넣기
		try {
			num = Integer.parseInt(sc.next());
			int result = 10 / num;
			System.out.println(result);

		} catch (ArithmeticException e1) {
			System.out.println("분모가 0입니다");
			return;
			//e1.printStackTrace(); 에러 트래킹하는
		} catch (NumberFormatException e2) {
			System.out.println("숫자를 입력하세요");
			return;
		}finally {
			System.out.println("정상일때도, 예외발생할때도 반드시 실행.");
			sc.close();
		}
		//한줄로 버전 
//		} catch (ArithmeticException | NumberFormatException e2) {
//			System.out.println("잘못 입력하셨습니다.");
//		}
//		

//		} catch (Exception e) {
//			System.out.println("잘못 입력하셨습니다.");
//		}



		System.out.println("End app..");
	}
}
