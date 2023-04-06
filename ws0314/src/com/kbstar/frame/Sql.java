package com.kbstar.frame;

public class Sql {
	//Cust DML
	public static String deleteSql = "DELETE FROM cust WHERE id = ?";
	public static String insertSql = "INSERT INTO cust VALUES(?, ?, ?, ?)";
	public static String selectSql = "SELECT * FROM cust WHERE id = ?";
	public static String selectAllSql = "SELECT * FROM cust";
	public static String updateSql = "UPDATE cust SET pwd=?, name=?, age=? WHERE id=?";
	
	//ITEM DML
	public static String ItemDeleteSql ="DELETE FROM item WHERE id =?";
	public static String ItemInsertSql ="INSERT INTO item VALUES(?,?,?,?,SYSDATE)";
	public static String ItemUpdateSql ="UPDATE item SET name = ?, price=?, rate =? WHERE id= ?";
	public static String ItemSelectSql ="SELECT * FROM item WHERE id = ?";
	public static String ItemSelectAllSql ="SELECT * FROM item";
	
	
	//
	public static String cartInsertSql = "INSERT INTO cart VALUES(?, ?, ?, ?, SYSDATE)";
	public static String cartDeleteSql = "DELETE FROM cart WHERE id = ?";
	public static String cartUpdateSql = "UPDATE cart SET cnt=? WHERE id=?";
	public static String cartSelectSql = "SELECT * FROM cart WHERE id = ?";
	public static String cartSelectAllSql = "SELECT * FROM cart";
	public static String mycartselectAllSql = 	"SELECT * FROM cart WHERE user_id = ?";
	
}
