package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListTest2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//List<Integer> list = new LinkedList<Integer>();
		// 인터페이스는 객체를 생성할 수 없다.
		// 1~ 10까지의 숫자를 20개 입력한다.
		// 단 while 문을 이용한다.

		Random r = new Random();

		while (list.size() < 20) {
			int num = r.nextInt(10) + 1;
			list.add(num);
			// list 정보를 출력한다.
		}
		System.out.println(list.size());
		System.out.println("-------");
		for (int data : list) {
			System.out.println(data);
		}
	}

}
