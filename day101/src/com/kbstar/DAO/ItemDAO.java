package com.kbstar.DAO;

import java.util.HashMap;
import java.util.List;

import com.kbstar.DTO.ItemDTO;

import com.kbstar.frame.DAO;

public class ItemDAO implements DAO<Integer, ItemDTO>{
	HashMap<Integer, ItemDTO>db = null;
	
	
	public ItemDAO() {
		db = new HashMap();{
			
		}
	}


	@Override
	public void insert(ItemDTO v) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update(ItemDTO v) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}


	@Override
	public ItemDTO select(Integer k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<ItemDTO> select() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}



}
