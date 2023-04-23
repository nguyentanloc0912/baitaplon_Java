package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



import connectDB.ConnectDB;
import entity.NhanVien;
import entity.khachHang_model;
import view.KhachHang;

public class khachHang_DAO {
		public ArrayList<khachHang_model> getALLKhachHang() {
				ArrayList<khachHang_model> dsKhachHang = new ArrayList<khachHang_model>();
				ConnectDB.getInstance();
				Connection con = ConnectDB.getConnecttion();
				
				try {
					String sql = "select * from khachhang";
					Statement statement = con.createStatement();
					ResultSet rs = statement.executeQuery(sql);
					while(rs.next()){
						dsKhachHang.add(new khachHang_model(rs.getString("MaKH"),rs.getString("TenKH"),rs.getString("soDienThoai"),rs.getDate("ngaySinh"),rs.getString("Email"),rs.getString("DiaChi")));
					}
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
				return dsKhachHang;
		}
		public boolean addKH(khachHang_model kh) {
			Connection con = ConnectDB.getConnecttion();
			ConnectDB.getInstance();
			
			String sql = "insert into khachhang(MaKH, TenKH, DiaChi, Email, soDienThoai,ngaySinh) values (?,?,?,?,?,?)";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, kh.getMaKH());
				ps.setString(2, kh.getTenKH());
				ps.setString(3, kh.getDiaChi());
				ps.setString(4, kh.getEmail());
				ps.setString(5, kh.getSdt());
				ps.setDate(6, new Date(kh.getNgaySinh().getTime()));
				return ps.executeUpdate()>0;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return false;
		}
		public boolean updateKH( khachHang_model kh) {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnecttion();
			String sql = "update khachhang set  TenKH = ?, DiaChi = ?, Email=?, SoDienThoai = ?, ngaySinh = ? where MaKH = ?";
			try {
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, kh.getTenKH());
				ps.setString(2, kh.getDiaChi());
				ps.setString(3, kh.getEmail());
				ps.setString(4, kh.getSdt());
				ps.setDate(5, new Date(kh.getNgaySinh().getTime()));
				ps.setString(6, kh.getMaKH());
				return ps.executeUpdate()>0;
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return false;
		}
		public boolean deleteKH(String maKH) {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnecttion();
			String sql = "delete from khachhang where MaKH =?";
			
			try {
				PreparedStatement ps= con.prepareStatement(sql);
				ps.setString(1, maKH);
		        return ps.executeUpdate()>0;
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return true;
		}
}
