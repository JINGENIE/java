package array;

import java.util.Arrays;
import java.util.Random;

public class p114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temp[] = new int [5];
		int arr[][]= new int [5][5];
		//가로 5 세로 5
		
		Random r = new Random();
		
		for(int i=0; i < arr.length ;i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = r.nextInt(9)+1;
				//i 가 1일때 j=0, 1, 2, 3, 4 네번 돈다
				
			}
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i=0; i<arr.length; i++) {
			for(int j=0; j < arr[i].length; j++) {
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println("");
		}
		//위의 내용을 for each로 변경
		
		
		for(int a[]: arr)  {
			for(int data: a) {
				System.out.printf("%d\t", data);
				
			}
			System.out.println("");
		}
	}

}
