package com.kbstar.dto;

public class AccountDTO {
	private String accNum;
	private String accName;
	private double balance;

	public AccountDTO() {
		// MakeAccountNumber makenum = new MakeAccountNumber();
	}

	public AccountDTO(String accNum, String accName, double balance) {
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
