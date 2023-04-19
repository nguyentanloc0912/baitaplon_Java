package model;

import java.util.ArrayList;

public class ds_NhanVien extends ArrayList<NhanVien> {
public ArrayList<NhanVien> ds;

public ds_NhanVien() {
	this.ds= new ArrayList<NhanVien>();
}
public boolean add(NhanVien nv) {
	if(ds.contains(nv)) {
		return false;
	}
	ds.add(nv);
	return true;
	
}
ArrayList<NhanVien> getds(){
	return ds;
}

}
