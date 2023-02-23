package variable;

import java.util.Random;

public class P68 {

	public static void main(String[] args) {
		String s2 = "110";
		String s1 = "10";
		int s2 = Integer.parseInt(s1);
		// api로 가져오는 . 범용적인 api
		int a = 10;
		System.out.println(s2 + a);

		// api이용하여 형변환. 기능적으로 제공해주는
		// String n2 = n1 +"";

		Random r = new Random(); // ctrl + shift + O 임폴트 자동 나옴
									// Ctrl + shift + F 정리
		// api 할때는 임폴트를 하자.
		int rndNum = r.nextInt(10)+1;
		System.out.println(rndNum);
	}

}
