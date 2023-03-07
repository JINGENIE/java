package com.kbstar.frame;

public interface DAO<K, V> {
	String IP = "127.0.0.1";

	// == public static final String ip = "127.0.0.1";
	// public static final (변경할 수 없는)
	public void insert(V v);
//public void abstract insert , abstract가 생략되어있으나 abstract
	public void delete(K v);

	public void update(V v);

	default void connect() {
		System.out.println(IP + "에 접속 하였습니다.");

	}

	default void close() {
		System.out.println(IP + "에 접속해제습니다.");
	}

}
