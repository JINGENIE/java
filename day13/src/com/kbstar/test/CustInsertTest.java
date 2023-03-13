package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
//		select
		// Cust cust = new Cust("id70", "pwd02", "tom", 30);
//		try {
//			crudService.get("id06");
//			System.out.println("성공");
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
////			e.printStackTrace();
//		}
		try {
			System.out.println(crudService.get("id06"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}

	}

}
