package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.ChiTietHoaDon;

import entity.HoaDon;


public class Dao_CtHoaDon {
    public static ResultSet getCountByMaCtHoaDon(String maCtHoaDon) {
    	Connection con = ConnectDB.getConnecttion();
    	ConnectDB.getInstance();
        ResultSet rs = null;
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM ct_hoadon WHERE MaCTHoaDon LIKE ?");
            stmt.setString(1, "%"+maCtHoaDon+"%");
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public  static ResultSet getCtHoaDonByMaCtHoaDon(String maCtHoaDon) {
    	Connection con = ConnectDB.getConnecttion();
    	ConnectDB.getInstance();
        ResultSet rs = null;
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM ct_hoadon WHERE MaCTHoaDon = ?");
            stmt.setString(1, maCtHoaDon);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static boolean addCtHoaDon(ChiTietHoaDon cthd) {
    	Connection con = ConnectDB.getConnecttion();
    	ConnectDB.getInstance();
    	String sql = "insert into ct_hoadon(MaCTHoaDon, MaHoaDon, MaSP, SoLuong, ThanhTien, GhiChu) values (?,?,?,?,?,?)";
    	try {
    		PreparedStatement ps= con.prepareStatement(sql);
    		ps.setString(1, cthd.getMaCTHoaDon());
    		ps.setString(2, cthd.getMaHoaDon());
    		ps.setString(3, cthd.getMaSP());
    		ps.setInt(4, cthd.getSoLuong());
    		ps.setLong(5, cthd.getThanhTien());
    		ps.setString(6, cthd.getGhiChu());
    		return ps.executeUpdate()>0;
    	}catch (Exception e) {
    		// TODO: handle exception
    		e.printStackTrace();
    	}
    	return false;
    	
    }
    public static ArrayList<ChiTietHoaDon> getAllChiTietHoaDons() throws SQLException{
		ArrayList<ChiTietHoaDon> ls = new ArrayList<ChiTietHoaDon>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnecttion();
		try {
			String sql = "SELECT * FROM ct_hoadon";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				ls.add( new ChiTietHoaDon(
						rs.getString("MaCTHoaDon"), rs.getString("MaHoaDon"), rs.getString("MaSP"), rs.getInt("SoLuong"), rs.getLong("ThanhTien"), rs.getString("GhiChu")
			));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return ls;	
	}
    public  static ArrayList<ChiTietHoaDon> getCTHoaDonByMaHoaDon(String maHoaDon) {
        ArrayList<ChiTietHoaDon> hoaDonList = new ArrayList<ChiTietHoaDon>();
        ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnecttion();
        try {
            // Tạo câu lệnh truy vấn
            String query = "SELECT * FROM ct_hoadon WHERE MaHoaDon = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, maHoaDon);

            // Thực hiện truy vấn và lưu kết quả vào ArrayList
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
            	ChiTietHoaDon cthoaDon = new ChiTietHoaDon();
            	cthoaDon.setMaCTHoaDon(rs.getString("MaCTHoaDon"));
            	cthoaDon.setMaHoaDon(rs.getString("MaHoaDon"));
            	cthoaDon.setMaSP(rs.getString("MaSP"));
            	cthoaDon.setSoLuong(rs.getInt("SoLuong"));
            	cthoaDon.setThanhTien(rs.getLong("ThanhTien"));
            	cthoaDon.setGhiChu(rs.getString("GhiChu"));
                hoaDonList.add(cthoaDon);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return hoaDonList;
    }

    
}
