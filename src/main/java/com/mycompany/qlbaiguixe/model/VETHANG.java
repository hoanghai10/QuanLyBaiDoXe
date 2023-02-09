/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlbaiguixe.model;

/**
 *
 * @author DELL
 */
public class VETHANG {
      private String MAVE , SODIENTHOAI , BIENSOXE , TENKHACHHANG,TINHTRANGVE,NGAYDANGKY, SOTIEN,NGAYHETHAN,TENKHUVUC;

    public VETHANG() {
    }

    public VETHANG(String MAVE, String SODIENTHOAI, String BIENSOXE, String TENKHACHHANG, String TINHTRANGVE,String NGAYDANGKY, String SOTIEN,String NGAYHEYHAN,String TENKHUVUC) {
        this.MAVE = MAVE;
        this.SODIENTHOAI = SODIENTHOAI;
        this.BIENSOXE = BIENSOXE;
        this.TENKHACHHANG = TENKHACHHANG;
        this.TINHTRANGVE = TINHTRANGVE;
        this.NGAYDANGKY=NGAYDANGKY;
        this.SOTIEN = SOTIEN;
        this.NGAYHETHAN = NGAYHETHAN;
        this.TENKHUVUC=TENKHUVUC;
    }

    public String getMAVE() {
        return MAVE;
    }

    public void setMAVE(String MAVE) {
        this.MAVE = MAVE;
    }

    public String getSODIENTHOAI() {
        return SODIENTHOAI;
    }

    public void setSODIENTHOAI(String SODIENTHOAI) {
        this.SODIENTHOAI = SODIENTHOAI;
    }

    public String getTENKHUVUC() {
        return TENKHUVUC;
    }

    public void setTENKHUVUC(String TENKHUVUC) {
        this.TENKHUVUC = TENKHUVUC;
    }

    public String getBIENSOXE() {
        return BIENSOXE;
    }

    public void setBIENSOXE(String BIENSOXE) {
        this.BIENSOXE = BIENSOXE;
    }

    public String getTENKHACHHANG() {
        return TENKHACHHANG;
    }

    public void setTENKHACHHANG(String TENKHACHHANG) {
        this.TENKHACHHANG = TENKHACHHANG;
    }

    public String getTINHTRANGVE() {
        return TINHTRANGVE;
    }

    public void setTINHTRANGVE(String TINHTRANGVE) {
        this.TINHTRANGVE = TINHTRANGVE;
    }

    public String getNGAYDANGKY() {
        return NGAYDANGKY;
    }

    public void setNGAYDANGKY(String NGAYDANGKY) {
        this.NGAYDANGKY = NGAYDANGKY;
    }

    public String getSOTIEN() {
        return SOTIEN;
    }

    public void setSOTIEN(String SOTIEN) {
        this.SOTIEN = SOTIEN;
    }

    public String getNGAYHETHAN() {
        return NGAYHETHAN;
    }

    public void setNGAYHETHAN(String NGAYHETHAN) {
        this.NGAYHETHAN = NGAYHETHAN;
    }
      
}
