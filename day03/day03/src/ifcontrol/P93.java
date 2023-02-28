package ifcontrol;

import java.util.Scanner;

public class P93 {

	public static void main(String[] args) {

		// 숫자 4개의 2자리수를 입력받는다.
		// 평균과 합계를 구합니다.

		// 평균이 90이상이면 a
		// 평균이 80이상이면 b
		// 평균이 70이상이면 c
		// 평균이 60이상이면 d
		// 60 미만이면 f

		// 합계, 평균, 학점을 출력하시오
		Scanner sc = new Scanner(System.in);
		int sum= 0;
		float avr =0;
		int ko = 0;
		int en = 0;
		int ma = 0;
		int si = 0;
//		만약 2자리수가 아니면 프로그램 종료
		String grade = "";

//		int ko = sc.nextInt(); 이 표현 하면 위에 선어 안해도 되고 바로 꽂힘

		System.out.print("국어성적 : ");
		ko = Integer.parseInt(sc.next());
		if (ko < 10 || ko >= 100) {
			System.out.println("착오입력으로 프로그램을 종료합니다.");
			return;
		}
	
		System.out.print("영어성적 : ");
		en = Integer.parseInt(sc.next());
		if (en < 10 || en >= 100) {
			System.out.println("착오입력으로 프로그램을 종료합니다.");
			return;
		}

		System.out.print("수학성적 : ");
		ma = Integer.parseInt(sc.next());
		if (ma < 10 || ma >= 100) {
			System.out.println("착오입력으로 프로그램을 종료합니다.");
			return;
		}

		System.out.print("과학성적 : ");
		si = Integer.parseInt(sc.next());
		if (si < 10 || si >= 100) {
			System.out.println("착오입력으로 프로그램을 종료합니다.");
			return;
		}

		sum = ko + en + ma + si;
		avr = (float) (sum / 4.0);

		//싨수와 정수의 연산은실수가 됨.
		
		
//		System.out.println(sum);
//		System.out.println(avr);
		if (avr >= 90) {
			grade = "A";
		} else if (avr >= 80) {
			grade = "B";
		} else if (avr >= 70) {
			grade = "C";
		} else if (avr >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		//grade = ( avr >=90) ? "A" : ( avr >=80) ? "B" :( avr >= 70) ? "C" : ( avr >=60) ? "D" : "F" ;

		System.out.printf("합계 : %d, 평균 : %d, 학접 : %s", sum, avr, grade);

		// System.out.printf("max : %d, min : %d", max, min);
		// 비교해서 둘중 하나 값이 하나 크면 max에 넣고

	}

}
