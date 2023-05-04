package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.ChiTietHoaDon;
import entity.sanPham;

public class baoCao_DAO {
	public ArrayList<ChiTietHoaDon> getAllBaoCao() {
		ArrayList<ChiTietHoaDon> ls = new ArrayList<ChiTietHoaDon>();
		try {
			Connection con = ConnectDB.getConnecttion();
			ConnectDB.getInstance().connect();
			String sql = "SELECT * FROM baoCaoView";
			Statement stament = con.createStatement();
			ResultSet rs = stament.executeQuery(sql);
			while(rs.next()) {
				sanPham sp = new sanPham(rs.getString("tenSP"),rs.getLong("GiaBan"));
				int sl = rs.getInt("SoLuong");
				long tongTien = rs.getLong("TongTien");
				
				ChiTietHoaDon cthd = new ChiTietHoaDon(sp, sl, tongTien);
				ls.add(cthd);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return ls;
	}
	
	public ArrayList<ChiTietHoaDon> getDsBaoCaoTheoNgay(Date fromDate, Date toDate){
		ArrayList<ChiTietHoaDon> list = new ArrayList<ChiTietHoaDon>();
		try {
			Connection con = ConnectDB.getConnecttion();
			ConnectDB.getInstance().connect();
			String sql = "EXEC hdtheongay ?,?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setDate(1, fromDate);
			pst.setDate(2, toDate);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				sanPham sp = new sanPham(rs.getString("tenSP"),rs.getLong("GiaBan"));
				int sl = rs.getInt("SoLuong");
				long tongTien = rs.getLong("TongTien");
				ChiTietHoaDon cthd = new ChiTietHoaDon(sp, sl, tongTien);
				list.add(cthd);
			}
			ConnectDB.disconnect();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
