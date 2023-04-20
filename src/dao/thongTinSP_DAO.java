package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectDB.connect_SanPham;
import entity.sanPham;

public class thongTinSP_DAO {
	public List<sanPham> getAllSanPham(){
		List<sanPham> dsSanPham = new ArrayList<sanPham>();
		Connection con = connect_SanPham.getConnection();
		connect_SanPham.getInstance();
		try {
			String sql = "SELECT * FROM thongTinSanPham";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				sanPham sp = new sanPham(
						rs.getString("maLoaiXe"),
						rs.getString("loaiXe"),
						rs.getString("nuocSX"),
						rs.getDouble("giaBan"),
						rs.getInt("soLuong"),
						rs.getString("soSuon"),
						rs.getString("soKhung"),
						rs.getInt("soPK"));
				dsSanPham.add(sp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsSanPham;
	}
	
	public static void delete(String maLoai) {
		try {
			Connection con = connect_SanPham.getConnection();
			String sql = "DELETE FROM thongTinSanPham WHERE maLoaiXe = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, maLoai);
			pst.executeUpdate();
			connect_SanPham.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void update(sanPham sp) {
		connect_SanPham.getInstance();
		Connection con = connect_SanPham.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("UPDATE SANPHAM set giaBan = ?, soLuong = ? WHERE maLoaiXe = ?");
			stmt.setDouble(1, sp.getGiaBan());
			stmt.setInt(2, sp.getSoluong());
			stmt.setString(3, sp.getMaLoai());
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
