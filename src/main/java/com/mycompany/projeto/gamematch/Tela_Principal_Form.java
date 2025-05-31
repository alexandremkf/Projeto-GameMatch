/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



package com.mycompany.projeto.gamematch;


/**
 *
 * @author carlo
 */
public class Tela_Principal_Form extends javax.swing.JFrame {

    private String email;
    
    public Tela_Principal_Form() {
        initComponents();
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
        btnFPS = new javax.swing.JButton();
        btnRPG = new javax.swing.JButton();
        btnStrategyGames = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btn8a12 = new javax.swing.JButton();
        btn12a15 = new javax.swing.JButton();
        btn15a18 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        btnPC = new javax.swing.JButton();
        btnPlaystation = new javax.swing.JButton();
        btnXbox = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnSP = new javax.swing.JButton();
        btnMG = new javax.swing.JButton();
        btnRJ = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        btnPortuguês = new javax.swing.JButton();
        btnEnglish = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        btnValorant = new javax.swing.JButton();
        btnMinecraft = new javax.swing.JButton();
        btnFortnite = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnManhã = new javax.swing.JButton();
        btnTarde = new javax.swing.JButton();
        btnNoite = new javax.swing.JButton();
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

        btnFPS.setBackground(new java.awt.Color(0, 0, 0));
        btnFPS.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnFPS.setForeground(new java.awt.Color(255, 255, 255));
        btnFPS.setText("FPS");
        btnFPS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFPS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFPSMouseClicked(evt);
            }
        });

        btnRPG.setBackground(new java.awt.Color(0, 0, 0));
        btnRPG.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnRPG.setForeground(new java.awt.Color(255, 255, 255));
        btnRPG.setText("RPG");
        btnRPG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRPG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRPGMouseClicked(evt);
            }
        });

        btnStrategyGames.setBackground(new java.awt.Color(0, 0, 0));
        btnStrategyGames.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnStrategyGames.setForeground(new java.awt.Color(255, 255, 255));
        btnStrategyGames.setText("Strategy Games");
        btnStrategyGames.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnStrategyGames.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnStrategyGamesMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(8, 27, 40));
        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(74, 103, 147));
        jLabel5.setText("Age:");

        btn8a12.setBackground(new java.awt.Color(0, 0, 0));
        btn8a12.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btn8a12.setForeground(new java.awt.Color(255, 255, 255));
        btn8a12.setText("8-12");
        btn8a12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn8a12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn8a12MouseClicked(evt);
            }
        });

        btn12a15.setBackground(new java.awt.Color(0, 0, 0));
        btn12a15.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btn12a15.setForeground(new java.awt.Color(255, 255, 255));
        btn12a15.setText("12-15");
        btn12a15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn12a15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn12a15MouseClicked(evt);
            }
        });

        btn15a18.setBackground(new java.awt.Color(0, 0, 0));
        btn15a18.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btn15a18.setForeground(new java.awt.Color(255, 255, 255));
        btn15a18.setText("15-18");
        btn15a18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn15a18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn15a18MouseClicked(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(8, 27, 40));
        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(74, 103, 147));
        jLabel7.setText("Playing platform:");

        btnPC.setBackground(new java.awt.Color(0, 0, 0));
        btnPC.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnPC.setForeground(new java.awt.Color(255, 255, 255));
        btnPC.setText("PC");
        btnPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPCMouseClicked(evt);
            }
        });

        btnPlaystation.setBackground(new java.awt.Color(0, 0, 0));
        btnPlaystation.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnPlaystation.setForeground(new java.awt.Color(255, 255, 255));
        btnPlaystation.setText("Playstation");
        btnPlaystation.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPlaystation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPlaystationMouseClicked(evt);
            }
        });

        btnXbox.setBackground(new java.awt.Color(0, 0, 0));
        btnXbox.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnXbox.setForeground(new java.awt.Color(255, 255, 255));
        btnXbox.setText("Xbox");
        btnXbox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXbox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXboxMouseClicked(evt);
            }
        });
        btnXbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXboxActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(74, 103, 147));
        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(74, 103, 147));
        jLabel8.setText("Region:");

        btnSP.setBackground(new java.awt.Color(0, 0, 0));
        btnSP.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnSP.setForeground(new java.awt.Color(255, 255, 255));
        btnSP.setText("SP");
        btnSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSPMouseClicked(evt);
            }
        });

        btnMG.setBackground(new java.awt.Color(0, 0, 0));
        btnMG.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnMG.setForeground(new java.awt.Color(255, 255, 255));
        btnMG.setText("MG");
        btnMG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMGMouseClicked(evt);
            }
        });

        btnRJ.setBackground(new java.awt.Color(0, 0, 0));
        btnRJ.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnRJ.setForeground(new java.awt.Color(255, 255, 255));
        btnRJ.setText("RJ");
        btnRJ.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRJ.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRJMouseClicked(evt);
            }
        });
        btnRJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRJActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 103, 147));
        jLabel9.setText("Language:");

        btnPortuguês.setBackground(new java.awt.Color(0, 0, 0));
        btnPortuguês.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnPortuguês.setForeground(new java.awt.Color(255, 255, 255));
        btnPortuguês.setText("Português");
        btnPortuguês.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPortuguês.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPortuguêsMouseClicked(evt);
            }
        });

        btnEnglish.setBackground(new java.awt.Color(0, 0, 0));
        btnEnglish.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnEnglish.setForeground(new java.awt.Color(255, 255, 255));
        btnEnglish.setText("English");
        btnEnglish.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEnglish.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEnglishMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(74, 103, 147));
        jLabel10.setText("Most Played Game:");

        btnValorant.setBackground(new java.awt.Color(0, 0, 0));
        btnValorant.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnValorant.setForeground(new java.awt.Color(255, 255, 255));
        btnValorant.setText("Valorant");
        btnValorant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnValorant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValorantMouseClicked(evt);
            }
        });

        btnMinecraft.setBackground(new java.awt.Color(0, 0, 0));
        btnMinecraft.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnMinecraft.setForeground(new java.awt.Color(255, 255, 255));
        btnMinecraft.setText("Minecraft");
        btnMinecraft.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinecraft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinecraftMouseClicked(evt);
            }
        });

        btnFortnite.setBackground(new java.awt.Color(0, 0, 0));
        btnFortnite.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnFortnite.setForeground(new java.awt.Color(255, 255, 255));
        btnFortnite.setText("Fortnite");
        btnFortnite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFortnite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFortniteMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(74, 103, 147));
        jLabel11.setText("Playing Time:");

        btnManhã.setBackground(new java.awt.Color(0, 0, 0));
        btnManhã.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnManhã.setForeground(new java.awt.Color(255, 255, 255));
        btnManhã.setText("Manhã");
        btnManhã.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManhã.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManhãMouseClicked(evt);
            }
        });

        btnTarde.setBackground(new java.awt.Color(0, 0, 0));
        btnTarde.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnTarde.setForeground(new java.awt.Color(255, 255, 255));
        btnTarde.setText("Tarde");
        btnTarde.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTarde.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTardeMouseClicked(evt);
            }
        });

        btnNoite.setBackground(new java.awt.Color(0, 0, 0));
        btnNoite.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        btnNoite.setForeground(new java.awt.Color(255, 255, 255));
        btnNoite.setText("Noite");
        btnNoite.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNoite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNoiteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout painelCategoriasLayout = new javax.swing.GroupLayout(painelCategorias);
        painelCategorias.setLayout(painelCategoriasLayout);
        painelCategoriasLayout.setHorizontalGroup(
            painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCategoriasLayout.createSequentialGroup()
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCategoriasLayout.createSequentialGroup()
                                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnFPS, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRPG, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnStrategyGames)))
                                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCategoriasLayout.createSequentialGroup()
                                        .addGap(143, 143, 143)
                                        .addComponent(btnManhã, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnTarde, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnNoite)
                                        .addGap(78, 78, 78))
                                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                                        .addGap(163, 163, 163)
                                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(painelCategoriasLayout.createSequentialGroup()
                                                .addComponent(jLabel11)
                                                .addGap(148, 148, 148))
                                            .addGroup(painelCategoriasLayout.createSequentialGroup()
                                                .addComponent(jLabel10)
                                                .addGap(90, 90, 90))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCategoriasLayout.createSequentialGroup()
                                                .addComponent(btnValorant, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnMinecraft, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnFortnite))))))
                            .addGroup(painelCategoriasLayout.createSequentialGroup()
                                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                                        .addComponent(btn8a12)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn12a15)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn15a18))
                                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                                        .addComponent(btnPC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnPlaystation, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnXbox, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(190, 190, 190)
                                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                                        .addComponent(btnPortuguês, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEnglish))))
                            .addGroup(painelCategoriasLayout.createSequentialGroup()
                                .addComponent(btnSP, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMG, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnRJ, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(btnRPG)
                    .addComponent(btnStrategyGames)
                    .addComponent(btnValorant)
                    .addComponent(btnMinecraft)
                    .addComponent(btnFortnite)
                    .addComponent(btnFPS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11))
                .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn8a12)
                            .addComponent(btn12a15)
                            .addComponent(btn15a18))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPC)
                            .addComponent(btnPlaystation)
                            .addComponent(btnXbox))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSP)
                            .addComponent(btnMG)
                            .addComponent(btnRJ)))
                    .addGroup(painelCategoriasLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnManhã)
                            .addComponent(btnTarde)
                            .addComponent(btnNoite))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(painelCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPortuguês)
                            .addComponent(btnEnglish))))
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
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(painelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jSearchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(painelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void preencherCampoBuscaComTexto(String texto) {
        jSearchTextField.setEditable(true);
        jSearchTextField.setFocusable(true);
        jSearchTextField.setText(texto);
        jSearchTextField.requestFocusInWindow();
    }
    
    private void jSearchTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSearchTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSearchTextFieldActionPerformed

    private void btnRJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRJActionPerformed

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

    private void btnXboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXboxActionPerformed

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
        if (jSearchTextField.getText().equals("Search...")) {
            jSearchTextField.setText("");
        }
    }//GEN-LAST:event_jSearchTextFieldMouseClicked

    private void btnFPSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFPSMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnFPS.getText());
    }//GEN-LAST:event_btnFPSMouseClicked

    private void btnRPGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRPGMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnRPG.getText());
    }//GEN-LAST:event_btnRPGMouseClicked

    private void btnStrategyGamesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnStrategyGamesMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnStrategyGames.getText());
    }//GEN-LAST:event_btnStrategyGamesMouseClicked

    private void btn8a12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn8a12MouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btn8a12.getText());
    }//GEN-LAST:event_btn8a12MouseClicked

    private void btn12a15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn12a15MouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btn12a15.getText());
    }//GEN-LAST:event_btn12a15MouseClicked

    private void btn15a18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn15a18MouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btn15a18.getText());
    }//GEN-LAST:event_btn15a18MouseClicked

    private void btnPCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPCMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnPC.getText());
    }//GEN-LAST:event_btnPCMouseClicked

    private void btnPlaystationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPlaystationMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnPlaystation.getText());
    }//GEN-LAST:event_btnPlaystationMouseClicked

    private void btnXboxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXboxMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnXbox.getText());
    }//GEN-LAST:event_btnXboxMouseClicked

    private void btnSPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSPMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnSP.getText());
    }//GEN-LAST:event_btnSPMouseClicked

    private void btnMGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMGMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnMG.getText());
    }//GEN-LAST:event_btnMGMouseClicked

    private void btnRJMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRJMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnRJ.getText());
    }//GEN-LAST:event_btnRJMouseClicked

    private void btnValorantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValorantMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnValorant.getText());
    }//GEN-LAST:event_btnValorantMouseClicked

    private void btnMinecraftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinecraftMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnMinecraft.getText());
    }//GEN-LAST:event_btnMinecraftMouseClicked

    private void btnFortniteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFortniteMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnFortnite.getText());
    }//GEN-LAST:event_btnFortniteMouseClicked

    private void btnManhãMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManhãMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnManhã.getText());
    }//GEN-LAST:event_btnManhãMouseClicked

    private void btnTardeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTardeMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnTarde.getText());
    }//GEN-LAST:event_btnTardeMouseClicked

    private void btnNoiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNoiteMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnNoite.getText());
    }//GEN-LAST:event_btnNoiteMouseClicked

    private void btnPortuguêsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPortuguêsMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnPortuguês.getText());
    }//GEN-LAST:event_btnPortuguêsMouseClicked

    private void btnEnglishMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEnglishMouseClicked
        // função para preencher o campo search com o botão escolhido
        preencherCampoBuscaComTexto(btnEnglish.getText());
    }//GEN-LAST:event_btnEnglishMouseClicked

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
    private javax.swing.JButton btn12a15;
    private javax.swing.JButton btn15a18;
    private javax.swing.JButton btn8a12;
    private javax.swing.JButton btnEnglish;
    private javax.swing.JButton btnFPS;
    private javax.swing.JButton btnFortnite;
    private javax.swing.JButton btnMG;
    private javax.swing.JButton btnManhã;
    private javax.swing.JButton btnMinecraft;
    private javax.swing.JButton btnNoite;
    private javax.swing.JButton btnPC;
    private javax.swing.JButton btnPlaystation;
    private javax.swing.JButton btnPortuguês;
    private javax.swing.JButton btnRJ;
    private javax.swing.JButton btnRPG;
    private javax.swing.JButton btnSP;
    private javax.swing.JButton btnStrategyGames;
    private javax.swing.JButton btnTarde;
    private javax.swing.JButton btnValorant;
    private javax.swing.JButton btnXbox;
    private javax.swing.JLabel creditsPrincipalLabel;
    private javax.swing.JLabel friendsPrincipalLabel;
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
