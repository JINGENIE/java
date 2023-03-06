package com.kbstar.service;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Service;

public class UserService implements Service<String, UserDTO> {

	DAO<String, UserDTO> dao;//서비스는  DAO를 통해서.들어가니까..
		public UserService() {
			dao = new UserDAO();
		}
		
	@Override
	public void register(UserDTO v) {
		System.out.println("Security Check.."); //데이터 베이스들어가기전에 filtering
		dao.insert(v);
		System.out.println("Send mail..");
		System.out.println("Send SMS..");
	}

//	@Override
//	public void delete(String k) {
//		dao.delete(k);
//		System.out.println("Send mail..");
//	}
//
//	@Override
//	public void update(UserDTO v) {
//		dao.update(v);
//		System.out.println("Send mail..");
//		
//	}

	@Override
	public void remove(String k) {
		dao.delete(k);
		System.out.println("Send sms..");
		
	}

	@Override
	public void modify(UserDTO v) {
		dao.update(v);
		System.out.println("Send sms..");
	}
	
}
