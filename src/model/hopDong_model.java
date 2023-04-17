package model;

import java.time.LocalDate;

public class hopDong_model {
	private int soDH;
	private String ngayHD;
	private int tgbaohanh;
	private double tienPhaiThanhToan;
	private double tienDaTra;
	private String maNV;
	private String tragop;
	private int lanTra;
	private String ngayTraTien;
	private String tenKH,diaChi,sdt;
	public hopDong_model(int soDH, String ngayHD, int tgbaohanh, double tienPhaiThanhToan, double tienDaTra,
			String maNV,String tragop ,int lanTra, String ngayTraTien, String tenKH, String diaChi, String sdt) {
		this.setSoDH(soDH);
		this.setNgayHD(ngayHD);
		this.setTgbaohanh(tgbaohanh);
		this.setTienPhaiThanhToan(tienPhaiThanhToan);
		this.setTienDaTra(tienDaTra);
		this.setMaNV(maNV);
		this.setTragop(tragop);
		this.setTenKH(tenKH);
		this.setDiaChi(diaChi);
		this.setSdt(sdt);
		this.setNgayTraTien(ngayTraTien);
		this.setLanTra(lanTra);
	}
	
	public hopDong_model(int soDH) {
		this.setSoDH(soDH);
	}

	public int getSoDH() {
		return soDH;
	}
	public void setSoDH(int soDH) {
		if(soDH > 0)
			this.soDH = soDH;
		else 
			this.soDH = 1;
	}
	public String getNgayHD() {
		return ngayHD;
	}
	public void setNgayHD(String ngayHD) {
		this.ngayHD = ngayHD;
	}
	public int getTgbaohanh() {
		return tgbaohanh;
	}
	public void setTgbaohanh(int tgbaohanh) {
		if(tgbaohanh > 0)
			this.tgbaohanh = tgbaohanh;
		else
			this.tgbaohanh = 1;
	}
	public double getTienPhaiThanhToan() {
		return tienPhaiThanhToan;
	}
	public void setTienPhaiThanhToan(double tienPhaiThanhToan) {
		if(tienPhaiThanhToan > 0)
			this.tienPhaiThanhToan = tienPhaiThanhToan;
		else
			this.tienPhaiThanhToan = 1;
	}
	public double getTienDaTra() {
		return tienDaTra;
	}
	public void setTienDaTra(double tienDaTra) {
		if(tienDaTra >= 0)
			this.tienDaTra = tienDaTra;
		else
			this.tienDaTra = 0;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		if(!maNV.equals(""))
			this.maNV = maNV;
		else
			this.maNV = "null";
	}
	
	public String getTragop() {
		return tragop;
	}

	public void setTragop(String tragop) {
		this.tragop = tragop;
	}

	public String getTenKH() {
		return tenKH;
	}
	public void setTenKH(String tenKH) {
		if(!tenKH.equals(""))
			this.tenKH = tenKH;
		else
			this.tenKH = "null";
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		if(!tenKH.equals(""))
			this.diaChi = diaChi;
		else
			this.diaChi = "null";
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		if(!sdt.equals(""))
			this.sdt = sdt;
		else
			this.sdt = "null";
	}
	public String getNgayTraTien() {
		return ngayTraTien;
	}
	public void setNgayTraTien(String ngayTraTien) {
		this.ngayTraTien = ngayTraTien;
	}

	public int getLanTra() {
		return lanTra;
	}

	public void setLanTra(int lanTra) {
		this.lanTra = lanTra;
	}

	@Override
	public String toString() {
		return "hopDong_model [soDH=" + soDH + ", ngayHD=" + ngayHD + ", tgbaohanh=" + tgbaohanh
				+ ", tienPhaiThanhToan=" + tienPhaiThanhToan + ", tienDaTra=" + tienDaTra + ", maNV=" + maNV
				+ ", tragop=" + tragop + ", ngayTraTien=" + ngayTraTien + ", tenKH=" + tenKH + ", diaChi=" + diaChi
				+ ", sdt=" + sdt + "]";
	}
	
	
}
