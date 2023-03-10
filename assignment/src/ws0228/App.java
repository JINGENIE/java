package ws0228;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] employeeArr = new Employee[5];
		employeeArr[0] = new Employee("진" , 300000);
		employeeArr[1] = new Employee("기현" , 300000);
		employeeArr[2] = new Employee("지예" , 300000);
		employeeArr[3] = new Employee("준혁" , 300000);
		employeeArr[4] = new Employee("진만" , 300000);
//		for (int i=0; i<employeeArr.length;i++) {
		
//			
//		}
		Manager[] managerArr = new Manager[5];
		managerArr[0] = new Manager("진" , 300000,1000000);
		managerArr[1] = new Manager("기현" , 300000,1000000);
		managerArr[2] = new Manager("지예" , 300000,1000000);
		managerArr[3] = new Manager("준혁" , 300000,1000000);
		managerArr[4] = new Manager("진만" , 300000,1000000);

		
		for (Manager m:managerArr) {
			System.out.println("담당자별 정보" +m.toString());
			System.out.println("연봉은" + m.getAnnSalary()+ "원");
			System.out.println("세금은" + m.getTax()+ "원");
		}

		for (Employee e:employeeArr) {
			System.out.println("담당자별 정보" +e.toString());
			System.out.println("연봉은" + e.getAnnSalary() + "원");
			System.out.println("세금은" +e.getTax()+ "원");
		}

	}

}
