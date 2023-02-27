package array;

public class p102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;

		
		int arr [] = new int[3];
		arr [0] = 10;
		arr [1] = 20;
		arr [2] = 30;

		System.out.println(arr);
		
		for(int i=0; i< arr.length ; i++) {
			System.out.printf("%d \t", arr[i]);
		}
		System.out.println("Type 2");//arr안의 int 형 데이터 끄집어내기
		for(int data:arr) {
			System.out.printf("%d \t", data);
	}

}
}