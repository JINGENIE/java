package test1;



public class App {

	public static void main(String[] args) {
		
		Employee[] employeeArr = new Employee[5];
		employeeArr[0] = new Employee("진" , 350000);
		employeeArr[1] = new Employee("기현" , 200000);
		employeeArr[2] = new Employee("지예" , 330000);
		employeeArr[3] = new Employee("준혁" , 310000);
		employeeArr[4] = new Employee("진만" , 370000);
		
		Manager[] managerArr = new Manager[5];
		managerArr[0] = new Manager("진" , 350000, 100000);
		managerArr[1] = new Manager("기현" , 200000, 100000);
		managerArr[2] = new Manager("지예" , 330000, 100000);
		managerArr[3] = new Manager("준혁" , 310000, 100000);
		managerArr[4] = new Manager("진만" , 370000, 100000);
		
		for(Employee e:employeeArr) {
			System.out.println("인사시스템에 등록된 내용"+ e.toString());
			System.out.println("연봉은"+ e.getAnnSalary() + "세금은"+ e.getTax());
		
		}
		System.out.println("---------------------------------");
		for(Manager m:managerArr) {
			System.out.println("인사시스템에 등록된 내용"+ m.toString());
			System.out.println("연봉은"+ m.getAnnSalary() + "세금은"+ m.getTax());

		}
	}

}
