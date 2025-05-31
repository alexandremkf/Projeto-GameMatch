/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



package com.mycompany.projeto.gamematch;

import java.awt.Component;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author carlo
 */
public class Tela_Principal_Form extends javax.swing.JFrame {

    private String email;
    
    public Tela_Principal_Form() {
        initComponents();
        adicionarEventosDosBotoes(painelCategorias, jSearchTextField);
        setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
        
        // Comportamento inicial do campo Search
        jSearchTextField.setText("Search...");
        jSearchTextField.setEditable(false);
        jSearchTextField.setFocusable(false);
    }

    public Tela_Principal_Form(String email) {
        initComponents();
        this.email = email;
        setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        friendsPrincipalLabel = new javax.swing.JLabel();
        creditsPrincipalLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        painelCategorias = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jSearchTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1558, 775));

        jPanel1.setBackground(new java.awt.Color(0, 12, 21));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/gm-small.png"))); // NOI18N

        friendsPrincipalLabel.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        friendsPrincipalLabel.setForeground(new java.awt.Color(74, 103, 147));
        friendsPrincipalLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/friends.png"))); // NOI18N
        friendsPrincipalLabel.setText("Friends");
        friendsPrincipalLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        friendsPrincipalLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friendsPrincipalLabelMouseClicked(evt);
            }
        });

        creditsPrincipalLabel.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        creditsPrincipalLabel.setForeground(new java.awt.Color(74, 103, 147));
        creditsPrincipalLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/credits.png"))); // NOI18N
        creditsPrincipalLabel.setText("Credits");
        creditsPrincipalLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creditsPrincipalLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditsPrincipalLabelMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(14, 47, 86));

        jPanel4.setBackground(new java.awt.Color(0, 12, 21));

        painelCategorias.setBackground(new java.awt.Color(8, 27, 40));

        jLabel3.setBackground(new java.awt.Color(8, 27, 40));
        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(74, 103, 147));
        jLabel3.setText("Categories");

        jLabel4.setBackground(new java.awt.Color(8, 27, 40));
        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 103, 147));
        jLabel4.setText("Game style:");

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("FPS Games");

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("RPG");

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Strategy Games");

        jLabel5.setBackground(new java.awt.Color(8, 27, 40));
        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(74, 103, 147));
        jLabel5.setText("Age:");

        jButton6.setBackground(new java.awt.Color(0, 0, 0));
        jButton6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("8-12");

        jButton7.setBackground(new java.awt.Color(0, 0, 0));
        jButton7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("12-15");

        jButton8.setBackground(new java.awt.Color(0, 0, 0));
        jButton8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("15-18");

        jLabel7.setBackground(new java.awt.Color(8, 27, 40));
        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(74, 103, 147));
        jLabel7.setText("Playing platform:");

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setText("PC");

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setText("Playstation");

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setText("Xbox");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(74, 103, 147));
        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 103, 147));
        jLabel8.setText("Region:");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("São Paulo");

        jButton5.setBackground(new java.awt.Color(0, 0, 0));
        jButton5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Minas Gerais");

        jButton9.setBackground(new java.awt.Color(0, 0, 0));
        jButton9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("Rio de Janeiro");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 103, 147));
        jLabel9.setText("Language:");

        jButton14.setBackground(new java.awt.Color(0, 0, 0));
        jButton14.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setText("Portuguese");

        jButton15.setBackground(new java.awt.Color(0, 0, 0));
        jButton15.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setText("English");

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(74, 103, 147));
        jLabel10.setText("Most Played Game:");

        jButton13.setBackground(new java.awt.Color(0, 0, 0));
        jButton13.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setText("Valorant");

        jButton16.setBackground(new java.awt.Color(0, 0, 0));
        jButton16.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setText("Minecraft");

        jButton17.setBackground(new java.awt.Color(0, 0, 0));
        jButton17.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setText("CS:GO");

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(74, 103, 147));
        jLabel11.setText("Playing Time:");

        jButton18.setBackground(new java.awt.Color(0, 0, 0));
        jButton18.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setText("Morning");

        jButton19.setBackground(new java.awt.Color(0, 0, 0));
        jButton19.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setText("Afternoon");

        jButton20.setBackground(new java.awt.Color(0, 0, 0));
        jButton20.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setText("Night");

        javax.swing.GroupLayout painelCategoriasLayout = new javax.swing.GroupLayout(painelCategorias);
        painelCategorias.setLayout(painelCategoriasLayout);
        painelCategoriasLayout.setHorizontalGroup(
            painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCategoriasLayout.createSequentialGroup()
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(painelCategoriasLayout.createSequentialGroup()
                                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                                        .addComponent(jButton6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton8))
                                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                                        .addComponent(jButton10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton11)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton12)))
                                .addGap(213, 213, 213)
                                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                                        .addComponent(jButton14)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton15))
                                    .addComponent(jLabel9)))
                            .addGroup(painelCategoriasLayout.createSequentialGroup()
                                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton3))
                                    .addComponent(jLabel5))
                                .addGap(159, 159, 159)
                                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel10)
                                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelCategoriasLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jButton13)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton16))
                                            .addGroup(painelCategoriasLayout.createSequentialGroup()
                                                .addComponent(jButton18)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton19)))
                                        .addGap(18, 18, 18)
                                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton17)
                                            .addComponent(jButton20)))))
                            .addGroup(painelCategoriasLayout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9))))
                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel3)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        painelCategoriasLayout.setVerticalGroup(
            painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCategoriasLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton13)
                    .addComponent(jButton16)
                    .addComponent(jButton17)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11))
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6)
                            .addComponent(jButton7)
                            .addComponent(jButton8))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton10)
                            .addComponent(jButton11)
                            .addComponent(jButton12))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton9)))
                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton18)
                            .addComponent(jButton19)
                            .addComponent(jButton20))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton14)
                            .addComponent(jButton15))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jSearchTextField.setBackground(new java.awt.Color(8, 27, 40));
        jSearchTextField.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jSearchTextField.setForeground(new java.awt.Color(74, 103, 147));
        jSearchTextField.setText("Search...");
        jSearchTextField.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jSearchTextField.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jSearchTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jSearchTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jSearchTextFieldFocusLost(evt);
            }
        });
        jSearchTextField.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSearchTextFieldMouseClicked(evt);
            }
        });
        jSearchTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSearchTextFieldActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(74, 103, 147));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/Lupa.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(painelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(25, 25, 25)
                .addComponent(painelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        userLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/user.png"))); // NOI18N
        userLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userLabelMouseClicked(evt);
            }
        });

        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/logout.png"))); // NOI18N
        logoutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(friendsPrincipalLabel)
                .addGap(18, 18, 18)
                .addComponent(creditsPrincipalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutLabel)
                .addGap(18, 18, 18)
                .addComponent(userLabel)
                .addGap(23, 23, 23))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(friendsPrincipalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(creditsPrincipalLabel))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(logoutLabel)
                                    .addComponent(userLabel))
                                .addGap(8, 8, 8)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void adicionarEventosDosBotoes(Container container, JTextField searchField) {
        for (Component comp : container.getComponents()) {
            if (comp instanceof JButton) {
                JButton botao = (JButton) comp;
                botao.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        searchField.setText(botao.getText());
                    }
                });
            } else if (comp instanceof Container) {
                // Se for outro painel, faz recursivamente
                adicionarEventosDosBotoes((Container) comp, searchField);
            }
        }
    }

    
    private void jSearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchTextFieldActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jSearchTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jSearchTextFieldFocusGained
        // Código para sumir o PlaceHolder ao clicar para digitar.
        if (!jSearchTextField.isEditable()) {
            jSearchTextField.setEditable(true);
            jSearchTextField.setFocusable(true);
            jSearchTextField.requestFocusInWindow();

            if (jSearchTextField.getText().equals("Search...")) {
                jSearchTextField.setText("");
            }
        }
    }//GEN-LAST:event_jSearchTextFieldFocusGained

    private void jSearchTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jSearchTextFieldFocusLost
        // Código para permanecer o PlaceHolder enquanto estiver vazio a entrada.
        if (jSearchTextField.getText().isEmpty()) {
        jSearchTextField.setText("Search...");
        }
    }//GEN-LAST:event_jSearchTextFieldFocusLost

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        // Código para ao clicar no símbolo de log out vá para a tela inicial:
        new Tela_Inicial_Form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void userLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLabelMouseClicked
        // Código para ao clicar no símbolo do user vá para a tela do usuário:
        new Tela_Usuario_Form(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userLabelMouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void creditsPrincipalLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsPrincipalLabelMouseClicked
        // Código para ao clicar no credits vá para a tela dos creditos:
        new Tela_Creditos_Form(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_creditsPrincipalLabelMouseClicked

    private void friendsPrincipalLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friendsPrincipalLabelMouseClicked
        // Código para ao clicar no Friends vá para a tela dos amigos:
        new Tela_Friends_Form(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_friendsPrincipalLabelMouseClicked

    private void jSearchTextFieldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchTextFieldMouseClicked
        // Código para tirar esse foco que o campo de texto recebia.
        jSearchTextField.setFocusable(true);
        jSearchTextField.setEditable(true);
        jSearchTextField.requestFocusInWindow();
    }//GEN-LAST:event_jSearchTextFieldMouseClicked

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
            java.util.logging.Logger.getLogger(Tela_Principal_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Principal_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Principal_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel creditsPrincipalLabel;
    private javax.swing.JLabel friendsPrincipalLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jSearchTextField;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel painelCategorias;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
