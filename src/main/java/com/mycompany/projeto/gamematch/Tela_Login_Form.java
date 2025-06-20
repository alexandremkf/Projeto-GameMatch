package com.mycompany.projeto.gamematch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Tela_Login_Form extends javax.swing.JFrame {

    public Tela_Login_Form() {
        initComponents();
        setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
        jPasswordFieldLog.setEchoChar((char) 0);
        TextFieldEmailLog.setEditable(false);
        TextFieldEmailLog.setFocusable(false);
        jPasswordFieldLog.setEditable(false);
        jPasswordFieldLog.setFocusable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel19 = new javax.swing.JPanel();
        logoLoginLabel = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        creditsLoginLabel = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        TextFieldEmailLog = new javax.swing.JTextField();
        jPanel22 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        JlabelLogintelalogin = new javax.swing.JLabel();
        jPasswordFieldLog = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel19.setBackground(new java.awt.Color(0, 12, 21));

        logoLoginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/gm-small.png"))); // NOI18N
        logoLoginLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoLoginLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoLoginLabelMouseClicked(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(74, 103, 147));
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/friends.png"))); // NOI18N
        jLabel32.setText("Friends");

        creditsLoginLabel.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        creditsLoginLabel.setForeground(new java.awt.Color(74, 103, 147));
        creditsLoginLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/credits.png"))); // NOI18N
        creditsLoginLabel.setText("Credits");
        creditsLoginLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel20.setBackground(new java.awt.Color(14, 47, 86));

        jPanel21.setBackground(new java.awt.Color(0, 12, 21));

        TextFieldEmailLog.setBackground(new java.awt.Color(8, 27, 40));
        TextFieldEmailLog.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        TextFieldEmailLog.setForeground(new java.awt.Color(74, 103, 147));
        TextFieldEmailLog.setText("E-mail");
        TextFieldEmailLog.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TextFieldEmailLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TextFieldEmailLog.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TextFieldEmailLogFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextFieldEmailLogFocusLost(evt);
            }
        });
        TextFieldEmailLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextFieldEmailLogMouseClicked(evt);
            }
        });
        TextFieldEmailLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEmailLogActionPerformed(evt);
            }
        });

        jPanel22.setBackground(new java.awt.Color(74, 103, 147));
        jPanel22.setForeground(new java.awt.Color(74, 103, 147));
        jPanel22.setPreferredSize(new java.awt.Dimension(326, 5));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 40)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(74, 103, 147));
        jLabel9.setText("Log into your account");

        jPanel23.setBackground(new java.awt.Color(74, 103, 147));
        jPanel23.setForeground(new java.awt.Color(74, 103, 147));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );

        JlabelLogintelalogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/logincorrect.png"))); // NOI18N
        JlabelLogintelalogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JlabelLogintelalogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JlabelLogintelaloginMouseClicked(evt);
            }
        });

        jPasswordFieldLog.setBackground(new java.awt.Color(8, 27, 40));
        jPasswordFieldLog.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        jPasswordFieldLog.setForeground(new java.awt.Color(74, 103, 147));
        jPasswordFieldLog.setText("password");
        jPasswordFieldLog.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPasswordFieldLog.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordFieldLogFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldLogFocusLost(evt);
            }
        });
        jPasswordFieldLog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldLogMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addGap(0, 77, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(66, 66, 66))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TextFieldEmailLog)
                            .addComponent(jPasswordFieldLog, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE))
                        .addGap(138, 138, 138))))
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addComponent(JlabelLogintelalogin)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(TextFieldEmailLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPasswordFieldLog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(JlabelLogintelalogin)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(181, 181, 181)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoLoginLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(18, 18, 18)
                .addComponent(creditsLoginLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(logoLoginLabel))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(creditsLoginLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void TextFieldEmailLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEmailLogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEmailLogActionPerformed

    private void JlabelLogintelaloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JlabelLogintelaloginMouseClicked
        String email = TextFieldEmailLog.getText().trim();
        String senha = new String(jPasswordFieldLog.getPassword()).trim();

        // Verificação se todos os campos foram preenchidos
        if (email.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Erro", JOptionPane.WARNING_MESSAGE);
            return;
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gamematch_db", "root", "2705");

            String sql = "SELECT * FROM users WHERE email = ? AND password = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, email);
            pstmt.setString(2, senha);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                // Verifica se os campos obrigatórios da conta estão preenchidos
                String username = rs.getString("username");
                String age = rs.getString("age");
                String region = rs.getString("region");
                String platform = rs.getString("platform");
                String gameStyle = rs.getString("game_style");
                String language = rs.getString("language");
                String mostPlayedGame = rs.getString("most_played_game");
                String playingTime = rs.getString("playing_time");
                String selfDescription = rs.getString("self_description");

                boolean cadastroCompleto = username != null && !username.isEmpty() &&
                                          age != null && !age.isEmpty() &&
                                          region != null && !region.isEmpty() &&
                                          platform != null && !platform.isEmpty() &&
                                          gameStyle != null && !gameStyle.isEmpty() &&
                                          language != null && !language.isEmpty() &&
                                          mostPlayedGame != null && !mostPlayedGame.isEmpty() &&
                                          playingTime != null && !playingTime.isEmpty() &&
                                          selfDescription != null && !selfDescription.isEmpty();

                if (cadastroCompleto) {
                    // Cadastro completo → vai para tela principal
                    Tela_Principal_Form main = new Tela_Principal_Form(email);
                    main.setSize(1021, 722);
                    main.setLocationRelativeTo(null);
                    main.setVisible(true);
                } else {
                    // Cadastro incompleto → vai para tela do usuário
                    Tela_Usuario_Form usuarioForm = new Tela_Usuario_Form(email, false);
                    usuarioForm.setLocationRelativeTo(null);
                    usuarioForm.setVisible(true);
                }            
                
                this.dispose(); // fecha a tela de login
            } else {
                JOptionPane.showMessageDialog(this, "E-mail ou senha inválidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            }

            rs.close();
            pstmt.close();
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao fazer login: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_JlabelLogintelaloginMouseClicked
    
    private void TextFieldEmailLogFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldEmailLogFocusGained
        // Código para sumir o PlaceHolder ao clicar para digitar.
        if (TextFieldEmailLog.getText().equals("E-mail")) {
        TextFieldEmailLog.setText("");
        }
    }//GEN-LAST:event_TextFieldEmailLogFocusGained

    private void TextFieldEmailLogFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextFieldEmailLogFocusLost
        // Código para permanecer o PlaceHolder enquanto estiver vazio a entrada.
        if (TextFieldEmailLog.getText().isEmpty()) {
        TextFieldEmailLog.setText("E-mail");
        }
    }//GEN-LAST:event_TextFieldEmailLogFocusLost

    private void jPasswordFieldLogFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldLogFocusGained
        // Código serve para se estiver vazio a entrada, aparecer "password" ao invés dos asterísticos.
        String senha = String.valueOf(jPasswordFieldLog.getPassword());
        if (senha.equals("password")) {
            jPasswordFieldLog.setText("");
            jPasswordFieldLog.setEchoChar('•'); // Ativa os asteriscos
        }
    }//GEN-LAST:event_jPasswordFieldLogFocusGained

    private void jPasswordFieldLogFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldLogFocusLost
        // Código serve para remover a palavra password e o que você digitar aparecerá em asterísticos.
        String senha = String.valueOf(jPasswordFieldLog.getPassword());
        if (senha.isEmpty()) {
            jPasswordFieldLog.setText("password");
            jPasswordFieldLog.setEchoChar((char) 0); // Remove asteriscos para mostrar texto
        }
    }//GEN-LAST:event_jPasswordFieldLogFocusLost

    private void logoLoginLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoLoginLabelMouseClicked
        // Código para ao clicar no Logo vá para a tela dos inicial:
        new Tela_Inicial_Form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoLoginLabelMouseClicked

    private void TextFieldEmailLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextFieldEmailLogMouseClicked
        // Código para tirar esse foco que o campo de texto recebia.
        TextFieldEmailLog.setFocusable(true);
        TextFieldEmailLog.setEditable(true);
        TextFieldEmailLog.requestFocusInWindow();
    }//GEN-LAST:event_TextFieldEmailLogMouseClicked

    private void jPasswordFieldLogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldLogMouseClicked
        // Código para tirar esse foco que o campo de texto recebia.
        jPasswordFieldLog.setFocusable(true);
        jPasswordFieldLog.setEditable(true);
        jPasswordFieldLog.requestFocusInWindow();
    }//GEN-LAST:event_jPasswordFieldLogMouseClicked

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
            java.util.logging.Logger.getLogger(Tela_Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Login_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Login_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JlabelLogintelalogin;
    private javax.swing.JTextField TextFieldEmailLog;
    private javax.swing.JLabel creditsLoginLabel;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPasswordField jPasswordFieldLog;
    private javax.swing.JLabel logoLoginLabel;
    // End of variables declaration//GEN-END:variables
}
