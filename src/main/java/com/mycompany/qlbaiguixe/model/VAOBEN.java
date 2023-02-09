/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlbaiguixe.model;

import Controller.*;

/**
 *
 * @author hthkt
 */
public class VAOBEN {
    private String MAVE;
    private String LOAIVE,TENKHUVUC,BIENSOXE,TINHTRANGVE
    ,THOIGIANVAO,GIOVAO,GIATIEN,THOIGIANRA;

    public VAOBEN(String MAVE, String LOAIVE, String BIENSOXE, String TENKHUVUC, String TINHTRANGVE, String THOIGIANVAO, String GIOVAO,String GIATIEN,String THOIGIANRA) {
        this.MAVE = MAVE;
        this.LOAIVE = LOAIVE;
        this.TENKHUVUC = TENKHUVUC;
        this.BIENSOXE = BIENSOXE;
        this.THOIGIANVAO = THOIGIANVAO;
        this.GIOVAO = GIOVAO;
        this.TINHTRANGVE = TINHTRANGVE;
        this.GIATIEN = GIATIEN;
        this.THOIGIANRA=THOIGIANRA;
    }

    public String getMAVE() {
        return MAVE;
    }

    public void setMAVE(String MAVE) {
        this.MAVE = MAVE;
    }

    public String getTHOIGIANRA() {
        return THOIGIANRA;
    }

    public void setTHOIGIANRA(String THOIGIANRA) {
        this.THOIGIANRA = THOIGIANRA;
    }

    public String getLOAIVE() {
        return LOAIVE;
    }

    public void setLOAIVE(String LOAIVE) {
        this.LOAIVE = LOAIVE;
    }

    public String getTENKHUVUC() {
        return TENKHUVUC;
    }

    public void setTENKHUVUC(String KHUVUC) {
        this.TENKHUVUC = KHUVUC;
    }

    public String getBIENSOXE() {
        return BIENSOXE;
    }

    public void setBIENSOXE(String BIENSOXE) {
        this.BIENSOXE = BIENSOXE;
    }

    public String getTHOIGIANVAO() {
        return THOIGIANVAO;
    }

    public void setTHOIGIANVAO(String THOIGIANVAO) {
        this.THOIGIANVAO = THOIGIANVAO;
    }

    public String getGIOVAO() {
        return GIOVAO;
    }

    public void setGIOVAO(String GIOVAO) {
        this.GIOVAO = GIOVAO;
    }

    public String getTINHTRANGVE() {
        return TINHTRANGVE;
    }

    public void setTINHTRANGVE(String TINHTRANGVE) {
        this.TINHTRANGVE = TINHTRANGVE;
    }
    public String getGIATIEN(){
    return GIATIEN;
    }
    public void setGIATIEN(String GIATIEN){
        this.GIATIEN = GIATIEN;
    }

    public VAOBEN() {
    }
    
}
