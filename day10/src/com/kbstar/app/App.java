package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.Service;
import com.kbstar.service.UserService;

import bank.MakeMessage;

public class App {

	public static void main(String[] args) {
		// DAO dao = new OracleDAO();
		Service<String, UserDTO> service = new UserService();
		// 추상클래스,인터페이스는 객체생성 못함

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input command(q,i,d,u)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			} else if (cmd.equals("i")) {
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input Name...");
				String name = sc.next();
				// data transfer object를 만들어서 해당 객체 전달
				UserDTO user = new UserDTO(id, pwd, name);
				try {
					service.register(user);
				} catch (Exception e) {
						System.out.println(MakeMessage.makeMessage(e.getMessage()));
				}
				// object에 user 넣을 수 있다.
			} else if (cmd.equals("d")) {
				System.out.println("Input ID...");
				String id = sc.next();
				// 해당 아디를 삭제요청하겠다
				try {
					service.remove(id);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
				}
			} else if (cmd.equals("u")) {
				System.out.println("Input ID...");
				String id = sc.next();
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input Name...");
				String name = sc.next();
				// data transfer object를 만들어서 해당 객체 전달
				UserDTO user = new UserDTO(id, pwd, name);
				try {
					service.modify(user);
				} catch (Exception e) {
					System.out.println(MakeMessage.makeMessage(e.getMessage()));
				}
			}
		}
		sc.close();

	}

}
