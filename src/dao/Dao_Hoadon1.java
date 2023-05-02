package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.sql.Date;


import connectDB.ConnectDB;
import entity.HoaDon;
import view.HoaDon_GUI;


public class Dao_Hoadon1 {



    public static ResultSet getCountByMaHoaDon(String maHoaDon) {
    	Connection con = ConnectDB.getConnecttion();
    	ConnectDB.getInstance();
        ResultSet rs = null;
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT COUNT(*) FROM hoadon WHERE MaHoaDon LIKE ?");
            stmt.setString(1, maHoaDon);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public  static ResultSet getHoaDonByMaHoaDon(String maHoaDon) {
    	Connection con = ConnectDB.getConnecttion();
    	ConnectDB.getInstance();
        ResultSet rs = null;
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM hoadon WHERE MaHoaDon = ?");
            stmt.setString(1, maHoaDon);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public boolean addHoaDon(HoaDon hd) {
    	Connection con = ConnectDB.getConnecttion();
    	ConnectDB.getInstance();
    	String sql = "insert into hoadon(MaHoaDon, Ngay, MaKH, Tongtien, username) values (?,?,?,?,?)";
    	try {
    		PreparedStatement ps= con.prepareStatement(sql);
    		ps.setString(1, hd.getMaHD());
    		ps.setDate(2, new Date(hd.getNgay().getTime()));
    		ps.setString(3, hd.getMaKH());
    		ps.setLong(4, hd.getTongtien());
    		ps.setString(5, hd.getUsername());
    		return ps.executeUpdate()>0;
    	}catch (Exception e) {
    		// TODO: handle exception
    		e.printStackTrace();
    	}
    	return false;
    	
    }
	public static ArrayList<HoaDon> getAllHoaDons() throws SQLException{
		ArrayList<HoaDon> ls = new ArrayList<HoaDon>();
		ConnectDB.getInstance().connect();
		Connection con = ConnectDB.getConnecttion();
		try {
			String sql = "SELECT * FROM hoadon";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while(rs.next()) {
				ls.add( new HoaDon(
						rs.getString("MaHoaDon"), rs.getDate("Ngay"), rs.getString("MaKH"), rs.getLong("TongTien"), rs.getString("username")
			));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return ls;	
	}
	public static boolean deleteHoaDon(String maHoaDon) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnecttion();
		String sql = "delete from hoadon where MaHoaDon = ?";
		try {
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, maHoaDon);
	        return ps.executeUpdate()>0;
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;

	}
	
public static void timHoaDon() {
	HoaDon_GUI.Clear_table();
//	Dao_Hoadon1.timHoaDon();
	HoaDon_GUI.ds_hd.clear();
	ConnectDB.getInstance().connect();
	Connection con = ConnectDB.getConnecttion();
	String sql = "select * from hoadon where MaHoaDon like '%"+ HoaDon_GUI.txtTimKiem.getText() + "%'";
	try {
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(sql);
		while(rs.next()) {
			HoaDon_GUI.ds_hd.add( new HoaDon(
					rs.getString("MaHoaDon"), rs.getDate("Ngay"), rs.getString("MaKH"), rs.getLong("TongTien"), rs.getString("username")
		));
		}
	} catch (SQLException e5) {
		// TODO Auto-generated catch block
		e5.printStackTrace();
	}
	HoaDon_GUI.LoadDataArrayListToTable();	
}

}
