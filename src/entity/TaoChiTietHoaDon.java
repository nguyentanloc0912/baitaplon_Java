package entity;

import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import dao.Dao_CtHoaDon;
import dao.Dao_Hoadon1;

public class TaoChiTietHoaDon {
	public static String TaoSoCTHD() {
		String soCTHoaDon = "";
		try {
			DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
			Date d = new Date();
			soCTHoaDon  = "CTHD"+dateFormat.format(d);
			System.out.println("Số Chi tiết Đơn" + soCTHoaDon);
			ResultSet rs = Dao_CtHoaDon.getCountByMaCtHoaDon(soCTHoaDon);
			int rowcount = 0;
			if(rs.next()) {
				rowcount = rs.getInt(1);
			}
			boolean dup = false;
			do {
				if(rowcount > 98) {
					soCTHoaDon = soCTHoaDon+(rowcount+1);
				}else if(rowcount > 8) {
					soCTHoaDon = soCTHoaDon+ "A" + (rowcount+1);
				}else {
					soCTHoaDon = soCTHoaDon + "AA" + (rowcount+1);
				}
				System.out.println("SoHoaDon" + soCTHoaDon);
				ResultSet rs2 = Dao_CtHoaDon.getCtHoaDonByMaCtHoaDon(soCTHoaDon);
				if(rs2.next()) {
					dup = true;
					rowcount++;
					soCTHoaDon = "CTHD"+dateFormat.format(d);
					
				}else {
					dup = false;
					
				}
			}while(dup);
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Lỗi");
		}
		return soCTHoaDon;
	}
}
