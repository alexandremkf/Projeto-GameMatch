package com.mycompany.projeto.gamematch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BoxLayout;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.Box;
import java.awt.Component;
import java.util.HashSet;
import java.util.Set;

public class Tela_Friends_Form extends javax.swing.JFrame {
    
    private String email;
    
    public Tela_Friends_Form(String email) {
        this.email = email;
        initComponents();
        setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
        
        // Esconde o painel modelo para servir apenas como base para clonagem
        panelModeloAmigo.setVisible(false);
        
        // configura o painel que conterá os amigos
        usuariosPanel.setLayout(new BoxLayout(usuariosPanel, BoxLayout.Y_AXIS));
        usuariosPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        usuariosPanel.setAlignmentY(Component.TOP_ALIGNMENT);
        usuariosPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        scrollPanel.setViewportView(usuariosPanel);
        scrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPanel.getVerticalScrollBar().setUnitIncrement(20);
        
        exibirAmigos();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoGMfriends = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        creditsLabelfriends = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        usuariosPanel = new javax.swing.JPanel();
        panelModeloAmigo = new javax.swing.JPanel();
        usernameLabelFriends = new javax.swing.JLabel();
        tagsLabelFriends = new javax.swing.JLabel();
        btnEndFriend = new javax.swing.JLabel();
        Friends = new javax.swing.JLabel();
        btnNotification = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(74, 103, 147));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/friends.png"))); // NOI18N
        jLabel1.setText("Friends");

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

        panelModeloAmigo.setBackground(new java.awt.Color(8, 27, 40));

        usernameLabelFriends.setBackground(new java.awt.Color(8, 27, 40));
        usernameLabelFriends.setFont(new java.awt.Font("Monospaced", 0, 24)); // NOI18N
        usernameLabelFriends.setForeground(new java.awt.Color(74, 103, 147));
        usernameLabelFriends.setText("Username");

        tagsLabelFriends.setBackground(new java.awt.Color(8, 27, 40));
        tagsLabelFriends.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        tagsLabelFriends.setForeground(new java.awt.Color(74, 103, 147));
        tagsLabelFriends.setText("Tags");

