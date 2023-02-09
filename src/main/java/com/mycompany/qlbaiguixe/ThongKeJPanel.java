/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.qlbaiguixe;

import com.mycompany.qlbaiguixe.model.THONGKEDAO;
import ThongBao.DBConnection;
import ThongBao.DatabaseLink;
import com.mycompany.qlbaiguixe.model.THONGKE;
import com.mycompany.qlbaiguixe.model.THONGKE;
import com.mycompany.qlbaiguixe.model.THONGKEDAO;
import com.mycompany.qlbaiguixe.model.VAOBEN;
import com.mycompany.qlbaiguixe.model.VAOBEN;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.TableView;

/**
 *
 * @author hthkt
 */
public class ThongKeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QLBaoCao
     */
    private List<VAOBEN> rvb;
    DefaultTableModel dfau;
    public ThongKeJPanel() throws SQLException {
        initComponents();
        dfau = (DefaultTableModel) Table.getModel();
        //showDuLieu();
        
    }
        private void Tong() {
        DecimalFormat x = new DecimalFormat("###,###,###,###,###,###");
        int Tong = 0;
        for(int i=0;i<Table.getRowCount();i++){
            Tong+=Integer.parseInt(Table.getValueAt(i,5).toString());
        }
        DoanhThu.setText("Doanh thu: "+x.format(Tong)+" "+"VND");
    }
    private void showDuLieu() throws SQLException {
        final String OLD_FORMAT = "dd-MM-yyyy";
        final String NEW_FORMAT = "yyyy-MM-dd";
        

        SimpleDateFormat sdf1 = new SimpleDateFormat(OLD_FORMAT);
        sdf1.applyPattern(NEW_FORMAT);
        String dateForm = sdf1.format(this.txtTu.getDate());

        SimpleDateFormat sdf2 = new SimpleDateFormat(OLD_FORMAT);
        sdf2.applyPattern(NEW_FORMAT);
        String dateTo = sdf2.format(this.txtDen.getDate());

        THONGKEDAO s = new THONGKEDAO();
        List<THONGKE> tklist = s.getStat(dateForm, dateTo);

        dfau.setRowCount(0);
        tklist.forEach((Object) -> {
            dfau.addRow(new Object[]{Object.getMAVE(), Object.getLOAIVE(),Object.getBIENSOXE(),Object.getTHOIGIANRA(),Object.getTENKHUVUC(),Object.getTONGTIEN()});
        });
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTu = new com.toedter.calendar.JDateChooser();
        txtDen = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        DoanhThu = new javax.swing.JLabel();

        Search.setText("Thống kê");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Từ ngày:");

        jLabel2.setText("đến ngày:");

        txtTu.setDateFormatString("yyyy-MM-dd");

        txtDen.setDateFormatString("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTu, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDen, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Search)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Search)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addComponent(txtTu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDen, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(153, 153, 153))
        );

        jPanel2.setLayout(new java.awt.BorderLayout());

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã vé", "Loại vé", "Biển số xe", "Thời gian ra", "Khu vực", "Tổng tiền"
            }
        ));
        jScrollPane1.setViewportView(Table);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        DoanhThu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DoanhThu.setText("Doanh thu:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(DoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        try {
            // TODO add your handling code here
            showDuLieu();
            Tong();
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_SearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DoanhThu;
    private javax.swing.JButton Search;
    private javax.swing.JTable Table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser txtDen;
    private com.toedter.calendar.JDateChooser txtTu;
    // End of variables declaration//GEN-END:variables

    
}