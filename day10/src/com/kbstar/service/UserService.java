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
	public void register(UserDTO v) throws Exception {
		System.out.println("Security Check.."); //데이터 베이스들어가기전에 filtering
		dao.insert(v);//여기서 try catch까지 하면 app까지 가지않음
		System.out.println("Send mail..");
		System.out.println("Send SMS..");
	}
		
		
//	@Override
//	public void register(UserDTO v) throws Exception {
//		System.out.println("Security Check.."); //데이터 베이스들어가기전에 filtering
//		try {
//			dao.insert(v);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			throw e;
//		}//여기서 try catch까지 하면 app까지 가지않음
//		System.out.println("Send mail..");
//		System.out.println("Send SMS..");
//	}


//	@Override
//	public void remove(String k) throws Exception {
//		dao.delete(k); //가다가 문제가 생기면 던지기 . exception생기면 실행안됨
//		System.out.println("Send sms..");
//		
//	}
//	
	
	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			//log
			throw e;
		} //가다가 문제가 생기면 던지기 . exception생기면 실행안됨
		System.out.println("Send sms..");
		//서비스단에서 로그 분석이 가능 
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try {
			dao.update(v);
		} catch (Exception e) {
			throw e;
		}
		System.out.println("Send sms..");
	}

//	@Override
//	public void search() {
//		// TODO Auto-generated method stub
//		
//	}
	
}
