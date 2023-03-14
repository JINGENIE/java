package com.kbstar.test;

import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CustCRUDServiceImpl;

public class CustInsertTest {

	public static void main(String[] args) {
		CRUDService<String, Cust> crudService = new CustCRUDServiceImpl();
//		select
		 Cust cust = new Cust("id70", "pwd02", "tom", 30);
		try {
			crudService.register(cust);
			System.out.println(cust);
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
