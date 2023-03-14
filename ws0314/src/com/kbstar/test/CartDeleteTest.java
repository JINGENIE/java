package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.dto.Item;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;
import com.kbstar.service.ItemCRUDServiceImpl;

public class CartDeleteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			CRUDService<String, Cart> service =
					new CartCRUDServiceImpl();
			
			try {
				service.remove("202331439100");
				System.out.println("성공");
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		}

}
