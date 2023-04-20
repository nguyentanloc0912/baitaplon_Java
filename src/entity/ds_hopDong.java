package model;

import java.util.ArrayList;

public class ds_hopDong {
	private ArrayList<hopDong_model> dsHD;

	public ds_hopDong(ArrayList<hopDong_model> dsHD) {
		this.dsHD = dsHD;
	}

	public ds_hopDong() {
		this.dsHD = new ArrayList<hopDong_model>();
	}

	public ArrayList<hopDong_model> getDsHD() {
		return dsHD;
	}

	public hopDong_model getHopDong(int i) {
		if(i >= 0 && i<=dsHD.size())
			return dsHD.get(i);
		return null;
	}
	
	public boolean themHD(hopDong_model hd) {
		for (hopDong_model hopDong_model : dsHD) {
			if(hopDong_model.getSoDH() == hd.getSoDH())
				return false;
		}
		dsHD.add(hd);
		return true;
	}
	
	public boolean xoaHD(int i) {
		if(i>=0 && i<=dsHD.size()) {
			dsHD.remove(i);
			return true;
		}else
			return false;
	}
	
	public int timKiemDH(int soDH) {
		for(int i=0;i<dsHD.size();i++) {
			if(dsHD.get(i).getSoDH() == soDH)
				return i;
		}
		return -1;
	}
	
	public boolean capNhatHD(int soHDCu, hopDong_model hDMoi) {
		hopDong_model hDCu = new hopDong_model(soHDCu);
		if (dsHD.contains(hDCu)) {
			hDCu = dsHD.get(dsHD.indexOf(hDCu));
			hDCu.setNgayHD(hDMoi.getNgayHD());
			hDCu.setTgbaohanh(hDMoi.getTgbaohanh());
			hDCu.setTienPhaiThanhToan(hDMoi.getTienPhaiThanhToan());
			hDCu.setTienDaTra(hDMoi.getTienDaTra());
			hDCu.setMaNV(hDMoi.getMaNV());
			hDCu.setTragop(hDMoi.getTragop());
			hDCu.setNgayTraTien(hDMoi.getNgayTraTien());
			hDCu.setTenKH(hDMoi.getTenKH());
			hDCu.setDiaChi(hDMoi.getDiaChi());
			hDCu.setSdt(hDMoi.getSdt());
			return true;
		}
		return false;
	}

	public int count() {
		return dsHD.size();
	}

	@Override
	public String toString() {
		return "ds_hopDong [dsHD=" + dsHD + "]";
	}
	
}
