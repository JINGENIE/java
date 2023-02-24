package ifcontrol;

public class P90 {

	public static void main(String[] args) {

		
		int a = 10;
		int b = 20;
		
		//두가지 수의 최대 값과 최소 값을 구하시오
		
		int max = 0;
		int min = 0;
		//변수를 사용하기 위해 먼저 선언을 한다.
		
		if (a > b) {
			max = a ;
			min = b ;
		}else {
			max = b ;
			min = a ;
		}
		
		
		System.out.printf("max : %d, min : %d",max,min);
		//비교해서 둘중 하나 값이 하나 크면 max에 넣고 
	}
	
}




