package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.ChiTietHoaDon;

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
    public static  ArrayList<ChiTietHoaDon> getALLCtHoaDonByMaHoaDon() {
    	Connection con = ConnectDB.getConnecttion();
    	ConnectDB.getInstance();
        ResultSet rs = null;
        ArrayList<ChiTietHoaDon> list = new ArrayList<ChiTietHoaDon>();
        try {
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM ct_hoadon");
            rs = stmt.executeQuery();
            while (rs.next()){
            	list.add(new ChiTietHoaDon(rs.getString("MaCTHoaDon"),rs.getString("MaHoaDon"),rs.getString("MaSP"),rs.getInt("SoLuong"),rs.getLong("ThanhTien")));
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}
