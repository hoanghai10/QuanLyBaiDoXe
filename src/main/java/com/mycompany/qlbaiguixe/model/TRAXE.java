/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlbaiguixe.model;

/**
 *
 * @author DELL
 */
public class TRAXE {
    private String MAVE,LOAIVE,BIENSO,KHUVUC,THOIGIANRA,SOTIEN;

    public TRAXE() {
    }

    public TRAXE(String MAVE, String LOAIVE, String BIENSO, String KHUVUC,String THOIGIANRA,String SOTIEN) {
        this.MAVE = MAVE;
        this.LOAIVE = LOAIVE;
        this.BIENSO = BIENSO;
        this.KHUVUC = KHUVUC;
        this.THOIGIANRA= THOIGIANRA;
        this.SOTIEN= SOTIEN;

    }

    public String getMAVE() {
        return MAVE;
    }

    public String getSOTIEN() {
        return SOTIEN;
    }

    public void setSOTIEN(String SOTIEN) {
        this.SOTIEN = SOTIEN;
    }
    

    public void setMAVE(String MAVE) {
        this.MAVE = MAVE;
    }

    public String getLOAIVE() {
        return LOAIVE;
    }

    public void setLOAIVE(String LOAIVE) {
        this.LOAIVE = LOAIVE;
    }

    public String getBIENSO() {
        return BIENSO;
    }

    public void setBIENSO(String BIENSO) {
        this.BIENSO = BIENSO;
    }

    public String getKHUVUC() {
        return KHUVUC;
    }

    public void setKHUVUC(String KHUVUC) {
        this.KHUVUC = KHUVUC;
    }

    public String getTHOIGIANRA() {
        return THOIGIANRA;
    }

    public void setTHOIGIANRA(String THOIGIANRA) {
        this.THOIGIANRA = THOIGIANRA;
    }
    


 
    
}
