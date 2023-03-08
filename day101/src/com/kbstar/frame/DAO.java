package com.kbstar.frame;

import java.util.List;

public interface DAO<K, V> {
//데이터베이스에 데이터를 입력수정삭제조회
	//Create Read Update Delete
	public void insert(V v) throws Exception;

	public void update(V v) throws Exception;

	public void delete(String id) throws Exception;

	public V select(K k) throws Exception;
	// V값으로 리턴하라는 말
	public List<V> select() throws Exception;
	//LIST에 담아서 다 가져와


	
}
