package com.kbstar.frame;

import java.util.List;

public interface ShopService<V, C> {
	public V login(String id, String pwd) throws Exception;
	public void register(V v)throws Exception;
	//커스트 디티오
	public List<C> myCart(String id)throws Exception;
	//아이디를 넣으면 해당하는 카드저오를 조회해라
}
