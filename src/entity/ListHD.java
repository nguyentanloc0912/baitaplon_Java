package entity;

import java.io.Serializable;
import java.util.ArrayList;

public class ListHD implements Serializable{
    ArrayList<HoaDon> ls;
 
	public ListHD() {
		// TODO Auto-generated constructor stub
		ls = new ArrayList<HoaDon>();
	}
	
      public ArrayList<HoaDon> getLs() {
		return ls;
	}

	public void setLs(ArrayList<HoaDon> ls) {
		this.ls = ls;
	}

	public boolean themHD(HoaDon hd) {
    	  if(ls.contains(hd))
    		  return false;
    	  ls.add(hd);
    	  return true;
      }
      
      public boolean xoaHD(int index) {
			if(index > 0 || index < ls.size())
			{
			 ls.remove(index);
			 return true;
			}
		return false;
	
	}
      public HoaDon timHD(String maHD)
  	{
  		for(HoaDon hd : ls)
  			if(hd.getMaHD().equals(maHD))
  				return ls.get(ls.indexOf(hd));
  		return null;
  	}
	public int getSize() {
		return ls.size();
	}
	public HoaDon getElement(int index) {
		if(index < 0 || index > ls.size()) {
			return ls.get(index);
		}
		return null;
		
	}
}

