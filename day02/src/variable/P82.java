package variable;

import java.util.Random;
import java.util.Scanner;

//삼항연산
public class P82 {

	public static void main(String[] args) {
		
		int score = 79;
		String grade =  (score >= 90) ? "A" : (score >= 80) ? "B" : "F";
		System.out.println(grade);
	}

}
