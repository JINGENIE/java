package com.kbstar.service;

import java.util.ArrayList;
import java.util.List;

import com.kbstar.dao.UserDAO;
import com.kbstar.dto.UserDTO;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Msg;
import com.kbstar.frame.Notification;
import com.kbstar.frame.CRUDService;
import com.kbstar.noti.NotificationImpl;

public class UserService implements CRUDService<String, UserDTO> {

	DAO<String, UserDTO> userDao;
	Notification notification;

	public UserService() { // 이게 뭔지 모르겠
		userDao = new UserDAO();
		notification = new NotificationImpl();
	}

	@Override
	public void register(UserDTO v) throws Exception {
		try {
			userDao.insert(v);
		} catch (Exception e) {
			throw new Exception("회원가입에 실패하였습니다. (EX0001)");
			// UserDAO 단에서 발생하는 에러메세지를 표출하는 것보다 화면단에서 발생한 에러메세지를 보여주는 좀더 고객 관점의 에러메세지 표출
		}
		notification.sendEmail(v.getEmail(), Msg.registerMsg1);
		notification.sendSMS(v.getContact(), Msg.registerMsg2);
	}

	@Override
	public void remove(String k) throws Exception {
		UserDTO user = null;
		user= userDao.select(k);
		try {
		userDao.delete(k);
		}catch(Exception e) {
			throw new Exception("탈퇴 오류입니다");
		}
		notification.sendSMS(user.getContact(), Msg.removeMsg1);
		notification.sendEmail(user.getEmail(), Msg.removeMsg2);
	}

	@Override
	public void modify(UserDTO v) throws Exception {
		try {
			userDao.update(v);
		}catch(Exception e) {
			throw new Exception("수정 오류입니다");
		}
		

	}

	@Override
	public UserDTO get(String k) throws Exception {
		UserDTO obj = null;
		obj = userDao.select(k);
		return obj;
	}

	@Override
	public List<UserDTO> get() throws Exception {
		List<UserDTO> list = null;
		try {
			list = userDao.select();
		} catch (Exception e) {

		}
		return list;
	}

}
