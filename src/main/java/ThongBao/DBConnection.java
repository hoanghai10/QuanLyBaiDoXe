    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThongBao;

import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class DBConnection {
    public static Connection getConnection(){
        Connection connection = null;
//        try {
//            //Connection connection = null;
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String url = "jdbc:sqlserver://DESKTOP-8A75RRB\\SQLEXPRESS01:1433;database=QUANLYBAIDOXE";
//            String user = "sa";
//            String pass = "12345678";
//            connection = DriverManager.getConnection(url, user, pass);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return connection;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-TOSHQ4P7\\SQLEXPRESS:1433;database=QLBAIDOXE;user = sa;password = 12;encrypt = false");
     
            System.out.println("ket noi thanh cong");
        } 
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }
    public static void closeConnection(Connection con){
        if(con != null){
            try{
                con.close();
            }
            catch (Exception ex) {
            ex.printStackTrace();
        }
        }
    }
    public static void main(String[] args) {
        System.out.println(getConnection());
    }
    
}
