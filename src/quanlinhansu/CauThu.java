package quanlinhansu;

import java.util.Date;

public class CauThu extends NhanVien {

    private String viTriThiDauString;
    private int soLuotTranThamGia;
    private int soBanThang;
    private double luongThoaThuan;

    public CauThu() {
        // TODO Auto-generated constructor stub
    }

    public CauThu(String ID, String tenNhanVien, String quocTich, boolean gioiTinh, Date ngaySinh, Date ngayVaoLam, String viTriThiDauString, int soLuotTranThamGia, int soBanThang, double luongThoaThuan) {
        this.ID = ID;
        this.tenNhanVien = tenNhanVien;
        this.quocTich = quocTich;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.ngayVaolam = ngayVaoLam;
        this.viTriThiDauString = viTriThiDauString;
        this.soLuotTranThamGia = soLuotTranThamGia;
        this.soBanThang = soBanThang;
        this.luongThoaThuan = luongThoaThuan;
    }

    public String getViTriThiDauString() {
        return viTriThiDauString;
    }

    public int getSoLuotTranThamGia() {
        return soLuotTranThamGia;
    }

    public int getSoBanThang() {
        return soBanThang;
    }

    public double getLuongThoaThuan() {
        return luongThoaThuan;
    }

    @Override
    public double tinhLuong() {
        // TODO Auto-generated method stub
        return this.phuCapThamNien() + this.luongThoaThuan;
    }
}
