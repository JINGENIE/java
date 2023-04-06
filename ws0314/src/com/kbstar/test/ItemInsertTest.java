package com.kbstar.test;

import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.ItemCRUDServiceImpl;

public class ItemInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Item> service = new ItemCRUDServiceImpl();
//		select
		 Item obj = new Item("JIN",300000,3.2);
		try {
			service.register(obj);
			System.out.println("성공");
		} catch (Exception e) {
			System.out.println(e.getMessage());
	
		}
//		try {
//			System.out.println(crudService.get("id06"));
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
////			e.printStackTrace();
//		}
//
//	}

}
}
