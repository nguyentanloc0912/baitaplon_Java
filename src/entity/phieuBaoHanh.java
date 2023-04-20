package model;

public class phieuBaoHanh {
	private String maPBH,tenNV,maKH,tenLK,lidoBH;
	private int soluong;
	private String loi;
	private double giatien;
	private double thanhtien;
	public phieuBaoHanh(String maPBH, String tenNV, String maKH, String tenLK, String lidoBH, int soluong, String loi,
			double giatien) {
		super();
		this.maPBH = maPBH;
		this.tenNV = tenNV;
		this.maKH = maKH;
		this.tenLK = tenLK;
		this.lidoBH = lidoBH;
		this.soluong = soluong;
		this.loi = loi;
		this.giatien = giatien;
	}
	
	public phieuBaoHanh(String maPBH, String tenLK, int soluong, double thanhtien) {
		super();
		this.maPBH = maPBH;
		this.tenLK = tenLK;
		this.soluong = soluong;
		this.thanhtien = thanhtien;
	}

	public phieuBaoHanh(String maPBH) {
		super();
		this.maPBH = maPBH;
	}
	public String getMaPBH() {
		return maPBH;
	}
	public void setMaPBH(String maPBH) {
		this.maPBH = maPBH;
	}
	public String getTenNV() {
		return tenNV;
	}
	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getTenLK() {
		return tenLK;
	}
	public void setTenLK(String tenLK) {
		this.tenLK = tenLK;
	}
	public String getLidoBH() {
		return lidoBH;
	}
	public void setLidoBH(String lidoBH) {
		this.lidoBH = lidoBH;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}
	public String getLoi() {
		return loi;
	}
	public void setLoi(String loi) {
		this.loi = loi;
	}
	public double getGiatien() {
		return giatien;
	}
	public void setGiatien(double giatien) {
		this.giatien = giatien;
	}
	
	public double getThanhtien() {
		return thanhtien;
	}

	public void setThanhtien(double thanhtien) {
		this.thanhtien = soluong * giatien;
	}

	@Override
	public String toString() {
		return "phieuBaoHanh [maPBH=" + maPBH + ", tenNV=" + tenNV + ", maKH=" + maKH + ", tenLK=" + tenLK + ", lidoBH="
				+ lidoBH + ", soluong=" + soluong + ", loi=" + loi + ", giatien=" + giatien + "]";
	}
	
}
