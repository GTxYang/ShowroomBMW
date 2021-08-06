/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author howl1
 */
public class frmDangNhap extends javax.swing.JFrame {
    
    /**
     * Creates new form frmDangNhap
     */
    public frmDangNhap()throws SQLException {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        name23 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cc = new javax.swing.JCheckBox();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Đăng nhập");
        setLocation(new java.awt.Point(600, 200));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setEnabled(false);

        jLabel3.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jLabel3.setText("LOGIN");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("User Name:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Password:");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/car-key (1).png"))); // NOI18N
        jButton1.setText("ĐĂNG NHẬP");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/logout (1).png"))); // NOI18N
        jButton2.setText("THOÁT");
        jButton2.setPreferredSize(new java.awt.Dimension(183, 41));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Bạn là:");

        cc.setBackground(new java.awt.Color(255, 255, 255));
        cc.setText("Hiển thị mật khẩu");
        cc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chọn chức vụ", "Admin ", "Nhân viên", "Quản lý kho" }));

        jLabel1.setForeground(new java.awt.Color(51, 102, 255));
        jLabel1.setText("Showroom BMW Phú Mỹ Hưng");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/bmw-with-wings-logo-77D61A73AA-seeklogo.com.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(143, 143, 143))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cc)
                                    .addComponent(name23)
                                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name23, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cc)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String msg = name23.getText();
        
        if(name23.getText().equals("")||pass.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ Username va Password");
           
        }
       
        else if(jComboBox1.getSelectedIndex()==1){
                String b = name23.getText();
                String v = pass.getText();
        try {                    
                String userName = "sa";
                String password = "123456";
                String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyBMW;";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection(url, userName, password);
                String sql = "Select * from Administrator where TaiKhoan = ? and MatKhau = ? ";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1,name23.getText());
                pst.setString(2,pass.getText());
                ResultSet rs = pst.executeQuery();
                    if(rs.next())
                {
                    dispose();
                   
                    frmAdmin abc = new frmAdmin(msg); 
                    abc.setVisible(true);
                    setVisible(false);
                }
                     else {
                    JOptionPane.showMessageDialog(null, " Sai tên tài khoản hoặc mật khẩu Admin.");
                    name23.grabFocus();
                    }
                        
                }    
        catch(Exception e)
                  {
                      JOptionPane.showMessageDialog(null, "Không thể kết nối đến SQL1");
                  }
        }
        
        else if(jComboBox1.getSelectedIndex()==2){
            try {                    
                String userName = "sa";
                String password = "123456";
                String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyBMW;";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection(url, userName, password);
                String sql = "Select * from NhanVien where TKNhanVien = ? and MKNhanVien = ? ";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1,name23.getText());
                pst.setString(2,pass.getText());
                ResultSet rs = pst.executeQuery();
                    if(rs.next())
                {
                    dispose();
                    frmNhanVien abcz = new frmNhanVien(msg);
                    
                    abcz.setVisible(true);
                    setVisible(false);
                }
                     else {
                    JOptionPane.showMessageDialog(null, " Sai tên tài khoản hoặc mật khẩu Nhân Viên.");
                    name23.grabFocus();
                    }
                        
                }    
        catch(Exception e)
                  {
                      JOptionPane.showMessageDialog(null, "Không thể kết nối đến SQL");
                  }
        }
        
        else if(jComboBox1.getSelectedIndex()==3){
                
        try {                    
                String userName = "sa";
                String password = "123456";
                String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyBMW;";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection(url, userName, password);
                String sql = "Select * from QuanLyKho where TKNhanVien = ? and MKNhanVien = ? ";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1,name23.getText());
                pst.setString(2,pass.getText());
                ResultSet rs = pst.executeQuery();
                    if(rs.next())
                {
                    dispose();                  
                    frmQuanLyKho abc = new frmQuanLyKho(msg);                    
                    abc.setVisible(true);
                    setVisible(false);
                }
                     else {
                    JOptionPane.showMessageDialog(null, " Sai tên tài khoản hoặc mật khẩu Quản kho .");
                    name23.grabFocus();
                    }                        
                }    
        catch(Exception e)
                  {
                      JOptionPane.showMessageDialog(null, "Không thể kết nối đến SQL1");
                  }
        }
        
        else if(jComboBox1.getSelectedIndex()==4){
                
        try {                    
                String userName = "sa";
                String password = "123456";
                String url = "jdbc:sqlserver://localhost:1433;databaseName=QuanLyBMW;";
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection conn = DriverManager.getConnection(url, userName, password);
                String sql = "Select * from QuanLyNhanSu where TKNhanVien = ? and MKNhanVien = ? ";
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1,name23.getText());
                pst.setString(2,pass.getText());
                ResultSet rs = pst.executeQuery();
                    if(rs.next())
                {
                    dispose();                  
                    frmQuanLyNhanSu abc = new frmQuanLyNhanSu(msg);                    
                    abc.setVisible(true);
                    setVisible(false);
                }
                     else {
                    JOptionPane.showMessageDialog(null, " Sai tên tài khoản hoặc mật khẩu Quản nhân sự .");
                    name23.grabFocus();
                    }                        
                }    
        catch(Exception e)
                  {
                      JOptionPane.showMessageDialog(null, "Không thể kết nối đến SQL1");
                  }
        }
        
        else 
            JOptionPane.showMessageDialog(this,"Xin hãy chọn chức vụ để đăng nhập :)");

        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         int ret =JOptionPane.showConfirmDialog(null,"Bạn có muốn thoát","Thoát",JOptionPane.YES_NO_OPTION);
            if(ret == JOptionPane.YES_OPTION)
                System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccActionPerformed
            if(cc.isSelected())
       {
           pass.setEchoChar((char)0);
       }
       else
       {
           pass.setEchoChar('*');
       }
    }//GEN-LAST:event_ccActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws SQLException {
        frmDangNhap f = new frmDangNhap();
        f.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox cc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name23;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
