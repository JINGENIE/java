package ws0309w;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Lotto {
	private HashSet<Integer> winningNum = new HashSet<>();;
	private double prizeMoney;

	public void makeWinningNumberMoney() {

		Random rand = new Random();
		while (winningNum.size() < 3) {
			int num = rand.nextInt(25) + 1;
			winningNum.add(num);
		}
		prizeMoney = (rand.nextDouble() * 20000000) + 1;
	}

	public int checkRanking(ArrayList<Integer> myNum) {
		int count = 0;
		for (int num : myNum) {
			if (winningNum.contains(num)) {
				count++;
			}
		}
		switch (count) {
		case 3:
			return 1;
		case 2:
			return 2;
		case 1:
			return 3;
		default:
			return 4;
		}
	}

	public double prizeMoney(int grade) {
		switch (grade) {
		case 1:
			return prizeMoney;
		case 2:
			return prizeMoney * 0.3;
		case 3:
			return prizeMoney * 0.2;
		default:
			return 0;
		}
	}

	public HashSet<Integer> getWinningNum() {
		return winningNum;
	}

}
