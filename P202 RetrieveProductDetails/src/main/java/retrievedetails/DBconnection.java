package retrievedetails;

import java.sql.Connection;

import java.sql.DriverManager;

public class DBconnection {
	static Connection con=null;
	public static Connection getMyConnection() throws Exception {
	Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/commerce","root","Nandy*16");
		return con;
	}
}