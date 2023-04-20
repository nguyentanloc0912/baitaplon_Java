package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class connect_SanPham{
	public static Connection con = null;
	private static connect_SanPham instance = new connect_SanPham();
	public static connect_SanPham getInstance() {
		return instance;
	}
	public void connect() throws SQLException {
		String url = "jdbc:sqlserver://localhost:59945;databasename=SANPHAM";
		String user = "sa";
		String password = "sapassword";
		con = DriverManager.getConnection(url, user, password);
	}
	
	public static void disconnect() {
		if(con == null)
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
	
	public static Connection getConnection() {
		return con;
	}
}