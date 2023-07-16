/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdms;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author pmora
 */
public class User extends javax.swing.JFrame {

    /**
     * Creates new form User
     */
    public User() {
        initComponents();
        SelectUser();
        getlastid();
        Font BebasNeue = null;
        Font oldS = null;
        
        try{
            BebasNeue = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("BebasNeue-Regular.ttf"));
            
            oldS = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("OldStandardTT-Regular.ttf"));
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,55);
            jLabel7.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,20);
            jLabel11.setFont(BebasNeue);
           
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,30);
            jLabel12.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,20);
            jLabel8.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,20);
            jLabel9.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,20);
            jLabel10.setFont(BebasNeue);
            
            oldS = oldS.deriveFont(Font.BOLD,20);
            userNo.setFont(oldS);
            oldS = oldS.deriveFont(Font.BOLD,20);
            username.setFont(oldS);
            oldS = oldS.deriveFont(Font.BOLD,20);
            password.setFont(oldS);
            oldS = oldS.deriveFont(Font.BOLD,20);
            email.setFont(oldS);
            
             BebasNeue = BebasNeue.deriveFont(Font.BOLD,18);
            AddBtn.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,18);
            DeleteBtn.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,18);
            HomeBtn.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,18);
            EditBtn.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,18);
            clear1.setFont(BebasNeue);
            
            
            
            oldS = oldS.deriveFont(Font.BOLD,12);
            userlist.setFont(oldS);
            
            
            
            
        }catch(FontFormatException | IOException e){
            JOptionPane.showMessageDialog(null, e);
        }

    }
   Connection Con = null;
   Statement St = null;
   ResultSet Rs = null;
   int lastid;


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        EditBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userlist = new javax.swing.JTable();
        userNo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        clear1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(4, 37, 58));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(225, 221, 191));
        jLabel7.setText("Manage User");

        jLabel16.setFont(new java.awt.Font("SimSun", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(225, 221, 191));
        jLabel16.setText("x");
        jLabel16.setToolTipText("");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(348, 348, 348)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 351, Short.MAX_VALUE)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 29, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(4, 37, 58));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(225, 221, 191));

        jLabel8.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(76, 131, 122));
        jLabel8.setText("UserName");

        jLabel9.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(76, 131, 122));
        jLabel9.setText("Password");

        jLabel10.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(76, 131, 122));
        jLabel10.setText(" email address");

        username.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        username.setForeground(new java.awt.Color(4, 37, 58));

        email.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        email.setForeground(new java.awt.Color(4, 37, 58));

        password.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        password.setForeground(new java.awt.Color(4, 37, 58));

        AddBtn.setBackground(new java.awt.Color(4, 37, 58));
        AddBtn.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(225, 221, 191));
        AddBtn.setText("ADd");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });

        EditBtn.setBackground(new java.awt.Color(4, 37, 58));
        EditBtn.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        EditBtn.setForeground(new java.awt.Color(225, 221, 191));
        EditBtn.setText("edit");
        EditBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditBtnMouseClicked(evt);
            }
        });
        EditBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setBackground(new java.awt.Color(4, 37, 58));
        DeleteBtn.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(225, 221, 191));
        DeleteBtn.setText("delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        HomeBtn.setBackground(new java.awt.Color(4, 37, 58));
        HomeBtn.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        HomeBtn.setForeground(new java.awt.Color(225, 221, 191));
        HomeBtn.setText("Home");
        HomeBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeBtnMouseClicked(evt);
            }
        });
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });

        userlist.setBackground(new java.awt.Color(225, 221, 191));
        userlist.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        userlist.setForeground(new java.awt.Color(4, 37, 58));
        userlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "User No.", "Username", "Password", "Email Address"
            }
        ));
        userlist.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        userlist.setGridColor(new java.awt.Color(76, 131, 122));
        userlist.setRowHeight(30);
        userlist.setSelectionForeground(new java.awt.Color(225, 221, 191));
        userlist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userlistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(userlist);

        userNo.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        userNo.setForeground(new java.awt.Color(4, 37, 58));
        userNo.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(76, 131, 122));
        jLabel11.setText("User Number");

        jLabel12.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(4, 37, 58));
        jLabel12.setText("User List");

        clear1.setBackground(new java.awt.Color(4, 37, 58));
        clear1.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        clear1.setForeground(new java.awt.Color(225, 221, 191));
        clear1.setText("Clear");
        clear1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clear1MouseClicked(evt);
            }
        });

        jLabel1.setToolTipText("");

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdms/USER.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(239, 239, 239))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(34, 34, 34))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(119, 119, 119))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(username, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userNo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jLabel12)
                        .addGap(220, 220, 220))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(userNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EditBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void getlastid(){
        String currentDir=System.getProperty("user.dir");
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
            String sql = "select max(userNo) from userTBL";
            St = Con.createStatement();
            Rs = St.executeQuery(sql);
            if(Rs.next()){
                lastid=Rs.getInt(1);
                lastid++;
                userNo.setText(Integer.toString(lastid));
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            
        }
    }
    public void SelectUser()
    {
        String currentDir=System.getProperty("user.dir");
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
            St = (Statement) Con.createStatement();
            Rs = St.executeQuery("select * from USERTBL");
            userlist.setModel(DbUtils.resultSetToTableModel(Rs));
            userlist.getColumnModel().getColumn(0).setHeaderValue("User ID");
            userlist.getColumnModel().getColumn(1).setHeaderValue("Username");
            userlist.getColumnModel().getColumn(2).setHeaderValue("Password");
            userlist.getColumnModel().getColumn(3).setHeaderValue("Email Address");
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }
    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        String currentDir=System.getProperty("user.dir");
        if(userNo.getText().isEmpty() || username.getText().isEmpty()|| password.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
           
        }else{
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
            PreparedStatement add = Con.prepareStatement("insert into USERTBL values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(userNo.getText()));
            add.setString(2, username.getText());
            add.setString(3, password.getText());
            add.setString(4, email.getText());
            
            
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "User Succesfully Added");
            Con.close();
            SelectUser();
            getlastid();
            username.setText("");
            password.setText("");
            email.setText("");
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void EditBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditBtnMouseClicked
             if(userNo.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty() || email.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
            
        }
        else
        {
            String currentDir=System.getProperty("user.dir");
            try{
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
                String UpdateQuery = "update Admin1.USERTBL set USERNAME='"+username.getText()+"'"+", PASSWORD='"+password.getText()+"'"+", EMAIL='"+email.getText()+"'"+"where USERNO ="+userNo.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                JOptionPane.showMessageDialog(this, "User Updated Succesfully");
                SelectUser();
                getlastid();
                username.setText("");
                password.setText("");
                email.setText("");
            }catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EditBtnMouseClicked

    private void EditBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditBtnActionPerformed

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
               if(userNo.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty() || email.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter The User to be Deleted");
           
        }
        else
        {
            String currentDir=System.getProperty("user.dir");
            try{
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
                String Id = userNo.getText();
                String Query = "Delete from Admin1.USERTBL where USERNO="+Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectUser();
                getlastid();
                username.setText("");
                password.setText("");
                email.setText("");
                JOptionPane.showMessageDialog(this, "User Deleted Succesfully");
            }catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnMouseClicked

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void userlistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userlistMouseClicked
        DefaultTableModel model = (DefaultTableModel) userlist.getModel();
        int Myindex = userlist.getSelectedRow();
        userNo.setText(model.getValueAt(Myindex, 0).toString());
        username.setText(model.getValueAt(Myindex, 1).toString());
        password.setText(model.getValueAt(Myindex, 2).toString());
        email.setText(model.getValueAt(Myindex, 3).toString()); 
    }//GEN-LAST:event_userlistMouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void clear1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clear1MouseClicked
        username.setText("");
        password.setText("");
        email.setText("");
    }//GEN-LAST:event_clear1MouseClicked
    private int xMouse, yMouse;
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
   xMouse=evt.getX();
       yMouse=evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
       int x=evt.getXOnScreen();
     int y=evt.getYOnScreen();
     setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

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
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(User.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton EditBtn;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JButton clear1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField password;
    private javax.swing.JTextField userNo;
    private javax.swing.JTable userlist;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
