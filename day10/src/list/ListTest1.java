package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListTest1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		//1~10 까지의 숫자를 랜덤하게 10개 담으세요
		Random r = new Random();
		for(int i=0; i<=10; i++) {
			int num = r.nextInt(10) + 1;
			list.add(num);
		}
		list.add(5, 100);//0번째에 100넣기
		list.remove(5);
		for(int data:list) {
				System.out.println(data);
		}
//당신은 리스트에 무엇을 담으시겠습니까
	}

}
