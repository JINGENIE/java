package com.kbstar.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;

public class UserDAO implements DAO<String, UserDTO>{
	HashMap<String, UserDTO> db;
	
	//데이터베이스 만들어주기
	public UserDAO() {
		db = new HashMap<>();
	}
	
	
	@Override
	public void insert(UserDTO v) throws Exception {
		if(db.containsKey(v.getId())) {
			throw new Exception("DB Error");
		}
		db.put(v.getId(), v);
	}
	//userdao에서 userservice로 날라간다.

	@Override
	public void delete(String k) throws Exception {
		if(!db.containsKey(k)) {
			throw new Exception("존재하지 않는 id입니다.");
		}
		db.remove(k);
	}

	@Override
	public void update(UserDTO v) throws Exception {
		if(db.containsKey(v.getId())) {
			throw new Exception("존재하지 않는 id로 수정이 불가합니다.");
		}
		db.put(v.getId(), v);
		
	}

	@Override
	public UserDTO select(String k) throws Exception {
		UserDTO obj = null;
		obj = db.get(k);
		return obj;
	}

	@Override
	public List<UserDTO> select() throws Exception {
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		Collection<UserDTO>	col = db.values();
		
		for(UserDTO obj :col) {
			list.add(obj);
		}
		
		return list; 
	}
	//USER DAO 에서 KV값 정해주기


	@Override
	public List<UserDTO> search(Object obj) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
