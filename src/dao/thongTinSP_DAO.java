package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectDB.ConnectDB;
import entity.sanPham;

public class thongTinSP_DAO {
	public ArrayList<sanPham> getAllSanPham(){
		ArrayList<sanPham> list = new ArrayList<sanPham>();
		Connection con = ConnectDB.getConnecttion();
		ConnectDB.getInstance();
		try {
			String sql = "SELECT * FROM thongTinSanPham";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				sanPham sp = new sanPham(
						rs.getString("maLoaiXe"),
						rs.getString("loaiXe"),
						rs.getString("nuocSX"),
						rs.getLong("giaBan"),
						rs.getInt("soLuong"),
						rs.getString("soSuon"),
						rs.getString("soKhung"),
						rs.getInt("soPK"));
				list.add(sp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void delete(String maLoai) {
		try {
			Connection con = ConnectDB.getConnecttion();
			String sql = "DELETE FROM thongTinSanPham WHERE maLoaiXe = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, maLoai);
			pst.executeUpdate();
			ConnectDB.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void updateGia(String ma,long giaMoi) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnecttion();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("UPDATE thongTinSanPham set giaBan = ? WHERE maLoaiXe = ?");
			stmt.setLong(1, giaMoi);
			stmt.setString(2, ma);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void updateSL(String ma,int soluong) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnecttion();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("UPDATE thongTinSanPham set soLuong = ? WHERE maLoaiXe = ?");
			stmt.setLong(1, soluong);
			stmt.setString(2, ma);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
