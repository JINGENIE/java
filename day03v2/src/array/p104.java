package array;

import java.util.Arrays;
import java.util.Random;

public class p104 {

	public static void main(String[] args) {
	

		
		int arr[] = new int[5];
		Random r = new Random();
				
		
		for(int i=0; i< arr.length ; i++) {
			arr[i] = r.nextInt(9)+1; //1���� 9������ ���� ������ ����.
			 
		}
		
		System.out.println(Arrays.toString(arr));
		
		//�迭�� �հ� ����� ���Ͻÿ�
		
//	    int sum = 0;
//		for(int a:arr) {
//		     sum += a;
//		        }
//		double avg =0.0;
//		avg = sum / (arr.length*1.0); 
//		System.out.printf("%d, %4.2f" , sum,avg);
		
		
		//Ȧ����°�� �հ� ����� ���Ͻʽÿ�.
		
		int sum = 0;
		double avg = 0.0;
		int cnt =0;
		
		for(int i=0; i<arr.length;i++) {
			if(i%2 == 0) {
				//�迭�� 0���� �����ϱ⶧����,, 
				 sum += arr[i];
				 cnt ++ ;
			}
		}
		avg = sum / (cnt*1.0); 
		System.out.printf("%d, %4.2f" , sum ,avg);

		}
}

	
