package com.mycompany.projeto.gamematch;

public class Tela_Notificacoes_Form extends javax.swing.JFrame {

    private String email;
    
    public Tela_Notificacoes_Form() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoGMfriends = new javax.swing.JLabel();
        friendsBusca = new javax.swing.JLabel();
        creditsLabelfriends = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        usuariosPanel = new javax.swing.JPanel();
        panelModeloUsuario = new javax.swing.JPanel();
        usernameLabel = new javax.swing.JLabel();
        tagsLabel = new javax.swing.JLabel();
        btnAccept = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 12, 21));

        logoGMfriends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/gm-small.png"))); // NOI18N
        logoGMfriends.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoGMfriends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoGMfriendsMouseClicked(evt);
            }
        });

        friendsBusca.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        friendsBusca.setForeground(new java.awt.Color(74, 103, 147));
        friendsBusca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/friends.png"))); // NOI18N
        friendsBusca.setText("Friends");
        friendsBusca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        friendsBusca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                friendsBuscaMouseClicked(evt);
            }
        });

        creditsLabelfriends.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        creditsLabelfriends.setForeground(new java.awt.Color(74, 103, 147));
        creditsLabelfriends.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/credits.png"))); // NOI18N
        creditsLabelfriends.setText("Credits");
        creditsLabelfriends.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        creditsLabelfriends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                creditsLabelfriendsMouseClicked(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(14, 47, 86));

        scrollPanel.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        usuariosPanel.setBackground(new java.awt.Color(0, 12, 21));
        usuariosPanel.setMaximumSize(new java.awt.Dimension(32767, 32760));
        usuariosPanel.setPreferredSize(new java.awt.Dimension(930, 550));

        panelModeloUsuario.setBackground(new java.awt.Color(8, 27, 40));

        usernameLabel.setBackground(new java.awt.Color(8, 27, 40));
        usernameLabel.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        usernameLabel.setForeground(new java.awt.Color(74, 103, 147));
        usernameLabel.setText("Username");

        tagsLabel.setBackground(new java.awt.Color(8, 27, 40));
        tagsLabel.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        tagsLabel.setForeground(new java.awt.Color(74, 103, 147));
        tagsLabel.setText("Tags");

        btnAccept.setBackground(new java.awt.Color(8, 27, 40));
        btnAccept.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        btnAccept.setForeground(new java.awt.Color(74, 103, 147));
        btnAccept.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/accept.png"))); // NOI18N
        btnAccept.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelModeloUsuarioLayout = new javax.swing.GroupLayout(panelModeloUsuario);
        panelModeloUsuario.setLayout(panelModeloUsuarioLayout);
        panelModeloUsuarioLayout.setHorizontalGroup(
            panelModeloUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModeloUsuarioLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(usernameLabel)
                .addGap(112, 112, 112)
                .addComponent(tagsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 303, Short.MAX_VALUE)
                .addComponent(btnAccept)
                .addGap(30, 30, 30))
        );
        panelModeloUsuarioLayout.setVerticalGroup(
            panelModeloUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModeloUsuarioLayout.createSequentialGroup()
                .addGroup(panelModeloUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModeloUsuarioLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelModeloUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabel)
                            .addComponent(tagsLabel)))
                    .addGroup(panelModeloUsuarioLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnAccept)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(8, 27, 40));
        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(74, 103, 147));
        jLabel3.setText("Notifications:");

        javax.swing.GroupLayout usuariosPanelLayout = new javax.swing.GroupLayout(usuariosPanel);
        usuariosPanel.setLayout(usuariosPanelLayout);
        usuariosPanelLayout.setHorizontalGroup(
            usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosPanelLayout.createSequentialGroup()
                .addGroup(usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuariosPanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(panelModeloUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(usuariosPanelLayout.createSequentialGroup()
                        .addGap(309, 309, 309)
                        .addComponent(jLabel3)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        usuariosPanelLayout.setVerticalGroup(
            usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelModeloUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(367, Short.MAX_VALUE))
        );

        scrollPanel.setViewportView(usuariosPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 930, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        logoutLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/logout.png"))); // NOI18N
        logoutLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutLabelMouseClicked(evt);
            }
        });

        userLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/user.png"))); // NOI18N
        userLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logoGMfriends)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(friendsBusca)
                .addGap(18, 18, 18)
                .addComponent(creditsLabelfriends)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 357, Short.MAX_VALUE)
                .addComponent(logoutLabel)
                .addGap(18, 18, 18)
                .addComponent(userLabel)
                .addGap(32, 32, 32))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(logoGMfriends))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(friendsBusca, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(creditsLabelfriends))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(userLabel)
                                    .addComponent(logoutLabel))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1020, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 730, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoGMfriendsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoGMfriendsMouseClicked
        // Abre a tela principal com base no e-mail logado (pode passar o e-mail se quiser usar depois)
        Tela_Principal_Form main = new Tela_Principal_Form(email);
        main.setSize(1021, 722);
        main.setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
        main.setVisible(true);

        this.dispose(); // fecha a tela de login
    }//GEN-LAST:event_logoGMfriendsMouseClicked

    private void friendsBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friendsBuscaMouseClicked
        // Código para ao clicar no Friends vá para a tela dos amigos:
        new Tela_Friends_Form(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_friendsBuscaMouseClicked

    private void creditsLabelfriendsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsLabelfriendsMouseClicked
        // Código para ao clicar no credits vá para a tela dos creditos:
        new Tela_Creditos_Form(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_creditsLabelfriendsMouseClicked

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
            java.util.logging.Logger.getLogger(Tela_Notificacoes_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Notificacoes_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Notificacoes_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Notificacoes_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Notificacoes_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAccept;
    private javax.swing.JLabel creditsLabelfriends;
    private javax.swing.JLabel friendsBusca;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoGMfriends;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel panelModeloUsuario;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JLabel tagsLabel;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JPanel usuariosPanel;
    // End of variables declaration//GEN-END:variables
}
