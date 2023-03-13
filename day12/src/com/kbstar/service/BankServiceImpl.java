/**
 * 
 */
package com.kbstar.service;

import java.util.List;

import com.kbstar.dao.AccountDAO;
import com.kbstar.dao.TransactionDAO;
import com.kbstar.dao.UserDAO;
import com.kbstar.dto.AccountDTO;
import com.kbstar.dto.TransactionDTO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.BankService;
import com.kbstar.frame.DAO;
import com.kbstar.frame.MakeAccountNumber;
import com.kbstar.frame.Notification;
import com.kbstar.noti.NotificationImpl;

/**
 * @author 이진
 *
 */
public class BankServiceImpl implements BankService<UserDTO, AccountDTO, TransactionDTO, String, String> {

	DAO<String, UserDTO> userDao;
	DAO<String, AccountDTO> accountDao;
	DAO<String, TransactionDTO> transactionDao;
	Notification notification;

	public BankServiceImpl() {
		userDao = new UserDAO();
		accountDao = new AccountDAO();
		transactionDao = new TransactionDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		try {
			userDao.insert(v);
		} catch (Exception e) {
			throw new Exception("등록 오류");
		}
		notification.sendEmail(v.getEmail(), "축하합니다.");
		notification.sendSMS(v.getContact(), "축하합니다.");
	}

	@Override
	public UserDTO login(String k, String p) throws Exception {
		// 아이디 비교해보고, 맞다면 비밀번호 비교.
		UserDTO user = null;
		user = userDao.select(k);
		if (user != null) {
			if (user.getPwd().equals(p)) {
				System.out.println("ok");
			} else {
				throw new Exception("로그인실패..비번오류");
			}
		} else {
			throw new Exception("로그인실패..아디오류");
		}
		return user;
	}

	@Override
	public UserDTO getUserInfo(String k) throws Exception {
		UserDTO user = null;
		user = userDao.select(k);
		return user;
	}

//	@Override
//	public void makeAccount(String k, double balance) throws Exception {
//		String accNo = MakeAccountNumber.makeAccNum();
////		AccountDTO account = 
////				new AccountDTO(MakeAccountNumber.makeAccNum(),balance, k);
//		AccountDTO account = new AccountDTO(accNo, balance, k);
//		accountDao.insert(account);
//		UserDTO user = userDao.select(k);
//		notification.sendEmail(user.getEmail(), accNo+"계좌를 생성하셨습니다");
//		notification.sendEmail(user.getContact(), accNo+"계좌를 생성하셨습니다");
//	}
	@Override
	public void makeAccount(String k, double balance) throws Exception {
		String accNo = MakeAccountNumber.makeAccNum();
		AccountDTO account = new AccountDTO(accNo, balance, k);
		System.out.println(account);
		accountDao.insert(account);
		System.out.println("1");
		UserDTO user = userDao.select(k);
		System.out.println(user);
		notification.sendEmail(user.getEmail(), accNo + "계좌를 생성하셨습니다.");
		notification.sendEmail(user.getContact(), accNo + "계좌를 생성하셨습니다.");
	}

	@Override
	public List<TransactionDTO> getAllTr(String acc) throws Exception {
		return transactionDao.search(acc);
	
	}

	@Override
	public void transaction(String sendAcc, String receiveAcc, double balance, String desc) throws Exception {
		// 계좌정보수정
		// 계좌잔액정보를 조회하고 잔액에서 이체하는 금액을 차감한 잔액으로 수정
		// 거래내역 추가
		// 완료
		System.out.println("금결원 전송");
		AccountDTO acc = null;
		acc = accountDao.select(sendAcc);
		double abalance = acc.getBalance() - balance;
		acc.setBalance(abalance);
		accountDao.update(acc);
		// 거래내역추가
		TransactionDTO tr = new TransactionDTO(MakeAccountNumber.makeTrNum(), sendAcc, balance, "0", desc);
		transactionDao.insert(tr);
		// sms,email전송

		String uid = acc.getHolder();
		UserDTO u = userDao.select(uid);
		// 유저디티오 정보를 유저디에이오의 셀렉트를 통해 뺴내자
		notification.sendEmail(u.getEmail(), sendAcc + "에서 " + balance + " 원이 출금되었습니다.");
		notification.sendEmail(u.getContact(), sendAcc + "에서 " + balance + " 원이 출금되었습니다.");

//		UserDTO user = userDao.select(desc);
//		notification.sendEmail(user.getEmail(), abalance+ "이체 완료하였습니다.");
//		notification.sendEmail(user.getContact(), abalance + "이체완료하셨습니다.");
		// 완료
	}

	@Override
	public List<AccountDTO> getAllAccount(String k) throws Exception {
		List<AccountDTO> list  = null;
		list = accountDao.search(k);
		return list;
		//return accountDao.search(k);와 같은 코드
	}

}
