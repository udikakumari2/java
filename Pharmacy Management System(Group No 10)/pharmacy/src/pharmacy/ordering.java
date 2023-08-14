/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author MyPc
 */
public class ordering extends javax.swing.JFrame {

    /**
     * Creates new form mupdate
     */
    public ordering() {
        initComponents();
        
       
    }
    String name12;
    public ordering(String name) {
        initComponents();
        connect();
        this.name12=name;
       
        selectMed();
        selectMed1();
        loadSupler();
        
       
    }
   
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    DefaultTableModel model;

    public void connect(){
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy","root","");
    
    }
    catch(Exception e){
    JOptionPane.showMessageDialog(null,e.getMessage());}
    
    
    }
    
    
    
     public void selectMed(){

try{
   
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy", "root", "");
Statement st=con.createStatement();
ResultSet Rs=st.executeQuery("SELECT * FROM orderList");
mtable1.setModel(DbUtils.resultSetToTableModel(Rs));
}
catch(SQLException e){

e.printStackTrace();
}
}
      public void selectMed1(){

try{
   
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy", "root", "");
Statement st=con.createStatement();
ResultSet Rs=st.executeQuery("SELECT * FROM listo");
mtable.setModel(DbUtils.resultSetToTableModel(Rs));
}
catch(SQLException e){

e.printStackTrace();
}
}
     
     
     public void search12(String str){
 model=(DefaultTableModel) mtable.getModel();
 TableRowSorter<DefaultTableModel> trs=new TableRowSorter<>(model);
 mtable.setRowSorter(trs);
 trs.setRowFilter(RowFilter.regexFilter(str));
 
 
 
 
 
 
}
     public class supler{
String name;
String id;
public supler(String id,String name){
this.id=id;
this.name=name;

}

        

        
       
public String toString(){
return name;

}

}
public void loadSupler(){

        try {
            pst=con.prepareStatement("SELECT * FROM suplayer");
            rs=pst.executeQuery();
            sid.removeAll();
            while(rs.next()){
            sid.addItem(new supler(rs.getString(1),rs.getString(2)));
            
            }
        } catch (SQLException ex) {
            Logger.getLogger(ordering.class.getName()).log(Level.SEVERE, null, ex);
        }


}
public void deletet(String str){
     try{
          
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy","root","");
        PreparedStatement pst=con.prepareStatement("DELETE FROM orderList WHERE medice_id=?");
        pst.setString(1,id.getText());
        
        pst.executeUpdate();
        selectMed();
        
      }
      catch(Exception e){
      e.printStackTrace();
      
      }}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        insert = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        exit = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mtable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        edate = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        sid = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        mtable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 76, 41));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Odering item report");
        jLabel1.setToolTipText("");

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("X");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(498, 498, 498)
                .addComponent(jLabel1)
                .addGap(0, 563, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -18, 1270, 90));

        id.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(102, 102, 102));
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setBorder(null);
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 300, 420, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, 420, 10));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Medicine Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, -1, -1));

        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(null);
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 360, 390, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 390, 390, 17));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 490, -1, -1));

        qty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        qty.setForeground(new java.awt.Color(102, 102, 102));
        qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty.setBorder(null);
        jPanel1.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 480, 440, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 510, 440, 10));

        insert.setBackground(new java.awt.Color(255, 76, 41));
        insert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertMouseExited(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Order");

        javax.swing.GroupLayout insertLayout = new javax.swing.GroupLayout(insert);
        insert.setLayout(insertLayout);
        insertLayout.setHorizontalGroup(
            insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel7)
                .addContainerGap(109, Short.MAX_VALUE))
        );
        insertLayout.setVerticalGroup(
            insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, 260, -1));

        exit.setBackground(new java.awt.Color(255, 76, 41));
        exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Exit");

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(25, 25, 25))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 520, 90, -1));

        mtable.setAutoCreateRowSorter(true);
        mtable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        mtable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "medicne_name", "medicne_name", "quntity", "price", "Manufacture_Date", "Exppire_Date"
            }
        ));
        mtable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        mtable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mtable.setGridColor(new java.awt.Color(255, 255, 255));
        mtable.setRowHeight(40);
        mtable.setRowMargin(4);
        mtable.setSelectionBackground(new java.awt.Color(255, 76, 41));
        mtable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mtableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mtable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 570, 330));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Medicine ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, -1, 20));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Ordered Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 570, -1, -1));

        edate.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(edate, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 570, 360, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Suplayer ID");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 430, -1, -1));

        sid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sid.setToolTipText("");
        jPanel1.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 400, -1));

        mtable1.setAutoCreateRowSorter(true);
        mtable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        mtable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        mtable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "medicne_name", "medicne_name", "quntity", "price", "Manufacture_Date", "Exppire_Date"
            }
        ));
        mtable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        mtable1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mtable1.setGridColor(new java.awt.Color(255, 255, 255));
        mtable1.setRowHeight(40);
        mtable1.setRowMargin(4);
        mtable1.setSelectionBackground(new java.awt.Color(255, 76, 41));
        mtable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mtable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(mtable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 630, 160));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Odering item report");
        jLabel2.setToolTipText("");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Orders");
        jLabel5.setToolTipText("");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 230, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Shortage products");
        jLabel6.setToolTipText("");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 110, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
        // TODO add your handling code here:
        insert.setBackground(Color.white);
         DefaultTableModel model=(DefaultTableModel)mtable.getModel();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy","root","");
        PreparedStatement pst=con.prepareStatement("insert into listo values(?,?,?,?,?)");
        //ResultSet rs=pst.executeQuery();
        supler sup=(supler)sid.getSelectedItem();
        String s=id.getText();
         pst.setString(1,s);
        pst.setString(2,name.getText());
        pst.setString(3,sid.getSelectedItem().toString());
        pst.setString(4,qty.getText());
      
        SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-dd");
         
         String date2=df.format(edate.getDate());
         
         pst.setString(5,date2);
       
        pst.executeUpdate();
        selectMed();
         selectMed1();
        name.setText(null);
        qty.setText(null);
       
       
       edate.setCalendar(null);
      sid.setSelectedIndex(-1);
      deletet(s);
        JOptionPane.showMessageDialog(null,"successful");
         } 
        
        
        
        catch(Exception e){
        e.printStackTrace();
        
        }
       
       
    }//GEN-LAST:event_insertMouseClicked




    private void insertMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseExited
        // TODO add your handling code here:
        insert.setBackground(new Color(255,76,41));
    }//GEN-LAST:event_insertMouseExited

    private void mtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mtableMouseClicked
        // TODO add your handling code here:
        
        
     
     
      
       
    }//GEN-LAST:event_mtableMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        new ordering(name12).setVisible(false);
        admin1 l=new admin1(name12);
        l.setVisible(true);
    }//GEN-LAST:event_exitMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void mtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mtable1MouseClicked
        // TODO add your handling code here:
         DefaultTableModel model=(DefaultTableModel)mtable1.getModel();
        int myidex=mtable1.getSelectedRow();
         id.setText(model.getValueAt(myidex,0).toString());
       name.setText(model.getValueAt(myidex, 1).toString());
    }//GEN-LAST:event_mtable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ordering.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ordering().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser edate;
    private javax.swing.JPanel exit;
    private javax.swing.JTextField id;
    private javax.swing.JPanel insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable mtable;
    private javax.swing.JTable mtable1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField qty;
    private javax.swing.JComboBox sid;
    // End of variables declaration//GEN-END:variables
}
