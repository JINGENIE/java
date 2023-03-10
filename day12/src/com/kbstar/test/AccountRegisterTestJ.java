package com.kbstar.test;

import java.util.List;

import com.kbstar.dto.AccountDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.AccountService;


public class AccountRegisterTestJ {

	public static void main(String[] args) {
		CRUDService <String, AccountDTO> service = new AccountService();
		AccountDTO obj1 = new AccountDTO("8525281761610",30000,"JINLEE");
		AccountDTO obj2 = new AccountDTO("4004281761610",30000,"JAMES");
		AccountDTO obj3 = new AccountDTO("4428281761610",30000,"HAILY");
	
		
		//-----register-------------------------------------
		try {
			service.register(obj1);
			service.register(obj2);
			service.register(obj3);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		//------getk------------------------------------
		AccountDTO user = null;
		try {
			service.get("4428281761610");
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------
		List<AccountDTO> list = null;
		
		try {
			list=service.get();
			for(AccountDTO u:list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//------------------------------------------
		try {
			service.remove("8525281761610");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		}
	}


