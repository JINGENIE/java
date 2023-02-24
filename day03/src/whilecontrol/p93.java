package whilecontrol;

public class p93 {

	public static void main(String[] args) {
		System.out.println("Start....");
		int i = 1;
		int sum = 0;
		double avg = 0.0;

		while (i <= 100) {
			System.out.println(i);
			sum += i;
			i ++;
		} 
		avg = (sum*1.0) /( i-1);
		System.out.printf("%d,%f \n",sum,avg);
		System.out.println("End....");
		System.out.println("End....");
	}

}

//itneger i의 scope가 다르다. 
//for문에서 더 갖혀있음