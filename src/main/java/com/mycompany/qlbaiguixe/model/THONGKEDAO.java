/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qlbaiguixe.model;

import ThongBao.DBConnection;
import com.mycompany.qlbaiguixe.model.THONGKE;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hthkt
 */
public class THONGKEDAO {

    public List<THONGKE> getStat(String dateForm, String dateTo) throws SQLException {

        List<THONGKE> tklist = new ArrayList<>();

//        String query = "SELECT * FROM products where product_name LIKE '%"+name+"%'";
        String query = "SELECT  RABEN.MAVE, VE.LOAIVE,RABEN.BIENSOXE, RABEN.THOIGIANRA,RABEN.TENKHUVUC, RABEN.SOTIEN FROM VE RIGHT JOIN RABEN ON VE.MAVE=RABEN.MAVE WHERE RABEN.THOIGIANRA "
                + "BETWEEN '" + dateForm + "' AND '" + dateTo + "'";

        Connection conn = DBConnection.getConnection();
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            THONGKE tk = new THONGKE(rs.getString("MAVE"), rs.getString("LOAIVE"),rs.getString("TENKHUVUC"),rs.getString("BIENSOXE"),rs.getString("THOIGIANRA"),rs.getString("SOTIEN"));
            tklist.add(tk);
        }
        return tklist;

    }
}
