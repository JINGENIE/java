package com.kbstar.app;

import java.util.Scanner;

import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.MakeNewMessage;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;
import com.kbstar.service.ItemService;

public class App2 {

	public static void main(String[] args) {
		// DAO dao = new OracleDAO();
		Service<Integer, ItemDTO> service = new ItemService(); // 인터페이스에 선언을 해서
		// 추상클래스,인터페이스는 객체생성 못함
		// ItemService service = new ItemService();
		SearchService search = new ItemService();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input command(q,i,d,u,s)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;
			} else if (cmd.equals("s")) {
				search.search();

			} else if (cmd.equals("i")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input Name...");
				String name = sc.next();
				System.out.println("Input price...");
				double price = Double.parseDouble(sc.next());
				System.out.println("Input qunatity...");
				int qt = Integer.parseInt(sc.next());

				// data transfer object를 만들어서 해당 객체 전달
				ItemDTO user = new ItemDTO(id, name, price, qt);
				try {
					service.register(user);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(MakeNewMessage.makeMessage(e.getMessage()));
				}
				// object에 user 넣을 수 있다.

			} else if (cmd.equals("d")) {
				System.out.println("Input ID...");
//				int id = Integer.parseInt(sc.next());
//				System.out.println("Input Name...");
//				service.remove(id);

				try {
					int id = Integer.parseInt(sc.next());
					service.remove(id);

				} catch (Exception e) {
					System.out.println(MakeNewMessage.makeMessage(e.getMessage()));
				}

			} else if (cmd.equals("u")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input Name...");
				String name = sc.next();
				System.out.println("Input price...");
				double price = Double.parseDouble(sc.next());

				System.out.println("Input qunatity...");
				int qt = Integer.parseInt(sc.next());

				// data transfer object를 만들어서 해당 객체 전달
				ItemDTO user = new ItemDTO(id, name, price, qt);
				try {
					service.modify(user);
				} catch (Exception e) {
					System.out.println(MakeNewMessage.makeMessage(e.getMessage()));
				}
			}
		}
		sc.close();

	}

}
