package entity;

public class ChiTietHoaDon {
public String maCTHoaDon;
public String maHoaDon;
public String maSP;

public int soLuong;
public long thanhTien;
public String ghiChu;

public int soluong;
public long thanhtien;



public ChiTietHoaDon(int soluong, long thanhtien) {
	super();
	this.soluong = soluong;
	this.thanhtien = thanhtien;
	
}




public String getMaCTHoaDon() {
	return maCTHoaDon;
}
public void setMaCTHoaDon(String maCTHoaDon) {
	this.maCTHoaDon = maCTHoaDon;
}
public String getMaHoaDon() {
	return maHoaDon;
}
public void setMaHoaDon(String maHoaDon) {
	this.maHoaDon = maHoaDon;
}
public String getMaSP() {
	return maSP;
}
public void setMaSP(String maSP) {
	this.maSP = maSP;
}
public int getSoLuong() {
	return soLuong;
}
public void setSoLuong(int soLuong) {
	this.soLuong = soLuong;
}
public long getThanhTien() {
	return thanhTien;
}
public void setThanhTien(long thanhTien) {
	this.thanhTien = thanhTien;
}
public String getGhiChu() {
	return ghiChu;
}
public void setGhiChu(String ghiChu) {
	this.ghiChu = ghiChu;
}
public ChiTietHoaDon(String maCTHoaDon, String maHoaDon, String maSP, int soLuong, long thanhTien, String ghiChu) {
	super();
	this.maCTHoaDon = maCTHoaDon;
	this.maHoaDon = maHoaDon;
	this.maSP = maSP;
	this.soLuong = soLuong;
	this.thanhTien = thanhTien;
	this.ghiChu = ghiChu;
}
public ChiTietHoaDon() {
	super();
}


}
