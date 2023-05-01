package entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class HoaDon implements Serializable {
	private String maHD;
	private Date ngay;
	private String maKH;
	private long Tongtien;
	private String username;
	public String getMaHD() {
		return maHD;
	}
	public void setMaHD(String maHD) {
		this.maHD = maHD;
	}
	public Date getNgay() {
		return ngay;
	}
	public void setNgay(Date ngay) {
		this.ngay = ngay;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public long getTongtien() {
		return Tongtien;
	}
	public void setTongtien(long tongtien) {
		Tongtien = tongtien;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public HoaDon(String maHD, Date ngay, String maKH, long tongtien,
			String username) {
		super();
		this.maHD = maHD;
		this.ngay = ngay;
		this.maKH = maKH;
		Tongtien = tongtien;
		this.username = username;
	}
//	@Override
//	public String toString() {
//		return "HoaDon [maHD=" + maHD + ", ngay=" + ngay + ", maKH=" + maKH + ", maLoaiXe=" + maLoaiXe + ", soluong="
//				+ soluong + ", hinhthucTT=" + hinhthucTT + ", Tongtien=" + Tongtien + ", username=" + username + "]";
//	}
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
	public HoaDon() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
