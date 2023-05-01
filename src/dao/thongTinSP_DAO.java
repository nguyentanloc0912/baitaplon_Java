package dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import connectDB.ConnectDB;
import entity.NhanVien;
import entity.sanPham;

public class thongTinSP_DAO {
	public ArrayList<sanPham> getAllSanPham(){
		ArrayList<sanPham> list = new ArrayList<sanPham>();
		Connection con = ConnectDB.getConnecttion();
		ConnectDB.getInstance();
		try {
			String sql = "SELECT * FROM sanpham";
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while(rs.next()) {
				sanPham sp = new sanPham(
						rs.getString("MaSP"),
						rs.getString("TenSP"),
						rs.getString("nuocSX"),
						rs.getLong("GiaBan"),
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
	public boolean addSP(sanPham sp) {
		Connection con = ConnectDB.getConnecttion();
		ConnectDB.getInstance();
		String sql = "insert into sanpham(maSP, TenSP, GiaBan, nuocSX, soSuon, soKhung, soPK) values (?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, sp.getMaLoai());
			ps.setString(2, sp.getTenLoai());
			ps.setLong(3, sp.getGiaBan());
			ps.setString(4, sp.getNsx());
			ps.setString(5, sp.getSoSuon());
			ps.setString(6, sp.getSoKhung());
			ps.setInt(7, sp.getSoPK());
			return ps.executeUpdate()>0;
		}catch (Exception e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Trùng mã");
			e.printStackTrace();
		}
		return false;
		
	}
	public static void delete(String maLoai) {
		try {
			Connection con = ConnectDB.getConnecttion();
			String sql = "DELETE FROM thongTinSanPham WHERE MaSP = ?";
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
			stmt = con.prepareStatement("UPDATE thongTinSanPham set GiaBan = ? WHERE MaSP = ?");
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
	
//	public static void updateSL(String ma,int soluong) {
//		ConnectDB.getInstance();
//		Connection con = ConnectDB.getConnecttion();
//		PreparedStatement stmt = null;
//		try {
//			stmt = con.prepareStatement("UPDATE thongTinSanPham set soLuong = ? WHERE maLoaiXe = ?");
//			stmt.setLong(1, soluong);
//			stmt.setString(2, ma);
//			stmt.executeUpdate();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}finally {
//			try {
//				stmt.close();
//			}catch(SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
}
