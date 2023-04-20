package entity;

import java.util.Date;
import java.time.LocalDate;
import java.util.Objects;



public class NhanVien {
private String usename;
private String password;
private String hoTen;
private Date ngaySinh;
private String email;
private String phone;
public String getUsename() {
	return usename;
}
public void setUsename(String usename) {
	this.usename = usename;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getHoTen() {
	return hoTen;
}
public void setHoTen(String hoTen) {
	this.hoTen = hoTen;
}
public Date getNgaySinh() {
	return ngaySinh;
}
public void setNgaySinh(Date ngaySinh) {
	this.ngaySinh = ngaySinh;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public NhanVien(String usename, String password, String hoTen, Date ngaySinh, String email, String phone) {
	this.usename = usename;
	this.password = password;
	this.hoTen = hoTen;
	this.ngaySinh = ngaySinh;
	this.email = email;
	this.phone = phone;
}
@Override
public int hashCode() {
	return Objects.hash(usename);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	NhanVien other = (NhanVien) obj;
	return Objects.equals(usename, other.usename);
}
public NhanVien() {
	super();
}
public NhanVien(String usename) {
	super();
	this.usename = usename;
}

}
