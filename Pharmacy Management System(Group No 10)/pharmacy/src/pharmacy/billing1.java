
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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;

public class billing1 extends javax.swing.JFrame {

   
    public billing1() {
     
        
        initComponents();
         selectMed1();
         selectMed();
    }
   DefaultTableModel model,model1; 
   String old;
   int x=1,pay1=0,cost=0;
   public void selectMed1(){

        try{
   
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy", "root", "");
            Statement st=con.createStatement();
            ResultSet Rs=st.executeQuery("SELECT * FROM billing");
            mtable1.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(SQLException e){

            e.printStackTrace();
        }
} 
    
    
    
    public void selectMed(){

        try{
   
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy", "root", "");
            Statement st=con.createStatement();
            ResultSet Rs=st.executeQuery("SELECT * FROM mupdate");
            mtable.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(SQLException e){

            e.printStackTrace();
        }
}
    int oldqty;
    
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mname = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        mid = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        insert = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        date = new com.toedter.calendar.JDateChooser();
        insert1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cost1 = new javax.swing.JTextField();
        pay = new javax.swing.JTextField();
        balance = new javax.swing.JTextField();
        insert2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        mtable1 = new javax.swing.JTable();
        insert3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        insert4 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mtable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 76, 41));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Billing process");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(456, 456, 456)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 71, 46));
        jLabel4.setText("Billing");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Medicine ID:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Name of medicine:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Price:               Rs.");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Quantity:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Date:");

        mname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        price.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        mid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        qty.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        qty.setForeground(new java.awt.Color(240, 240, 240));

        insert.setBackground(new java.awt.Color(255, 76, 41));
        insert.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insertMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insertMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insertMouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("ADD");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout insertLayout = new javax.swing.GroupLayout(insert);
        insert.setLayout(insertLayout);
        insertLayout.setHorizontalGroup(
            insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insertLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(20, 20, 20))
        );
        insertLayout.setVerticalGroup(
            insertLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14)
        );

        insert1.setBackground(new java.awt.Color(255, 76, 41));
        insert1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        insert1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insert1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insert1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insert1MouseExited(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel15.setText("CLEAR ");

        javax.swing.GroupLayout insert1Layout = new javax.swing.GroupLayout(insert1);
        insert1.setLayout(insert1Layout);
        insert1Layout.setHorizontalGroup(
            insert1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insert1Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel15)
                .addGap(20, 20, 20))
        );
        insert1Layout.setVerticalGroup(
            insert1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel15)
        );

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Total cost:   Rs.");

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Payment:     Rs.");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Balance:      Rs.");

        cost1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cost1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cost1MouseEntered(evt);
            }
        });

        pay.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        balance.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        insert2.setBackground(new java.awt.Color(255, 76, 41));
        insert2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        insert2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insert2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insert2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insert2MouseExited(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("BALANCE");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout insert2Layout = new javax.swing.GroupLayout(insert2);
        insert2.setLayout(insert2Layout);
        insert2Layout.setHorizontalGroup(
            insert2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insert2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addGap(20, 20, 20))
        );
        insert2Layout.setVerticalGroup(
            insert2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cost1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(price)
                            .addComponent(mid)
                            .addComponent(mname)
                            .addComponent(qty)
                            .addComponent(date, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE))
                        .addGap(156, 156, 156))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insert2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(insert1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(mid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(insert1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cost1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(pay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(insert2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

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

        insert3.setBackground(new java.awt.Color(255, 76, 41));
        insert3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        insert3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insert3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insert3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insert3MouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel17.setText("PRINT");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout insert3Layout = new javax.swing.GroupLayout(insert3);
        insert3.setLayout(insert3Layout);
        insert3Layout.setHorizontalGroup(
            insert3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        insert3Layout.setVerticalGroup(
            insert3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insert3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17))
        );

        insert4.setBackground(new java.awt.Color(255, 76, 41));
        insert4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        insert4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                insert4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                insert4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                insert4MouseExited(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel18.setText("Exit");

        javax.swing.GroupLayout insert4Layout = new javax.swing.GroupLayout(insert4);
        insert4.setLayout(insert4Layout);
        insert4Layout.setHorizontalGroup(
            insert4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insert4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        insert4Layout.setVerticalGroup(
            insert4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, insert4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18))
        );

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 539, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(insert3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(insert4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 682, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insert3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insert4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseClicked
        // TODO add your handling code here:
        
      
          try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharmarcy","root","");
                 PreparedStatement pst=con.prepareStatement("insert into billing values(?,?,?,?,?,?)");
              

                String mid1=mid.getText();
                pst.setString(1,mid1);
          
           
                 pst.setString(2,mname.getText());
                 String price1=price.getText();
        
                 pst.setString(3,price1);
                int mt=Integer.parseInt(qty.getText());
                pst.setString(4,qty.getText());
        
                cost=mt*Integer.parseInt(price1);
                cost1.setText(String.valueOf(cost)+".00");
         
      
                SimpleDateFormat df=new SimpleDateFormat("YYYY-MM-dd");
                String date1=df.format(date.getDate());
                 pst.setString(5,date1);
        
                pst.setInt(6, cost);
                 int newqty=Integer.parseInt(old)-mt;
        
                pay.setText(".00");
                 pay1=Integer.parseInt(pay.getText());
                int bal=pay1-cost;
                 balance.setText(String.valueOf(bal)+".00");
                pst.executeUpdate();
    
                selectMed();
                selectMed1();
       
                mname.setText(null);
                price.setText(null);
                mid.setText(null);
            qty.setText(null);
            date.setCalendar(null);
       
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

    private void insert1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insert1MouseClicked
        // TODO add your handling code here:
          mname.setText(null);
        price.setText(null);
       mid.setText(null);
       qty.setText(null);
       date.setCalendar(null);
        
       

    }//GEN-LAST:event_insert1MouseClicked

    private void insert1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insert1MouseExited
        // TODO add your handling code here:
        insert1.setBackground(new Color(255,76,41));
        
    }//GEN-LAST:event_insert1MouseExited

    private void insert2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insert2MouseClicked
        // TODO add your handling code here:
        pay1=Integer.parseInt(pay.getText());
        int bal=pay1-cost;
        balance.setText(String.valueOf(bal)+".00");
    }//GEN-LAST:event_insert2MouseClicked

    private void insert2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insert2MouseExited
        // TODO add your handling code here:
        insert2.setBackground(new Color(255,76,41));
    }//GEN-LAST:event_insert2MouseExited

    private void mtable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mtable1MouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_mtable1MouseClicked

    private void insert3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insert3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_insert3MouseClicked

    private void insert3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insert3MouseExited
        // TODO add your handling code here:
        insert3.setBackground(new Color(255,76,41));
    }//GEN-LAST:event_insert3MouseExited

    private void insert4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insert4MouseClicked
        // TODO add your handling code here:
        new cachier1().setVisible(true);
    }//GEN-LAST:event_insert4MouseClicked

    private void insert4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insert4MouseExited
        // TODO add your handling code here:
        insert4.setBackground(new Color(255,76,41));
    }//GEN-LAST:event_insert4MouseExited

    private void mtableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mtableMouseClicked
