/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlbaiguixe.model;

import ThongBao.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;

/**
 *
 * @author DELL
 */
public class TRAXEDAO {

    //
        public boolean insert(TRAXE trxe2) throws Exception {
        String sql = "insert into RABEN(MAVE,BIENSOXE,TENKHUVUC,THOIGIANRA,TINHTRANGVE,SOTIEN) values(?,?,?,?,N'Không Sử Dụng',?)";
        try (
                Connection connection = DBConnection.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, trxe2.getMAVE());
            //pstmt.setString(2, trxe2.getLOAIVE());
            pstmt.setString(2, trxe2.getBIENSO());
            pstmt.setString(3, trxe2.getKHUVUC());
            pstmt.setString(4, trxe2.getTHOIGIANRA());
            pstmt.setString(5, trxe2.getSOTIEN());
//pstmt.setString(5, trxe.getNGAYGIOVAO());

            return pstmt.executeUpdate() > 0;
        }
    }

    public TRAXE finById(String maVe) throws Exception {
        String sql = "SELECT VAOBEN.MAVE, VE.LOAIVE,VAOBEN.TENKHUVUC,VAOBEN.BIENSOXE, VAOBEN.BIENSOXE, VAOBEN.THOIGIANVAO,VAOBEN.SOTIEN FROM VE RIGHT JOIN VAOBEN ON VE.MAVE=VAOBEN.MAVE where VAOBEN.MAVE = ?";
        try (
                Connection connection = DBConnection.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, maVe);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                TRAXE trxe2 = new TRAXE();
                trxe2.setMAVE(rs.getString("MAVE"));
                trxe2.setLOAIVE(rs.getString("LOAIVE"));
                trxe2.setKHUVUC(rs.getString("TENKHUVUC"));
                trxe2.setBIENSO(rs.getString("BIENSOXE"));
                trxe2.setTHOIGIANRA(rs.getString("THOIGIANVAO"));
                trxe2.setSOTIEN(rs.getString("SOTIEN"));

                return trxe2;
            }

//return pstmt.executeUpdate() > 0;
        }
        return null;
    }

    public TRAXE findByLicencePlate(String licencePlate) {
        String sql = "SELECT VAOBEN.MAVE, VE.LOAIVE,VAOBEN.TENKHUVUC,VAOBEN.BIENSOXE, VAOBEN.BIENSOXE, VAOBEN.THOIGIANVAO,VAOBEN.SOTIEN FROM VE RIGHT JOIN VAOBEN ON VE.MAVE=VAOBEN.MAVE where VAOBEN.BIENSOXE =?";
        try (
                Connection connection = DBConnection.getConnection(); 
                PreparedStatement pstmt = connection.prepareStatement(sql);) 
        {
            pstmt.setString(1, licencePlate);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                TRAXE trxe2 = new TRAXE();
                trxe2.setMAVE(rs.getString("MAVE"));
                trxe2.setLOAIVE(rs.getString("LOAIVE"));
                trxe2.setKHUVUC(rs.getString("TENKHUVUC"));
                trxe2.setBIENSO(rs.getString("BIENSOXE"));
                trxe2.setTHOIGIANRA(rs.getString("THOIGIANVAO"));
                trxe2.setSOTIEN(rs.getString("SOTIEN"));


                return trxe2;
            }

//return pstmt.executeUpdate() > 0;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean update(TRAXE trxe) throws Exception {
        String sql = "update VAOBEN set BIENSOXE = ?,TENKHUVUC =? , THOIGIANVAO=?" + " where MAVE =?";
        try (
                Connection connection = DBConnection.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(4, trxe.getMAVE());
           // pstmt.setString(1, trxe.getLOAIVE());
            pstmt.setString(1, trxe.getBIENSO());
            pstmt.setString(2, trxe.getKHUVUC());
            pstmt.setString(3, trxe.getTHOIGIANRA());
//pstmt.setString(5, trxe.getNGAYGIOVAO());

            return pstmt.executeUpdate() > 0;
        }
    }
//    
//        public boolean xoaxe(TRAXE trxe) throws Exception {
//        String sql = "delete RAVAOBEN set  LOAIVE = ?,BIENSOXE = ?,TENKHUVUC =? , THOIGIANVAO=?" + " where MAVE =?";
//        try (
//                Connection connection = DBConnection.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql);) {
//            pstmt.setString(5, trxe.getMAVE());
//            pstmt.setString(1, trxe.getLOAIVE());
//            pstmt.setString(2, trxe.getBIENSO());
//            pstmt.setString(3, trxe.getKHUVUC());
//            pstmt.setString(4, trxe.getTHOIGIANVAO());
////pstmt.setString(5, trxe.getNGAYGIOVAO());
//
//            return pstmt.executeUpdate() > 0;
//        }
//    }
}
