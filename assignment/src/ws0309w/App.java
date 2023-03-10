package ws0309w;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lotto lotto = new Lotto();
		lotto.makeWinningNumberMoney();

		Scanner scanner = new Scanner(System.in);
		System.out.print("1부터 25까지의 숫자 중 숫자 세개를 입력하세요: ");
		ArrayList<Integer> myNum = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			int num = scanner.nextInt();
			myNum.add(num);
		}

		int ranking = lotto.checkRanking(myNum);
		double prize = lotto.prizeMoney(ranking);
		System.out.println("당첨된 번호는: " + lotto.getWinningNum());
		System.out.println("내가 누른 번호는: " + myNum);
		System.out.println("나의 등수는 : " + ranking);
		System.out.println("당첨금액은: " + prize);
	}
}
