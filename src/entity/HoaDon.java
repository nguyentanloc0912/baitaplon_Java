package  entity;

import java.io.Serializable;

public class HoaDon implements Serializable {

	private String maHD;
	private String maKH;
	private String ngay;
	private  String hinhthucTT;
	private double Tongtien;
	private String username;
	


	public HoaDon(String maHD, String maKH, String ngay, String hinhthucTT, double tongtien,
			String username) {
		super();
		this.maHD = maHD;
		this.maKH = maKH;
		this.ngay = ngay;
		this.hinhthucTT = hinhthucTT;
		Tongtien = tongtien;
		this.username = username;
	}




	public HoaDon() {
		// TODO Auto-generated constructor stub
	}


	

	public String getMaHD() {
		return maHD;
	}




	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}

	public String getMaKH() {
		return maKH;
	}




	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}




	public String getNgay() {
		return ngay;
	}




	public void setNgay(String ngay) {
		this.ngay = ngay;
	}




	public String getHinhthucTT() {
		return hinhthucTT;
	}




	public void setHinhthucTT(String hinhthucTT) {
		this.hinhthucTT = hinhthucTT;
	}




	public double getTongtien() {
		return Tongtien;
	}




	public void setTongtien(double tongtien) {
		Tongtien = tongtien;
	}




	public String getUsername() {
		return username;
	}




	public void setUsername(String username) {
		this.username = username;
	}




	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", maKH=" + maKH + ", ngay=" + ngay + ", hinhthucTT=" + hinhthucTT
				+ ", Tongtien=" + Tongtien + ", username=" + username + "]";
	}

}

