package model;

import java.time.LocalDate;

public class khachHang_model {
	private String maKH,tenKH,sdt;
	private LocalDate ngaySinh;
	private String email;
	public khachHang_model(String maKH, String tenKH, String sdt, LocalDate ngaySinh, String email) {
		this.setMaKH(maKH);
		this.setTenKH(tenKH);
		this.setSdt(sdt);
		this.setNgaySinh(ngaySinh);
		this.setEmail(email);
	}
	
	public khachHang_model(String maKH) {
		this.setMaKH(maKH);
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
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		if(!sdt.equals(""))
			this.sdt = sdt;
		else
			this.sdt = "null";
	}
	public LocalDate getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(LocalDate ngaySinh) {
		if(ngaySinh.isBefore(LocalDate.now()))
			this.ngaySinh = ngaySinh;
		else 
			this.ngaySinh = LocalDate.now();
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.equals(""))
			this.email = email;
		else
			this.email = "null";
	}
	@Override
	public String toString() {
		return "khachHang_model [maKH=" + maKH + ", tenKH=" + tenKH + ", sdt=" + sdt + ", ngaySinh=" + ngaySinh
				+ ", email=" + email + "]";
	}
	
	
}
