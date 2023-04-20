package entity;

public class sanPham {
	private String maLoai,tenLoai,nsx;
	private double giaBan;
	private int soluong;
	private String soSuon,soKhung;
	private int soPK;
	public sanPham(String maLoai, String tenLoai, String nsx, double giaBan, int soluong, String soSuon, String soKhung,
			int soPK) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
		this.nsx = nsx;
		this.giaBan = giaBan;
		this.soluong = soluong;
		this.soSuon = soSuon;
		this.soKhung = soKhung;
		this.soPK = soPK;
	}
	
	public sanPham(String maLoai, double giaBan, int soluong) {
		super();
		this.maLoai = maLoai;
		this.giaBan = giaBan;
		this.soluong = soluong;
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
	public double getGiaBan() {
		return giaBan;
	}
	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}
	public int getSoluong() {
		return soluong;
	}
	public void setSoluong(int soluong) {
		this.soluong = soluong;
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
		return "sanPham [maLoai=" + maLoai + ", tenLoai=" + tenLoai + ", nsx=" + nsx + ", giaBan=" + giaBan
				+ ", soluong=" + soluong + ", soSuon=" + soSuon + ", soKhung=" + soKhung + ", soPK=" + soPK + "]";
	}
	
}
