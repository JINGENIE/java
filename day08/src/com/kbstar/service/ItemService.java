package com.kbstar.service;

import com.kbstar.dao.ItemDAO;
import com.kbstar.dto.ItemDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.SearchService;
import com.kbstar.frame.Service;

public class ItemService implements Service<Integer, ItemDTO>, SearchService {

	DAO<Integer, ItemDTO> dao;

	public ItemService() {
		dao = new ItemDAO(); // dao에 itemdao넣어줬. 상위클래스에 하위클래스 객체를 넣어줌 promotion
	}

	@Override
	public void register(ItemDTO v) {
		System.out.println(v + "Data checked...");
		System.out.println("Send SMS.");
	}

	@Override
	public void remove(Integer k) {
		System.out.println(k + "Data checked...");
		dao.delete(k);
		System.out.println("Send SMS.");
	}

	@Override
	public void modify(ItemDTO v) {
		System.out.println(v + "Data checked...");
		dao.update(v);
		System.out.println("Send SMS.");
	}

	@Override
	public void search() {
		System.out.println("Item searched...");
	}

}
