/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdms;

import java.awt.Color;
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
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author pmora
 */
public class ExProducts extends javax.swing.JFrame {

    /**
     * Creates new form ExProducts
     */
    public ExProducts() {
        initComponents();
        fetch();
        GetToday();
        fetch2();
        Font BebasNeue = null;
        Font oldS = null;
        SelectProd();
        getlastid();
        
        try{
            BebasNeue = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("BebasNeue-Regular.ttf"));
            
            oldS = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("OldStandardTT-Regular.ttf"));
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,55);
            jLabel7.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,24);
            jLabel20.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,24);
            jLabel21.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,24);
            jLabel22.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,24);
            jLabel23.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,24);
            jLabel25.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,24);
            jLabel26.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,24);
            jLabel28.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,36);
            jLabel18.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,36);
            jLabel17.setFont(BebasNeue);
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,24);
            jLabel24.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,24);
            jLabel27.setFont(BebasNeue);
            

            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,18);
            DeleteBtn.setFont(BebasNeue);

            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,18);
            HomeBtn.setFont(BebasNeue);

            
            oldS = oldS.deriveFont(Font.BOLD,20);
            ProID.setFont(oldS);
            oldS = oldS.deriveFont(Font.BOLD,20);
            ProName.setFont(oldS);
            oldS = oldS.deriveFont(Font.BOLD,20);
            ProPrice.setFont(oldS);
            oldS = oldS.deriveFont(Font.BOLD,20);
            ProQTY.setFont(oldS);
            oldS = oldS.deriveFont(Font.BOLD,20);
            Manufacturer.setFont(oldS);
            oldS = oldS.deriveFont(Font.BOLD,20);
            ProCat.setFont(oldS);
            oldS = oldS.deriveFont(Font.BOLD,16);
            ManuDate.setFont(oldS);
            oldS = oldS.deriveFont(Font.BOLD,16);
            ExpiDate.setFont(oldS);
            oldS = oldS.deriveFont(Font.BOLD,20);
            STAT.setFont(oldS);

            
            
            ManuDate.setForeground(Color.BLACK);
            ExpiDate.setForeground(Color.BLACK);
            

            
            oldS = oldS.deriveFont(Font.BOLD,12);
            ProTable1.setFont(oldS);
            oldS = oldS.deriveFont(Font.BOLD,12);
            ProTable2.setFont(oldS);
            
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

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        DeleteBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProTable1 = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        Datelb = new javax.swing.JLabel();
        Timelb = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ProTable2 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        Manufacturer = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        ProQTY = new javax.swing.JTextField();
        ProPrice = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        ProName = new javax.swing.JTextField();
        ProID = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProCat = new javax.swing.JTextField();
        ManuDate = new javax.swing.JTextField();
        ExpiDate = new javax.swing.JTextField();
        STAT = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(4, 37, 58));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(225, 221, 191));
        jLabel7.setText("Manage soon to expire and expired products");

        jLabel16.setFont(new java.awt.Font("SimSun", 0, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(225, 221, 191));
        jLabel16.setText("x");
        jLabel16.setToolTipText("");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(98, 98, 98)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(225, 221, 191));
        jPanel3.setEnabled(false);

        DeleteBtn.setBackground(new java.awt.Color(4, 37, 58));
        DeleteBtn.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        DeleteBtn.setForeground(new java.awt.Color(225, 221, 191));
        DeleteBtn.setText("delete all expired from database");
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

        ProTable1.setBackground(new java.awt.Color(225, 221, 191));
        ProTable1.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        ProTable1.setForeground(new java.awt.Color(255, 102, 102));
        ProTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Price", "Quantity", "Manufacturer", "Manufacturing Date", "Expiration Date"
            }
        ));
        ProTable1.setToolTipText("");
        ProTable1.setGridColor(new java.awt.Color(76, 131, 122));
        ProTable1.setRowHeight(30);
        ProTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProTable1);

        jLabel17.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(4, 37, 58));
        jLabel17.setText("expired products");

        Datelb.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        Datelb.setForeground(new java.awt.Color(76, 131, 122));
        Datelb.setText("Date");

        Timelb.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        Timelb.setForeground(new java.awt.Color(76, 131, 122));
        Timelb.setText("Date");

        ProTable2.setBackground(new java.awt.Color(225, 221, 191));
        ProTable2.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        ProTable2.setForeground(new java.awt.Color(153, 0, 0));
        ProTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Price", "Quantity", "Manufacturer", "Manufacturing Date", "Expiration Date"
            }
        ));
        ProTable2.setToolTipText("");
        ProTable2.setGridColor(new java.awt.Color(76, 131, 122));
        ProTable2.setRowHeight(30);
        ProTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ProTable2);

        jLabel18.setFont(new java.awt.Font("Showcard Gothic", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(4, 37, 58));
        jLabel18.setText("products with > 70% shelf life");

        jLabel28.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(76, 131, 122));
        jLabel28.setText("Status");

        jLabel27.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(76, 131, 122));
        jLabel27.setText("Expiry Date");

        jLabel26.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(76, 131, 122));
        jLabel26.setText("Manufacturer date");

        jLabel25.setFont(jLabel25.getFont().deriveFont(jLabel25.getFont().getSize()+7f));
        jLabel25.setForeground(new java.awt.Color(76, 131, 122));
        jLabel25.setText("Manufacturer");

        Manufacturer.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Manufacturer.setForeground(new java.awt.Color(4, 37, 58));
        Manufacturer.setEnabled(false);

        jLabel24.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(76, 131, 122));
        jLabel24.setText("Category");

        jLabel23.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(76, 131, 122));
        jLabel23.setText("Quantity");

        ProQTY.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        ProQTY.setForeground(new java.awt.Color(4, 37, 58));
        ProQTY.setEnabled(false);

        ProPrice.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        ProPrice.setForeground(new java.awt.Color(4, 37, 58));
        ProPrice.setEnabled(false);
        ProPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProPriceActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(76, 131, 122));
        jLabel22.setText("Price");

        jLabel21.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(76, 131, 122));
        jLabel21.setText("Product Name");

        ProName.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        ProName.setForeground(new java.awt.Color(4, 37, 58));
        ProName.setEnabled(false);

        ProID.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        ProID.setForeground(new java.awt.Color(4, 37, 58));
        ProID.setEnabled(false);
        ProID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProIDActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(76, 131, 122));
        jLabel20.setText("ID");

        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel31.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(76, 131, 122));
        jLabel31.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\61225.png")); // NOI18N
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdms/EXPI.png"))); // NOI18N

        ProCat.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        ProCat.setForeground(new java.awt.Color(4, 37, 58));
        ProCat.setEnabled(false);

        ManuDate.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        ManuDate.setForeground(new java.awt.Color(4, 37, 58));
        ManuDate.setEnabled(false);

        ExpiDate.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        ExpiDate.setForeground(new java.awt.Color(4, 37, 58));
        ExpiDate.setEnabled(false);

        STAT.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        STAT.setForeground(new java.awt.Color(4, 37, 58));
        STAT.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Datelb, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Timelb, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn))
                        .addGap(48, 48, 48))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel28, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Manufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProID, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ProCat, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ManuDate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ExpiDate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(STAT, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 725, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jLabel17)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 724, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(141, 141, 141)
                        .addComponent(jLabel31)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel31))
                        .addGap(7, 7, 7)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(Datelb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(Timelb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(ProPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(ProCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Manufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(ManuDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(ExpiDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(STAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 90, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(4, 37, 58));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 29, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

       private void GetToday()
{
   Thread GetToday;
        GetToday = new Thread()
        {
            public void run()
            {
                try {
                    while(true)
                    {
                        Calendar cal=new GregorianCalendar();
                        int day=cal.get(Calendar.DAY_OF_MONTH);
                        int month=cal.get(Calendar.MONTH)+1;
                        int year=cal.get(Calendar.YEAR);
                        int second=cal.get(Calendar.SECOND);
                        int minute=cal.get(Calendar.MINUTE);
                        int hour=cal.get(Calendar.HOUR);
                        
                        Timelb.setText( hour +":"+ minute +":"+ second);
                        Datelb.setText( year +"-"+ month +"-"+ day );
                        //getTime=lbltime.getText();
                        //getDate=lbldate.getText();
                        sleep(1000);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e);
                    
                    
                }
            }
        };
    GetToday.start();
   
}
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void ProTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProTable2MouseClicked
        DefaultTableModel model = (DefaultTableModel) ProTable2.getModel();
        int Myindex = ProTable2.getSelectedRow();
        ProID.setText(model.getValueAt(Myindex, 0).toString());
        ProName.setText(model.getValueAt(Myindex, 1).toString());
        ProPrice.setText(model.getValueAt(Myindex, 2).toString());
        ProQTY.setText(model.getValueAt(Myindex, 3).toString());
        ProCat.setText(model.getValueAt(Myindex, 4).toString());
        Manufacturer.setText(model.getValueAt(Myindex, 5).toString());
        ManuDate.setText(model.getValueAt(Myindex, 6).toString());
        ExpiDate.setText(model.getValueAt(Myindex, 7).toString());
        STAT.setText(model.getValueAt(Myindex, 8).toString());
        ManuDate.setForeground(Color.BLACK);
        ExpiDate.setForeground(Color.BLACK);
    }//GEN-LAST:event_ProTable2MouseClicked

    private void ProTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel) ProTable1.getModel();
        int Myindex = ProTable1.getSelectedRow();
        ProID.setText(model.getValueAt(Myindex, 0).toString());
        ProName.setText(model.getValueAt(Myindex, 1).toString());
        ProPrice.setText(model.getValueAt(Myindex, 2).toString());
        ProQTY.setText(model.getValueAt(Myindex, 3).toString());
        ProCat.setText(model.getValueAt(Myindex, 4).toString());
        Manufacturer.setText(model.getValueAt(Myindex, 5).toString());
        ManuDate.setText(model.getValueAt(Myindex, 6).toString());
        ExpiDate.setText(model.getValueAt(Myindex, 7).toString());
        STAT.setText(model.getValueAt(Myindex, 8).toString());
        ManuDate.setForeground(Color.BLACK);
        ExpiDate.setForeground(Color.BLACK);
    }//GEN-LAST:event_ProTable1MouseClicked

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeBtnActionPerformed

    private void HomeBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeBtnMouseClicked
        new HomeForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomeBtnMouseClicked

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeleteBtnActionPerformed
    public void getlastid(){
        String currentDir=System.getProperty("user.dir");
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
            String sql = "select max(ProID) from PRODUCTS";
            St = Con.createStatement();
            Rs = St.executeQuery(sql);
            if(Rs.next()){
                lastid=Rs.getInt(1);
                lastid++;
                ProID.setText(Integer.toString(lastid));
            }
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            
        }
    }
    public void SelectProd()
    {
        String currentDir=System.getProperty("user.dir");
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
            St = (Statement) Con.createStatement();
            Rs = St.executeQuery("select * from PRODUCTS ORDER BY PROID ASC");
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }
    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
          String currentDir=System.getProperty("user.dir");
        try{
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
                String Query = "Delete from Admin1.EXPRODUCTS where STAT='Expired'";
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Expired Product(s) Deleted from Database");
            }catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
         
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void ProPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProPriceActionPerformed

    private void ProIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProIDActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        new ExProducts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        new ExProducts().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel31MouseClicked
    private int xMouse, yMouse;
    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
       xMouse=evt.getX();
       yMouse=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
     int x=evt.getXOnScreen();
     int y=evt.getYOnScreen();
     setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    public void fetch(){
        String currentDir=System.getProperty("user.dir");
       
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
            St = (Statement) Con.createStatement();
            

            String query = "SELECT * FROM PRODUCTS  WHERE cast( {fn TIMESTAMPDIFF( SQL_TSI_DAY,MANUDATE,CURRENT_TIMESTAMP)} as double) /cast( {fn TIMESTAMPDIFF( SQL_TSI_DAY,MANUDATE,EXPIDATE )} as DOUBLE)*100 > 70 AND STAT = 'Available'";
            
            //SELECT * FROM Admin1.Products WHERE {fn TIMESTAMPDIFF( SQL_TSI_MONTH, CURRENT_MONTH, ExpiDate)} <= 1
            Rs = St.executeQuery(query);
            ProTable1.setModel(DbUtils.resultSetToTableModel(Rs));
            ProTable1.getColumnModel().getColumn(0).setHeaderValue("Product ID");
            ProTable1.getColumnModel().getColumn(1).setHeaderValue("Product Name");
            ProTable1.getColumnModel().getColumn(2).setHeaderValue("Price");
            ProTable1.getColumnModel().getColumn(3).setHeaderValue("Quantity");
            ProTable1.getColumnModel().getColumn(4).setHeaderValue("Manufacturer");
            ProTable1.getColumnModel().getColumn(5).setHeaderValue("Category");
            ProTable1.getColumnModel().getColumn(6).setHeaderValue("Manufacturing Date");
            ProTable1.getColumnModel().getColumn(7).setHeaderValue("Expiration Date");
            ProTable1.getColumnModel().getColumn(8).setHeaderValue("Status");
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            JOptionPane.showConfirmDialog(null, e);
        }
        
    }
     public void fetch2(){
         String currentDir=System.getProperty("user.dir");
 try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
	Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
            St = (Statement) Con.createStatement();
            Rs = St.executeQuery("select * from EXPRODUCTS ORDER BY PROID ASC");
            ProTable2.setModel(DbUtils.resultSetToTableModel(Rs));
            ProTable2.getColumnModel().getColumn(0).setHeaderValue("Product ID");
            ProTable2.getColumnModel().getColumn(1).setHeaderValue("Product Name");
            ProTable2.getColumnModel().getColumn(2).setHeaderValue("Price");
            ProTable2.getColumnModel().getColumn(3).setHeaderValue("Quantity");
            ProTable2.getColumnModel().getColumn(4).setHeaderValue("Manufacturer");
            ProTable2.getColumnModel().getColumn(5).setHeaderValue("Category");
            ProTable2.getColumnModel().getColumn(6).setHeaderValue("Manufacturing Date");
            ProTable2.getColumnModel().getColumn(7).setHeaderValue("Expiration Date");
            ProTable2.getColumnModel().getColumn(8).setHeaderValue("Status");
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }
     public void insert(){
         
     }
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
            java.util.logging.Logger.getLogger(ExProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExProducts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ExProducts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Datelb;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JTextField ExpiDate;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JTextField ManuDate;
    private javax.swing.JTextField Manufacturer;
    private javax.swing.JTextField ProCat;
    private javax.swing.JTextField ProID;
    private javax.swing.JTextField ProName;
    private javax.swing.JTextField ProPrice;
    private javax.swing.JTextField ProQTY;
    private javax.swing.JTable ProTable1;
    private javax.swing.JTable ProTable2;
    private javax.swing.JTextField STAT;
    private javax.swing.JLabel Timelb;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
