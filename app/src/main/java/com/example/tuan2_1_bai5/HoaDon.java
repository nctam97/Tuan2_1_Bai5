package com.example.tuan2_1_bai5;

public class HoaDon {
    public HoaDon(String tenkh, int soluongsach, boolean isVip) {
        this.tenkh = tenkh;
        this.soluongsach = soluongsach;
        this.isVip = isVip;
    }

    public String getTenkh() {
        return tenkh;
    }

    public void setTenkh(String tenkh) {
        this.tenkh = tenkh;
    }

    public int getSoluongsach() {
        return soluongsach;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    public void setSoluongsach(int soluongsach) {
        this.soluongsach = soluongsach;
    }
    public double thanhtien(){
        final int dongia=20000;
        if(isVip==false)
            return (double)(soluongsach*dongia);
        return (soluongsach*dongia)-(soluongsach*dongia*0.1);
    }
    private String tenkh;
    private int soluongsach;
    private boolean isVip;

}