package array;

public class ws {

	public static void main(String[] args) {
		// 1~ 100������ ���� ��
		/// 3�� ����� �հ� ����� ���Ͻÿ�
		/// 4�� ����� �հ� ����� ���Ͻÿ�
		/// 7�� ����� �հ� ����� ���Ͻÿ�

		// ���� �������ֱ�/
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
