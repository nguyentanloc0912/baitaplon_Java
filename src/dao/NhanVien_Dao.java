package dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import connectDB.ConnectDB;
import entity.NhanVien;

public class NhanVien_Dao {
public ArrayList<NhanVien> getAllNhanVien(){
	ArrayList<NhanVien> dsnhanvien = new ArrayList<NhanVien>();
	ConnectDB.getInstance();
	Connection con = ConnectDB.getConnecttion();
	try {
		String sql = "select * from TaiKhoan";
		java.sql.Statement statement = con.createStatement();
		ResultSet rs = statement.executeQuery(sql);
		while(rs.next()) {
			dsnhanvien.add(new NhanVien(
					rs.getString("username"), rs.getString("password"), rs.getString("HoTen"), rs.getDate("NgaySinh"), rs.getString("Email"), rs.getString("Phone")));
		}
		
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return dsnhanvien;
}
public boolean addNhanVien(NhanVien nv) {
	Connection con = ConnectDB.getConnecttion();
	ConnectDB.getInstance();
	String sql = "insert into TaiKhoan(username, password, HoTen, NgaySinh, Email, Phone) values (?,?,?,?,?,?)";
	try {
		PreparedStatement ps= con.prepareStatement(sql);
		ps.setString(1, nv.getUsename());
		ps.setString(2, nv.getPassword());
		ps.setString(3, nv.getHoTen());
		ps.setDate(4, new Date(nv.getNgaySinh().getTime()));
		ps.setString(5, nv.getEmail());
		ps.setString(6, nv.getPhone());
		return ps.executeUpdate()>0;
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return false;
	
}
public boolean updateNhanVien(NhanVien nv) {
	ConnectDB.getInstance();
	Connection con = ConnectDB.getConnecttion();
	String sql = "update Taikhoan set  password = ?, HoTen = ?, NgaySinh = ?, Email = ?, Phone = ? where username = ?";
	try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, nv.getPassword());
		ps.setString(2, nv.getHoTen());
		ps.setDate(3, new Date(nv.getNgaySinh().getTime()));
		ps.setString(4,  nv.getEmail());
		ps.setString(5, nv.getPhone());
		ps.setString(6, nv.getUsename());
		return ps.executeUpdate()>0;
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return false;
}
public boolean deleteNhanVien(String userNhanVien) {
	ConnectDB.getInstance();
	Connection con = ConnectDB.getConnecttion();
	String sql = "delete from Taikhoan where username = ?";
	try {
		PreparedStatement ps= con.prepareStatement(sql);
		ps.setString(1, userNhanVien);
        return ps.executeUpdate()>0;
	}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return true;
}
}
