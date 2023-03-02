//package bank;
//
//import java.util.Scanner;
//
//public class App2 {
//
//	public static void main(String[] args) {
//		Account acc = null;
//
//		Scanner sc = new Scanner(System.in);
//		while (true) {
//			// 무한루프를 돌리기
//			System.out.println("Input Commant(c,w,d,s,q)..");
//			String cmd = sc.next();
//			if (cmd.equals("q")) {
//				System.out.println("Bye,,,");
//				break;
//			} else if (cmd.equals("c")) {
//				System.out.println("Create Account:");
//				System.out.println("Input Account Info[name,balance]");
//				System.out.println("Input name");
//
//				String name = sc.next();
//
//				System.out.println("Input balance");
//
////				double balance = sc.nextDouble();
//				double balance = Double.parseDouble(sc.next());
//				acc = new Account(name, balance);
//				System.out.println(acc); // (acc)뒤에 to string 생략된.
//
//			} else if (cmd.equals("w")) {
//				System.out.println("Withdraw:");
//
//				System.out.println("Input Withdraw Money");
//				double money = Double.parseDouble(sc.next());
//				acc.withdraw(money);
//
//				System.out.println("acc");
//
//			} else if (cmd.equals("d")) {
//				System.out.println("Deposit");
//
//				System.out.println("Input Withdraw Money");
//				double money = Double.parseDouble(sc.next());
//				acc.deposit(money);
//				System.out.println(acc);
//
//			} else if (cmd.equals("e")) {
//				System.out.println("Select:");
//				System.out.println(acc);
//			}
//
//		}
//
//		sc.close();
//
//	}
//
//}
package bank;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
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
				System.out.println("Input Account Info[name, balance]");
				System.out.println("Input Name");
				String name = sc.next();
				System.out.println("Input Balance");
				double balance = Double.parseDouble(sc.next());// 얘도 static으로 만들어진 함수구나...
				acc = new Account(name, balance);// acc는 if문 내에서만 사용할 수 있다. 따라서 while문 밖에서 선언해줘야함
				System.out.println(acc);

			} else if (cmd.equals("w")) {
				System.out.println("Withdraw");
				System.out.println("Input Withdraw money");
				double money = Double.parseDouble(sc.next());
				acc.withdraw(money);
			} else if (cmd.equals("d")) {
				System.out.println("Deposit");
				System.out.println("Input Deposit money");
				double money = Double.parseDouble(sc.next());
				acc.deposit(money);
			} else if (cmd.equals("s")) {
				System.out.println("Search");
				System.out.println(acc);
			}
		}
		sc.close();
	}

}