package ifcontrol;

public class P91 {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		int c = 15;

		// �� ���� �ִ� ���� �ּ� ���� ���Ͻÿ�

		int max = 0;
		int min = 0;
		// ������ ����ϱ� ���� ���� ������ �Ѵ�.


		
	//Ǯ�� 1
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
		
	//Ǯ��2
		
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

		
		//�亯 3
//		max = (a > b) ? ((a > c)? a : c) : (b > c)? b : c;
//		min = (b > a) ? ((a < c)? a : c) : (b < c)? b : c;
		
		
		
	//	max = Math.max(max, b)
		
		//java api�� �̿���
		if(a>b) {
			max = Math.max(a, c);
			min = Math.min(b, c);
			
		}else {
			max = Math.max(b, c);
			min = Math.min(a, c);
		}
		
		System.out.printf("max : %d, min : %d", max, min);
		// ���ؼ� ���� �ϳ� ���� �ϳ� ũ�� max�� �ְ�
	}

}
