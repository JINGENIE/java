package ws0302;

public class Account {

	private String accNum;
	private String accName;
	private double balance;
	private double rate;
	private String grade;

	public Account() {
		this.accNum = MakeAccountNumber.makeAccNum();
	}

//	public Account(String accNum, String accName, double balance, double rate, String grade) {
//
//		this.accNum = accNum;
//		this.accName = accName;
//		this.balance = balance;
//		this.rate = rate;
//		this.grade = grade;
//	}

	// account num가 자동생성되기때문에 빠진 cons 추가

	public Account(String accName, double balance, double rate, String grade) {
		this();
		this.accName = accName;
		this.balance = balance;
		this.rate = rate;
		this.grade = grade;
	}
	
	
	// getter setter

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterest() {
		return this.balance * this.rate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	//



	// 입금 출금 기능
	public void withdraw(double money) {
		if (money <= 0) {
			System.out.println("출금 금액을 확인해주세요");
			return;
		}
		if (this.balance < money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		this.balance -= money;

	}

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + ", rate=" + rate
				+ ", grade=" + grade + "]";
	}

	public void deposit(double money) {
		if (money <= 0) {
			System.out.println("입금 금액을 확인해주세요");
			return; // 더이상 진행안하고 종료한다.
		}
		this.balance += money;

	}

}