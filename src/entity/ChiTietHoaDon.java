package entity;

public class ChiTietHoaDon {
public String maCTHoaDon;
public String maHoaDon;
public String maSP;
public int soluong;
public long thanhtien;

public sanPham sanPham;


public ChiTietHoaDon(sanPham sanPham,int soluong, long thanhtien) {
	super();
	this.soluong = soluong;
	this.thanhtien = thanhtien;
	this.sanPham = sanPham;
}
public sanPham getSanPham() {
	return sanPham;
}
public void setSanPham(sanPham sanPham) {
	this.sanPham = sanPham;
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
public int getSoluong() {
	return soluong;
}
public void setSoluong(int soluong) {
	this.soluong = soluong;
}
public long getThanhtien() {
	return thanhtien;
}
public void setThanhtien(long thanhtien) {
	this.thanhtien = thanhtien;
}
public ChiTietHoaDon(String maCTHoaDon, String maHoaDon, String maSP, int soluong, long thanhtien) {
	super();
	this.maCTHoaDon = maCTHoaDon;
	this.maHoaDon = maHoaDon;
	this.maSP = maSP;
	this.soluong = soluong;
	this.thanhtien = thanhtien;
}

}
