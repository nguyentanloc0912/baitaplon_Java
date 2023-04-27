package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectDB.ConnectDB;
import entity.HoaDon;

public class DAO_HoaDon {
	public ArrayList<HoaDon> getAllHoaDons(){
		ArrayList<HoaDon> ls = new ArrayList<HoaDon>();
		
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnecttion();
		try {
			String sql = "select * from hoadon";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				ls.add(new HoaDon(
						rs.getString(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4),
						rs.getInt(5),
						rs.getString(6),
						rs.getDouble(7),
						rs.getString(8)
						));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ls;	
	}
	public static void delete(String maHD) {
		try {
			Connection con = ConnectDB.getConnecttion();
			String sql = "DELETE FROM hoadon WHERE maHD = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, maHD);
			pst.executeUpdate();
			ConnectDB.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	
}
