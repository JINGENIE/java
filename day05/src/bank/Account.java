package bank;

public class Account {
	private String accNum;
	private String accName;
	private double balance;

	public Account() {
		//MakeAccountNumber makenum = new MakeAccountNumber();
		this.accNum = MakeAccountNumber.makeAccNum();
		//static으로 만들면 객체를매번 만들지않고... 쓸 수있다. 
	}

	public Account(String accName, double balance) {
		this();
		this.accName = accName;
		this.balance = balance;
//		생성자 (name, balance)만 받는걸로 또 만든 이유는 accnum을 입력할때 
//		저희가 지정하는건 이상하다 해서 accnum은 자동으로 만들어지는걸로 받고 
//		두개만 입력받는거 만든다
	}

	public Account(String accNum, String accName, double balance) {
		this.accNum = accNum;
		this.accName = accName;
		this.balance = balance;
	}

	

	@Override
	public String toString() {
		return "Account [accNum=" + accNum + ", accName=" + accName + ", balance=" + balance + "]";
	}

	public double getBalance() { // 잔액을 조회할 수 있다.
		return balance;
	}

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

	public void deposit(double money) {
		if (money <= 0) {
			System.out.println("입금 금액을 확인해주세요");
			return; // 더이상 진행안하고 종료한다.
		}
		this.balance += money;

	}

}
