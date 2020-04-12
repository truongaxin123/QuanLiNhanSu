/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlinhansu;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Set;

/**
 *
 * @author truon
 */
public class DSNhanVien {

    public Hashtable<String, NhanVien> my_dict = new Hashtable<String, NhanVien>();

    public DSNhanVien() {

    }

    public void themNhanVien(String ID, NhanVien a) {
        my_dict.put(ID, a);
    }

    public void suaNhanVien(String ID, NhanVien a) {
        my_dict.put(ID, a);
    }

    public void xoaNhanVien(String ID) {
        my_dict.remove(ID);
    }

    public void xuatNhanVien() {
        for (String key : my_dict.keySet()) {
            NhanVien value = my_dict.get(key);
            System.out.println(key + " = " + value);
        }
    }

    public String luongCaoNhat() {
        double luong = 0;
        String id = null;
        for (NhanVien a : this.my_dict.values()) {
            if (a.tinhLuong() > luong) {
                luong = a.tinhLuong();
                id = a.getID();
            }
        }
        return id;
    }
}
