package model;

import java.util.ArrayList;

import view.KhachHang;

public class ds_KhachHang {
	private ArrayList<khachHang_model> dsKH;

	public ds_KhachHang(ArrayList<khachHang_model> dsKH) {
		super();
		this.dsKH = dsKH;
	}

	public ds_KhachHang() {
		dsKH = new ArrayList<khachHang_model>();
	}

	public ArrayList<khachHang_model> getDsKH() {
		return dsKH;
	}

	public khachHang_model getHopDong(int i) {
		if(i >= 0 && i<=dsKH.size())
			return dsKH.get(i);
		return null;
	}
	
	public boolean themKH(khachHang_model kh) {
		for (khachHang_model khachhang_model : dsKH) {
			if(khachhang_model.getMaKH().equals(kh.getMaKH()))
				return false;
		}
		dsKH.add(kh);
		return true;
	}
	
	public boolean xoaKH(int i) {
		if(i>=0 && i<=dsKH.size()) {
			dsKH.remove(i);
			return true;
		}else
			return false;
	}
	
	public int timKiemKH(String maKH) {
		for(int i=0;i<dsKH.size();i++) {
			if(dsKH.get(i).getMaKH().equals(maKH))
				return i;
		}
		return -1;
	}
	
	public boolean capNhatKH(String maKHCu, khachHang_model khMoi) {
		khachHang_model khCu = new khachHang_model(maKHCu);
		if (dsKH.contains(khCu)) {
			khCu = dsKH.get(dsKH.indexOf(khCu));
			khCu.setTenKH(khMoi.getTenKH());
			khCu.setSdt(khMoi.getSdt());
			khCu.setNgaySinh(khMoi.getNgaySinh());
			khCu.setEmail(khMoi.getEmail());
			return true;
		}
		return false;
	}

	public int count() {
		return dsKH.size();
	}


	@Override
	public String toString() {
		return "ds_KhachHang [dsKH=" + dsKH + "]";
	}
	
	
}
