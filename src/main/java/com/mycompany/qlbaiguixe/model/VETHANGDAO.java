/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlbaiguixe.model;

import ThongBao.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class VETHANGDAO {
                 public boolean insert(VETHANG themve2) throws Exception {
        String sql = "insert into VETHANG(MAVETHANG,BIENSOXE,SODIENTHOAI,TENKHACHHANG,NGAYHETHAN,SOTIEN,TINHTRANGVE,TENKHUVUC) values(?,?,?,?,?,N'500000',N'Chưa Hết Hạn',N'D')";
        try (
                Connection connection = DBConnection.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, themve2.getMAVE());
            pstmt.setString(2, themve2.getBIENSOXE());
            pstmt.setString(3, themve2.getSODIENTHOAI());
            pstmt.setString(4, themve2.getTENKHACHHANG());
            pstmt.setString(5, themve2.getNGAYHETHAN());
            //pstmt.setString(6, themve2.getSOTIEN());
            // pstmt.setString(5, trxe2.getKHUVUC());
//pstmt.setString(5, trxe.getNGAYGIOVAO());

            return pstmt.executeUpdate() > 0;
        }
    }
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                 ////////////////////////////////////////////////////////////////////////////////////////////////
public VETHANG finById2(String maVe) throws Exception {
        String sql = "select * from VETHANG where MAVETHANG =?";
        try (
                Connection connection = DBConnection.getConnection();
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(1, maVe);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                
                VETHANG themve2 = new VETHANG();
                themve2.setMAVE(rs.getString("MAVETHANG"));
                themve2.setBIENSOXE(rs.getString("BIENSOXE"));
                themve2.setSODIENTHOAI(rs.getString("SODIENTHOAI"));
                themve2.setTENKHACHHANG(rs.getString("TENKHACHHANG"));
                themve2.setNGAYHETHAN(rs.getString("NGAYHETHAN"));
                themve2.setNGAYDANGKY(rs.getString("NGAYDANGKY"));
                themve2.setTENKHUVUC(rs.getString("TENKHUVUC"));
                themve2.setSOTIEN(rs.getString("SOTIEN"));

                return themve2;
            }

//return pstmt.executeUpdate() > 0;
        }
        return null;
    }

/////////////////////////////////////////////////////////////////
    public boolean update(VETHANG themve) throws Exception {
        String sql = "update VETHANG set  BIENSOXE = ?,TENKHACHHANG =? , SODIENTHOAI=?, NGAYDANGKY=?, NGAYHETHAN=?" + " where MAVETHANG =?";
        try (
                Connection connection = DBConnection.getConnection(); PreparedStatement pstmt = connection.prepareStatement(sql);) {
            pstmt.setString(6, themve.getMAVE());
            pstmt.setString(1, themve.getBIENSOXE());
            pstmt.setString(2, themve.getTENKHACHHANG());
            pstmt.setString(3, themve.getSODIENTHOAI());
            pstmt.setString(4, themve.getNGAYDANGKY());
            pstmt.setString(5, themve.getNGAYHETHAN());
//            pstmt.setString(4, trxe.getTHOIGIANVAO());
//pstmt.setString(5, trxe.getNGAYGIOVAO());

            return pstmt.executeUpdate() > 0;
        }
    }
        public VETHANG findByIDVe(String idVe) {
        String sql = "select * from VETHANG Where MAVETHANG = '%s'".formatted(idVe);
        System.out.println(sql);
        try (
                 Connection connection = DBConnection.getConnection();  
                PreparedStatement pstmt = connection.prepareStatement(sql);) {
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                VETHANG vt1 = new VETHANG();
                vt1.setMAVE(rs.getString("MAVETHANG"));
                vt1.setTENKHACHHANG(rs.getString("TENKHACHHANG"));
                vt1.setBIENSOXE(rs.getString("BIENSOXE"));
                vt1.setNGAYDANGKY(rs.getString("NGAYDANGKY"));
                vt1.setNGAYHETHAN(rs.getString("NGAYHETHAN"));
                vt1.setTINHTRANGVE(rs.getString("TINHTRANGVE"));
                vt1.setSODIENTHOAI(rs.getString("SODIENTHOAI"));
                vt1.setSOTIEN(rs.getString("SOTIEN"));
                vt1.setTENKHUVUC(rs.getString("TENKHUVUC"));
                return vt1;
            } else {
                System.out.println("Null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
