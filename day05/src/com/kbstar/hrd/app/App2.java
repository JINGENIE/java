package com.kbstar.hrd.app;



import com.kbstar.hrd.Manager;

public class App2 {


		public static void main(String[] args) {
			Manager mng = new Manager("1000", "이똥", 500, 100); //오버로드
			System.out.println(mng.toString());
			System.out.println(mng.getSalary());
			System.out.println(mng.getTax());
			System.out.println(mng.getAnnSalary());
			System.out.println(mng.getAnnTax());
			System.out.println(mng.getAnnTax());
			
			
			System.out.println("===================================");
		
			Manager managers[] = new Manager[3];
	
			
			
			managers[0] = new Manager("301","정수아", 500, 50);
			managers[1] = new Manager("302","김수아", 510 , 55);
			managers[2] = new Manager("303","이수아", 520, 65);
			
			for(Manager mn:managers) {
				System.out.println(mn);
				System.out.println(mn.getTax());
				System.out.println(mn.getAnnSalary());
				System.out.println(mn.getAnnTax());
				
			}
		}

	

	}


