package entity;

public class CT_HoaDon implements Serializable {
    private String maCTHD;
    private String maHD;
    private String maLoai;
    private int soluong;
    private double thanhtien;

    public CT_HoaDon(String maCTHD, String maHD, String maLoai, int soluong, double thanhtien) {
        this.maCTHD = maCTHD;
        this.maHD = maHD;
        this.maLoai = maLoai;
        this.soluong = soluong;
        this.thanhtien = thanhtien;
    }

    public String getMaCTHD() {
        return maCTHD;
    }

    public void setMaCTHD(String maCTHD) {
        this.maCTHD = maCTHD;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public double getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(double thanhtien) {
        this.thanhtien = thanhtien;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((maCTHD == null) ? 0 : maCTHD.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CT_HoaDon other = (CT_HoaDon) obj;
        if (maCTHD == null) {
            if (other.maCTHD != null)
                return false;
        } else if (!maCTHD.equals(other.maCTHD))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "CT_HoaDon [maCTHD=" + maCTHD + ", maHD=" + maHD + ", maLoai=" + maLoai + ", soluong=" + soluong
                + ", thanhtien=" + thanhtien + "]";
    }

}
