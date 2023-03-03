package inherit2;

public class App2 {

	public static void main(String[] args) {

		// Manager is a Employee
		Employee e = new Manager("100", "jamse", 500, 50);
//		Manager m = new Employee("100", "jamse", 500);

		Employee ea[] = new Employee[5];
		ea[0] = new Employee("100", "jamse", 500);
		ea[1] = new Employee("101", "jamse", 500);
		ea[2] = new Manager("102", "jamse", 500, 50);
		ea[3] = new Manager("103", "jamse", 500, 50);
		ea[4] = new Sales("104", "jamse", 500, "seoul", 0.35);
		
	//	employee의 객체인 ea에 넣었기때문에 Employee에  선언된 함수들만 쓸 수있음
		//폴리모피즘구현하려면 상위클래스 그대로.
		

		for (Employee emp : ea) {
			System.out.println(emp);
//			System.out.println(emp.getAnnSalary());
			System.out.println(emp.getAnnSalary());
			System.out.println(emp.getIncentive());
			
			//이거 할 필요없음
//			if(emp instanceof Sales) {
//				Sales s = (Sales)emp; //객체의 타입캐스트. 세일즈로 바꿔서 사용하겠다/외워서 사용하기
//				System.out.println(s.getIncentive());
			}
		
		System.out.println("-----");
		TaxCal t =new TaxCal();
		double result = t.getTax(ea[3]);

		System.out.println(result);
	
		}

	}

