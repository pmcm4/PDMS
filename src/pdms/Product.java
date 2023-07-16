/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdms;



import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.io.IOException;
import static java.lang.Thread.sleep;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableRowSorter;
import static jdk.nashorn.internal.objects.NativeFunction.function;


import net.proteanit.sql.DbUtils;

/**
 *
 * @author pmora
 */
public class Product extends javax.swing.JFrame {


    public Product() {
        initComponents();
        SelectProd();
        GetCat();
        UpdateSold();
        getlastid();
        chckExpi();
        transfer();
        delete();

        Font BebasNeue = null;
        Font oldS = null;
        
        
        
        
        
        try{
            BebasNeue = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("BebasNeue-Regular.ttf"));
            
            oldS = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("OldStandardTT-Regular.ttf"));
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,55);
            jLabel7.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,20);
            ID.setFont(BebasNeue);
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,20);
            jLabel29.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,20);
            pName.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,20);
            price.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,20);
            QTY.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,20);
            Cat.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,20);
            Manu.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,20);
            mDate.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,20);
            Expi.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,18);
            AddBtn.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,18);
            DeleteBtn.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,18);
            HomeBtn.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,18);
            UpdateBtn.setFont(BebasNeue);

            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,18);
            clear.setFont(BebasNeue);
            
            BebasNeue = BebasNeue.deriveFont(Font.BOLD,18);
            stat.setFont(BebasNeue);
            
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
            oldS = oldS.deriveFont(Font.BOLD,20);
            Search.setFont(oldS);
            
            
            ManuDate.setForeground(Color.BLACK);
            ExpiDate.setForeground(Color.BLACK);
            

            
            oldS = oldS.deriveFont(Font.BOLD,12);
            ProTable.setFont(oldS);
            
        }catch(FontFormatException | IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
        //chckSTAT();

       // GetToday();
       
           
    }

   Connection Con = null;
   Statement St = null;
   ResultSet Rs = null;
   PreparedStatement pst = null;
   int lastid;
   DefaultTableModel model;
   
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        ProName = new javax.swing.JTextField();
        ProPrice = new javax.swing.JTextField();
        ProQTY = new javax.swing.JTextField();
        Manufacturer = new javax.swing.JTextField();
        AddBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        HomeBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProTable = new javax.swing.JTable();
        ProCat = new javax.swing.JComboBox<>();
        STAT = new javax.swing.JComboBox<>();
        Search = new javax.swing.JTextField();
        ProID = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        pName = new javax.swing.JLabel();
        price = new javax.swing.JLabel();
        QTY = new javax.swing.JLabel();
        Cat = new javax.swing.JLabel();
        Manu = new javax.swing.JLabel();
        mDate = new javax.swing.JLabel();
        Expi = new javax.swing.JLabel();
        stat = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        clear = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        ManuDate = new com.toedter.calendar.JDateChooser();
        ExpiDate = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

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
        jLabel7.setText("manage products");

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
                .addGap(375, 375, 375)
                .addComponent(jLabel16)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel7)
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
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(225, 221, 191));

        ProName.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        ProName.setForeground(new java.awt.Color(4, 37, 58));

        ProPrice.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        ProPrice.setForeground(new java.awt.Color(4, 37, 58));
        ProPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProPriceActionPerformed(evt);
            }
        });

        ProQTY.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        ProQTY.setForeground(new java.awt.Color(4, 37, 58));

        Manufacturer.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Manufacturer.setForeground(new java.awt.Color(4, 37, 58));

        AddBtn.setBackground(new java.awt.Color(4, 37, 58));
        AddBtn.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        AddBtn.setForeground(new java.awt.Color(225, 221, 191));
        AddBtn.setText("ADd");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setBackground(new java.awt.Color(4, 37, 58));
        UpdateBtn.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        UpdateBtn.setForeground(new java.awt.Color(225, 221, 191));
        UpdateBtn.setText("edit");
        UpdateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateBtnMouseClicked(evt);
            }
        });
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
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

        ProTable.setBackground(new java.awt.Color(225, 221, 191));
        ProTable.setFont(new java.awt.Font("Showcard Gothic", 0, 12)); // NOI18N
        ProTable.setForeground(new java.awt.Color(4, 37, 58));
        ProTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Price", "Quantity", "Manufacturer", "Expiration Date", "Manufacturing Date", "ExpiDays"
            }
        ));
        ProTable.setGridColor(new java.awt.Color(76, 131, 122));
        ProTable.setRowHeight(30);
        ProTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProTable);

        ProCat.setBackground(new java.awt.Color(225, 221, 191));
        ProCat.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        ProCat.setForeground(new java.awt.Color(4, 37, 58));
        ProCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--" }));
        ProCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProCatActionPerformed(evt);
            }
        });

        STAT.setBackground(new java.awt.Color(225, 221, 191));
        STAT.setFont(new java.awt.Font("Showcard Gothic", 0, 11)); // NOI18N
        STAT.setForeground(new java.awt.Color(4, 37, 58));
        STAT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "Available", "Sold", "Expired" }));
        STAT.setToolTipText("Available\nSold");
        STAT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STATActionPerformed(evt);
            }
        });

        Search.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        Search.setForeground(new java.awt.Color(4, 37, 58));
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchKeyReleased(evt);
            }
        });

        ProID.setFont(new java.awt.Font("Showcard Gothic", 0, 14)); // NOI18N
        ProID.setForeground(new java.awt.Color(4, 37, 58));
        ProID.setEnabled(false);
        ProID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProIDActionPerformed(evt);
            }
        });

        ID.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        ID.setForeground(new java.awt.Color(76, 131, 122));
        ID.setText("ID");

        pName.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        pName.setForeground(new java.awt.Color(76, 131, 122));
        pName.setText("Product Name");

        price.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        price.setForeground(new java.awt.Color(76, 131, 122));
        price.setText("Price");

        QTY.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        QTY.setForeground(new java.awt.Color(76, 131, 122));
        QTY.setText("Quantity");

        Cat.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        Cat.setForeground(new java.awt.Color(76, 131, 122));
        Cat.setText("Category");

        Manu.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        Manu.setForeground(new java.awt.Color(76, 131, 122));
        Manu.setText("Manufacturer");

        mDate.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        mDate.setForeground(new java.awt.Color(76, 131, 122));
        mDate.setText("Manufacturer date");

        Expi.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        Expi.setForeground(new java.awt.Color(76, 131, 122));
        Expi.setText("Expiry Date");

        stat.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        stat.setForeground(new java.awt.Color(76, 131, 122));
        stat.setText("Status");

        jLabel29.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(76, 131, 122));
        jLabel29.setText("Search");

        clear.setBackground(new java.awt.Color(4, 37, 58));
        clear.setFont(new java.awt.Font("Showcard Gothic", 1, 14)); // NOI18N
        clear.setForeground(new java.awt.Color(225, 221, 191));
        clear.setText("Clear");
        clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearMouseClicked(evt);
            }
        });
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
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

        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pdms/CART.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(268, 268, 268)
                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(stat)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(STAT, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel12))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Expi, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(mDate, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Manu, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Cat, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(QTY, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(pName, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ID, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ProName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ProPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ProQTY, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ProCat, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Manufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ProID, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ManuDate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ExpiDate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 262, Short.MAX_VALUE)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)
                        .addComponent(jLabel31)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price)
                            .addComponent(ProPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ProQTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QTY))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProCat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Manufacturer)
                            .addComponent(Manu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mDate)
                            .addComponent(ManuDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Expi)
                            .addComponent(ExpiDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(STAT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stat))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AddBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HomeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29)
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addGap(31, 31, 31))
        );

        STAT.getAccessibleContext().setAccessibleName("Available\nSold");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void SelectProd()
    {
        String currentDir=System.getProperty("user.dir");
        try{
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
          Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
            St = (Statement) Con.createStatement();
            Rs = St.executeQuery("select * from PRODUCTS ORDER BY PROID ASC");
            ProTable.setModel(DbUtils.resultSetToTableModel(Rs));
            ProTable.getColumnModel().getColumn(0).setHeaderValue("Product ID");
            ProTable.getColumnModel().getColumn(1).setHeaderValue("Product Name");
            ProTable.getColumnModel().getColumn(2).setHeaderValue("Price");
            ProTable.getColumnModel().getColumn(3).setHeaderValue("Quantity");
            ProTable.getColumnModel().getColumn(4).setHeaderValue("Manufacturer");
            ProTable.getColumnModel().getColumn(5).setHeaderValue("Category");
            ProTable.getColumnModel().getColumn(6).setHeaderValue("Manufacturing Date");
            ProTable.getColumnModel().getColumn(7).setHeaderValue("Expiration Date");
            ProTable.getColumnModel().getColumn(8).setHeaderValue("Status");
            
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }
    }

    
    private void GetCat(){
        String currentDir=System.getProperty("user.dir");
        try{
           Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
           Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
            St = (Statement) Con.createStatement();
            String query = "select * from Admin1.CATEGORY";
            Rs = St.executeQuery(query);
            while(Rs.next())
                    {
                        String MyCat = Rs.getString("CATNAME");
                        ProCat.addItem(MyCat);
                    }
        }catch(HeadlessException | ClassNotFoundException | SQLException e)
        {
            
        }
    }
    
   
   /* private void GetToday()
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
                        //  getTime=lbltime.getText();
                        // getDate=lbldate.getText();
                        sleep(1000);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(rootPane, e); 
                }
            }
        };
    GetToday.start();
   
}*/
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
       public void UpdateSold(){
           String currentDir=System.getProperty("user.dir");
        try{
               Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
               Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
                String UpdateQuery = "update Admin1.PRODUCTS set PROQTY= 0 where STAT='Sold'";
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                SelectProd();
                
            }catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
    }
              public void chckExpi(){
                  String currentDir=System.getProperty("user.dir");
        try{
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
                String UpdateQuery = "update Admin1.PRODUCTS set STAT='Expired' where cast( {fn TIMESTAMPDIFF( SQL_TSI_DAY,MANUDATE,CURRENT_TIMESTAMP)} as double) /cast( {fn TIMESTAMPDIFF( SQL_TSI_DAY,MANUDATE,EXPIDATE )} as DOUBLE)*100 > 101 ";
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                SelectProd();
            }catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
    }
