package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.BankServiceImpl;
import com.kbstar.service.UserService;

public class App {

	public static void main(String[] args) {
		BankService<UserDTO, AccountDTO, TransactionDTO, String, String> service = new BankServiceImpl();
		service = new BankServiceImpl();
		CRUDService<String,UserDTO> userService =
				new UserService();
		Scanner sc = new Scanner(System.in);
		while (true) {
			UserDTO user = null;
			System.out.println("Login(l) or Register (r) (q)...");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				break;
			} else if (cmd.equals("r")) {
				System.out.println("register()");
				String id = sc.next();
				String pwd = sc.next();
				String name = sc.next();
				String email = sc.next();
				String contact = sc.next();
				user = new UserDTO(id, pwd, name, email, contact);
				try {
					service.register(user);
					System.out.println("welcome");
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else if (cmd.equals("l")) {
				System.out.println("login()");
				String id = sc.next();
				String pwd = sc.next();
				user = null;
				try {
					user = service.login(id, pwd);
					System.out.println(user);
					System.out.println("welcome로그인성공");
					System.out.println("-------------------");
					while (true) {
						// 계좌개설 이체 조히
						System.out.println("Menu(m,t,a,i,tr,e)");
						String cmn = sc.next();
						if (cmn.equals("e")) {
							break;
							// 여기서 break는 로그아웃과 같은 기능
						} else if (cmn.equals("m")) {
							System.out.println("Makeaccount");
							double balance = Double.parseDouble(sc.next());
							// 금액을 받아서 발란스로 받는다100
							System.out.println(user.getId());
							service.makeAccount(user.getId(), balance);
							System.out.println("make account completed");
						} else if (cmn.equals("t")) {
							System.out.println("transaction");
							String sendAcc= sc.next();
							String receiveAcc= sc.next();
							double balance = Double.parseDouble(sc.next());
							String desc= sc.next();
							service.transaction(sendAcc, receiveAcc, balance, desc);
							System.out.println("Trasaction completed");
						} else if (cmn.equals("a")) {
							System.out.println("select account");
						} else if (cmn.equals("i")) {
							System.out.println("user info");
							String rid = user.getId();
							UserDTO ruser=null;
							ruser = service.getUserInfo(rid);
							System.out.println(ruser);
							
						} else if (cmn.equals("tr")) {
							System.out.println("select transcation");
						}

					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
					e.printStackTrace();
				}

			}

		}
	}

}
