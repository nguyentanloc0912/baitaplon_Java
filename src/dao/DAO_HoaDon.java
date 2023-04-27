package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import  connectDB.ConnectDB;
import entity.HoaDon;

public class DAO_HoaDon {
	public ArrayList<HoaDon> getAllHoaDons() throws SQLException{
		ArrayList<HoaDon> ls = new ArrayList<HoaDon>();
		
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnecttion();
		try {
			String sql = "SELECT * FROM hoadon";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				ls.add( new HoaDon(
						rs.getString("maHD"),
						rs.getDate("Ngay"),
						rs.getString("MaKH"),
						rs.getString("maLoaiXe"),
						rs.getInt("soluong"),
						rs.getString("HnhThucTT"),
						rs.getLong("TongTien"),
						rs.getString("username")
						));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return ls;	
	}
	public static void delete(String maHD) {
		try {
			Connection con = ConnectDB.getConnecttion();
			String sql = "DELETE FROM hoadon WHERE maHD = ? ";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, maHD);
			pst.executeUpdate();
			ConnectDB.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public boolean addHD(HoaDon hd) {
		Connection con = ConnectDB.getConnecttion();
		ConnectDB.getInstance();
		
		String sql = "INSERT INTO hoadon(maHD, Ngay, MaKH,maLoaiXe,soluong,HinhThucTT, TongTien, username) values (?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, hd.getMaHD());
			ps.setDate(2, new Date(hd.getNgay().getTime()));
			ps.setString(3, hd.getMaKH());
			ps.setString(4, hd.getMaLoaiXe());
			ps.setInt(5, hd.getSoluong());
			ps.setString(6, hd.getHinhthucTT());
			ps.setLong(7, hd.getTongtien());
			ps.setString(8, hd.getUsername());
			ps.executeUpdate();
			ConnectDB.disconnect();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
}
