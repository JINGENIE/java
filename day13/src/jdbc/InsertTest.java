package jdbc;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class InsertTest {
	public static void main(String[] args) {
		
		/* Driver Loading ---------------------------------------*/
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Dirver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Dirver Loading 성공!");
		
		
		
		/* Connect-----------------------------------------------*/
		String id = "bank";     //user01 아님!!
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.20.60:1521:XE";   //cmd 켜서 ipconfig 라고 치면 내 ip나옴 ipv4
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, id, pwd);
		} catch (SQLException e) {
			System.out.println("접속 실패!");
			e.printStackTrace();
			return;
		}
		System.out.println("접속 성공!");
		
		
		
		/* Statement 생성 - SQL-----------------------------------*/
		
		/* SQL 전송-----------------------------------------------*/
		String insertSql = "INSERT INTO cust VALUES(?, ?, ?, ?)";
		PreparedStatement pstmt = null;
		try {
			pstmt = con.prepareStatement(insertSql);
			pstmt.setString(1, "id002");
			pstmt.setString(2, "pwd10");
			pstmt.setString(3, "기현");
			pstmt.setInt(4, 50);
			int result = pstmt.executeUpdate(); // 위에서 작성한 쿼리문을 업데이트함
			System.out.println(result);  // 정상 처리되면 1, 안되면 0이 돌아옴
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		
		
		/* 결과 받기-----------------------------------------------*/
		
		/* Close-------------------------------------------------*/
		try {
			if(con != null) {
				con.close();
			}
		} catch (SQLException e) {
			System.out.println("close 실패!");
			e.printStackTrace();
		}
		System.out.println("close 성공!");
	
	
	}
}
