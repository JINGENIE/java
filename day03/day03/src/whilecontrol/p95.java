package whilecontrol;

//¦������ ���ϱ�

public class p95 {

	public static void main(String[] args) {
		System.out.println("Start....");
		int i = 1;
		int sum = 0;
		double avg = 0.0;
		int cnt = 0;

		while (i <= 10) {

			if (i % 2 == 0) {
				sum += i;

				cnt++;
			}

		
			if (i == 8) {
				break;
			}
			i++;
		}
		avg = (sum * 1.0) / cnt;
		System.out.printf("%d,%f \n", sum, avg);
		System.out.println("End....");
		System.out.println("End....");
	}

}

//itneger i�� scope�� �ٸ���. 
//for������ �� ��������