package com.kbstar.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.kbstar.dto.Cust;
import com.kbstar.frame.DAO;
import com.kbstar.frame.Sql;

public class CustDaoImpl implements DAO<String, String, Cust> {

	/*---------------------------------------------------------*/
	public CustDaoImpl() {
		/* Driver Loading --------------------------------------- */
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Dirver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Driver Loading 성공!");

	}



	/*-insert/register--------------------------------------------------*/
	@Override
	public void insert(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.insertSql);) {
			pstmt.setString(1, v.getId());
			pstmt.setString(2, v.getPwd());
			pstmt.setString(3, v.getName());
			pstmt.setInt(4, v.getAge());
			int result = pstmt.executeUpdate(); // 위에서 작성한 쿼리문을 업데이트함

		} catch (SQLException e1) {
			throw e1;
			// e1.printStackTrace();
		}

	}

	/*-delete/remove-------------------------------------------------*/
	@Override
	public void delete(String k) throws Exception {
		try (Connection con = getConnection();

				PreparedStatement pstmt = con.prepareStatement(Sql.deleteSql);) {
			pstmt.setString(1, k);

			int result = pstmt.executeUpdate(); // 위에서 작성한 쿼리문을 업데이트함
			if (result == 0) {
				throw new Exception("id 를 확인해주세요");
			}
			System.out.println(result); // 정상 처리되면 1, 안되면 0이 돌아옴

		} catch (Exception e1) {
			throw e1;
		}

	}

	/*--update/modify-------------------------------------------------*/
	@Override
	public void update(Cust v) throws Exception {
		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.updateSql);) {

			pstmt.setString(1, v.getPwd());
			pstmt.setString(2, v.getName());
			pstmt.setInt(3, v.getAge());
			pstmt.setString(4, v.getId());

			int result = pstmt.executeUpdate(); // 위에서 작성한 쿼리문을 업데이트함
			if (result == 0) {
				throw new Exception("id 를 확인해주세요");
			}
			System.out.println(result); // 정상 처리되면 1, 안되면 0이 돌아옴
		} catch (SQLException e1) {
			throw e1;
		}
	}

	@Override
	public Cust select(String k) throws Exception {
		Cust cust = null;

		try (Connection con = getConnection(); PreparedStatement pstmt = con.prepareStatement(Sql.selectSql);) {
			pstmt.setString(1, k);// 1번째 물음표에 k값을 넣겠다.

			try (ResultSet rset = pstmt.executeQuery();) {// 자동클로즈의 효과를 얻게 하기 위해서
				rset.next(); // z키값이동
				String id = rset.getString("id");// 컬럼명을 가지고 오겠다
				String pwd = rset.getString("pwd");
				String name = rset.getString("name");
				int age = rset.getInt("age");
				cust = new Cust(id, pwd, name, age);// 객체생성
			} catch (Exception e) {
				throw e;
			}
		} catch (Exception e) {
			throw e;
		}

		return cust;

	}

	@Override
	public List<Cust> selectAll() throws Exception {
		List<Cust> list = new ArrayList<>();
		try(Connection con = getConnection();
				PreparedStatement pstmt = con.prepareStatement(Sql.selectAllSql)) {
			try(ResultSet rset= pstmt.executeQuery();) {
				while(rset.next()) {
					Cust cust = null;
					//ㄷㅔ이터가 없을때까지 와일루프 돌리기
					String id = rset.getString("id");// 컬럼명을 가지고 오겠다
					String pwd = rset.getString("pwd");
					String name = rset.getString("name");
					int age = rset.getInt("age");
					cust = new Cust(id, pwd, name, age);//
					list.add(cust);
				}
			}catch(Exception e) {
				
			}
		}catch(Exception e) {
			throw e;
		}

		return list;
	}

	@Override
	public List<Cust> search(String k) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
