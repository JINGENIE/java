package ifcontrol;

public class P85 {

	public static void main(String[] args) {
		String grade = "IP";
		String gender = "M";
		System.out.println("Start ...");
		
		double sum = 90.0;
		
		
		
		
		
		
		if(grade.equals("VIP")) {
			System.out.println("실행 ...");
	//		return; // 끝내라 라는 의미
		}
		if (gender.equals("M")) {
			
			System.out.println("Male ...");
		}
		else {		
			System.out.println("Female ...");
			}
		
		//
		
		if(sum >= 90) {
			grade = "VIP";
		}else if (sum >= 70.0) {
			grade = "GOLDE";
		}else {
			grade = "SILVER";
		}
		System.out.printf("%s, %s, %4.2f \n", grade,gender,sum);
		//실수f
		System.out.println("End ...");
	}

}
