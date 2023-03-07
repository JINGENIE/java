package bank;

import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Mexception {
		Account acc = null;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input command(c, w, d, s, q)...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye...");
				break;
			} else if (cmd.equals("c")) {
				System.out.println("create account");
				System.out.println("Input Account Info[name,accholder, balance]");
				System.out.println("Input Name");
				String name = sc.next();
				System.out.println("Input Accholder");
				String accHolder = sc.next();
				System.out.println("Input Balance");
				double balance = Double.parseDouble(sc.next());// 얘도 static으로 만들어진 함수구나...
				try {
					acc = new Account(name, accHolder, balance);
				}catch(Mexception le) {
					System.out.println(le.getMessage());
				}
				// acc는 if문 내에서만 사용할 수 있다. 따라서 while문 밖에서 선언해줘야함
				System.out.println(acc);

			} else if (cmd.equals("w")) {
				System.out.println("Withdraw");
				System.out.println("Input Withdraw money");
				double money = Double.parseDouble(sc.next());
				try {
					acc.withdraw(money);
				}catch(Mexception e1){
					System.out.println(e1.getMessage());
				}catch(Lexception e2){
					System.out.println(e2.getMessage());}
					System.out.println(acc);
	
			} else if (cmd.equals("d")) {
				System.out.println("Deposit");
				System.out.println("Input Deposit money");
				double money = Double.parseDouble(sc.next());
				try {
				acc.deposit(money);
				}catch(Mexception e1) {
					System.out.println(e1.getMessage());
				}System.out.println(acc);
				//조회
			} else if (cmd.equals("s")) {
				System.out.println("Select");
				System.out.println(acc.getBalance());
			}
		}
		sc.close();
	}
		
	}


