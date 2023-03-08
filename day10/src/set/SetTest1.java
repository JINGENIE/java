package set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest1 {

	public static void main(String[] args) {
		//set은 중복 허용 x
		Set<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		
//		for(int i = 0; i<10; i++) {
//			int num = r.nextInt(10)+1;
//			set.add(num);
//			
//		}
		while (set.size() < 10) {
			int num = r.nextInt(10) + 1;
			set.add(num);
		}
		
		System.out.println(set.size());
		System.out.println("-----------------------");
		for (int data :set) {
			System.out.println(data);
		}
		}

}
