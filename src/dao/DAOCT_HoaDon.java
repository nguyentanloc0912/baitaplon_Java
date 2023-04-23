package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connectDB.ConnectDB;
import entity.CT_HoaDon;
public class DAOCT_HoaDon {
    public List<CT_HoaDon> getAllHoaDons(){
		List<CT_HoaDon> ls = new ArrayList<CT_HoaDon>();
		
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		try {
			String sql = "select * from CT_HoaDon";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				ls.add(new CT_HoaDon(
					  rs.getString(1),
					  rs.getString(2),
					  rs.getString(3),
					  rs.getInt(4),
					  rs.getDouble(5)
						));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ls;	
	}
	public boolean deleteNhanVien(String maCTHD) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "delete from Taikhoan where maCTHD = ?";
		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, maCTHD);
	        return ps.executeUpdate()>0;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;
	}
	public boolean updateNhanVien(CT_HoaDon ct) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "update maCTHD =?, maHD=?, maSP = ?, soluong=?, thanhtien =?, ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, ct.getMaCTHD());
			ps.setString(2, ct.getMaHD());
			ps.setString(3, ct.getMaLoai());
			ps.setInt(4, ct.getSoluong());
			ps.setDouble(5, ct.getThanhtien());
			return ps.executeUpdate()>0;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public boolean addNhanVien(CT_HoaDon ct) {
		Connection con = ConnectDB.getConnection();
		ConnectDB.getInstance();
		
		String sql = "insert into HoaDon(maCTHD, maHD, maSP, soluong, thanhtien) values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, ct.getMaCTHD());
			ps.setString(2, ct.getMaHD());
			ps.setString(3, ct.getMaLoai());
			ps.setInt(4, ct.getSoluong());
			ps.setDouble(5, ct.getThanhtien());
			return ps.executeUpdate()>0;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
		
	}
}

