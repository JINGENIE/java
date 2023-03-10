package ws0302;

import ws0228.Manager;

public class App {

	public static void main(String[] args) {
		System.out.println("문제)6개의 계좌 정보를 출력 하시오");
//		
		Account[] accArr = new Account[6];
		accArr[0] = new Account("james1", 10000, 0.35, "VIP");
		accArr[1] = new Account("james2", 10000, 0.45, "GOLD");
		accArr[2] = new Account("james3", 10000, 0.55, "SIVER");
		accArr[3] = new Account("james4", 10000, 0.15, "GOLD");
		accArr[4] = new Account("james5", 10000, 0.28, "SIVER");
		accArr[5] = new Account("james6", 10000, 0.31, "VIP");

//		 모든 계좌의 잔액과 현재 이자금액을 출력 하시오

		for (Account acc : accArr) {
			System.out.println("" + acc.toString());
			System.out.println("모든 계좌의 잔액은 " + acc.getBalance() + "현재 이자금액은 " + acc.getInterest());

		}

		System.out.println("문제)VIP들의 잔액의 합과 평균을 출력 하시오");
		double vipSum = 0.00;
		int cnt = 0;
		for (int i = 0; i < accArr.length; i++) {
			if (accArr[i].getGrade() == "VIP") {
				vipSum += accArr[i].getBalance();
				cnt++;
			} else {
				continue;
			}
		}

		double avr = vipSum / cnt;
		System.out.printf("VIP고객의 잔액 합계는 %4.2f이고, 평균은 %4.2f입니다.", vipSum, avr);

	}

}
