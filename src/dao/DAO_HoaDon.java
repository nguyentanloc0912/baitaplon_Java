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
    public List<HoaDon> getAllHoaDons(){
		List<HoaDon> ls = new ArrayList<HoaDon>();
		
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		try {
			String sql = "select * from lophoc";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				ls.add(new HoaDon(
					  rs.getString(1),
					  rs.getString(2),
					  rs.getString(3),
					  rs.getString(4),
					  rs.getDouble(5),
					  rs.getString(6)
						));
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ls;	
	}
	public boolean deleteNhanVien(String maHD) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "delete from Taikhoan where maHD = ?";
		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, maHD);
	        return ps.executeUpdate()>0;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;
	}
	public boolean updateNhanVien(HoaDon hd) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "update maHD =?, maKH=?, ngay = ?, HinhthucTT=?, Tongtien =?, username=?";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, hd.getMaHD());
			ps.setString(2, hd.getMaKH());
			ps.setString(3, hd.getNgay());
			ps.setString(4, hd.getHinhthucTT());
			ps.setDouble(5, hd.getTongtien());
			ps.setString(6, hd.getUsername());
			return ps.executeUpdate()>0;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}

	public boolean addNhanVien(HoaDon hd) {
		Connection con = ConnectDB.getConnection();
		ConnectDB.getInstance();
		
		String sql = "insert into HoaDon(maHD, maKH, Ngay, HinhThucTT,TongTien, Nhanvien) values (?,?,?,?,?,?)";
		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, hd.getMaHD());
			ps.setString(2, hd.getMaKH());
			ps.setString(3, hd.getNgay());
			ps.setString(4, hd.getHinhthucTT());
			ps.setDouble(5, hd.getTongtien());
			ps.setString(6, hd.getUsername());
			return ps.executeUpdate()>0;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
		
	}
}

