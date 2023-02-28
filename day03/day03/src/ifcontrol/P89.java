package ifcontrol;

public class P89 {

	public static void main(String[] args) {
//		String grade = "IP";
//		String gender = "M";
//		System.out.println("Start ...");
//		
//		double sum = 90.0;
//		
//	}
//}
//		
		
		
//		
//		if(grade.equals("VIP")) {
//			System.out.println("실행 ...");
//	//		return; // 끝내라 라는 의미
//		}
//		if (gender.equals("M")) {
//			
//			System.out.println("Male ...");
//		}
//		else {		
//			System.out.println("Female ...");
//			}
//		
//		//
//		
//		if(sum >= 90) {
//			grade = "VIP";
//		}else if (sum >= 70.0) {
//			grade = "GOLDE";
//		}else {
//			grade = "SILVER";
//		}

//		
//		
	
		
//		if( (sum >= 90) && (gender.equals( male )) {	
//			grade = "MVIP";
//			}
//		else if( (sum >= 90) && (gender.equals( Female ) {	
//			grade = "FVIP";
//			}
//		else if( (sum >= 80) && (gender.equals( male ) {	
//				grade = "MGOLD";
//				}
//		
//		
		
//		//강사님 답안
//		String grade = "IP";
//		String gender = "M";
//		System.out.println("Start ...");
//		
//		
//		double sum = 90.0;
//		
//		
//		if (gender.equals("M")) {
//			if(sum>=90) {
//				grade = "MVIP";
//			}else if (sum >=80) {
//				grade = "MGOLD";
//				
//			}else {
//				grade ="MNORMAL";
//			}
//		}
//		else{
//				if(sum>=90) {
//					grade = "FVIP";
//				}else if (sum >=80) {
//					grade = "FGOLD";
//					
//				}else {
//					grade ="FNORMAL";}
//		}
		
		
//		String grade = (sum >= 90) ? "VIP" : (sum >= 70) ? "Gold" : "Silver" ;
//		System.out.println(grade);
		
		String gender1 = "M";
		double sum1 = 73.0;
		String grade ;
		
//		grade = (gender1.equals("M") && (sum1 >=90) ? "MVIP" :  (sum1 >=80) ? "MGOLD" : "MNORMAL" ); 
//		grade = (gender1.equals("F") && (sum1 >=90) ? "FVIP" :  (sum1 >=80) ? "FGOLD" : "FNORMAL" );		
//		
//		
//				
//		
		
		
		grade = (gender1.equals("M")) ?
		(sum1 >=90) ? "MVIP" :  (sum1 >=80) ? "MGOLD" : "MNORMAL"  :
		(sum1 >=90) ? "FVIP" :  (sum1 >=80) ? "FGOLD" : "FNORMAL" ;	
		
		
		System.out.println(grade);
		
		
//		
//		switch(grade) {
//		case "FVIP" :
//		case "MVIP" :
//			sum1 += 100;
//			break;
//			
//			
//		case "FGOLD" :		
//		case "MGOLD" :
//			sum1 += 90;
//			break;
//			
//			
//		default :
//			sum1 +=10;
//			
//		}
//		
////		VIP 가 받는선물 VIP. GOLD
////		GOLD 가 받는 선물 GOLD NORMAL
//	
//		System.out.printf("%s","%s","4.2f \n", grade,gender1,sum1);
//		//실수f
//		System.out.println("End ...");
	}
	
}




