package model;

import java.time.LocalDate;

public class hopDong_model {
	private int soDH;
	private LocalDate ngayHD;
	private int tgbaohanh;
	private double tienPhaiThanhToan;
	private double tienDaTra;
	private String maNV,maKH,tenKH,diaChi,sdt;
	private LocalDate ngayTraTien;
	public hopDong_model(int soDH, LocalDate ngayHD, int tgbaohanh, double tienPhaiThanhToan, double tienDaTra,
			String maNV, String maKH, String tenKH, String diaChi, String sdt, LocalDate ngayTraTien) {
		this.setSoDH(soDH);
		this.setNgayHD(ngayHD);
		this.setTgbaohanh(tgbaohanh);
		this.setTienPhaiThanhToan(tienPhaiThanhToan);
		this.setTienDaTra(tienDaTra);
		this.setMaNV(maNV);
		this.setMaKH(maKH);
		this.setTenKH(tenKH);
		this.setDiaChi(diaChi);
		this.setSdt(sdt);
		this.setNgayTraTien(ngayTraTien);
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
	public LocalDate getNgayHD() {
		return ngayHD;
	}
	public void setNgayHD(LocalDate ngayHD) {
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
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		if(!maKH.equals(""))
			this.maKH = maKH;
		else
			this.maKH = "null";
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
	public LocalDate getNgayTraTien() {
		return ngayTraTien;
	}
	public void setNgayTraTien(LocalDate ngayTraTien) {
		if(ngayTraTien.isAfter(ngayHD))
			this.ngayTraTien = ngayTraTien;
		else
			this.ngayTraTien = LocalDate.now();
	}
	@Override
	public String toString() {
		return "hopDong_model [soDH=" + soDH + ", ngayHD=" + ngayHD + ", tgbaohanh=" + tgbaohanh
				+ ", tienPhaiThanhToan=" + tienPhaiThanhToan + ", tienDaTra=" + tienDaTra + ", maNV=" + maNV + ", maKH="
				+ maKH + ", tenKH=" + tenKH + ", diaChi=" + diaChi + ", sdt=" + sdt + ", ngayTraTien=" + ngayTraTien
				+ "]";
	}
	
}
