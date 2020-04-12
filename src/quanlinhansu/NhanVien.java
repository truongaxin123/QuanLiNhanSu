package quanlinhansu;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class NhanVien implements iDoiBong {

    protected String ID;
    protected String tenNhanVien;
    protected String quocTich;
    protected boolean gioiTinh;
    protected Date ngaySinh;
    protected Date ngayVaolam;

    public NhanVien() {

    }

    public String getID() {
        return ID;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public String getGioiTinh() {
        if (gioiTinh) {
            return "Nam";
        } else {
            return "Nữ";
        }
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public String getNgaySinh() {
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = fm.format(this.ngaySinh);
        return strDate;
    }

    public String getNgayVaolam() {
        SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = fm.format(this.ngayVaolam);
        return strDate;
    }

    public int ThamNien() {
        // TODO Auto-generated method stub
        Calendar d1 = new GregorianCalendar();
        d1.setTime(this.ngayVaolam);
        Calendar d2 = new GregorianCalendar();
        Date hientaiDate = Calendar.getInstance().getTime();
        d2.setTime(hientaiDate);
        return d2.get(Calendar.YEAR) - d1.get(Calendar.YEAR);
    }

    public double phuCapThamNien() {
        return this.ThamNien() * NhanVien.PHU_CAP_MOT_NAM;
    }

    @Override
    public String toString() {
        return this.tenNhanVien; //To change body of generated methods, choose Tools | Templates.
    }

}
