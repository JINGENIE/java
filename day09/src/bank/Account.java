package bank;

public class Account {
	private String accNo;
	private String name;
	private String accHolder;
	private double balance;

	// Constructor - 음수 예외상황
	public Account() {
		this.accNo = MakeAccountNumber.makeAccNum();
	}

	public Account(String name, String accHolder, double balance) throws Mexception {
		this();
		this.name = name;
		this.accHolder = accHolder;
		if (balance < 0) {
			throw new Mexception("잔액이 음수입니다.");
		}
		this.balance = balance;
	}

	public Account(String accNo, String name, String accHolder, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.accHolder = accHolder;
		this.balance = balance;
	}

	// 계좌 정보조회

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", accHolder=" + accHolder + ", balance=" + balance + "]";
	}

	// 잔액 조회
	public double getBalance() { // 잔액을 조회할 수 있다.
		return balance;
	}

	// 입금 - 음수예외상황
	public void deposit(double money) throws Mexception {
		if (money < 0) {
			throw new Mexception("음수");
		}
		balance += money;
		}

	// 출금 - 잔액부족 예외상황, 음수예외상황
	public void withdraw(double money) throws Lexception, Mexception {
		if (money < 0) {
			throw new Mexception("음수");
		}
		if (balance < money) {
			throw new Lexception("잔액부족");
		}
		balance -= money;
	}
}
