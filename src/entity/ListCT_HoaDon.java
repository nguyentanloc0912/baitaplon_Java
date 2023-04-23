package entity;

import java.io.Serializable;
import java.util.ArrayList;

public class ListCT_HoaDon implements Serializable {
    ArrayList<CT_HoaDon> ls;

    public ListCT_HoaDon() {
        // TODO Auto-generated constructor stub
        ls = new ArrayList<CT_HoaDon>();
    }

    public ArrayList<CT_HoaDon> getLs() {
        return ls;
    }

    public void setLs(ArrayList<CT_HoaDon> ls) {
        this.ls = ls;
    }

    public boolean themCTHD(CT_HoaDon ct) {
        if (ls.contains(ct))
            return false;
        ls.add(ct);
        return true;
    }

    public boolean xoaCTHD(int index) {
        if (index > 0 || index < ls.size()) {
            ls.remove(index);
            return true;
        }
        return false;

    }

    public CT_HoaDon timHD(String maCTHD) {
        for (CT_HoaDon ct : ls)
            if (ct.getMaCTHD().equals(maCTHD))
                return ls.get(ls.indexOf(ct));
        return null;
    }

    public int getSize() {
        return ls.size();
    }

    public CT_HoaDon getElement(int index) {
        if (index < 0 || index > ls.size()) {
            return ls.get(index);
        }
        return null;

    }
}
