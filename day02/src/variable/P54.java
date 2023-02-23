package variable;

public class P54 {

	public static void main(String[] args) {
		//boolean
		boolean b1 = 10 > 5;

		//정수
		int n1 = 10;
	//	long n2 = 2000000000000L; //L이나 D등으로 표현해준다. 자바에서 정수의 기본형은 int
		long n2 = 0L;
		n2 = 22222222222222222L;
		
		//실수 
				double d1 = 1.0;
			//	float f1 = 1.0; -> 안됨 
				float f1 = 1.0F; //가능
				double d2 = 1/2;
				
				System.out.println(d2);
				
				double d3 = 10.0/3.0;
			System.out.println(d3);
				
				//char
				char c1 ='A';
				System.out.println(c1);
				
				char c2 = 65;
				System.out.println(c2);
				
				
				int n3 = 10;
				double n4 = 10.0;
				
				//int result = n3 + n4; double을 int로바꾸는게 risky
				double result = n3 + n4;

				System.out.println(result);
				
	}
		
		
}
