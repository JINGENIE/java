package com.kbstar.App;

import java.util.List;
import java.util.Scanner;

import com.kbstar.DAO.ItemDAO;
import com.kbstar.DTO.ItemDTO;
import com.kbstar.frame.DAO;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DAO<Integer, ItemDTO> itemDao = new ItemDAO();

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Input command(q,id,u,s,sa)");
			String cmd = sc.next();
			if (cmd.equals("q")) {
				System.out.println("Bye");
				break;

			} else if (cmd.equals("i")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input PWD...");
				String pwd = sc.next();
				System.out.println("Input name...");
				String name = sc.next();
				ItemDTO user = new ItemDTO(id, pwd, name);
				try {
					itemDao.insert(user);
				} catch (Exception e) {
					System.out.println("id가 존재합니다.");
				}

			} else if (cmd.equals("d")) {
				System.out.println("Input ID...");
				String id = sc.next();
				try {
					itemDao.delete(id);
				} catch (Exception e) {
					System.out.println("id가 존재하지 않습니다.");
				}

			} else if (cmd.equals("u")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				System.out.println("Input Name...");
				String pwd = sc.next();
				System.out.println("Input price...");
				String name = sc.next();

				System.out.println("Input qunatity...");
				int qt = Integer.parseInt(sc.next());

				// data transfer object를 만들어서 해당 객체 전달
				ItemDTO user = new ItemDTO(id, pwd, name);
				try {
					itemDao.update(user);
				} catch (Exception e) {
					System.out.println("id가 존재하지 않습니다.");
				}

			} else if (cmd.equals("s")) {
				System.out.println("Input ID...");
				int id = Integer.parseInt(sc.next());
				ItemDTO user = null;
				try {
					user = itemDao.select(id);
					System.out.println(user);
				} catch (Exception e) {
					System.out.println("id가 존재하지 않습니다.");

				}
			} else if (cmd.equals("sa")) {

				List<ItemDTO> list = null;
				try {
					list = itemDao.select();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println("id가 존재하지 않습니다.");
				}
				for (ItemDTO u : list) {
					System.out.println(u);
				}

			}
		}
		sc.close();
	}
}
