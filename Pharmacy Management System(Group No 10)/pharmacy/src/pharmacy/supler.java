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
public class supler extends javax.swing.JFrame {

    /**
     * Creates new form mupdate
     */
    
    String id;
    String name;
    String newid;
    public supler(String id,String name) {
        initComponents();
        this.id=id;
        this.name=name;
        newid=id;
        connect();
        autoId();
        selectMed();
        JOptionPane.showMessageDialog(this,newid);
            }
    public supler(String name) {
        initComponents();
        
        this.name=name;
        
        connect();
        autoId();
        selectMed();
        
            }
    public supler() {
        initComponents();
       connect();
        autoId();
        selectMed();
        
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
     public void autoId(){
    
    try{
    Statement s=con.createStatement();
    rs=s.executeQuery("SELECT MAX(suplayer_id) FROM suplayer ");
    rs.next();
    rs.getString("MAX(suplayer_id)");
    if(rs.getString("MAX(suplayer_id)")==null){
    sid.setText("SD001");
    }
    else{
    long id1=Long.parseLong(rs.getString("MAX(suplayer_id)").substring(2,rs.getString("MAX(suplayer_id)").length()));
    id1++;
    sid.setText("SD"+String.format("%03d",id1));
    
    
    }
    
    }
    catch(Exception e){
     JOptionPane.showMessageDialog(null,e.getMessage());
    
    }
    
    
    }
     public void selectMed(){

try{
   
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy", "root", "");
Statement st=con.createStatement();
ResultSet Rs=st.executeQuery("SELECT * FROM suplayer");
stable.setModel(DbUtils.resultSetToTableModel(Rs));
}
catch(SQLException e){

e.printStackTrace();
}
}
     
     
     public void search12(String str){
 model=(DefaultTableModel) stable.getModel();
 TableRowSorter<DefaultTableModel> trs=new TableRowSorter<>(model);
 stable.setRowSorter(trs);
 trs.setRowFilter(RowFilter.regexFilter(str));
 
 
 
 
 
 
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        pnumber = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        sAddress = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        update = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        insert = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        clear = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        exit = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stable = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        idate = new com.toedter.calendar.JDateChooser();
        delete1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        iAmount = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 76, 41));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Suplayer updates");
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
                .addGap(515, 515, 515)
                .addComponent(jLabel1)
                .addContainerGap(578, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(20, 20, 20))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -18, 1270, 90));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Monthly Invoice Amount Rs:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        sid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sid.setForeground(new java.awt.Color(102, 102, 102));
        sid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sid.setBorder(null);
        jPanel1.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 400, 30));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 400, 10));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Suplayer Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        sname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sname.setForeground(new java.awt.Color(102, 102, 102));
        sname.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sname.setBorder(null);
        jPanel1.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 390, 30));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 390, 17));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Phone Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        pnumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pnumber.setForeground(new java.awt.Color(102, 102, 102));
        pnumber.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pnumber.setBorder(null);
        jPanel1.add(pnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 400, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, 400, 10));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Address");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 30));

        sAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        sAddress.setForeground(new java.awt.Color(102, 102, 102));
        sAddress.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sAddress.setBorder(null);
        jPanel1.add(sAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 450, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 450, 10));

        update.setBackground(new java.awt.Color(255, 76, 41));
        update.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("UPDATE");

        javax.swing.GroupLayout updateLayout = new javax.swing.GroupLayout(update);
        update.setLayout(updateLayout);
        updateLayout.setHorizontalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        updateLayout.setVerticalGroup(
            updateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 490, -1, -1));

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
        jLabel7.setText("INSERT");

        javax.swing.GroupLayout insertLayout = new javax.swing.GroupLayout(insert);
        insert.setLayout(insertLayout);
        insertLayout.setHorizontalGroup(
            insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        insertLayout.setVerticalGroup(
            insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        clear.setBackground(new java.awt.Color(255, 76, 41));
        clear.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clearMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("CLEAR");

        javax.swing.GroupLayout clearLayout = new javax.swing.GroupLayout(clear);
        clear.setLayout(clearLayout);
        clearLayout.setHorizontalGroup(
            clearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clearLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel8)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        clearLayout.setVerticalGroup(
            clearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clearLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 490, -1, -1));

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

        jPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 490, -1, -1));

        stable.setAutoCreateRowSorter(true);
        stable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        stable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        stable.setModel(new javax.swing.table.DefaultTableModel(
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
        stable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        stable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stable.setGridColor(new java.awt.Color(255, 255, 255));
        stable.setRowHeight(40);
        stable.setRowMargin(4);
        stable.setSelectionBackground(new java.awt.Color(255, 76, 41));
        stable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(stable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 630, 340));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Suplayer ID");
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
        jLabel12.setText("Invoice Date");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        idate.setForeground(new java.awt.Color(102, 102, 102));
        jPanel1.add(idate, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 360, 30));

        delete1.setBackground(new java.awt.Color(255, 76, 41));
        delete1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        delete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delete1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                delete1MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("DELETE");

        javax.swing.GroupLayout delete1Layout = new javax.swing.GroupLayout(delete1);
        delete1.setLayout(delete1Layout);
        delete1Layout.setHorizontalGroup(
            delete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel14)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        delete1Layout.setVerticalGroup(
            delete1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delete1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(delete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));

        iAmount.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        iAmount.setForeground(new java.awt.Color(102, 102, 102));
        iAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        iAmount.setBorder(null);
        jPanel1.add(iAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 300, 30));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 300, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
        // TODO add your handling code here:
        insert.setBackground(Color.white);
         DefaultTableModel model=(DefaultTableModel)stable.getModel();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy","root","");
        PreparedStatement pst=con.prepareStatement("insert into suplayer values(?,?,?,?,?,?)");
        //ResultSet rs=pst.executeQuery();
       
         pst.setString(1,sid.getText());
        pst.setString(2,sname.getText());
        pst.setString(3,pnumber.getText());
        pst.setString(4,sAddress.getText());
        SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-dd");
         pst.setString(5,iAmount.getText());
         String date2=df.format(idate.getDate());
        
         pst.setString(6,date2);
        pst.executeUpdate();
        selectMed();
        autoId();
        sname.setText(null);
        pnumber.setText(null);
       sAddress.setText(null);
      iAmount.setText(null);
       idate.setCalendar(null);
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

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked
        // TODO add your handling code here:
        update.setBackground(Color.white);
       
        try{
       
      
      
          
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy","root","");
        PreparedStatement pst=con.prepareStatement("UPDATE suplayer SET suplayer_name=? , phone=?  , address=? , invoice_amount=? ,  Invoice_date=? WHERE suplayer_id=?");
        
        pst.setString(1,sname.getText());
        pst.setString(2,pnumber.getText());
        pst.setString(3,sAddress.getText());
       SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-dd");
          pst.setString(4,iAmount.getText());
         String date2=df.format(idate.getDate());
           pst.setString(5,date2);
           pst.setString(6, sid.getText());
        pst.executeUpdate();
        selectMed();
        autoId();
        sname.setText(null);
        pnumber.setText(null);
       sAddress.setText(null);
       iAmount.setText(null);
       idate.setCalendar(null);
        JOptionPane.showMessageDialog(null," updation successful");
      }
      catch(Exception e){
      e.printStackTrace();
      
      }
       
       
    }//GEN-LAST:event_updateMouseClicked

    private void updateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseExited
        // TODO add your handling code here:
        update.setBackground(new Color(255,76,41));
    }//GEN-LAST:event_updateMouseExited

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        // TODO add your handling code here:
        clear.setBackground(Color.white);
        sid.setText(null);
         sname.setText(null);
        pnumber.setText(null);
       sAddress.setText(null);
      iAmount.setText(null);
       idate.setCalendar(null);
       autoId();
       
    }//GEN-LAST:event_clearMouseClicked

    private void clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseExited
        // TODO add your handling code here:
         clear.setBackground(new Color(255,76,41));
    }//GEN-LAST:event_clearMouseExited

    private void stableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model=(DefaultTableModel)stable.getModel();
        int myidex=stable.getSelectedRow();
         int d1=stable.getSelectedRow();
          Date date1;
        try {
           
            date1 = new SimpleDateFormat("YYYY-MM-dd").parse((String)model.getValueAt(d1, 5));
            
            idate.setDate(date1);
        } catch (ParseException ex) {
            Logger.getLogger(supler.class.getName()).log(Level.SEVERE, null, ex);
        }
             
        sid.setText(model.getValueAt(myidex,0).toString());
       sname.setText(model.getValueAt(myidex, 1).toString());
        pnumber.setText(model.getValueAt(myidex, 2).toString());
        sAddress.setText(model.getValueAt(myidex, 3).toString());
     iAmount.setText(model.getValueAt(myidex, 4).toString());
       
     
     
      
       
    }//GEN-LAST:event_stableMouseClicked

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
       admin1 l=new admin1(name);
        l.setVisible(true);
    }//GEN-LAST:event_exitMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
       System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void delete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseClicked
        // TODO add your handling code here:
        
        delete1.setBackground(Color.white);
           if(sid.getText().isEmpty()){
             
            JOptionPane.showMessageDialog(this,"Enert id to be delete"); 
             
         }
   
         
         
         else{
    
     try{
          
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy","root","");
        PreparedStatement pst=con.prepareStatement("DELETE FROM suplayer WHERE suplayer_id=?");
        pst.setString(1,sid.getText());
        
        pst.executeUpdate();
        selectMed();
        autoId();
        sname.setText(null);
        pnumber.setText(null);
       sAddress.setText(null);
      iAmount.setText(null);
       idate.setCalendar(null);
        JOptionPane.showMessageDialog(null,"Deletion successful");
      }
      catch(Exception e){
      e.printStackTrace();
      
      }}
    }//GEN-LAST:event_delete1MouseClicked

    private void delete1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delete1MouseExited
        // TODO add your handling code here:
        delete1.setBackground(new Color(255,76,41));
    }//GEN-LAST:event_delete1MouseExited

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
            java.util.logging.Logger.getLogger(supler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(supler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(supler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(supler.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new supler().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel clear;
    private javax.swing.JPanel delete1;
    private javax.swing.JPanel exit;
    private javax.swing.JTextField iAmount;
    private com.toedter.calendar.JDateChooser idate;
    private javax.swing.JPanel insert;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField pnumber;
    private javax.swing.JTextField sAddress;
    private javax.swing.JTextField search;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sname;
    private javax.swing.JTable stable;
    private javax.swing.JPanel update;
    // End of variables declaration//GEN-END:variables
}
