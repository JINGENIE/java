package ifcontrol;

import java.util.Scanner;

public class P93 {

	public static void main(String[] args) {

		// ���� 4���� 2�ڸ����� �Է¹޴´�.
		// ��հ� �հ踦 ���մϴ�.

		// ����� 90�̻��̸� a
		// ����� 80�̻��̸� b
		// ����� 70�̻��̸� c
		// ����� 60�̻��̸� d
		// 60 �̸��̸� f

		// �հ�, ���, ������ ����Ͻÿ�
		Scanner sc = new Scanner(System.in);
		int sum= 0;
		float avr =0;
		int ko = 0;
		int en = 0;
		int ma = 0;
		int si = 0;
//		���� 2�ڸ����� �ƴϸ� ���α׷� ����
		String grade = "";

//		int ko = sc.nextInt(); �� ǥ�� �ϸ� ���� ���� ���ص� �ǰ� �ٷ� ����

		System.out.print("����� : ");
		ko = Integer.parseInt(sc.next());
		if (ko < 10 || ko >= 100) {
			System.out.println("�����Է����� ���α׷��� �����մϴ�.");
			return;
		}
	
		System.out.print("����� : ");
		en = Integer.parseInt(sc.next());
		if (en < 10 || en >= 100) {
			System.out.println("�����Է����� ���α׷��� �����մϴ�.");
			return;
		}

		System.out.print("���м��� : ");
		ma = Integer.parseInt(sc.next());
		if (ma < 10 || ma >= 100) {
			System.out.println("�����Է����� ���α׷��� �����մϴ�.");
			return;
		}

		System.out.print("���м��� : ");
		si = Integer.parseInt(sc.next());
		if (si < 10 || si >= 100) {
			System.out.println("�����Է����� ���α׷��� �����մϴ�.");
			return;
		}

		sum = ko + en + ma + si;
		avr = (float) (sum / 4.0);

		//����� ������ �������Ǽ��� ��.
		
		
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

		System.out.printf("�հ� : %d, ��� : %d, ���� : %s", sum, avr, grade);

		// System.out.printf("max : %d, min : %d", max, min);
		// ���ؼ� ���� �ϳ� ���� �ϳ� ũ�� max�� �ְ�

	}

}
