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
public class expired2 extends javax.swing.JFrame {

    /**
     * Creates new form mupdate
     */
    public expired2() {
        initComponents();
        
       
    }
    String name12;
    public expired2(String name) {
        initComponents();
        connect();
        this.name12=name;
        
        selectMed();
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
    public void insertToOrderList(String id,String name){
    
    //orderList
    try{
    
    Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy","root","");
        PreparedStatement pst=con.prepareStatement("insert into orderList values(?,?)");
        pst.setString(1, id);
        pst.setString(2, name);
        //ResultSet rs=pst.executeQuery();
        
     
         
        pst.executeUpdate();
    
    }
    catch(Exception e){
    
    e.printStackTrace();
    }
    
    
    }
    public void deletet(String str){
     try{
          
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy","root","");
        PreparedStatement pst=con.prepareStatement("DELETE FROM mupdate WHERE medice_id=?");
        pst.setString(1,id.getText());
        
        pst.executeUpdate();
        selectMed();
        
      }
      catch(Exception e){
      e.printStackTrace();
      
      }}
     
     public void selectMed(){

try{
   
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy", "root", "");
Statement st=con.createStatement();
String sql="SELECT * FROM mupdate WHERE Exppire_Date < '"+name12+"'";
ResultSet Rs=st.executeQuery(sql);
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
            Logger.getLogger(expired2.class.getName()).log(Level.SEVERE, null, ex);
        }


}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        price = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        insert = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        exit = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mtable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        mdate = new com.toedter.calendar.JDateChooser();
        edate = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        sid = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 76, 41));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Expired items report ");
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
                .addGap(521, 521, 521)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 500, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -18, 1270, 90));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Manufacture Date");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        id.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        id.setForeground(new java.awt.Color(102, 102, 102));
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id.setBorder(null);
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 400, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 400, 10));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Medicine Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name.setBorder(null);
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 250, 390, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 390, 17));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        qty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        qty.setForeground(new java.awt.Color(102, 102, 102));
        qty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        qty.setBorder(null);
        jPanel1.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 440, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 440, 10));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, 30));

        price.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        price.setForeground(new java.awt.Color(102, 102, 102));
        price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        price.setBorder(null);
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 470, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 470, 10));

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
        jLabel7.setText("Return to Company");

        javax.swing.GroupLayout insertLayout = new javax.swing.GroupLayout(insert);
        insert.setLayout(insertLayout);
        insertLayout.setHorizontalGroup(
            insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertLayout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(182, 182, 182))
        );
        insertLayout.setVerticalGroup(
            insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 550, 490, 40));

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
            .addGroup(exitLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 550, -1, -1));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 630, 390));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Medicine ID");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        search.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        search.setBorder(null);
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                searchMouseReleased(evt);
            }
        });
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchKeyTyped(evt);
            }
        });
        jPanel1.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 360, 20));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 130, 370, 10));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Search");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Exppire Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, -1, -1));

        mdate.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(mdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 360, 30));

        edate.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(edate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 360, 30));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("Suplayer ID");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        sid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sid.setToolTipText("");
        jPanel1.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 400, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
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
        PreparedStatement pst=con.prepareStatement("insert into ordert values(?,?,?,?,?,?,?)");
        //ResultSet rs=pst.executeQuery();
        supler sup=(supler)sid.getSelectedItem();
        String id23=id.getText();
         pst.setString(1,id23);
         pst.setString(2,sid.getSelectedItem().toString());
         String name12=name.getText();
        pst.setString(3,name12);
        pst.setString(4,qty.getText());
        pst.setString(5,price.getText());
        SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-dd");
         String date1=df.format(mdate.getDate());
         String date2=df.format(edate.getDate());
         pst.setString(6,date1);
         pst.setString(7,date2);
         
        pst.executeUpdate();
        selectMed();
        insertToOrderList(id23,name12);
        deletet(id23);
       
        name.setText(null);
        qty.setText(null);
       price.setText(null);
       mdate.setCalendar(null);
       edate.setCalendar(null);
      sid.setSelectedIndex(-1);
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
        
        DefaultTableModel model=(DefaultTableModel)mtable.getModel();
        int myidex=mtable.getSelectedRow();
         int d1=mtable.getSelectedRow();
          Date date2,date1;
          id.setText(model.getValueAt(myidex,0).toString());
       name.setText(model.getValueAt(myidex, 1).toString());
        qty.setText(model.getValueAt(myidex, 2).toString());
        price.setText(model.getValueAt(myidex, 3).toString());
        try {
            date2 = new SimpleDateFormat("YYYY-MM-dd").parse((String)model.getValueAt(d1, 4));
            date1 = new SimpleDateFormat("YYYY-MM-dd").parse((String)model.getValueAt(d1, 5));
            mdate.setDate(date2);
            edate.setDate(date1);
        } catch (ParseException ex) {
            Logger.getLogger(expired2.class.getName()).log(Level.SEVERE, null, ex);
        }
          
        
       
        sid.setSelectedItem(model.getValueAt(myidex, 6).toString());
        
      //  mdate.setDate(model.getValueAt(myidex, 4).toString());
       
     
     
      
       
    }//GEN-LAST:event_mtableMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_searchMouseClicked

    private void searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyTyped
  
    }//GEN-LAST:event_searchKeyTyped

    private void searchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseReleased
        // TODO add your handling code here:
      
      
    }//GEN-LAST:event_searchMouseReleased

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        new expired2(name12).setVisible(false);
        admin1 l=new admin1(name12);
        l.setVisible(true);
    }//GEN-LAST:event_exitMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        // TODO add your handling code here:
         String s1=search.getText();
       search12(s1);     
    }//GEN-LAST:event_searchKeyReleased

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
            java.util.logging.Logger.getLogger(expired2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(expired2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(expired2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(expired2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new expired2().setVisible(true);
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
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private com.toedter.calendar.JDateChooser mdate;
    private javax.swing.JTable mtable;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qty;
    private javax.swing.JTextField search;
    private javax.swing.JComboBox sid;
    // End of variables declaration//GEN-END:variables
}
