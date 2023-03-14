package com.kbstar.service;

import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;

public class CustCRUDServiceImpl implements CRUDService<String, Cust> {

	DAO<String, String, Cust> dao;
	
	public CustCRUDServiceImpl() {
		dao = new CustDaoImpl();
		}
	
	@Override
	public void register(Cust v) throws Exception {
		// 데이터검증
		//DB입력
		try {
			dao.insert(v);
		}catch(Exception e) {
			if(e instanceof SQLIntegrityConstraintViolationException) {
				throw new Exception ("id가 중복되었습니다.");
			}else {
				throw new Exception ("시스템 장애입니다.");
			}
			
		}
	
		//EMAIL, SMS 전송
		
	}

//	@Override
//	public void modify(Cust v) throws Exception {
//		try {
//			dao.update(v);
//		}catch(Exception e) {
////			if(e instanceof errorcode) {
//				throw new Exception ("업데이트할 값이 없습니다.");
//			}else 
//				throw new Exception ("시스템 장애입니다.");
//			}
//		
//	

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			
			if(e instanceof SQLRecoverableException) {
				new Exception("시스템장애");
			}else {
				new Exception("해당 id가 존재하지 않습니다.");
			}
		}
		
	}

	@Override
	public Cust get(String k) throws Exception {
//		Cust cust = null;
//		try {
//			dao.select(k);
//		} catch (Exception e) {
//			if(e instanceof SQLRecoverableException ) {
//				throw new Exception("시스템장애");
//			}else {
//				throw new Exception("조회내용이 없습니다.");
//			}
//		}
//		System.out.println("Dirver Loading 성공!");
//		return cust;

		Cust cust = null;
		try {
		cust = dao.select(k);
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
			 throw new Exception("시스템 장애입니다.");
			}else {
				throw new Exception("ID가 존재하지 않습니다");
			}
		}
		return cust;
	}

	@Override
	public List<Cust> get() throws Exception {
		List<Cust> list = null;
		
		try{
			list= dao.selectAll();
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				 throw new Exception("시스템 장애입니다.");
			}else {
//					throw new Exception("ID가 존재하지 않습니다");
//				}
		}
		
		

	}return list;
	}
	@Override
	public void modify(Cust v) throws Exception {
		try {
		dao.update(v);}
		catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				throw new Exception("시스템장애.");
				
			}else {
				throw new Exception("해당 id가 존재하지 않습니다.");
			}
			
		}
		
	}

}
