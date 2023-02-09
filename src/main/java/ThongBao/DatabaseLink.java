/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongBao;

import com.microsoft.sqlserver.jdbc.SQLServerConnectionPoolDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import com.mycompany.qlbaiguixe.model.VE;
import com.mycompany.qlbaiguixe.model.VAOBEN;

/**
 *
 * @author hthkt
 */
public class DatabaseLink {

    public Connection conn;
    public DatabaseLink(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-TOSHQ4P7\\SQLEXPRESS:1433;database=QLBAIDOXE;user = sa;password = 12;encrypt = false");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public boolean addVAOBEN(VAOBEN r){
         String sql = "INSERT INTO dbo.VAOBEN(MAVE,TENKHUVUC,BIENSOXE,THOIGIANVAO,TINHTRANGVE,SOTIEN)"
                + "VALUES(?,?,?,?,N'Sử dụng',?)";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
             ps.setString(1, r.getMAVE());
            // ps.setString(2, r.getLOAIVE());
             ps.setString(2, r.getTENKHUVUC());
             ps.setString(3, r.getBIENSOXE());
             ps.setString(4, r.getTHOIGIANVAO());
             ps.setString(5, r.getGIATIEN());
             //ps.setString(7, r.getTINHTRANGVE());
             return ps.executeUpdate()>0;
         } catch (Exception e) {
             e.printStackTrace();
         }
         return false;   
        }
     public ArrayList<VAOBEN> getListVAOBEN(){
         ArrayList<VAOBEN> list = new ArrayList<>();
         String sql ="SELECT * FROM dbo.VAOBEN";
         try {
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             while (rs.next()){
                 VAOBEN rvb = new VAOBEN();
                 rvb.setMAVE(rs.getString("MAVE"));
                 rvb.setLOAIVE(rs.getString("LOAIVE"));
                 rvb.setTENKHUVUC(rs.getString("TENKHUVUC"));
                 rvb.setBIENSOXE(rs.getString("BIENSOXE"));
                 rvb.setTHOIGIANVAO(rs.getString("THOIGIANVAO"));
                 rvb.setTHOIGIANRA(rs.getString("TINHTRANGVE"));
                 rvb.setTINHTRANGVE(rs.getString("SOTIEN"));
                 list.add(rvb);
                 
                 
             }
         } catch (Exception e) {
             e.printStackTrace();
         }
         return list;
     }
         
}
    
