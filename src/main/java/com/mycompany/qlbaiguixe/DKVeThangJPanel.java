/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.qlbaiguixe;

import Controller.Date;
import ThongBao.DBConnection;
import com.mycompany.qlbaiguixe.model.VETHANG;
import com.mycompany.qlbaiguixe.model.VETHANGDAO;
import com.mycompany.qlbaiguixe.model.TRAXE;
import com.mycompany.qlbaiguixe.model.TRAXEDAO;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hthkt
 */
public class DKVeThangJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QLVeThangJPanel
     */
    public DKVeThangJPanel() {
        initComponents();
        showDuLieu2();
        showMV();
        initDate();
    }
    private void initDate(){
        Date d = new Date(txtndk);
        d.start();
     }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        JTTENKHACHHANG = new javax.swing.JTextField();
        JTSDT = new javax.swing.JTextField();
        JTBIENSOXE = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JT1 = new javax.swing.JTable();
        JBTHEMVE = new javax.swing.JButton();
        JBCAPNHATVE = new javax.swing.JButton();
        JBXOAVE = new javax.swing.JButton();
        JBLAMMOI = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JTNgayHetHan = new javax.swing.JTextField();
        JTMAVE = new javax.swing.JComboBox<>();
        txtndk = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTTIMKIEM = new javax.swing.JTextField();
        JBTIMKIEM = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("????ng k?? v?? th??ng");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("M?? v??:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("T??n kh??ch h??ng:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("S??? ??i???n tho???i:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Bi???n s??? xe:");

        jPanel2.setLayout(new java.awt.BorderLayout());

        JT1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "M?? v??", "T??n kh??ch h??ng", "S??? ??i???n tho???i", "Bi???n s??? xe", "Ng??y ????ng k??", "Ng??y H???t H???n", "T??nh Tr???ng V??", "S??? Ti???n"
            }
        ));
        jScrollPane1.setViewportView(JT1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.PAGE_START);

        JBTHEMVE.setText("Th??m v?? th??ng");
        JBTHEMVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTHEMVEActionPerformed(evt);
            }
        });

        JBCAPNHATVE.setText("C???p nh???t v?? th??ng");
        JBCAPNHATVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCAPNHATVEActionPerformed(evt);
            }
        });

        JBXOAVE.setText("X??a v?? th??ng");
        JBXOAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBXOAVEActionPerformed(evt);
            }
        });

        JBLAMMOI.setText("L??m m???i");
        JBLAMMOI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBLAMMOIActionPerformed(evt);
            }
        });

        jLabel7.setText("Ng??y ????ng K??:");

        jLabel8.setText("Ng??y H???t H???n:");

        JTMAVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTMAVEActionPerformed(evt);
            }
        });

        txtndk.setText("18-10-2002");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(JBTHEMVE)
                        .addGap(41, 41, 41)
                        .addComponent(JBCAPNHATVE)
                        .addGap(40, 40, 40)
                        .addComponent(JBXOAVE)
                        .addGap(42, 42, 42)
                        .addComponent(JBLAMMOI))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTMAVE, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JTTENKHACHHANG, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTBIENSOXE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JTSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JTNgayHetHan, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addComponent(txtndk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtndk, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(JTSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(JTMAVE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(JTTENKHACHHANG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JTBIENSOXE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(JTNgayHetHan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JBXOAVE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBCAPNHATVE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBTHEMVE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBLAMMOI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel6.setText("Nh???p M?? V?? ????? T??m Ki???m:");

        JTTIMKIEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTTIMKIEMActionPerformed(evt);
            }
        });

        JBTIMKIEM.setText("T??m Ki???m");
        JBTIMKIEM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTIMKIEMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel6)
                .addGap(16, 16, 16)
                .addComponent(JTTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(JBTIMKIEM)
                .addGap(42, 42, 42)
                .addComponent(jSeparator1))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTTIMKIEM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(JBTIMKIEM)))
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void JBTHEMVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTHEMVEActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (JTMAVE.getSelectedItem().equals("")) {
            sb.append("Ma ve ko dc de trong");
            JTMAVE.setBackground(Color.red);
        } else {
            JTMAVE.setBackground(Color.WHITE);
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try {
            VETHANG themve2 = new VETHANG();
            themve2.setMAVE((String) JTMAVE.getSelectedItem());
            themve2.setBIENSOXE(JTBIENSOXE.getText());
            themve2.setSODIENTHOAI(JTSDT.getText());
            themve2.setTENKHACHHANG(JTTENKHACHHANG.getText());
            themve2.setNGAYHETHAN(JTNgayHetHan.getText());

            // trxe.setNGAYGIOVAO(tfNgayGioVao.getText());
            VETHANGDAO dao2 = new VETHANGDAO();
            dao2.insert(themve2);

            JOptionPane.showMessageDialog(this, "????ng k?? v?? th??ng th??nh c??ng");
            showDuLieu2();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "M?? v?? th??ng n??y ???? ???????c s??? d???ng ho???c kh??ng h???p l???");
            e.printStackTrace();
        }
    }//GEN-LAST:event_JBTHEMVEActionPerformed

    private void JBLAMMOIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBLAMMOIActionPerformed
        // TODO add your handling code here:

        JTSDT.setText("");
        JTBIENSOXE.setText("");
        JTTENKHACHHANG.setText("");
        JTNgayHetHan.setText("");
        JTTIMKIEM.setText("");
    }//GEN-LAST:event_JBLAMMOIActionPerformed

    private void JBTIMKIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTIMKIEMActionPerformed
        // TODO add your handling code here:
        if (JBTIMKIEM.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "B???n c???n ph???i nh???p m?? v??");
            return;
        }
        try {

            VETHANGDAO dao3 = new VETHANGDAO();
            VETHANG themve2 = dao3.finById2(JTTIMKIEM.getText());
//            if (option.equals("M?? V??")) {
//                TRAXE traxe3 = dao2.finById(tfTimKiem.getText());
            if (themve2 != null) {
                JTMAVE.setSelectedItem(themve2.getMAVE());
                JTSDT.setText(themve2.getSODIENTHOAI());
                JTBIENSOXE.setText(themve2.getBIENSOXE());
                JTTENKHACHHANG.setText(themve2.getTENKHACHHANG());
                txtndk.setText(themve2.getNGAYDANGKY());
                JTNgayHetHan.setText(themve2.getNGAYHETHAN());

            } else {
                JOptionPane.showMessageDialog(this, "V?? n??y kh??ng t???n t???i tr??n h??? th???ng");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "error:" + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_JBTIMKIEMActionPerformed

    private void JBCAPNHATVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCAPNHATVEActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        if (JTMAVE.getSelectedItem().equals("")) {
            sb.append("Ma ve ko dc de trong");
            JTMAVE.setBackground(Color.red);
        } else {
            JTMAVE.setBackground(Color.WHITE);
        }
        if (sb.length() > 0) {
            JOptionPane.showMessageDialog(this, sb);
            return;
        }
        try {
            VETHANG themve = new VETHANG();
            themve.setMAVE((String) JTMAVE.getSelectedItem());
            themve.setSODIENTHOAI(JTSDT.getText());
            themve.setBIENSOXE(JTBIENSOXE.getText());
            themve.setTENKHACHHANG(JTTENKHACHHANG.getText());
            themve.setNGAYDANGKY(txtndk.getText());
            themve.setNGAYHETHAN(JTNgayHetHan.getText());
            // trxe.setNGAYGIOVAO(tfNgayGioVao.getText());

            VETHANGDAO dao = new VETHANGDAO();
            dao.update(themve);

            JOptionPane.showMessageDialog(this, "V?? ???? ???????c c???p nh???t");
            showDuLieu2();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "error:" + e.getLocalizedMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_JBCAPNHATVEActionPerformed

    private void JBXOAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBXOAVEActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(null, "B???n mu???n x??a v?? n??y?");
        int posittion = 0;
        if (result == 0) {
            posittion = JT1.getSelectedRow();
            String data = null;
            if (posittion == -1) {
                data = (String) this.JTMAVE.getSelectedItem();
            } else {
                data = JT1.getModel().getValueAt(posittion, 0).toString();
//                BangDL.getSelectionModel().addSelectionInterval(posittion, 0);
            }

            System.out.println(data);

            try {
                Connection connection = DBConnection.getConnection();
                String query = "DELETE FROM dbo.VETHANG WHERE MAVETHANG = ?";
                PreparedStatement ps = connection.prepareStatement(query);
                ps.setString(1, data);
                ps.executeUpdate();
                showDuLieu2();
                DBConnection.closeConnection(connection);
                JOptionPane.showMessageDialog(null, "X??a th??nh c??ng");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }//GEN-LAST:event_JBXOAVEActionPerformed

    private void JTMAVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTMAVEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTMAVEActionPerformed

    private void JTTIMKIEMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTTIMKIEMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTTIMKIEMActionPerformed
    ///////////////////////////////////
    ////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////

    private void showDuLieu2() {
        try {
            ((DefaultTableModel) JT1.getModel()).setRowCount(0);
            String[] arr = {"M?? v??", "T??n Kh??ch H??ng", "S??? ??i???n Tho???i", "Bi???n s??? xe", "Ng??y ????ng K??", "Ng??y H???t H???n", "T??nh Tr???ng V??", "S??? Ti???n", "Khu v???c"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            Connection connection = DBConnection.getConnection();
            String query = "SELECT * FROM VETHANG";
            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                model.addRow(new String[]{rs.getString("MAVETHANG"),
                    rs.getString("TENKHACHHANG"), rs.getString("SODIENTHOAI"),
                    rs.getString("BIENSOXE"), rs.getString("NGAYDANGKY"),
                    rs.getString("NGAYHETHAN"), rs.getString("TINHTRANGVE"),
                    rs.getString("SOTIEN"), rs.getString("TENKHUVUC")
                });
            }
            JT1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(TraXeJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void showMV(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-TOSHQ4P7\\SQLEXPRESS:1433;database=QLBAIDOXE;user = sa;password = 12;encrypt = false");
            String sql = "SELECT VE.MAVE\n" +
"FROM VE LEFT JOIN VETHANG ON VE.MAVE = VETHANG.MAVETHANG\n" +
"WHERE MAVE like 'VT%'";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {                
                JTMAVE.addItem(rs.getString("MaVe"));
            }
            rs.close();
            ps.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCAPNHATVE;
    private javax.swing.JButton JBLAMMOI;
    private javax.swing.JButton JBTHEMVE;
    private javax.swing.JButton JBTIMKIEM;
    private javax.swing.JButton JBXOAVE;
    private javax.swing.JTable JT1;
    private javax.swing.JTextField JTBIENSOXE;
    private javax.swing.JComboBox<String> JTMAVE;
    private javax.swing.JTextField JTNgayHetHan;
    private javax.swing.JTextField JTSDT;
    private javax.swing.JTextField JTTENKHACHHANG;
    private javax.swing.JTextField JTTIMKIEM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel txtndk;
    // End of variables declaration//GEN-END:variables
}
