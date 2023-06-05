/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nghincjava3.ass.Model;



public class bangdiem {
    private int ma;
    private String masinhvien;
    private float tienganh,tinhoc,gdtc;

    public bangdiem() {
    }

    public bangdiem(int ma, String masinhvien, float tienganh, float tinhoc, float gdtc) {
        this.ma = ma;
        this.masinhvien = masinhvien;
        this.tienganh = tienganh;
        this.tinhoc = tinhoc;
        this.gdtc = gdtc;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getMasinhvien() {
        return masinhvien;
    }

    public void setMasinhvien(String masinhvien) {
        this.masinhvien = masinhvien;
    }

    public float getTienganh() {
        return tienganh;
    }

    public void setTienganh(float tienganh) {
        this.tienganh = tienganh;
    }

    public float getTinhoc() {
        return tinhoc;
    }

    public void setTinhoc(float tinhoc) {
        this.tinhoc = tinhoc;
    }

    public float getGdtc() {
        return gdtc;
    }

    public void setGdtc(float gdtc) {
        this.gdtc = gdtc;
    }
    
        
    
}
