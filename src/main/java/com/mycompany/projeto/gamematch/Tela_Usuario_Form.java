package com.mycompany.projeto.gamematch;

import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Tela_Usuario_Form extends javax.swing.JFrame {

    private String email;
    private boolean cadastroCompleto;

    public Tela_Usuario_Form(String email, boolean cadastroCompleto) {
        initComponents();
        setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
        this.email = email;
        this.cadastroCompleto = cadastroCompleto;

        // Carrega os dados do usuário
        carregarDadosUsuario();
        
        jTextAreaSelfDescription.setLineWrap(true);
        jTextAreaSelfDescription.setWrapStyleWord(true);
        
        setCamposEditaveis(false); // esse método controla habilitação

        if (!cadastroCompleto) {
            // Mensagem para o usuário
            JOptionPane.showMessageDialog(this,
                "Seu cadastro está incompleto. Por favor, complete todos os campos para continuar.",
                "Atenção", JOptionPane.WARNING_MESSAGE);

            if (!cadastroCompleto) {
            aplicarPlaceholder(TextFieldUsernamecriar, "Username");
            aplicarPlaceholder(TextFieldAgecriar, "Age");
            aplicarPlaceholder(TextFieldRegioncriar, "Region");
            aplicarPlaceholder(TextFieldLanguagecriar, "Language");
            aplicarPlaceholder(TextFieldMostPlayedcriar, "Most Played Game");
            aplicarPlaceholder(TextFieldPlayingTimecriar, "Playing Time");
            aplicarPlaceholderTextArea(jTextAreaSelfDescription, "Self Description...");
        }
            
            bloquearSaida(); // bloqueia ações que levam a sair da tela até cadastro completo
        }
    }

    private void aplicarPlaceholder(JTextField campo, String placeholder) {
        campo.setText(placeholder);

        campo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (campo.getText().equals(placeholder)) {
                    campo.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (campo.getText().isEmpty()) {
                    campo.setText(placeholder);
                }
            }
        });
    }
    
    private void aplicarPlaceholderTextArea(JTextArea campo, String placeholder) {
        campo.setText(placeholder);

        campo.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                if (campo.getText().equals(placeholder)) {
                    campo.setText("");
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (campo.getText().isEmpty()) {
                    campo.setText(placeholder);
                }
            }
        });
    }
    
    private void bloquearSaida() {
        // Desabilita o botão logout e outros que levam a outras telas
        logoutLabel.setEnabled(false);
        creditsUserLabel.setEnabled(false);
        friendsUserLabel.setEnabled(false);

        // Também pode sobrescrever o evento fechar janela para impedir fechar
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        // Mostra um aviso se o usuário tentar fechar a janela
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                JOptionPane.showMessageDialog(null,
                    "Por favor, complete seu cadastro antes de sair.",
                    "Cadastro incompleto", JOptionPane.WARNING_MESSAGE);
            }
        });
    }
    
    private void carregarDadosUsuario() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gamematch_db", "root", "2705");

            String sql = "SELECT username, age, region, platform, game_style, language, most_played_game, playing_time, self_description FROM users WHERE email = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, email);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                TextFieldUsernamecriar.setText(rs.getString("username"));
                TextFieldAgecriar.setText(rs.getString("age"));
                TextFieldRegioncriar.setText(rs.getString("region"));
                jComboBoxPlataformscriar.setSelectedItem(rs.getString("platform"));
                jComboBoxGameStylecriar.setSelectedItem(rs.getString("game_style"));
                TextFieldLanguagecriar.setText(rs.getString("language"));
                TextFieldMostPlayedcriar.setText(rs.getString("most_played_game"));
                TextFieldPlayingTimecriar.setText(rs.getString("playing_time"));
                jTextAreaSelfDescription.setText(rs.getString("self_description"));
            } else {
                JOptionPane.showMessageDialog(this, "Usuário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao carregar dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void setCamposEditaveis(boolean ativar) {
        TextFieldUsernamecriar.setEditable(ativar);
        TextFieldAgecriar.setEditable(ativar);
        TextFieldRegioncriar.setEditable(ativar);
        jComboBoxPlataformscriar.setEnabled(ativar);
        jComboBoxGameStylecriar.setEnabled(ativar);
        TextFieldLanguagecriar.setEditable(ativar);
        TextFieldMostPlayedcriar.setEditable(ativar);
        TextFieldPlayingTimecriar.setEditable(ativar);
        jTextAreaSelfDescription.setEditable(ativar);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel19 = new javax.swing.JPanel();
        logoUserLabel = new javax.swing.JLabel();
        friendsUserLabel = new javax.swing.JLabel();
        creditsUserLabel = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        TextFieldRegioncriar = new javax.swing.JTextField();
        TextFieldAgecriar = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        TextFieldLanguagecriar = new javax.swing.JTextField();
        jComboBoxPlataformscriar = new javax.swing.JComboBox<>();
        TextFieldMostPlayedcriar = new javax.swing.JTextField();
        jComboBoxGameStylecriar = new javax.swing.JComboBox<>();
        TextFieldPlayingTimecriar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaSelfDescription = new javax.swing.JTextArea();
        JlabelPlataforms = new javax.swing.JLabel();
        JlabelGameStylecriar = new javax.swing.JLabel();
        JlabelSelfDescription = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        TextFieldUsernamecriar = new javax.swing.JTextField();
        editbtn = new javax.swing.JLabel();
        savebtn = new javax.swing.JLabel();
        btnDeleteAccount = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        btnNotification = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel19.setBackground(new java.awt.Color(0, 12, 21));

        logoUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/gm-small.png"))); // NOI18N
        logoUserLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoUserLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoUserLabelMouseClicked(evt);
            }
        });

        friendsUserLabel.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        friendsUserLabel.setForeground(new java.awt.Color(74, 103, 147));
        friendsUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/friends.png"))); // NOI18N
        friendsUserLabel.setText("Friends");
        friendsUserLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        friendsUserLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friendsUserLabelMouseClicked(evt);
            }
        });

        creditsUserLabel.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        creditsUserLabel.setForeground(new java.awt.Color(74, 103, 147));
        creditsUserLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/credits.png"))); // NOI18N
        creditsUserLabel.setText("Credits");
        creditsUserLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creditsUserLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditsUserLabelMouseClicked(evt);
            }
        });

        jPanel20.setBackground(new java.awt.Color(14, 47, 86));

        jPanel21.setBackground(new java.awt.Color(0, 12, 21));

        TextFieldRegioncriar.setEditable(false);
        TextFieldRegioncriar.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldRegioncriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldRegioncriar.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldRegioncriar.setText("Region");
        TextFieldRegioncriar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldRegioncriar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldRegioncriarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldRegioncriarFocusLost(evt);
            }
        });
        TextFieldRegioncriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldRegioncriarActionPerformed(evt);
            }
        });

        TextFieldAgecriar.setEditable(false);
        TextFieldAgecriar.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldAgecriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldAgecriar.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldAgecriar.setText("Age");
        TextFieldAgecriar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldAgecriar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldAgecriarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldAgecriarFocusLost(evt);
            }
        });
        TextFieldAgecriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldAgecriarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 103, 147));
        jLabel9.setText("Your account");

        jPanel24.setBackground(new java.awt.Color(74, 103, 147));
        jPanel24.setForeground(new java.awt.Color(74, 103, 147));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        TextFieldLanguagecriar.setEditable(false);
        TextFieldLanguagecriar.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldLanguagecriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldLanguagecriar.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldLanguagecriar.setText("Language");
        TextFieldLanguagecriar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldLanguagecriar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldLanguagecriarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldLanguagecriarFocusLost(evt);
            }
        });
        TextFieldLanguagecriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldLanguagecriarActionPerformed(evt);
            }
        });

        jComboBoxPlataformscriar.setBackground(new java.awt.Color(8, 27, 40));
        jComboBoxPlataformscriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jComboBoxPlataformscriar.setForeground(new java.awt.Color(74, 103, 147));
        jComboBoxPlataformscriar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Playstation", "Xbox", "Nintendo", "PC", "Mobile" }));
        jComboBoxPlataformscriar.setFocusable(false);

        TextFieldMostPlayedcriar.setEditable(false);
        TextFieldMostPlayedcriar.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldMostPlayedcriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldMostPlayedcriar.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldMostPlayedcriar.setText("Most Played Game");
        TextFieldMostPlayedcriar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldMostPlayedcriar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldMostPlayedcriarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldMostPlayedcriarFocusLost(evt);
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

        TextFieldPlayingTimecriar.setEditable(false);
        TextFieldPlayingTimecriar.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldPlayingTimecriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldPlayingTimecriar.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldPlayingTimecriar.setText("Playing Time");
        TextFieldPlayingTimecriar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldPlayingTimecriar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldPlayingTimecriarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldPlayingTimecriarFocusLost(evt);
            }
        });
        TextFieldPlayingTimecriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldPlayingTimecriarActionPerformed(evt);
            }
        });

        jTextAreaSelfDescription.setEditable(false);
        jTextAreaSelfDescription.setBackground(new java.awt.Color(8, 27, 40));
        jTextAreaSelfDescription.setColumns(20);
        jTextAreaSelfDescription.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextAreaSelfDescription.setForeground(new java.awt.Color(74, 103, 147));
        jTextAreaSelfDescription.setRows(5);
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

        jPanel25.setBackground(new java.awt.Color(74, 103, 147));
        jPanel25.setForeground(new java.awt.Color(74, 103, 147));
        jPanel25.setPreferredSize(new java.awt.Dimension(0, 5));

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        TextFieldUsernamecriar.setEditable(false);
        TextFieldUsernamecriar.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldUsernamecriar.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldUsernamecriar.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldUsernamecriar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        TextFieldUsernamecriar.setText("Username");
        TextFieldUsernamecriar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldUsernamecriar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldUsernamecriarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldUsernamecriarFocusLost(evt);
            }
        });
        TextFieldUsernamecriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldUsernamecriarActionPerformed(evt);
            }
        });

        editbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/editar.png"))); // NOI18N
        editbtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editbtnMouseClicked(evt);
            }
        });

        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/save.png"))); // NOI18N
        savebtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        savebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savebtnMouseClicked(evt);
            }
        });

        btnDeleteAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/trash.png"))); // NOI18N
        btnDeleteAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteAccountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1)
                                .addComponent(JlabelSelfDescription)
                                .addComponent(TextFieldUsernamecriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TextFieldLanguagecriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldMostPlayedcriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlabelGameStylecriar)
                            .addComponent(jComboBoxGameStylecriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxPlataformscriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JlabelPlataforms)
                            .addComponent(TextFieldPlayingTimecriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextFieldRegioncriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldAgecriar, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addComponent(editbtn)
                        .addGap(48, 48, 48)
                        .addComponent(savebtn)
                        .addGap(52, 52, 52)
                        .addComponent(btnDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 27, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel9))
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(TextFieldAgecriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextFieldRegioncriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(savebtn)
                        .addComponent(editbtn)
                        .addComponent(btnDeleteAccount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldLanguagecriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldMostPlayedcriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextFieldUsernamecriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextFieldPlayingTimecriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JlabelSelfDescription)
                    .addComponent(JlabelPlataforms))
                .addGap(18, 18, 18)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jComboBoxPlataformscriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JlabelGameStylecriar)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxGameStylecriar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel20Layout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/logout.png"))); // NOI18N
        logoutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        userLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/user.png"))); // NOI18N
        userLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/notification.png"))); // NOI18N
        btnNotification.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNotificationMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(friendsUserLabel)
                .addGap(18, 18, 18)
                .addComponent(creditsUserLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNotification)
                .addGap(18, 18, 18)
                .addComponent(logoutLabel)
                .addGap(18, 18, 18)
                .addComponent(userLabel)
                .addGap(36, 36, 36))
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoUserLabel))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(userLabel)
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnNotification)
                                    .addComponent(logoutLabel)))
                            .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(friendsUserLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(creditsUserLabel)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 642, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TextFieldRegioncriarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldRegioncriarFocusGained
        
    }//GEN-LAST:event_TextFieldRegioncriarFocusGained

    private void TextFieldRegioncriarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldRegioncriarFocusLost
        
    }//GEN-LAST:event_TextFieldRegioncriarFocusLost

    private void TextFieldRegioncriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldRegioncriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldRegioncriarActionPerformed

    private void TextFieldAgecriarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldAgecriarFocusGained
        
    }//GEN-LAST:event_TextFieldAgecriarFocusGained

    private void TextFieldAgecriarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldAgecriarFocusLost
        
    }//GEN-LAST:event_TextFieldAgecriarFocusLost

    private void TextFieldAgecriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldAgecriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldAgecriarActionPerformed

    private void TextFieldLanguagecriarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldLanguagecriarFocusGained
        
    }//GEN-LAST:event_TextFieldLanguagecriarFocusGained

    private void TextFieldLanguagecriarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldLanguagecriarFocusLost
        
    }//GEN-LAST:event_TextFieldLanguagecriarFocusLost

    private void TextFieldLanguagecriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldLanguagecriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldLanguagecriarActionPerformed

    private void TextFieldMostPlayedcriarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldMostPlayedcriarFocusGained
        
    }//GEN-LAST:event_TextFieldMostPlayedcriarFocusGained

    private void TextFieldMostPlayedcriarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldMostPlayedcriarFocusLost
        
    }//GEN-LAST:event_TextFieldMostPlayedcriarFocusLost

    private void TextFieldMostPlayedcriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldMostPlayedcriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldMostPlayedcriarActionPerformed

    private void TextFieldPlayingTimecriarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldPlayingTimecriarFocusGained
        
    }//GEN-LAST:event_TextFieldPlayingTimecriarFocusGained

    private void TextFieldPlayingTimecriarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldPlayingTimecriarFocusLost
        
    }//GEN-LAST:event_TextFieldPlayingTimecriarFocusLost

    private void TextFieldPlayingTimecriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldPlayingTimecriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldPlayingTimecriarActionPerformed

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        // Código para ao clicar no símbolo de log out vá para a tela inicial:
        new Tela_Inicial_Form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void TextFieldUsernamecriarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldUsernamecriarFocusGained
        
    }//GEN-LAST:event_TextFieldUsernamecriarFocusGained

    private void TextFieldUsernamecriarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldUsernamecriarFocusLost
        
    }//GEN-LAST:event_TextFieldUsernamecriarFocusLost

    private void TextFieldUsernamecriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldUsernamecriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldUsernamecriarActionPerformed

    private void creditsUserLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsUserLabelMouseClicked
        // Código para ao clicar no credits vá para a tela dos creditos:
        new Tela_Creditos_Form(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_creditsUserLabelMouseClicked

    private void friendsUserLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friendsUserLabelMouseClicked
        // Código para ao clicar no Friends vá para a tela dos amigos:
        new Tela_Friends_Form(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_friendsUserLabelMouseClicked

    private void logoUserLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoUserLabelMouseClicked
        // Abre a tela principal com base no e-mail logado (pode passar o e-mail se quiser usar depois)
        Tela_Principal_Form main = new Tela_Principal_Form(email);
        main.setSize(1021, 722);
        main.setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
        main.setVisible(true);              

        this.dispose(); // fecha a tela de login
    }//GEN-LAST:event_logoUserLabelMouseClicked

    private void editbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editbtnMouseClicked
        setCamposEditaveis(true);  // Ativa edição
    }//GEN-LAST:event_editbtnMouseClicked

    private void savebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savebtnMouseClicked
        // Verifica se todos os campos estão preenchidos
        if (camposEstaoVazios()) {
            JOptionPane.showMessageDialog(this,
                "Por favor, preencha todos os campos antes de salvar.",
                "Campos obrigatórios", JOptionPane.WARNING_MESSAGE);
            return; // Impede o salvamento
        }

        // Código para salvar os dados no banco aqui...
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gamematch_db", "root", "2705");

            String sql = "UPDATE users SET age = ?, region = ?, platform = ?, game_style = ?, language = ?, most_played_game = ?, playing_time = ?, self_description = ? WHERE email = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // Pegando os valores dos campos
            pstmt.setString(1, TextFieldAgecriar.getText());
            pstmt.setString(2, TextFieldRegioncriar.getText());
            pstmt.setString(3, (String) jComboBoxPlataformscriar.getSelectedItem());
            pstmt.setString(4, (String) jComboBoxGameStylecriar.getSelectedItem());
            pstmt.setString(5, TextFieldLanguagecriar.getText());
            pstmt.setString(6, TextFieldMostPlayedcriar.getText());
            pstmt.setString(7, TextFieldPlayingTimecriar.getText());
            pstmt.setString(8, jTextAreaSelfDescription.getText());

            // Grantindo que o email foi armazenado nesta tela (como uma variável)
            pstmt.setString(9, this.email); 

            int linhasAfetadas = pstmt.executeUpdate();

            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(this, "Dados atualizados com sucesso!");
                
                // Se estava bloqueado, libera a saída
                if (!cadastroCompleto) {
                    cadastroCompleto = true;
                    desbloquearSaida();
                }
            }

            pstmt.close();
            con.close();

            setCamposEditaveis(false);  // Desativa edição depois de salvar
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar dados: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_savebtnMouseClicked

    private boolean camposEstaoVazios() {
        return TextFieldUsernamecriar.getText().trim().isEmpty() ||
               TextFieldAgecriar.getText().trim().isEmpty() ||
               TextFieldRegioncriar.getText().trim().isEmpty() ||
               TextFieldLanguagecriar.getText().trim().isEmpty() ||
               TextFieldMostPlayedcriar.getText().trim().isEmpty() ||
               TextFieldPlayingTimecriar.getText().trim().isEmpty() ||
               jTextAreaSelfDescription.getText().trim().isEmpty() ||
               TextFieldUsernamecriar.getText().equals("Username") ||
               TextFieldAgecriar.getText().equals("Age") ||
               TextFieldRegioncriar.getText().equals("Region") ||
               TextFieldLanguagecriar.getText().equals("Language") ||
               TextFieldMostPlayedcriar.getText().equals("Most Played Game") ||
               TextFieldPlayingTimecriar.getText().equals("Playing Time") ||
               jTextAreaSelfDescription.getText().equals("Self Description...");
    }
    
    private void desbloquearSaida() {
        logoutLabel.setEnabled(true);
        creditsUserLabel.setEnabled(true);
        friendsUserLabel.setEnabled(true);
        logoUserLabel.setEnabled(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        // Remove o listener que bloqueia fechar, se quiser pode implementar
        for (java.awt.event.WindowListener wl : this.getWindowListeners()) {
            if (wl instanceof java.awt.event.WindowAdapter) {
                this.removeWindowListener(wl);
            }
        }
    }
    
    private void btnNotificationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNotificationMouseClicked
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamematch_db", "root", "2705")) {
            String query = "SELECT COUNT(*) AS total FROM friend_requests WHERE receiver_email = ? AND status = 'pending'";
            try (PreparedStatement stmt = conn.prepareStatement(query)) {
                stmt.setString(1, email); // variável do usuário logado
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next() && rs.getInt("total") > 0) {
                        // Existem notificações → abre a tela
                        new Tela_Notificacoes_Form(email).setVisible(true);
                        this.dispose(); // fecha a tela atual
                    } else {
                        // Nenhuma notificação → mostra aviso
                        JOptionPane.showMessageDialog(this, "Você não possui novas notificações.");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao verificar notificações.");
        }
    }//GEN-LAST:event_btnNotificationMouseClicked

    private void btnDeleteAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteAccountMouseClicked
        // Exibe um diálogo de confirmação para o usuário antes de deletar a conta
        int resposta = JOptionPane.showConfirmDialog(this,
                "Tem certeza que deseja deletar sua conta? Esta ação é irreversível.",
                "Confirmar exclusão",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE);

        // Verifica se o usuário clicou em "Sim"
        if (resposta == JOptionPane.YES_OPTION) {
            try {
                // Carrega o driver JDBC do MySQL
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Abre a conexão com o banco de dados
                Connection con = DriverManager.getConnection(
                        "jdbc:mysql://127.0.0.1:3306/gamematch_db", "root", "2705");

                // Comando SQL para deletar o usuário com o email atual
                String sql = "DELETE FROM users WHERE email = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                // Define o parâmetro do email na query
                pstmt.setString(1, this.email);

                // Executa a query de exclusão e retorna o número de linhas afetadas
                int linhasAfetadas = pstmt.executeUpdate();

                // Fecha o PreparedStatement e a conexão com o banco
                pstmt.close();
                con.close();

                // Verifica se alguma linha foi afetada, ou seja, se o usuário foi deletado
                if (linhasAfetadas > 0) {
                    // Mostra mensagem de sucesso
                    JOptionPane.showMessageDialog(this, "Conta deletada com sucesso!");
                    // Abre a tela inicial
                    new Tela_Inicial_Form().setVisible(true);
                    // Fecha a tela atual do usuário
                    this.dispose();
                } else {
                    // Se nenhuma linha foi afetada, significa que o usuário não foi encontrado no banco
                    JOptionPane.showMessageDialog(this, "Erro: Conta não encontrada para exclusão.", "Erro", JOptionPane.ERROR_MESSAGE);
                }

            } catch (Exception e) {
                // Em caso de erro, exibe a mensagem de erro para o usuário
                JOptionPane.showMessageDialog(this, "Erro ao deletar conta: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btnDeleteAccountMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelGameStylecriar;
    private javax.swing.JLabel JlabelPlataforms;
    private javax.swing.JLabel JlabelSelfDescription;
    private javax.swing.JTextField TextFieldAgecriar;
    private javax.swing.JTextField TextFieldLanguagecriar;
    private javax.swing.JTextField TextFieldMostPlayedcriar;
    private javax.swing.JTextField TextFieldPlayingTimecriar;
    private javax.swing.JTextField TextFieldRegioncriar;
    private javax.swing.JTextField TextFieldUsernamecriar;
    private javax.swing.JLabel btnDeleteAccount;
    private javax.swing.JLabel btnNotification;
    private javax.swing.JLabel creditsUserLabel;
    private javax.swing.JLabel editbtn;
    private javax.swing.JLabel friendsUserLabel;
    private javax.swing.JComboBox<String> jComboBoxGameStylecriar;
    private javax.swing.JComboBox<String> jComboBoxPlataformscriar;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaSelfDescription;
    private javax.swing.JLabel logoUserLabel;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JLabel savebtn;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}
