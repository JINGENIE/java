package com.kbstar.service;

import java.sql.SQLException;
import java.sql.SQLRecoverableException;
import java.util.List;

import com.kbstar.dao.CartDaoImpl;
import com.kbstar.dao.CustDaoImpl;
import com.kbstar.dto.Cart;
import com.kbstar.dto.Cust;
import com.kbstar.frame.CRUDService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeItemNumber;

public class CartCRUDServiceImpl implements CRUDService<String, Cart> {
	DAO<String, String, Cart> dao;

	//
	public CartCRUDServiceImpl() {
		dao = new CartDaoImpl();
	}

	@Override
	public void register(Cart v) throws Exception {

		try {
			String id = MakeItemNumber.makeCartNum();
			v.setId(id);
			dao.insert(v);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("id가 중복 되었습니다.");
			} else {
				e.printStackTrace();
				throw new Exception("시스템 장애입니다.");

			}
		}
	}
//
//	@Override
//	public void modify(Cart v) throws Exception {
//		try {
//			dao.update(v);
//		} catch (Exception e) {
//			if (e instanceof SQLRecoverableException) {
//				throw new Exception("system error");
//			} else {
//				throw new Exception("there are no error");
//			}
//		}
//
//	}
	@Override
	public void modify(Cart v) throws Exception {
		try {
			dao.update(v);
		} catch (SQLRecoverableException e) {
			throw new Exception("서비스 장애.");
		} catch (SQLException e1) {
			e1.printStackTrace();
			throw new Exception("id가 없습니다.");
		} catch (Exception e2) {
			e2.printStackTrace();
			throw new Exception("예상치 못한 오류입니다.");
		}
	}

	@Override
	public void remove(String k) throws Exception {
		try {
			dao.delete(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템장애");
			} else {
				throw new Exception("해당 id가 존재하지 않습니다.");
			}
		}
	}

	@Override
	public Cart get(String k) throws Exception {
		Cart cart = null;
		try {
			cart = dao.select(k);
		} catch (Exception e) {
			if (e instanceof SQLRecoverableException) {
				throw new Exception("시스템 장애입니다.");
			} else {
				throw new Exception("ID가 존재하지 않습니다");
			}
		}
		return cart;
	}

	@Override
	public List<Cart> get() throws Exception {
		List<Cart> list = null;
		
		try{
			list= dao.selectAll();
		}catch(Exception e) {
			if(e instanceof SQLRecoverableException) {
				 throw new Exception("시스템 장애입니다.");
			}else {
				throw new Exception("ID가 존재하지 않습니다");}
		}
	return list;
}
}

		
	


