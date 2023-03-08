package com.kbstar.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import com.kbstar.DTO.UserDTO;
import com.kbstar.frame.DAO;

public class userDAO implements DAO<String, UserDTO> {
	HashMap<String, UserDTO> db = null;

	public userDAO() {
		db = new HashMap();
		{

		}

	}

	@Override
	public void insert(UserDTO v) throws Exception {
		if (db.containsKey(v.getId())) {
			throw new Exception();
		}
		db.put(v.getId(), v);

	}

	@Override
	public void update(UserDTO v) throws Exception {
		if (!db.containsKey(v.getId())) {
			throw new Exception();
		}
		db.put(v.getId(), v);
	}

	@Override
	public void delete(String k) throws Exception {
		if (!db.containsKey(k)) {
			throw new Exception();
		}
		db.remove(k);
	}

	@Override
	public UserDTO select(String k) throws Exception {
		UserDTO user = null;
		user = db.get(k);
		return user;
	}

	@Override
	public List<UserDTO> select() throws Exception {
		// TODO Auto-generated method stub
		ArrayList<UserDTO> list = new ArrayList<UserDTO>();
		Collection<UserDTO> col = db.values();
		for (UserDTO u : col) {
			list.add(u);
		}
		return list;
	}

}
