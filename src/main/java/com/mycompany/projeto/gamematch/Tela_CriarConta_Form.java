package com.mycompany.projeto.gamematch;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Tela_CriarConta_Form extends javax.swing.JFrame {

    private String email;
    
    public Tela_CriarConta_Form() {
        initComponents();
        setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
        
        // Também pode sobrescrever o evento fechar janela para impedir fechar
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }
    
    public Tela_CriarConta_Form(String email) {
        initComponents();
        setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
        this.email = email;
        
        TextFieldAgecriar.setEditable(false);
        TextFieldAgecriar.setFocusable(false);
        
        TextFieldRegioncriar.setEditable(false);
        TextFieldRegioncriar.setFocusable(false);
        
        TextFieldLanguaguecriar.setEditable(false);
        TextFieldLanguaguecriar.setFocusable(false);
        
        TextFieldMostPlayedcriar.setEditable(false);
        TextFieldMostPlayedcriar.setFocusable(false);
        
        TextFieldPlayingTimecriar.setEditable(false);
        TextFieldPlayingTimecriar.setFocusable(false);
        
        jTextAreaSelfDescription.setEditable(false);
        jTextAreaSelfDescription.setFocusable(false);

        // Quebra de linhas no text area:
        jTextAreaSelfDescription.setLineWrap(true);
        jTextAreaSelfDescription.setWrapStyleWord(true);
        
        // Também pode sobrescrever o evento fechar janela para impedir fechar
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel19 = new javax.swing.JPanel();
        logoCriarLabel = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        creditsCriarLabel = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        painelCriarConta = new javax.swing.JPanel();
        TextFieldRegioncriar = new javax.swing.JTextField();
        TextFieldAgecriar = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabelCreate = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        TextFieldLanguaguecriar = new javax.swing.JTextField();
        jComboBoxPlataformscriar = new javax.swing.JComboBox<>();
        TextFieldMostPlayedcriar = new javax.swing.JTextField();
        jComboBoxGameStylecriar = new javax.swing.JComboBox<>();
        TextFieldPlayingTimecriar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSelfDescription = new javax.swing.JTextArea();
        JlabelPlataforms = new javax.swing.JLabel();
        JlabelGameStylecriar = new javax.swing.JLabel();
        JlabelSelfDescription = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel19.setBackground(new java.awt.Color(0, 12, 21));

        logoCriarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/gm-small.png"))); // NOI18N
        logoCriarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel32.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(74, 103, 147));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/friends.png"))); // NOI18N
        jLabel32.setText("Friends");

        creditsCriarLabel.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        creditsCriarLabel.setForeground(new java.awt.Color(74, 103, 147));
        creditsCriarLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/credits.png"))); // NOI18N
        creditsCriarLabel.setText("Credits");
        creditsCriarLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel20.setBackground(new java.awt.Color(14, 47, 86));

        painelCriarConta.setBackground(new java.awt.Color(0, 12, 21));

        TextFieldRegioncriar.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldRegioncriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldRegioncriar.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldRegioncriar.setText("Region");
        TextFieldRegioncriar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldRegioncriar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldRegioncriar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldRegioncriarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldRegioncriarFocusLost(evt);
            }
        });
        TextFieldRegioncriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldRegioncriarMouseClicked(evt);
            }
        });
        TextFieldRegioncriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldRegioncriarActionPerformed(evt);
            }
        });

        TextFieldAgecriar.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldAgecriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldAgecriar.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldAgecriar.setText("Age");
        TextFieldAgecriar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldAgecriar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldAgecriar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldAgecriarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldAgecriarFocusLost(evt);
            }
        });
        TextFieldAgecriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldAgecriarMouseClicked(evt);
            }
        });
        TextFieldAgecriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAgecriarActionPerformed(evt);
            }
        });

        jPanel22.setBackground(new java.awt.Color(74, 103, 147));
        jPanel22.setForeground(new java.awt.Color(74, 103, 147));
        jPanel22.setPreferredSize(new java.awt.Dimension(326, 5));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 103, 147));
        jLabel9.setText("Creating an account");

        jPanel23.setBackground(new java.awt.Color(74, 103, 147));
        jPanel23.setForeground(new java.awt.Color(74, 103, 147));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 215, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jLabelCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/create.png"))); // NOI18N
        jLabelCreate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCreateMouseClicked(evt);
            }
        });

        jPanel24.setBackground(new java.awt.Color(74, 103, 147));
        jPanel24.setForeground(new java.awt.Color(74, 103, 147));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        TextFieldLanguaguecriar.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldLanguaguecriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldLanguaguecriar.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldLanguaguecriar.setText("Language");
        TextFieldLanguaguecriar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldLanguaguecriar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldLanguaguecriar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldLanguaguecriarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldLanguaguecriarFocusLost(evt);
            }
        });
        TextFieldLanguaguecriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldLanguaguecriarMouseClicked(evt);
            }
        });
        TextFieldLanguaguecriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldLanguaguecriarActionPerformed(evt);
            }
        });

        jComboBoxPlataformscriar.setBackground(new java.awt.Color(8, 27, 40));
        jComboBoxPlataformscriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jComboBoxPlataformscriar.setForeground(new java.awt.Color(74, 103, 147));
        jComboBoxPlataformscriar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Playstation", "Xbox", "Nintendo", "PC", "Mobile" }));

        TextFieldMostPlayedcriar.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldMostPlayedcriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldMostPlayedcriar.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldMostPlayedcriar.setText("Most Played Game");
        TextFieldMostPlayedcriar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldMostPlayedcriar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldMostPlayedcriar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldMostPlayedcriarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldMostPlayedcriarFocusLost(evt);
            }
        });
        TextFieldMostPlayedcriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldMostPlayedcriarMouseClicked(evt);
            }
        });
        TextFieldMostPlayedcriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldMostPlayedcriarActionPerformed(evt);
            }
        });

        jComboBoxGameStylecriar.setBackground(new java.awt.Color(8, 27, 40));
        jComboBoxGameStylecriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jComboBoxGameStylecriar.setForeground(new java.awt.Color(74, 103, 147));
        jComboBoxGameStylecriar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Battle Royale", "RPG", "Adventure", "FPS", "Strategy", "Sports", "Car Racing" }));

        TextFieldPlayingTimecriar.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldPlayingTimecriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldPlayingTimecriar.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldPlayingTimecriar.setText("Playing Time");
        TextFieldPlayingTimecriar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldPlayingTimecriar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldPlayingTimecriar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldPlayingTimecriarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldPlayingTimecriarFocusLost(evt);
            }
        });
        TextFieldPlayingTimecriar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldPlayingTimecriarMouseClicked(evt);
            }
        });
        TextFieldPlayingTimecriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPlayingTimecriarActionPerformed(evt);
            }
        });

        jTextAreaSelfDescription.setBackground(new java.awt.Color(8, 27, 40));
        jTextAreaSelfDescription.setColumns(20);
        jTextAreaSelfDescription.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextAreaSelfDescription.setForeground(new java.awt.Color(74, 103, 147));
        jTextAreaSelfDescription.setRows(5);
        jTextAreaSelfDescription.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextAreaSelfDescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaSelfDescriptionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaSelfDescription);

        JlabelPlataforms.setBackground(new java.awt.Color(8, 27, 40));
        JlabelPlataforms.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        JlabelPlataforms.setForeground(new java.awt.Color(74, 103, 147));
        JlabelPlataforms.setText("Platform:");

        JlabelGameStylecriar.setBackground(new java.awt.Color(8, 27, 40));
        JlabelGameStylecriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        JlabelGameStylecriar.setForeground(new java.awt.Color(74, 103, 147));
        JlabelGameStylecriar.setText("Game Style:");

        JlabelSelfDescription.setBackground(new java.awt.Color(8, 27, 40));
        JlabelSelfDescription.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        JlabelSelfDescription.setForeground(new java.awt.Color(74, 103, 147));
        JlabelSelfDescription.setText("Self Description:");

        javax.swing.GroupLayout painelCriarContaLayout = new javax.swing.GroupLayout(painelCriarConta);
        painelCriarConta.setLayout(painelCriarContaLayout);
        painelCriarContaLayout.setHorizontalGroup(
            painelCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCriarContaLayout.createSequentialGroup()
                .addGroup(painelCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(painelCriarContaLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(painelCriarContaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(painelCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCriarContaLayout.createSequentialGroup()
                                .addComponent(TextFieldRegioncriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(TextFieldMostPlayedcriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCriarContaLayout.createSequentialGroup()
                                .addComponent(TextFieldAgecriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextFieldLanguaguecriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelCriarContaLayout.createSequentialGroup()
                                .addGroup(painelCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxPlataformscriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JlabelPlataforms)
                                    .addComponent(jComboBoxGameStylecriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JlabelGameStylecriar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(painelCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextFieldPlayingTimecriar)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
                                    .addComponent(JlabelSelfDescription)))
                            .addComponent(jPanel22, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE))))
                .addGap(0, 35, Short.MAX_VALUE))
            .addGroup(painelCriarContaLayout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabelCreate)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelCriarContaLayout.setVerticalGroup(
            painelCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCriarContaLayout.createSequentialGroup()
                .addGroup(painelCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCriarContaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9))
                    .addGroup(painelCriarContaLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCriarContaLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(painelCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldAgecriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldLanguaguecriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldRegioncriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldMostPlayedcriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlabelPlataforms)
                    .addComponent(TextFieldPlayingTimecriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(painelCriarContaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCriarContaLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxPlataformscriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JlabelGameStylecriar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxGameStylecriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, painelCriarContaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(JlabelSelfDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCreate)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(painelCriarConta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoCriarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(creditsCriarLabel)
                .addGap(132, 531, Short.MAX_VALUE))
            .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoCriarLabel))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creditsCriarLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldRegioncriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldRegioncriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldRegioncriarActionPerformed

    private void TextFieldAgecriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAgecriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAgecriarActionPerformed

    private void TextFieldLanguaguecriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldLanguaguecriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldLanguaguecriarActionPerformed

    private void TextFieldMostPlayedcriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldMostPlayedcriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMostPlayedcriarActionPerformed

    private void TextFieldPlayingTimecriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPlayingTimecriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPlayingTimecriarActionPerformed

    private void TextFieldAgecriarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldAgecriarFocusGained
        // Código para sumir o PlaceHolder ao clicar para digitar.
        if (TextFieldAgecriar.getText().equals("Age")) {
            TextFieldAgecriar.setText("");
        }
    }//GEN-LAST:event_TextFieldAgecriarFocusGained

    private void TextFieldAgecriarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldAgecriarFocusLost
        // Código para permanecer o PlaceHolder enquanto estiver vazio a entrada.
        if (TextFieldAgecriar.getText().isEmpty()) {
            TextFieldAgecriar.setText("Age");
        }
    }//GEN-LAST:event_TextFieldAgecriarFocusLost

    private void TextFieldRegioncriarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldRegioncriarFocusGained
        // Código para sumir o PlaceHolder ao clicar para digitar.
        if (TextFieldRegioncriar.getText().equals("Region")) {
            TextFieldRegioncriar.setText("");
        }
    }//GEN-LAST:event_TextFieldRegioncriarFocusGained

    private void TextFieldRegioncriarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldRegioncriarFocusLost
        // Código para permanecer o PlaceHolder enquanto estiver vazio a entrada.
        if (TextFieldRegioncriar.getText().isEmpty()) {
            TextFieldRegioncriar.setText("Region");
        }
    }//GEN-LAST:event_TextFieldRegioncriarFocusLost

    private void TextFieldLanguaguecriarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldLanguaguecriarFocusGained
        // Código para sumir o PlaceHolder ao clicar para digitar.
        if (TextFieldLanguaguecriar.getText().equals("Language")) {
            TextFieldLanguaguecriar.setText("");
        }
    }//GEN-LAST:event_TextFieldLanguaguecriarFocusGained

    private void TextFieldLanguaguecriarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldLanguaguecriarFocusLost
        // Código para permanecer o PlaceHolder enquanto estiver vazio a entrada.
        if (TextFieldLanguaguecriar.getText().isEmpty()) {
            TextFieldLanguaguecriar.setText("Language");
        }
    }//GEN-LAST:event_TextFieldLanguaguecriarFocusLost

    private void TextFieldMostPlayedcriarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldMostPlayedcriarFocusGained
        if (TextFieldMostPlayedcriar.getText().equals("Most Played Game")) {
            TextFieldMostPlayedcriar.setText("");
        }
    }//GEN-LAST:event_TextFieldMostPlayedcriarFocusGained

    private void TextFieldMostPlayedcriarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldMostPlayedcriarFocusLost
        // Código para permanecer o PlaceHolder enquanto estiver vazio a entrada.
        if (TextFieldMostPlayedcriar.getText().isEmpty()) {
            TextFieldMostPlayedcriar.setText("Most Played Game");
        }
    }//GEN-LAST:event_TextFieldMostPlayedcriarFocusLost

    private void TextFieldPlayingTimecriarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldPlayingTimecriarFocusGained
        // Código para sumir o PlaceHolder ao clicar para digitar.
        if (TextFieldPlayingTimecriar.getText().equals("Playing Time")) {
            TextFieldPlayingTimecriar.setText("");
        }
    }//GEN-LAST:event_TextFieldPlayingTimecriarFocusGained

    private void TextFieldPlayingTimecriarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldPlayingTimecriarFocusLost
        // Código para permanecer o PlaceHolder enquanto estiver vazio a entrada.
        if (TextFieldPlayingTimecriar.getText().isEmpty()) {
            TextFieldPlayingTimecriar.setText("Playing Time");
        }
    }//GEN-LAST:event_TextFieldPlayingTimecriarFocusLost

    private void jLabelCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCreateMouseClicked
        String age = TextFieldAgecriar.getText().trim();
        String region = TextFieldRegioncriar.getText().trim();
        String platform = jComboBoxPlataformscriar.getSelectedItem().toString().trim();
        String gameStyle = jComboBoxGameStylecriar.getSelectedItem().toString().trim();
        String language = TextFieldLanguaguecriar.getText().trim();
        String mostPlayedGame = TextFieldMostPlayedcriar.getText().trim();
        String playingTime = TextFieldPlayingTimecriar.getText().trim();
        String selfDescription = jTextAreaSelfDescription.getText().trim();

        if (age.isEmpty() || region.isEmpty() || platform.isEmpty() || gameStyle.isEmpty() ||
            language.isEmpty() || mostPlayedGame.isEmpty() || playingTime.isEmpty() || selfDescription.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gamematch_db", "root", "2705");

            String sql = "UPDATE users SET age = ?, region = ?, platform = ?, game_style = ?, language = ?, most_played_game = ?, playing_time = ?, self_description = ? WHERE email = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, age);
            pstmt.setString(2, region);
            pstmt.setString(3, platform);
            pstmt.setString(4, gameStyle);
            pstmt.setString(5, language);
            pstmt.setString(6, mostPlayedGame);
            pstmt.setString(7, playingTime);
            pstmt.setString(8, selfDescription);
            pstmt.setString(9, email); // Agora usando o e-mail como identificador

            int linhasAfetadas = pstmt.executeUpdate();
            pstmt.close();
            con.close();

            if (linhasAfetadas > 0) {
                // Abre a tela principal com base no e-mail logado (pode passar o e-mail se quiser usar depois)
                Tela_Principal_Form main = new Tela_Principal_Form(email);
                main.setSize(1021, 722);
                main.setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
                main.setVisible(true);              
                
                this.dispose(); // fecha a tela de login
            } else {
                JOptionPane.showMessageDialog(this, "Usuário não encontrado para atualizar.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar o cadastro: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jLabelCreateMouseClicked

    private void TextFieldAgecriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldAgecriarMouseClicked
        // Código para tirar esse foco que o campo de texto recebia.
        TextFieldAgecriar.setFocusable(true);
        TextFieldAgecriar.setEditable(true);
        TextFieldAgecriar.requestFocusInWindow();
    }//GEN-LAST:event_TextFieldAgecriarMouseClicked

    private void TextFieldRegioncriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldRegioncriarMouseClicked
        // Código para tirar esse foco que o campo de texto recebia.
        TextFieldRegioncriar.setFocusable(true);
        TextFieldRegioncriar.setEditable(true);
        TextFieldRegioncriar.requestFocusInWindow();
    }//GEN-LAST:event_TextFieldRegioncriarMouseClicked

    private void TextFieldLanguaguecriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldLanguaguecriarMouseClicked
        // Código para tirar esse foco que o campo de texto recebia.
        TextFieldLanguaguecriar.setFocusable(true);
        TextFieldLanguaguecriar.setEditable(true);
        TextFieldLanguaguecriar.requestFocusInWindow();
    }//GEN-LAST:event_TextFieldLanguaguecriarMouseClicked

    private void TextFieldMostPlayedcriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldMostPlayedcriarMouseClicked
        // Código para tirar esse foco que o campo de texto recebia.
        TextFieldMostPlayedcriar.setFocusable(true);
        TextFieldMostPlayedcriar.setEditable(true);
        TextFieldMostPlayedcriar.requestFocusInWindow();
    }//GEN-LAST:event_TextFieldMostPlayedcriarMouseClicked

    private void TextFieldPlayingTimecriarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldPlayingTimecriarMouseClicked
        // Código para tirar esse foco que o campo de texto recebia.
        TextFieldPlayingTimecriar.setFocusable(true);
        TextFieldPlayingTimecriar.setEditable(true);
        TextFieldPlayingTimecriar.requestFocusInWindow();
    }//GEN-LAST:event_TextFieldPlayingTimecriarMouseClicked

    private void jTextAreaSelfDescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaSelfDescriptionMouseClicked
        // Código para tirar esse foco que o campo de texto recebia.
        jTextAreaSelfDescription.setFocusable(true);
        jTextAreaSelfDescription.setEditable(true);
        jTextAreaSelfDescription.requestFocusInWindow();
    }//GEN-LAST:event_jTextAreaSelfDescriptionMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelGameStylecriar;
    private javax.swing.JLabel JlabelPlataforms;
    private javax.swing.JLabel JlabelSelfDescription;
    private javax.swing.JTextField TextFieldAgecriar;
    private javax.swing.JTextField TextFieldLanguaguecriar;
    private javax.swing.JTextField TextFieldMostPlayedcriar;
    private javax.swing.JTextField TextFieldPlayingTimecriar;
    private javax.swing.JTextField TextFieldRegioncriar;
    private javax.swing.JLabel creditsCriarLabel;
    private javax.swing.JComboBox<String> jComboBoxGameStylecriar;
    private javax.swing.JComboBox<String> jComboBoxPlataformscriar;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCreate;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSelfDescription;
    private javax.swing.JLabel logoCriarLabel;
    private javax.swing.JPanel painelCriarConta;
    // End of variables declaration//GEN-END:variables
}
