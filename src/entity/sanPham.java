package entity;

import java.math.BigDecimal;

public class sanPham {
	private String maLoai,tenLoai,nsx;
	private long giaBan;

	private String soSuon,soKhung;
	private int soPK;
	public sanPham(String maLoai, String tenLoai, String nsx, long giaBan, String soSuon, String soKhung,
			int soPK) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
		this.nsx = nsx;
		this.giaBan = giaBan;
		this.soSuon = soSuon;
		this.soKhung = soKhung;
		this.soPK = soPK;
	}
	
	public sanPham(String maLoai, long giaBan) {
		super();
		this.maLoai = maLoai;
		this.giaBan = giaBan;
		
	}

	public sanPham() {
		super();
	}
	public String getMaLoai() {
		return maLoai;
	}
	public void setMaLoai(String maLoai) {
		this.maLoai = maLoai;
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public String getNsx() {
		return nsx;
	}
	public void setNsx(String nsx) {
		this.nsx = nsx;
	}
	public long getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(long giaBan) {
		this.giaBan = giaBan;
	}
	
	public String getSoSuon() {
		return soSuon;
	}
	public void setSoSuon(String soSuon) {
		this.soSuon = soSuon;
	}
	public String getSoKhung() {
		return soKhung;
	}
	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}
	public int getSoPK() {
		return soPK;
	}
	public void setSoPK(int soPK) {
		this.soPK = soPK;
	}
	@Override
	public String toString() {
		return getTenLoai();
	}
	
}
