package quanlinhansu;

import java.util.Date;

public class HuanLuyenVien extends NhanVien {

    private int soNamKinhNghiem;
    private double luongCoBan;
    private double phuCap;
    private double heSoLuong;

    public HuanLuyenVien() {
        // TODO Auto-generated constructor stub
    }

    public HuanLuyenVien(String ID, String tenNhanVien, String quocTich, boolean gioiTinh, Date ngaySinh, Date ngayVaoLam, int soNamKinhNghiem, double luongCoban, double phuCap, double heSoLuong) {
        this.ID = ID;
        this.tenNhanVien = tenNhanVien;
        this.quocTich = quocTich;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.ngayVaolam = ngayVaoLam;
        this.soNamKinhNghiem = soNamKinhNghiem;
        this.luongCoBan = luongCoban;
        this.phuCap = phuCap;
        this.heSoLuong = heSoLuong;
    }

    public int getSoNamKinhNghiem() {
        return soNamKinhNghiem;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public double getPhuCap() {
        return phuCap;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    @Override
    public double tinhLuong() {
        // TODO Auto-generated method stub
        return this.phuCapThamNien() + this.heSoLuong * HuanLuyenVien.LUONG_CB + this.phuCap;
    }
}
