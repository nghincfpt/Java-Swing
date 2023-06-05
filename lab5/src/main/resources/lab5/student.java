/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hh.lab5;

import java.io.Serializable;

/**
 *
 * @author ASUS
 */
public class student implements Serializable{
    private String msv;
    private String hoten;
    private String email;
    private String sdt;
    private String diachi;
    private boolean gioitinh;
   
  

    public student() {
    }

    public student(String msv, String hoten, String email, String sdt, String diachi, boolean gioitinh) {
        this.msv = msv;
        this.hoten = hoten;
        this.email = email;
        this.sdt = sdt;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

   
    
}
