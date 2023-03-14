package jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteTest {
	public static void main(String[] args) {

		/* Driver Loading --------------------------------------- */
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("Dirver가 없습니다.");
			e.printStackTrace();
			return;
		}
		System.out.println("Dirver Loading 성공!");

		/* Connect-------------필요정보 선언---------------------- */
		String id = "bank"; // user01 아님!!
		String pwd = "111111";
		String url = "jdbc:oracle:thin:@172.16.20.60:1521:XE"; // cmd 켜서 ipconfig 라고 치면 내 ip나옴 ipv4
		String deleteSql = "DELETE FROM cust WHERE id = ?";

		/* Statement 생성 - SQL----------------------------------- */

		/* SQL 전송----------------------------------------------- */

		try (Connection con = DriverManager.getConnection(url, id, pwd);
				PreparedStatement pstmt = con.prepareStatement(deleteSql);) {
			pstmt.setString(1, "id70");

			int result = pstmt.executeUpdate(); // 위에서 작성한 쿼리문을 업데이트함
			System.out.println(result); // 정상 처리되면 1, 안되면 0이 돌아옴
		
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}
}
