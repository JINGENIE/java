package oop2;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Employee {


		private String id ;
		private String name;
		private int salary;
		//in capsulation 한번 선언을 하면 바뀌지않음
		
		//자동으로 생성되는 
		public Employee() {
			this.id="temp0001";
			this.name = "temp";
			this.salary=100000000;
		}
		
		
		//get set 의미가 안와닿음 
		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;//set이 변경하겠다는 의미 
			//incapsulation하지만 접근을 한정적으로 허용할 수 있다.
		}



		public String getId() {
			return id;
		}



		public int getSalary() {
			return salary;
		}



		public Employee(String id, String name, int salary) {
			//용도: 사용자의 아이디 이름 샐러리를 나타내는
			this.id = id;
			this.name = name;
//			this.salary = salary;
			if(salary < 0 ){
				this.salary= 0;
			}else {
				this.salary = salary;
			}
		} //그 주소에 넣어주겠다.
		
//		public Employee(String id, String name, int salary) {
//			//
//			id = id;
//			name = name;
//			salary = salary;
//		} //그 주소에 넣어주겠다.
//		
//		
		public Employee(String name, int salary) {
			this("10000",name,salary);
			
			//this 나와 동일한 컨스트럭터를 호출한다. ("10000",name,salary)세개가 있는 콘스트럭터가 자동으로 호출됨
			//용도: 이름과 샐러리를 부여하면 자동적으로 아이디가 만들어지는 컨스트럭트
			
			//아래내용: 원래내용인데 상단내용 설명위해 주석처리
//			Random r = new Random();
//			this.id = String.valueOf(r.nextInt(100)+1) ;
	
		}
			
		public int getAnnSalary() {
			return this.salary *12;
		}
		
		public double getTax() {
			return this.salary * 0.175 ;
		}



		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		
		
	

}
		


