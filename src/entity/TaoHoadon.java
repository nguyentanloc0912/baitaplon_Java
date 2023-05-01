package entity;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.Dao_Hoadon1;

public class TaoHoadon {
	public static String TaoSoHD() {
		String soHoaDon = "";
		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			Date d = new Date();
			soHoaDon  = "HD"+ dateFormat.format(d);
			System.out.println("Số Hóa Đơn" + soHoaDon);
			ResultSet rs = Dao_Hoadon1.getCountByMaHoaDon(soHoaDon);
			int rowcount = 0;
			if(rs.next()) {
				rowcount = rs.getInt(1);
			}
			boolean dup = false;
			do {
				if(rowcount > 98) {
					soHoaDon = soHoaDon+(rowcount+1);
				}else if(rowcount > 8) {
					soHoaDon = soHoaDon+ "0" + (rowcount+1);
				}else {
					soHoaDon = soHoaDon + "00" + (rowcount+1);
				}
				System.out.println("SoHoaDon" + soHoaDon);
				ResultSet rs2 = Dao_Hoadon1.getHoaDonByMaHoaDon(soHoaDon);
				if(rs2.next()) {
					dup = true;
					rowcount++;
					soHoaDon = "HD"+dateFormat.format(d);
					
				}else {
					dup = false;
					
				}
			}while(dup);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Lỗi");
		}
		return soHoaDon;
	}

}
