package array;

public class ws {

	public static void main(String[] args) {
		// 1~ 100까지의 숫자 중
		/// 3의 배수의 합과 평균을 구하시오
		/// 4의 배수의 합과 평균을 구하시오
		/// 7의 배수의 합과 평균을 구하시오

		// 먼저 선언해주기/
		int i = 1;
		int sum3 = 0;
		int sum4 = 0;
		int sum7 = 0;
		double avg3 = 0.0;
		double avg4 = 0.0;
		double avg7 = 0.0;
		int cnt3 = 0;
		int cnt4 = 0;
		int cnt7 = 0;
		
		//
		
		

		for (i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sum3 += i;
				cnt3++;
			} 
			
			if (i % 4 == 0) {
				sum4 += i;
				cnt4++;
			} if (i % 7 == 0) {
				sum7 += i;
				cnt7++;

			}

		
		}
		avg3 = (sum3 * 1.0) / cnt3;
		avg4 = (sum4 * 1.0) / cnt4;
		avg7 = (sum7 * 1.0) / cnt7;
		
		System.out.printf("%d,%f \n", sum3, avg3);
		System.out.printf("%d,%f \n", sum4, avg4);
		System.out.printf("%d,%f \n", sum7, avg7);

	}
}