model1=(DefaultTableModel)mtable.getModel();
         int myidex=mtable.getSelectedRow();
       
       
        
       
          
        
             
        mid.setText(model1.getValueAt(myidex,0).toString());
       mname.setText(model1.getValueAt(myidex, 1).toString());
        price.setText(model1.getValueAt(myidex, 3).toString());
      qty.setText(model1.getValueAt(myidex, 2).toString());
      
      
      

   
    }//GEN-LAST:event_mtableMouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void cost1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cost1MouseEntered
        // TODO add your handling code here:
        x=0;
    }//GEN-LAST:event_cost1MouseEntered

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        
        
         // TODO add your handling code here:
        try{
        
       balance.print();
        
        }catch(Exception e){
        
        e.printStackTrace();
        
        }
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
        pay1=Integer.parseInt(pay.getText());
        int bal=pay1-cost;
        balance.setText(String.valueOf(bal)+".00");
    }//GEN-LAST:event_jLabel16MouseClicked

    private void insertMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insertMouseEntered
        // TODO add your handling code here:
         insert.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_insertMouseEntered

    private void insert1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insert1MouseEntered
        // TODO add your handling code here:
         insert1.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_insert1MouseEntered

    private void insert2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insert2MouseEntered
        // TODO add your handling code here:
         insert2.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_insert2MouseEntered

    private void insert3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insert3MouseEntered
        // TODO add your handling code here:
         insert3.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_insert3MouseEntered

    private void insert4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_insert4MouseEntered
        // TODO add your handling code here:
         insert4.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_insert4MouseEntered

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
            java.util.logging.Logger.getLogger(billing1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(billing1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(billing1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(billing1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new billing1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField balance;
    private javax.swing.JTextField cost1;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JPanel insert;
    private javax.swing.JPanel insert1;
    private javax.swing.JPanel insert2;
    private javax.swing.JPanel insert3;
    private javax.swing.JPanel insert4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mid;
    private javax.swing.JTextField mname;
    private javax.swing.JTable mtable;
    private javax.swing.JTable mtable1;
    private javax.swing.JTextField pay;
    private javax.swing.JTextField price;
    private javax.swing.JTextField qty;
    // End of variables declaration//GEN-END:variables
}
