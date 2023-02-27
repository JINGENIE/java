package array;

import java.util.Arrays;
import java.util.Random;

public class p106 {

	public static void main(String[] args) {

		int arr[] = new int[10];
		Random r = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(99) + 1; // 1���� 9������ ���� ������ ����.

		}

		System.out.println(Arrays.toString(arr));

		// �迭�� Ȧ���� ������ �հ� ����� ���Ͻÿ�

		int sum = 0;
		double avg = 0.0;
		int cnt = 0;

		for (int a : arr) {
			if (a % 2 != 0) {
				sum += a;
				cnt++;
			}
		}

		avg = sum / (cnt * 1.0);
		System.out.printf("%d, %4.2f", sum, avg);
	}
}
