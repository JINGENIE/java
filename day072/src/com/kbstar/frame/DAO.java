package com.kbstar.frame;

public interface DAO<K, V> {
	public void insert(V v);

	public void delete(K v);

	public void update(V v);

}
