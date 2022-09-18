package com.ps.gui;
public class DashBoard2 extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard2
     */
    public DashBoard2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        menubar = new javax.swing.JPanel();
        comInfo = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        activity = new javax.swing.JLabel();
        profileImg = new javax.swing.JLabel();
        dash = new javax.swing.JLabel();
        caseInfo = new javax.swing.JLabel();
        policeInfo = new javax.swing.JLabel();
        criminalInfo = new javax.swing.JLabel();
        generalDiary = new javax.swing.JLabel();
        dumInfo = new javax.swing.JLabel();
        others = new javax.swing.JLabel();
        personalInfo = new javax.swing.JLabel();
        editProfile = new javax.swing.JLabel();
        addNewAdmin = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        menuItem = new javax.swing.JPanel();
        dashboard = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        caseborad = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        policeboard = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jPanel3.setBackground(new java.awt.Color(44, 133, 193));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Police Station Management");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(44, 133, 193));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menubar.setBackground(new java.awt.Color(51, 51, 51));
        menubar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        comInfo.setBackground(new java.awt.Color(44, 133, 193));
        comInfo.setFont(new java.awt.Font("Segoe UI Emoji", 0, 13)); // NOI18N
        comInfo.setForeground(new java.awt.Color(255, 255, 255));
        comInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comInfo.setText("Admin RahatMinhaj");
        comInfo.setOpaque(true);
        menubar.add(comInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 30));

        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("MinhajulIslam");
        menubar.add(userName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        activity.setForeground(new java.awt.Color(51, 255, 0));
        activity.setText("Online");
        menubar.add(activity, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        profileImg.setForeground(new java.awt.Color(255, 255, 255));
        profileImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ecqlipse 2 - 48 32 16 system white/USER - M_48x48-32.png"))); // NOI18N
        menubar.add(profileImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 50, 40));

        dash.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dash.setForeground(new java.awt.Color(255, 255, 255));
        dash.setText("Dashboard");
        dash.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashMouseClicked(evt);
            }
        });
        menubar.add(dash, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 150, -1));

        caseInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        caseInfo.setForeground(new java.awt.Color(255, 255, 255));
        caseInfo.setText("Case Information");
        caseInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                caseInfoMouseClicked(evt);
            }
        });
        menubar.add(caseInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 150, -1));

        policeInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        policeInfo.setForeground(new java.awt.Color(255, 255, 255));
        policeInfo.setText("Police Information");
        policeInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                policeInfoMouseClicked(evt);
            }
        });
        menubar.add(policeInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 150, -1));

        criminalInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        criminalInfo.setForeground(new java.awt.Color(255, 255, 255));
        criminalInfo.setText("Criminal Information");
        menubar.add(criminalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 150, -1));

        generalDiary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        generalDiary.setForeground(new java.awt.Color(255, 255, 255));
        generalDiary.setText("General Diary");
        menubar.add(generalDiary, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 150, -1));

        dumInfo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dumInfo.setForeground(new java.awt.Color(255, 255, 255));
        dumInfo.setText("Dumpyard");
        menubar.add(dumInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 150, -1));

        others.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        others.setForeground(new java.awt.Color(255, 255, 255));
        others.setText("Others");
        menubar.add(others, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 150, -1));

        personalInfo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        personalInfo.setForeground(new java.awt.Color(153, 153, 153));
        personalInfo.setText("Personal Information");
        menubar.add(personalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 150, -1));

        editProfile.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        editProfile.setForeground(new java.awt.Color(255, 255, 255));
        editProfile.setText("Edit Your Profile");
        menubar.add(editProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 100, -1));

        addNewAdmin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addNewAdmin.setForeground(new java.awt.Color(255, 255, 255));
        addNewAdmin.setText("Add New Admin");
        menubar.add(addNewAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 100, -1));

        logOut.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logOut.setForeground(new java.awt.Color(255, 255, 255));
        logOut.setText("Log Out");
        menubar.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 60, -1));

        jPanel1.add(menubar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 560));

        menuItem.setBackground(new java.awt.Color(204, 204, 204));

        dashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Police Station Management");
        dashboard.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Version 1.0");
        dashboard.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 34, 234, 16));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Total Vehicle");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("250");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 115, 90));

        dashboard.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(595, 89, 211, 136));

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Total Case");
        jPanel5.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("250");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 115, 90));

        dashboard.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 89, 211, 136));

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Total Police");
        jPanel6.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("250");
        jPanel6.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 115, 90));

        dashboard.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 89, 211, 136));

        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Total GD");
        jPanel9.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("250");
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 115, 90));

        dashboard.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 211, 136));

        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Total Case");
        jPanel8.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("250");
        jPanel8.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 115, 90));

        dashboard.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 211, 136));

        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("Total Case");
        jPanel7.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("250");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 115, 90));

        dashboard.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 211, 136));

        caseborad.setBackground(new java.awt.Color(255, 204, 204));
        caseborad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Police Station Management");
        caseborad.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Version 1.0");
        caseborad.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 34, 234, 16));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Case ID", "Case Opened By", "Criminals", "Victims", "Case Taken By"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        caseborad.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 830, 380));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Case List:");
        caseborad.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jButton1.setText("Case Update");
        jButton1.setActionCommand("Close Case");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        caseborad.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 130, 40));

        jButton2.setText("Add New Case");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        caseborad.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ecqlipse 2 - 48 32 16 system black/SEARCH_16x16-32.png"))); // NOI18N
        jButton3.setText("Find Case");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        caseborad.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, 40));

        jButton4.setText("Pending Case");
        jButton4.setActionCommand("Close Case");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        caseborad.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 130, 40));

        jButton5.setText("Closed Case");
        jButton5.setActionCommand("Close Case");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        caseborad.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 130, 40));

        policeboard.setBackground(new java.awt.Color(204, 255, 255));
        policeboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Police Station Management");
        policeboard.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 21, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(153, 153, 153));
        jLabel19.setText("Version 1.0");
        policeboard.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 34, 234, 16));

        jButton6.setText("Add New Police");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        policeboard.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 130, 40));

        jButton7.setText("Police Information Update");
        jButton7.setActionCommand("Close Case");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        policeboard.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, 130, 40));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ecqlipse 2 - 48 32 16 system black/SEARCH_16x16-32.png"))); // NOI18N
        jButton8.setText("Find Police");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        policeboard.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 130, 40));

        jButton9.setText("Case Solved");
        jButton9.setActionCommand("Close Case");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        policeboard.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, 130, 40));

        jButton10.setText("Closed Case");
        jButton10.setActionCommand("Close Case");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        policeboard.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 130, 40));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Police ID", "Police Name", "Police Phone", "Superior", "Case Solved"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        policeboard.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 830, 380));

        javax.swing.GroupLayout menuItemLayout = new javax.swing.GroupLayout(menuItem);
        menuItem.setLayout(menuItemLayout);
        menuItemLayout.setHorizontalGroup(
            menuItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
            .addGroup(menuItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(caseborad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(policeboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuItemLayout.setVerticalGroup(
            menuItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addGroup(menuItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(caseborad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menuItemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(policeboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(menuItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 830, 530));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caseInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_caseInfoMouseClicked

      System.out.println("case");
        
        dashboard.setVisible(false);
        policeboard.setVisible(false);
        caseborad.setVisible(true);

    }//GEN-LAST:event_caseInfoMouseClicked

    private void dashMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashMouseClicked
        // TODO add your handling code here:
        System.out.println("dashboar");
        
        
        caseborad.setVisible(false);
        policeboard.setVisible(false);
        dashboard.setVisible(true);
        
    }//GEN-LAST:event_dashMouseClicked

    private void policeInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_policeInfoMouseClicked
        // TODO add your handling code here:
         System.out.println("police");
        
        
        dashboard.setVisible(false);
        caseborad.setVisible(false);
        policeboard.setVisible(true);
    }//GEN-LAST:event_policeInfoMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(DashBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activity;
    private javax.swing.JLabel addNewAdmin;
    private javax.swing.JLabel caseInfo;
    private javax.swing.JPanel caseborad;
    private javax.swing.JLabel comInfo;
    private javax.swing.JLabel criminalInfo;
    private javax.swing.JLabel dash;
    private javax.swing.JPanel dashboard;
    private javax.swing.JLabel dumInfo;
    private javax.swing.JLabel editProfile;
    private javax.swing.JLabel generalDiary;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel logOut;
    private javax.swing.JPanel menuItem;
    private javax.swing.JPanel menubar;
    private javax.swing.JLabel others;
    private javax.swing.JLabel personalInfo;
    private javax.swing.JLabel policeInfo;
    private javax.swing.JPanel policeboard;
    private javax.swing.JLabel profileImg;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
