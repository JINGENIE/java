package ifcontrol;

public class P84 {

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
//			System.out.println("���� ...");
//	//		return; // ������ ��� �ǹ�
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
		
		//����� ���
		String grade = "IP";
		String gender = "M";
		System.out.println("Start ...");
		
		
		double sum = 90.0;
		
		
		if (gender.equals("M")) {
			if(sum>=90) {
				grade = "MVIP";
			}else if (sum >=80) {
				grade = "MGOLD";
				
			}else {
				grade ="MNORMAL";
			}
		}
		if (gender.equals("F")) {
				if(sum>=90) {
					grade = "FVIP";
				}else if (sum >=80) {
					grade = "FGOLD";
					
				}else {
					grade ="FNORMAL";}
		}
			
		switch(grade) {
		case "FVIP" :
		case "MVIP" :
			sum += 100;
			break;
			
			
		case "FGOLD" :		
		case "MGOLD" :
			sum += 90;
			break;
			
			
		default :
			sum +=10;
			
		}
//		
//		VIP �� �޴¼��� VIP. GOLD
//		GOLD �� �޴� ���� GOLD NORMAL
	
		System.out.printf("%s","%s","4.2f \n", grade,gender,sum);
		//�Ǽ�f
		System.out.println("End ...");
	}
	
}




