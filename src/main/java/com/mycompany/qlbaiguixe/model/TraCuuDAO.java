/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlbaiguixe.model;

import ThongBao.DBConnection;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
public class TraCuuDAO {

    public int getCurrentBikeInArea(String areaName) {
        String query = """
                     Select TENKHUVUC, count(tinhtrangve) as soLuong from VAOBEN 
                     where TINHTRANGVE = N'Sử dụng' and TENKHUVUC = '%s'
                     Group by TENKHUVUC
                     """.formatted(areaName);

        try ( Connection c = DBConnection.getConnection();  var stm = c.createStatement()) {
            var result = stm.executeQuery(query);
            if (result.next()) {
                return result.getInt("soluong");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
