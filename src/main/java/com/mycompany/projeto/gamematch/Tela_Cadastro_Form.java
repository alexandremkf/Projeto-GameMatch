package com.mycompany.projeto.gamematch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Tela_Cadastro_Form extends javax.swing.JFrame {

    public Tela_Cadastro_Form() {
        initComponents();
        setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
        jPasswordFieldCadastro.setEchoChar((char) 0);
        TextFieldNome.setEditable(false);
        TextFieldNome.setFocusable(false);
        TextFieldEmail.setEditable(false);
        TextFieldEmail.setFocusable(false);
        jPasswordFieldCadastro.setEditable(false);
        jPasswordFieldCadastro.setFocusable(false);
        TextFieldUsername.setEditable(false);
        TextFieldUsername.setFocusable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jsignUpLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        creditsLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jstartNowLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        creditsLabel2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jstartNowLabel2 = new javax.swing.JLabel();
        jsignUpLabel2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        logoCadastroLabel = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        creditsLabel3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jsignUpTelaCadastroLabel = new javax.swing.JLabel();
        jLabelLogincadastro = new javax.swing.JLabel();
        TextFieldEmail = new javax.swing.JTextField();
        TextFieldNome = new javax.swing.JTextField();
        TextFieldUsername = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPasswordFieldCadastro = new javax.swing.JPasswordField();

        jsignUpLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/sign-up.png"))); // NOI18N
        jsignUpLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jsignUpLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsignUpLabelMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/gm-small.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 103, 147));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/friends.png"))); // NOI18N
        jLabel1.setText("Friends");

        creditsLabel.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        creditsLabel.setForeground(new java.awt.Color(74, 103, 147));
        creditsLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/credits.png"))); // NOI18N
        creditsLabel.setText("Credits");
        creditsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(14, 47, 86));

        jPanel4.setBackground(new java.awt.Color(0, 12, 21));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/gm-big.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 103, 147));
        jLabel9.setText("Connect. Play. Make history with new friends.");

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 80)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(74, 103, 147));
        jLabel10.setText("Start your");

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(74, 103, 147));
        jLabel6.setText("Your next squad is just one click away.");

        jstartNowLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/start-now.png"))); // NOI18N
        jstartNowLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jstartNowLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jstartNowLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel6)))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel8)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jstartNowLabel)
                .addGap(210, 210, 210))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jstartNowLabel)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(0, 12, 21));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/gm-small.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(74, 103, 147));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/friends.png"))); // NOI18N
        jLabel14.setText("Friends");

        creditsLabel2.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        creditsLabel2.setForeground(new java.awt.Color(74, 103, 147));
        creditsLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/credits.png"))); // NOI18N
        creditsLabel2.setText("Credits");
        creditsLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel6.setBackground(new java.awt.Color(14, 47, 86));

        jPanel7.setBackground(new java.awt.Color(0, 12, 21));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/gm-big.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(74, 103, 147));
        jLabel16.setText("Connect. Play. Make history with new friends.");

        jLabel17.setFont(new java.awt.Font("Monospaced", 0, 80)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(74, 103, 147));
        jLabel17.setText("Start your");

        jLabel18.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(74, 103, 147));
        jLabel18.setText("Your next squad is just one click away.");

        jstartNowLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/start-now.png"))); // NOI18N
        jstartNowLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jstartNowLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jstartNowLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel17)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel16)
                                .addGroup(jPanel7Layout.createSequentialGroup()
                                    .addGap(24, 24, 24)
                                    .addComponent(jLabel18)))))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel15)))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jstartNowLabel2)
                .addGap(210, 210, 210))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addGap(18, 18, 18)
                .addComponent(jstartNowLabel2)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(218, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jsignUpLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/sign-up.png"))); // NOI18N
        jsignUpLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jsignUpLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsignUpLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(creditsLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jsignUpLabel2)
                .addGap(29, 29, 29))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creditsLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jsignUpLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel8.setBackground(new java.awt.Color(0, 12, 21));

        logoCadastroLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/gm-small.png"))); // NOI18N
        logoCadastroLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoCadastroLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoCadastroLabelMouseClicked(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(74, 103, 147));
        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/friends.png"))); // NOI18N
        jLabel20.setText("Friends");

        creditsLabel3.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        creditsLabel3.setForeground(new java.awt.Color(74, 103, 147));
        creditsLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/credits.png"))); // NOI18N
        creditsLabel3.setText("Credits");
        creditsLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel9.setBackground(new java.awt.Color(14, 47, 86));

        jPanel10.setBackground(new java.awt.Color(0, 12, 21));

        jLabel24.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(74, 103, 147));
        jLabel24.setText("Already have an account? ");

        jsignUpTelaCadastroLabel.setForeground(new java.awt.Color(8, 27, 40));
        jsignUpTelaCadastroLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/sign-up.png"))); // NOI18N
        jsignUpTelaCadastroLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jsignUpTelaCadastroLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsignUpTelaCadastroLabelMouseClicked(evt);
            }
        });

        jLabelLogincadastro.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jLabelLogincadastro.setForeground(new java.awt.Color(74, 103, 147));
        jLabelLogincadastro.setText("Login");
        jLabelLogincadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelLogincadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogincadastroMouseClicked(evt);
            }
        });

        TextFieldEmail.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldEmail.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldEmail.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldEmail.setText("E-mail");
        TextFieldEmail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldEmailFocusLost(evt);
            }
        });
        TextFieldEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldEmailMouseClicked(evt);
            }
        });
        TextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEmailActionPerformed(evt);
            }
        });

        TextFieldNome.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldNome.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldNome.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldNome.setText("Name");
        TextFieldNome.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldNome.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldNomeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldNomeFocusLost(evt);
            }
        });
        TextFieldNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldNomeMouseClicked(evt);
            }
        });

        TextFieldUsername.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldUsername.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldUsername.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldUsername.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextFieldUsername.setText("Username");
        TextFieldUsername.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldUsername.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldUsernameFocusLost(evt);
            }
        });
        TextFieldUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldUsernameMouseClicked(evt);
            }
        });
        TextFieldUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldUsernameActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(74, 103, 147));
        jPanel3.setForeground(new java.awt.Color(74, 103, 147));
        jPanel3.setPreferredSize(new java.awt.Dimension(326, 5));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 40)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(74, 103, 147));
        jLabel4.setText("Sign up for your account");

        jPanel5.setBackground(new java.awt.Color(74, 103, 147));
        jPanel5.setForeground(new java.awt.Color(74, 103, 147));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jPasswordFieldCadastro.setBackground(new java.awt.Color(8, 27, 40));
        jPasswordFieldCadastro.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jPasswordFieldCadastro.setForeground(new java.awt.Color(74, 103, 147));
        jPasswordFieldCadastro.setText("password");
        jPasswordFieldCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordFieldCadastro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldCadastroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldCadastroFocusLost(evt);
            }
        });
        jPasswordFieldCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldCadastroMouseClicked(evt);
            }
        });
        jPasswordFieldCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldCadastroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelLogincadastro)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(91, 91, 91))))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                            .addComponent(TextFieldEmail)
                            .addComponent(TextFieldNome)
                            .addComponent(jPasswordFieldCadastro)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jsignUpTelaCadastroLabel)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(TextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordFieldCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextFieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jsignUpTelaCadastroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(jLabelLogincadastro))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(200, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoCadastroLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addGap(18, 18, 18)
                .addComponent(creditsLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoCadastroLabel))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creditsLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsignUpLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsignUpLabelMouseClicked
        // Código para ao clicar no sign-up vá para a tela do cadastro:
        new Tela_Cadastro_Form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jsignUpLabelMouseClicked

    private void jstartNowLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jstartNowLabelMouseClicked
        // Código para ao clicar no start now vá para a tela do cadastro:
        new Tela_Cadastro_Form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jstartNowLabelMouseClicked

    private void jstartNowLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jstartNowLabel2MouseClicked
        // Código para ao clicar no start now vá para a tela do cadastro:
        new Tela_Cadastro_Form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jstartNowLabel2MouseClicked

    private void jsignUpLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsignUpLabel2MouseClicked
        // Código para ao clicar no sign-up vá para a tela do cadastro:
        new Tela_Cadastro_Form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jsignUpLabel2MouseClicked

    private void jsignUpTelaCadastroLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsignUpTelaCadastroLabelMouseClicked
        String nome = TextFieldNome.getText().trim();
        String email = TextFieldEmail.getText().trim();
        String username = TextFieldUsername.getText().trim();
        String senha = new String(jPasswordFieldCadastro.getPassword()).trim();
        
        // Verificação para não aceitar os valores dos placeholders como informações para o pré user
        if (nome.equals("Name")) nome = "";
        if (email.equals("E-mail")) email = "";
        if (senha.equals("password")) senha = "";
        if (username.equals("Username")) username = "";
        
        // Verificação se os campos estão vazios
        if (nome.isEmpty() || email.isEmpty() || username.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.WARNING_MESSAGE);
            return; // Para a execução
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/gamematch_db", "root", "2705"
            );

            Statement stmt = con.createStatement();
            
            // Verificar se o e-mail já está cadastrado
            var rsEmail = stmt.executeQuery("SELECT * FROM users WHERE email = '" + email + "'");
            if (rsEmail.next()) {
                JOptionPane.showMessageDialog(this, "E-mail já cadastrado. Faça login na sua conta!", "Aviso", JOptionPane.WARNING_MESSAGE);
                rsEmail.close();
                stmt.close();
                con.close();
                return;
            }
            rsEmail.close();
            
            // Verificar se o username já está em uso
            var rsUsername = stmt.executeQuery("SELECT * FROM users WHERE username = '" + username + "'");
            if (rsUsername.next()) {
                JOptionPane.showMessageDialog(this, "Username já está em uso. Tente outro nome de usuário.", "Aviso", JOptionPane.WARNING_MESSAGE);
                rsUsername.close();
                stmt.close();
                con.close();
                return;
            }
            rsUsername.close();
            
            // Se passou nas verificações, inserir o novo usuário
            String sql = "INSERT INTO users (name, email, username, password) VALUES ('"
                + nome + "', '" + email + "', '" + username + "', '" + senha + "')";
            stmt.executeUpdate(sql);

            stmt.close();
            con.close();

            // Mensagem de sucesso
            JOptionPane.showMessageDialog(this, "Cadastro inicial realizado com sucesso!");

            // Código para ao clicar no sign-up vá para a tela de criar a conta:
            new Tela_CriarConta_Form(email).setVisible(true);
            this.dispose();

        
        } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro ao acessar o banco de dados.", "Erro", JOptionPane.ERROR_MESSAGE);
        System.out.println("Erro SQL: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Driver JDBC não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jsignUpTelaCadastroLabelMouseClicked

    private void TextFieldUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldUsernameActionPerformed

    private void jLabelLogincadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogincadastroMouseClicked
        // Código para clicar no login e ir para tela de logar na conta.
        new Tela_Login_Form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabelLogincadastroMouseClicked

    private void TextFieldNomeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldNomeFocusGained
        // Código para sumir o PlaceHolder ao clicar para digitar.
        if (TextFieldNome.getText().equals("Name")) {
        TextFieldNome.setText("");
        }
    }//GEN-LAST:event_TextFieldNomeFocusGained

    private void TextFieldNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldNomeFocusLost
        // Código para permanecer o PlaceHolder enquanto estiver vazio a entrada.
        if (TextFieldNome.getText().isEmpty()) {
        TextFieldNome.setText("Name");
        }
    }//GEN-LAST:event_TextFieldNomeFocusLost

    private void TextFieldEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldEmailFocusGained
        // Código para sumir o PlaceHolder ao clicar para digitar.
        if (TextFieldEmail.getText().equals("E-mail")) {
        TextFieldEmail.setText("");
        }
    }//GEN-LAST:event_TextFieldEmailFocusGained

    private void TextFieldEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldEmailFocusLost
       // Código para permanecer o PlaceHolder enquanto estiver vazio a entrada.
        if (TextFieldEmail.getText().isEmpty()) {
        TextFieldEmail.setText("E-mail");
        }
    }//GEN-LAST:event_TextFieldEmailFocusLost

    private void TextFieldUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldUsernameFocusGained
        // Código para sumir o PlaceHolder ao clicar para digitar.
        if (TextFieldUsername.getText().equals("Username")) {
        TextFieldUsername.setText("");
        }
    }//GEN-LAST:event_TextFieldUsernameFocusGained

    private void TextFieldUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldUsernameFocusLost
        // Código para permanecer o PlaceHolder enquanto estiver vazio a entrada.
        if (TextFieldUsername.getText().isEmpty()) {
        TextFieldUsername.setText("Username");
        }
    }//GEN-LAST:event_TextFieldUsernameFocusLost

    private void TextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEmailActionPerformed

    private void jPasswordFieldCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldCadastroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldCadastroActionPerformed

    private void jPasswordFieldCadastroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldCadastroFocusGained
       // Código serve para se estiver vazio a entrada, aparecer "password" ao invés dos asterísticos.
        String senha = String.valueOf(jPasswordFieldCadastro.getPassword());
        if (senha.equals("password")) {
            jPasswordFieldCadastro.setText("");
            jPasswordFieldCadastro.setEchoChar('•'); // Ativa os asteriscos
        }
    }//GEN-LAST:event_jPasswordFieldCadastroFocusGained

    private void jPasswordFieldCadastroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldCadastroFocusLost
       // Código serve para remover a palavra password e o que você digitar aparecerá em asterísticos.
        String senha = String.valueOf(jPasswordFieldCadastro.getPassword());
        if (senha.isEmpty()) {
            jPasswordFieldCadastro.setText("password");
            jPasswordFieldCadastro.setEchoChar((char) 0); // Remove asteriscos para mostrar texto
        }
    }//GEN-LAST:event_jPasswordFieldCadastroFocusLost

    private void logoCadastroLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoCadastroLabelMouseClicked
        // Código para ao clicar no Logo vá para a tela dos inicial:
        new Tela_Inicial_Form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoCadastroLabelMouseClicked

    private void TextFieldNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldNomeMouseClicked
        // Código para tirar esse foco que o campo de texto recebia.
        TextFieldNome.setFocusable(true);
        TextFieldNome.setEditable(true);
        TextFieldNome.requestFocusInWindow();
    }//GEN-LAST:event_TextFieldNomeMouseClicked

    private void TextFieldEmailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldEmailMouseClicked
        // Código para tirar esse foco que o campo de texto recebia.
        TextFieldEmail.setFocusable(true);
        TextFieldEmail.setEditable(true);
        TextFieldEmail.requestFocusInWindow();
    }//GEN-LAST:event_TextFieldEmailMouseClicked

    private void jPasswordFieldCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldCadastroMouseClicked
        // Código para tirar esse foco que o campo de texto recebia.
        jPasswordFieldCadastro.setFocusable(true);
        jPasswordFieldCadastro.setEditable(true);
        jPasswordFieldCadastro.requestFocusInWindow();
    }//GEN-LAST:event_jPasswordFieldCadastroMouseClicked

    private void TextFieldUsernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldUsernameMouseClicked
        // Código para tirar esse foco que o campo de texto recebia.
        TextFieldUsername.setFocusable(true);
        TextFieldUsername.setEditable(true);
        TextFieldUsername.requestFocusInWindow();
    }//GEN-LAST:event_TextFieldUsernameMouseClicked

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
            java.util.logging.Logger.getLogger(Tela_Cadastro_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Cadastro_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Cadastro_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldEmail;
    private javax.swing.JTextField TextFieldNome;
    private javax.swing.JTextField TextFieldUsername;
    private javax.swing.JLabel creditsLabel;
    private javax.swing.JLabel creditsLabel2;
    private javax.swing.JLabel creditsLabel3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLogincadastro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPasswordField jPasswordFieldCadastro;
    private javax.swing.JLabel jsignUpLabel;
    private javax.swing.JLabel jsignUpLabel2;
    private javax.swing.JLabel jsignUpTelaCadastroLabel;
    private javax.swing.JLabel jstartNowLabel;
    private javax.swing.JLabel jstartNowLabel2;
    private javax.swing.JLabel logoCadastroLabel;
    // End of variables declaration//GEN-END:variables
}