        btnEndFriend.setBackground(new java.awt.Color(8, 27, 40));
        btnEndFriend.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        btnEndFriend.setForeground(new java.awt.Color(74, 103, 147));
        btnEndFriend.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/endfriend.png"))); // NOI18N
        btnEndFriend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEndFriend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEndFriendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelModeloAmigoLayout = new javax.swing.GroupLayout(panelModeloAmigo);
        panelModeloAmigo.setLayout(panelModeloAmigoLayout);
        panelModeloAmigoLayout.setHorizontalGroup(
            panelModeloAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModeloAmigoLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(usernameLabelFriends)
                .addGap(112, 112, 112)
                .addComponent(tagsLabelFriends)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                .addComponent(btnEndFriend)
                .addGap(30, 30, 30))
        );
        panelModeloAmigoLayout.setVerticalGroup(
            panelModeloAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelModeloAmigoLayout.createSequentialGroup()
                .addGroup(panelModeloAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelModeloAmigoLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(panelModeloAmigoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameLabelFriends)
                            .addComponent(tagsLabelFriends)))
                    .addGroup(panelModeloAmigoLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btnEndFriend)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        Friends.setBackground(new java.awt.Color(8, 27, 40));
        Friends.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        Friends.setForeground(new java.awt.Color(74, 103, 147));
        Friends.setText("Friends:");

        javax.swing.GroupLayout usuariosPanelLayout = new javax.swing.GroupLayout(usuariosPanel);
        usuariosPanel.setLayout(usuariosPanelLayout);
        usuariosPanelLayout.setHorizontalGroup(
            usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosPanelLayout.createSequentialGroup()
                .addGroup(usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(usuariosPanelLayout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(Friends))
                    .addGroup(usuariosPanelLayout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(panelModeloAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        usuariosPanelLayout.setVerticalGroup(
            usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Friends, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelModeloAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(360, Short.MAX_VALUE))
        );

        scrollPanel.setViewportView(usuariosPanel);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
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

        btnNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/notification.png"))); // NOI18N
        btnNotification.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNotificationMouseClicked(evt);
            }
        });

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
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(creditsLabelfriends)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoutLabel)
                .addGap(18, 18, 18)
                .addComponent(userLabel)
                .addGap(36, 36, 36))
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
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnNotification, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(logoutLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(creditsLabelfriends)))))
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

    private int buscarIdPorEmail(String email) {
        String sql = "SELECT id FROM users WHERE email = ?";
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gamematch_db", "root", "2705");
             PreparedStatement stmt = con.prepareStatement(sql)) {

            stmt.setString(1, email);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
    private void exibirAmigos() {
        List<Map<String, String>> amigos = buscarAmigos();

        usuariosPanel.removeAll();
        usuariosPanel.setLayout(new BoxLayout(usuariosPanel, BoxLayout.Y_AXIS));
        usuariosPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        usuariosPanel.setAlignmentY(Component.TOP_ALIGNMENT);
        usuariosPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        javax.swing.Icon iconeBotao = ((JLabel) panelModeloAmigo.getComponent(2)).getIcon(); // botão de exemplo do modelo

        for (Map<String, String> amigo : amigos) {
            PainelFriends painel = new PainelFriends(
                amigo.get("username"),
                amigo.get("tags"),
                amigo.get("email"),
                iconeBotao,
                panelModeloAmigo
            );

            painel.setBtnDesfazerListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    desfazerAmizade(email, amigo.get("email"));
                    painel.setVisible(false);
                }
            });

            usuariosPanel.add(painel);
            usuariosPanel.add(Box.createVerticalStrut(25)); // espaço entre painéis
        }

        usuariosPanel.add(Box.createVerticalGlue());

        usuariosPanel.revalidate();
        usuariosPanel.repaint();
        scrollPanel.revalidate();
        scrollPanel.repaint();
    }
    
    private List<Map<String, String>> buscarAmigos() {
        List<Map<String, String>> amigos = new ArrayList<>();

        try (Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gamematch_db", "root", "2705")) {

            // Buscar o ID do usuário logado
            String sqlGetId = "SELECT id FROM users WHERE email = ?";
            PreparedStatement psGetId = con.prepareStatement(sqlGetId);
            psGetId.setString(1, email);
            ResultSet rsId = psGetId.executeQuery();

            int currentUserId = -1;
            if (rsId.next()) {
                currentUserId = rsId.getInt("id");
            } else {
                JOptionPane.showMessageDialog(this, "Usuário não encontrado.", "Erro", JOptionPane.ERROR_MESSAGE);
                return amigos;
            }
            rsId.close();
            psGetId.close();

            // Buscar os amigos do usuário logado
            String sqlFriends = """
                SELECT DISTINCT u.id, u.username, u.email, u.age, u.region, u.platform, 
                                u.game_style, u.language, u.most_played_game, u.playing_time, u.self_description 
                FROM friends f
                JOIN users u ON (
                    (f.user_id1 = ? AND u.id = f.user_id2)
                    OR
                    (f.user_id2 = ? AND u.id = f.user_id1)
                )
                """;
            PreparedStatement psFriends = con.prepareStatement(sqlFriends);
            psFriends.setInt(1, currentUserId);
            psFriends.setInt(2, currentUserId);

            ResultSet rsFriends = psFriends.executeQuery();

            Set<String> emailsAdicionados = new HashSet<>();

            while (rsFriends.next()) {
                String emailAmigo = rsFriends.getString("email");
                if (emailsAdicionados.contains(emailAmigo)) {
                    continue; // já adicionou esse amigo
                }
                emailsAdicionados.add(emailAmigo);

                Map<String, String> amigo = new HashMap<>();
                amigo.put("username", rsFriends.getString("username"));
                amigo.put("email", emailAmigo);
                String tags = "Age: " + rsFriends.getString("age") +
                              ", Region: " + rsFriends.getString("region") +
                              ", Platform: " + rsFriends.getString("platform") +
                              ", Game Style: " + rsFriends.getString("game_style") +
                              ", Language: " + rsFriends.getString("language") +
                              ", M.P.G.: " + rsFriends.getString("most_played_game") +
                              ", Playing Time: " + rsFriends.getString("playing_time") +
                              ", Bio: " + rsFriends.getString("self_description");
                amigo.put("tags", tags);
                amigos.add(amigo);
            }

            rsFriends.close();
            psFriends.close();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar amigos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return amigos;
    }
    
        private void desfazerAmizade(String userEmail, String friendEmail) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gamematch_db", "root", "2705");
            String sql = "DELETE FROM friends WHERE (user_email = ? AND friend_email = ?) OR (user_email = ? AND friend_email = ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, userEmail);
            stmt.setString(2, friendEmail);
            stmt.setString(3, friendEmail);
            stmt.setString(4, userEmail);
            int rows = stmt.executeUpdate();
            stmt.close();
            con.close();
            
            JOptionPane.showMessageDialog(this, "Amizade desfeita com sucesso!");
            exibirAmigos(); // atualizar lista
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao desfazer amizade.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void logoGMfriendsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoGMfriendsMouseClicked
        // Abre a tela principal com base no e-mail logado (pode passar o e-mail se quiser usar depois)
        Tela_Principal_Form main = new Tela_Principal_Form(email);
        main.setSize(1021, 722);
        main.setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
        main.setVisible(true);              

        this.dispose(); // fecha a tela de login
    }//GEN-LAST:event_logoGMfriendsMouseClicked

    private void creditsLabelfriendsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_creditsLabelfriendsMouseClicked
        // Código para ao clicar no credits vá para a tela dos creditos:
        new Tela_Creditos_Form(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_creditsLabelfriendsMouseClicked

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

    private void logoutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutLabelMouseClicked
        // Código para ao clicar no símbolo de log out vá para a tela inicial:
        new Tela_Inicial_Form().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutLabelMouseClicked

    private void userLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userLabelMouseClicked
        // Código para ao clicar no símbolo do user vá para a tela do usuário:
        new Tela_Usuario_Form(email, true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userLabelMouseClicked

    private void btnEndFriendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEndFriendMouseClicked
        // Colocar o código para acabar a amizade aqui:
        
    }//GEN-LAST:event_btnEndFriendMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Friends;
    private javax.swing.JLabel btnEndFriend;
    private javax.swing.JLabel btnNotification;
    private javax.swing.JLabel btnendfriend;
    private javax.swing.JLabel btnendfriend1;
    private javax.swing.JLabel btnendfriend2;
    private javax.swing.JLabel btnendfriend3;
    private javax.swing.JLabel btnendfriend4;
    private javax.swing.JLabel creditsLabelfriends;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoGMfriends;
    private javax.swing.JLabel logoutLabel;
    private javax.swing.JPanel panelModeloAmigo;
    private javax.swing.JPanel panelModeloUsuario;
    private javax.swing.JPanel panelModeloUsuario1;
    private javax.swing.JPanel panelModeloUsuario2;
    private javax.swing.JPanel panelModeloUsuario3;
    private javax.swing.JPanel panelModeloUsuario4;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JLabel tagsLabel;
    private javax.swing.JLabel tagsLabel1;
    private javax.swing.JLabel tagsLabel2;
    private javax.swing.JLabel tagsLabel3;
    private javax.swing.JLabel tagsLabel4;
    private javax.swing.JLabel tagsLabelFriends;
    private javax.swing.JLabel userLabel;
    private javax.swing.JLabel usernameLabel;
    private javax.swing.JLabel usernameLabel1;
    private javax.swing.JLabel usernameLabel2;
    private javax.swing.JLabel usernameLabel3;
    private javax.swing.JLabel usernameLabel4;
    private javax.swing.JLabel usernameLabelFriends;
    private javax.swing.JPanel usuariosPanel;
    // End of variables declaration//GEN-END:variables
}
