package whilecontrol;

public class p92 {

	public static void main(String[] args) {
		//�հ� ����� ���Ͻÿ�
		
		int sum = 0;
		double avg = 0.0;
		
		System.out.println("Start....");
		int cnt =0;
		for (int i= 1 ; i <=100 ; i ++) {
			sum += i ;
			cnt++;
		}
			avg = sum / (cnt*1.0);
			System.out.printf("%d,%f \n",sum,avg);
			System.out.println("End...."+cnt);
		}
		
//		
//		System.out.println("Start....");
//		int cnt =0;
//		for (int i = 1; i <= 100; i++) {
//			System.out.println(i);
//			cnt++;
//		}
//		System.out.println("End...."+cnt);
	}


