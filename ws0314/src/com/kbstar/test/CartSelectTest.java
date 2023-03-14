package com.kbstar.test;

import com.kbstar.dto.Cart;
import com.kbstar.frame.CRUDService;
import com.kbstar.service.CartCRUDServiceImpl;

public class CartSelectTest {

	public static void main(String[] args) {
		CRUDService<String, Cart> cartService = new CartCRUDServiceImpl();

		Cart cart= null;
		try {
//			System.out.println(crudService.get("id06"));
			cart =cartService.get("0003");
			System.out.println(cart);
		} catch (Exception e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}


	}

}
