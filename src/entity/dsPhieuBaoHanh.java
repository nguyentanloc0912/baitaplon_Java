package model;

import java.util.ArrayList;

public class dsPhieuBaoHanh {
	private ArrayList<phieuBaoHanh> dsPBH;

	public dsPhieuBaoHanh(ArrayList<phieuBaoHanh> dsPBH) {
		super();
		this.dsPBH = dsPBH;
	}

	public dsPhieuBaoHanh() {
		this.dsPBH = new ArrayList<phieuBaoHanh>();
	}

	public ArrayList<phieuBaoHanh> getDsPBH() {
		return dsPBH;
	}

	public phieuBaoHanh getPhieuBaoHanh(int i) {
		if(i >= 0 && i <= dsPBH.size())
			return dsPBH.get(i);
		return null;
	}
	
	public boolean themPBH(phieuBaoHanh pbh) {
		for (phieuBaoHanh phieuBaoHanh : dsPBH) {
			if(phieuBaoHanh.getMaPBH().equals(pbh.getMaPBH()))
				return false;
		}
		dsPBH.add(pbh);
		return true;
	}
	
	public boolean xoaPBH(int i) {
		if(i>=0 && i<=dsPBH.size()) {
			dsPBH.remove(i);
			return true;
		}else
			return false;
	}
	
	@Override
	public String toString() {
		return "dsPhieuBaoHanh [dsPBH=" + dsPBH + "]";
	}
	
}
