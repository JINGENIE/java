package ifcontrol;

public class P90 {

	public static void main(String[] args) {

		
		int a = 10;
		int b = 20;
		
		//�ΰ��� ���� �ִ� ���� �ּ� ���� ���Ͻÿ�
		
		int max = 0;
		int min = 0;
		//������ ����ϱ� ���� ���� ������ �Ѵ�.
		
		if (a > b) {
			max = a ;
			min = b ;
		}else {
			max = b ;
			min = a ;
		}
		
		
		System.out.printf("max : %d, min : %d",max,min);
		//���ؼ� ���� �ϳ� ���� �ϳ� ũ�� max�� �ְ� 
	}
	
}




