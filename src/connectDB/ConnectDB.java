package connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	public static Connection con = null;
	private static ConnectDB instance = new ConnectDB();
	public static ConnectDB getInstance() {
		return instance;
	}
	public void connect()  {
		
			String url = "jdbc:sqlserver://localhost:1433;databasename=QuanLiXe";
			String user = "sa";
			String password = "sapassword1";
			try {
				con = DriverManager.getConnection(url, user, password);
				System.out.println("Kết nối thành công");
			} catch (SQLException e) {
				// TODO: handle exception
				System.out.println("Lỗi kết nối SQL server");
			}
		
	}
	public void disconnect() {
		if(con!=null) {
			try {
				con.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	public static Connection getConnecttion() {
		return con;
	}
	public static void main(String[] args) {
		new ConnectDB().connect();
		
	}

}
