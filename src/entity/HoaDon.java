package entity;

import java.io.Serializable;
import java.util.Objects;

public class HoaDon implements Serializable {
	private String maHD;
	private String ngay;
	private String maKH;
	private String maLoaiXe;
	private int soluong;
	private  String hinhthucTT;
	private double Tongtien;
	private String username;

	
	public HoaDon(String maHD, String ngay, String maKH, String maLoaiXe, int soluong, String hinhthucTT,
			double tongtien, String username) {
		super();
		this.maHD = maHD;
		this.ngay = ngay;
		this.maKH = maKH;
		this.maLoaiXe = maLoaiXe;
		this.soluong = soluong;
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
	public String getNgay() {
		return ngay;
	}
	public void setNgay(String ngay) {
		this.ngay = ngay;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getMaLoaiXe() {
		return maLoaiXe;
	}
	public void setMaLoaiXe(String maLoaiXe) {
		this.maLoaiXe = maLoaiXe;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
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
	public int hashCode() {
		return Objects.hash(maHD);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(maHD, other.maHD);
	}
	@Override
	public String toString() {
		return "HoaDon [maHD=" + maHD + ", ngay=" + ngay + ", maKH=" + maKH + ", maLoaiXe=" + maLoaiXe + ", soluong="
				+ soluong + ", hinhthucTT=" + hinhthucTT + ", Tongtien=" + Tongtien + ", username=" + username + "]";
	}

}