/*public void chckSTAT(){
        try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/PDMS","Admin1","1234");
                String UpdateQuery = "update Admin1.PRODUCTS set STAT='Available' where cast( {fn TIMESTAMPDIFF( SQL_TSI_DAY,MANUDATE,CURRENT_TIMESTAMP)} as double) /cast( {fn TIMESTAMPDIFF( SQL_TSI_DAY,MANUDATE,EXPIDATE )} as DOUBLE)*100 > 1 ";
                Statement Add = Con.createStatement();
                Add.executeUpdate(UpdateQuery);
                SelectProd();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
    }*/
    
    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        new Product().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel31MouseClicked

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

    private void clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearMouseClicked
        ProName.setText("");
        ProPrice.setText("");
        ProQTY.setText("");
        Manufacturer.setText("");
        ((JTextField)ManuDate.getDateEditor().getUiComponent()).setText("");
        ((JTextField)ExpiDate.getDateEditor().getUiComponent()).setText("");
        getlastid();
    }//GEN-LAST:event_clearMouseClicked

    private void ProIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProIDActionPerformed

    private void SearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyReleased
        String searchString = Search.getText();
        search(searchString);
    }//GEN-LAST:event_SearchKeyReleased

    private void STATActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STATActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_STATActionPerformed

    private void ProCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProCatActionPerformed

    private void ProTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProTableMouseClicked
        DefaultTableModel model = (DefaultTableModel) ProTable.getModel();
        int Myindex = ProTable.getSelectedRow();
        ProID.setText(model.getValueAt(Myindex, 0).toString());
        ProName.setText(model.getValueAt(Myindex, 1).toString());
        ProPrice.setText(model.getValueAt(Myindex, 2).toString());
        ProQTY.setText(model.getValueAt(Myindex, 3).toString());
        Manufacturer.setText(model.getValueAt(Myindex, 4).toString());
        ((JTextField)ManuDate.getDateEditor().getUiComponent()).setText(model.getValueAt(Myindex, 6).toString());
        ((JTextField)ExpiDate.getDateEditor().getUiComponent()).setText(model.getValueAt(Myindex, 7).toString());
        ManuDate.setForeground(Color.BLACK);
        ExpiDate.setForeground(Color.BLACK);
    }//GEN-LAST:event_ProTableMouseClicked

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

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if(ProID.getText().isEmpty() || ProName.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter The Product to be Deleted");

        }
        else
        {
            String currentDir=System.getProperty("user.dir");
            try{
                 Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
                String Id = ProID.getText();
                String Query = "Delete from Admin1.PRODUCTS where PROID="+Id;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                SelectProd();
                JOptionPane.showMessageDialog(this, "Product Deleted Succesfully");
                ProName.setText("");
                ProPrice.setText("");
                ProQTY.setText("");
                Manufacturer.setText("");
                ((JTextField)ManuDate.getDateEditor().getUiComponent()).setText("");
                ((JTextField)ExpiDate.getDateEditor().getUiComponent()).setText("");
                getlastid();
            }catch(HeadlessException | ClassNotFoundException | SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void UpdateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateBtnMouseClicked
        if(ProID.getText().isEmpty() || ProName.getText().isEmpty() || ProPrice.getText().isEmpty() || ProQTY.getText().isEmpty() || Manufacturer.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");
        }
        else
        {
            if(ProCat.getSelectedItem() == "--")
            {
                JOptionPane.showMessageDialog(this, "Enter The Product Category.");

            }
            else if(STAT.getSelectedItem() == "--")
            {
                JOptionPane.showMessageDialog(this, "Enter The Product Satus.");

            }else
            {
                String currentDir=System.getProperty("user.dir");
                try{
                     Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                    Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
                    String UpdateQuery = "update Admin1.PRODUCTS set PRONAME='"+ProName.getText()+"'"+",PROPRICE="+ProPrice.getText()+""+",PROQTY="+ProQTY.getText()+""+",MANUFACTURER='"+Manufacturer.getText()+"'"+",PROCAT='"+ProCat.getSelectedItem().toString()+"'"+", MANUDATE='"+((JTextField)ManuDate.getDateEditor().getUiComponent()).getText()+"'"+",EXPIDATE ='"+((JTextField)ExpiDate.getDateEditor().getUiComponent()).getText()+"'"+", STAT='"+STAT.getSelectedItem().toString()+"'"+"where PROID ="+ProID.getText();
                    Statement Add = Con.createStatement();
                    Add.executeUpdate(UpdateQuery);
                    JOptionPane.showMessageDialog(this, "Product Updated Succesfully");
                    ProName.setText("");
                    ProPrice.setText("");
                    ProQTY.setText("");
                    Manufacturer.setText("");
                    ((JTextField)ManuDate.getDateEditor().getUiComponent()).setText("");
                    ((JTextField)ExpiDate.getDateEditor().getUiComponent()).setText("");
                    SelectProd();
                    getlastid();
                    UpdateSold();
                    chckExpi();

                }catch(HeadlessException | ClassNotFoundException | SQLException e)
                {
                    e.printStackTrace();
                }
            }
    }//GEN-LAST:event_UpdateBtnMouseClicked
    }
    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
       if(ProID.getText().isEmpty() || ProName.getText().isEmpty() || ProPrice.getText().isEmpty() || ProQTY.getText().isEmpty() || Manufacturer.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information");

        }
       else{
        if(ProCat.getSelectedItem() == "--")
        {
            JOptionPane.showMessageDialog(this, "Enter The Product Category.");

        }
        else if(STAT.getSelectedItem() == "--")
        {
            JOptionPane.showMessageDialog(this, "Enter The Product Satus.");

        }
        else
        {
            String currentDir=System.getProperty("user.dir");
            try{
                        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
                PreparedStatement add = Con.prepareStatement("insert into PRODUCTS values(?,?,?,?,?,?,?,?,?)");

                add.setInt(1, Integer.valueOf(ProID.getText()));
                add.setString(2, ProName.getText());
                add.setInt(3, Integer.valueOf(ProPrice.getText()));
                add.setInt(4, Integer.valueOf(ProQTY.getText()));
                add.setString(5, Manufacturer.getText());
                add.setString(6, ProCat.getSelectedItem().toString());
                add.setString(7, ((JTextField)ManuDate.getDateEditor().getUiComponent()).getText());
                add.setString(8, ((JTextField)ExpiDate.getDateEditor().getUiComponent()).getText());
                add.setString(9, STAT.getSelectedItem().toString());
                
                int row = add.executeUpdate();
                JOptionPane.showMessageDialog(this, "Product Succesfully Added");
                ProName.setText("");
                ProPrice.setText("");
                ProQTY.setText("");
                Manufacturer.setText("");
                ((JTextField)ManuDate.getDateEditor().getUiComponent()).setText("");
                ((JTextField)ExpiDate.getDateEditor().getUiComponent()).setText("");
                Con.close();
                SelectProd();
                getlastid();
                chckExpi();
                transfer();
                delete();
              

                
            }catch(HeadlessException | ClassNotFoundException | SQLException e)
            {

            }

        }
       }
    
    }//GEN-LAST:event_AddBtnMouseClicked
    
    private void ProPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProPriceActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new Product().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseEntered

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened
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
    public void search(String Str){
        model = (DefaultTableModel) ProTable.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        ProTable.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(Str));
        
        
        
    }
      
    public void transfer(){
        String currentDir=System.getProperty("user.dir");
        try{
                        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                  Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
                    String UpdateQuery = "INSERT INTO EXPRODUCTS SELECT * FROM PRODUCTS WHERE STAT = 'Expired'";                 
                    Statement Add = Con.createStatement();
                    Add.executeUpdate(UpdateQuery);
                    //JOptionPane.showMessageDialog(this, "Expired Products is succesfully transfered to Expired Database");
 

                }catch(Exception e)
                {
                    e.printStackTrace();
                }
    }
    public void delete(){
        String currentDir=System.getProperty("user.dir");
                try{
                        Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
                        Con = DriverManager.getConnection("jdbc:derby:"+currentDir+"\\dbPDMS","Admin1","1234");
                        String UpdateQuery = "DELETE FROM PRODUCTS WHERE STAT = 'Expired'";                 
                        Statement Add = Con.createStatement();
                        Add.executeUpdate(UpdateQuery);
                        //JOptionPane.showMessageDialog(this, "Expired Products is succesfully transfered to Expired Database");


                    }catch(HeadlessException | ClassNotFoundException | SQLException e)
                    {
                        e.printStackTrace();
                    }

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
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Product().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JLabel Cat;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JLabel Expi;
    private com.toedter.calendar.JDateChooser ExpiDate;
    private javax.swing.JButton HomeBtn;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel Manu;
    private com.toedter.calendar.JDateChooser ManuDate;
    private javax.swing.JTextField Manufacturer;
    private javax.swing.JComboBox<String> ProCat;
    private javax.swing.JTextField ProID;
    private javax.swing.JTextField ProName;
    private javax.swing.JTextField ProPrice;
    private javax.swing.JTextField ProQTY;
    private javax.swing.JTable ProTable;
    private javax.swing.JLabel QTY;
    private javax.swing.JComboBox<String> STAT;
    private javax.swing.JTextField Search;
    private javax.swing.JButton UpdateBtn;
    private javax.swing.JButton clear;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mDate;
    private javax.swing.JLabel pName;
    private javax.swing.JLabel price;
    private javax.swing.JLabel stat;
    // End of variables declaration//GEN-END:variables
}
