package ifcontrol;

public class P91 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 15;

		// 세 수의 최대 값과 최소 값을 구하시오

		int max = 0;
		int min = 0;
		// 변수를 사용하기 위해 먼저 선언을 한다.


		
	//풀이 1
		if (a >= b) {
			max = a;
			min = b;
		} else {
			max = b;
			min = a;
		}
		if (c > max)
			max = c;
		if (c < min)
			min = c;
		
	//풀이2
		
		if(a > b) {
			max = a;
			min = b;
			if (a < c) {
				max =c;
			}else {
				if(b>c) {
					min =c;
				}
			}
		}else {
			max =b;
			min = a;
			if(b<c) {
				max= c;
				
			}else {
				if(b>c) {
					min=c;
				}
			}
		}

		
		//답변 3
//		max = (a > b) ? ((a > c)? a : c) : (b > c)? b : c;
//		min = (b > a) ? ((a < c)? a : c) : (b < c)? b : c;
		
		
		
	//	max = Math.max(max, b)
		
		//java api를 이용함
		if(a>b) {
			max = Math.max(a, c);
			min = Math.min(b, c);
			
		}else {
			max = Math.max(b, c);
			min = Math.min(a, c);
		}
		
		System.out.printf("max : %d, min : %d", max, min);
		// 비교해서 둘중 하나 값이 하나 크면 max에 넣고
	}

}
