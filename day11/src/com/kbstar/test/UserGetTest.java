package com.kbstar.test;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.UserService;

public class UserGetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CRUDService<String, UserDTO>service= new UserService();
		UserDTO obj = 
				new UserDTO("id01", "pwd01", "james", "jj@naver.com", "010-1231-1234");
	
		try {
			service.register(obj);

		} catch (Exception e) {
			
			System.out.println(e.getMessage());
	}
		UserDTO user = null;
		
		try {
			service.get("id01");
			System.out.println(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
