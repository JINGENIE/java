package com.kbstar.frame;

import java.util.List;

//  /** + 엔터
/**
 * 23.3.10
 * @author JINLEE
 *
 * @param <V1> UserDTO
 * @param <V2> AccountDTO
 * @param <V3> TransactionDTO
 * @param <K>	String ID
 * @param <P> String pwd
 */
public interface BankService<V1,V2,V3, K, P> {
	public void register(V1 v) throws Exception;

	public V1 login(K k, P p) throws Exception;

	// 사용자의 정보가 리턴되니까 V
	public V1 getUserInfo(K k) throws Exception;

	public void makeAccount(K k, double balance) throws Exception;
	public List<V2>  getAllAccount(K k) throws Exception;
	//내가 보유하고 있는 모든 계좌를 조회해라.
	public List<V3>  getAllTr(String acc) throws Exception;
	//내가 진행한 트렌잭션을 조회해라.
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception;

}
