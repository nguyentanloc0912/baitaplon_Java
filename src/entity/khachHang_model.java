package entity;

import java.util.Date;
import java.time.LocalDate;
import java.util.Objects;

public class khachHang_model {
	private String maKH,tenKH;

	private String email, diaChi;
	public khachHang_model(String maKH, String tenKH,  String email, String diaChi) {
		this.setMaKH(maKH);
		this.setTenKH(tenKH);
	
		this.setEmail(email);
		this.setDiaChi(diaChi);
	}
	
	public khachHang_model() {
		super();
		this.diaChi="null";
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		if(email.equals(""))
			this.email = "NULL";
		else{
			this.email = email;
		}
			
	}
	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		if(diaChi.equals("")){
			this.diaChi = "xxx";
		}	
		else{
			this.diaChi =diaChi;
		}
			
	}

	
	

	@Override
	public String toString() {
		return  maKH;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((maKH == null) ? 0 : maKH.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		khachHang_model other = (khachHang_model) obj;
		if (maKH == null) {
			if (other.maKH != null)
				return false;
		} else if (!maKH.equals(other.maKH))
			return false;
		return true;
	}
	
	
}
