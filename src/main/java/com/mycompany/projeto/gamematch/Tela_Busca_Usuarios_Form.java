package com.mycompany.projeto.gamematch;

import com.mycompany.projeto.gamematch.PainelUsuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.BoxLayout;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.Box;
import java.awt.Component;
import java.awt.Dimension;

public class Tela_Busca_Usuarios_Form extends javax.swing.JFrame {

    private String email;
    private String tagsBusca;
    
    public Tela_Busca_Usuarios_Form() {
        initComponents();
        this.email = email;
        setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
        
        // Esconde o painel modelo para servir apenas como base para clonagem
        panelModeloUsuario.setVisible(false);
    }

    public Tela_Busca_Usuarios_Form(String email, String tagsBusca) {
        initComponents();
        this.email = email;
        this.tagsBusca = tagsBusca;
        setLocationRelativeTo(null); // Serve para começar com a tela centralizada.
        
        usuariosPanel.setLayout(new BoxLayout(usuariosPanel, BoxLayout.Y_AXIS));
        usuariosPanel.setAlignmentX(Component.LEFT_ALIGNMENT);
        usuariosPanel.setAlignmentY(Component.TOP_ALIGNMENT);
        usuariosPanel.setAutoscrolls(true);
        usuariosPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        
        // IMPORTANTE: Garante que o scroll funcione com base no conteúdo
        scrollPanel.setViewportView(usuariosPanel);
        
        // Forçar que a rolagem funcione
        scrollPanel.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        
        // Rolagem da tela
        scrollPanel.getVerticalScrollBar().setUnitIncrement(20);
        
        exibirUsuariosComTags(); // já chama o método ao abrir a tela
    }
    
    private void exibirUsuariosComTags() {
        List<String> tagsBuscadas = Arrays.asList(tagsBusca.split("\\s+"));
        List<Map<String, String>> usuarios = buscarUsuariosComTags(tagsBuscadas);

        usuariosPanel.removeAll();
        usuariosPanel.add(Box.createVerticalStrut(10)); // espaçamento no topo

        // Pega o ícone do botão do painel modelo
        javax.swing.Icon iconeBotao = ((JLabel) panelModeloUsuario.getComponent(2)).getIcon();

        for (Map<String, String> user : usuarios) {
            boolean pedidoEnviado = Boolean.parseBoolean(user.get("pedidoEnviado"));
            
            PainelUsuario painel = new PainelUsuario(
                user.get("username"),
                user.get("tags"),
                user.get("email"),
                iconeBotao,
                panelModeloUsuario
            );

            // Se já enviou o pedido, oculta o botão
            if (pedidoEnviado) {
                painel.getBtnAdd().setVisible(false);
            } else {
                painel.setBtnAddListener(new java.awt.event.MouseAdapter() {
                    @Override
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        String receiverEmail = user.get("email");
                        enviarPedidoDeAmizade(email, receiverEmail);
                        painel.getBtnAdd().setVisible(false);
                    }
                });
            }

            usuariosPanel.add(painel);
            usuariosPanel.add(Box.createVerticalStrut(25)); // espaçamento entre painéis
        }
        
        // Calcular altura real do conteúdo:
        int alturaTotal = 0;
        for (Component comp : usuariosPanel.getComponents()) {
            alturaTotal += comp.getPreferredSize().height;
        }

        // Define altura baseada no conteúdo real
        usuariosPanel.setPreferredSize(new Dimension(scrollPanel.getWidth(), alturaTotal));
        
        // Atualiza os componentes
        usuariosPanel.revalidate();
        usuariosPanel.repaint();
        scrollPanel.revalidate();
        scrollPanel.repaint();
        
        usuariosPanel.add(Box.createVerticalStrut(400)); // espaçamento inferior
        //ajustarAlturaUsuariosPanel(usuarios.size());
    }
    
    private List<Map<String, String>> buscarUsuariosComTags(List<String> tags) {
        List<Map<String, String>> usuarios = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gamematch_db", "root", "2705");

            // Monta o WHERE dinâmico com os campos corretos
            StringBuilder sql = new StringBuilder("SELECT * FROM users WHERE email != ? AND ");
            for (int i = 0; i < tags.size(); i++) {
                if (i > 0) sql.append(" AND ");
                sql.append("(");
                sql.append("age LIKE ? OR ");
                sql.append("region LIKE ? OR ");
                sql.append("platform LIKE ? OR ");
                sql.append("game_style LIKE ? OR ");
                sql.append("language LIKE ? OR ");
                sql.append("most_played_game LIKE ? OR ");
                sql.append("playing_time LIKE ? OR ");
                sql.append("self_description LIKE ?");
                sql.append(")");
            }

            PreparedStatement stmt = con.prepareStatement(sql.toString());

            int paramIndex = 1;
            stmt.setString(paramIndex++, email);  // <- filtro para não incluir o próprio usuário
            for (String tag : tags) {
                for (int j = 0; j < 8; j++) { // 8 campos por tag
                    stmt.setString(paramIndex++, "%" + tag + "%");
                }
            }

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Map<String, String> usuario = new HashMap<>();
                usuario.put("username", rs.getString("username"));
                usuario.put("email", rs.getString("email"));

                // Concatena as "tags visíveis" do usuário
                String tagsCombinadas = "Age: " + rs.getString("age") + ", " +
                                        "Region: " + rs.getString("region") + ", " +
                                        "Platform: " + rs.getString("platform") + ", " +
                                        "Game Style: " + rs.getString("game_style") + ", " +
                                        "Language: " + rs.getString("language") + ", " +
                                        "M.P.G.: " + rs.getString("most_played_game") + ", " +
                                        "Playing Time: " + rs.getString("playing_time") + ", " +
                                        "Bio: " + rs.getString("self_description");
                usuario.put("tags", tagsCombinadas);
                usuarios.add(usuario);
                
                // Verifica se já existe pedido pendente ou amizade entre os dois (em qualquer direção)
                String receiverEmail = rs.getString("email");

                Connection con2 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gamematch_db", "root", "2705");
                String verificaSql = """
                    SELECT * FROM friend_requests
                    WHERE
                        ((sender_email = ? AND receiver_email = ?) OR
                         (sender_email = ? AND receiver_email = ?))
                      AND status IN ('pending', 'accepted')
                """;
                PreparedStatement verificaStmt = con2.prepareStatement(verificaSql);
                verificaStmt.setString(1, email);         // quem está logado
                verificaStmt.setString(2, receiverEmail); // o outro usuário
                verificaStmt.setString(3, receiverEmail); // inverso
                verificaStmt.setString(4, email);         // inverso
                ResultSet rs2 = verificaStmt.executeQuery();

                boolean relacaoExiste = rs2.next();
                usuario.put("pedidoEnviado", String.valueOf(relacaoExiste)); // salva como "true" ou "false"

                rs2.close();
                verificaStmt.close();
                con2.close();
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao buscar usuários.", "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return usuarios;
    }
    
    private void ajustarAlturaUsuariosPanel(int quantidadeUsuarios) {
        int alturaPainel = 150; // Altura aproximada de cada painel (ajuste conforme necessário)
        int espacoEntre = 20;
        int margemExtra = 40;

        int alturaTotal = (alturaPainel * quantidadeUsuarios) + (espacoEntre * (quantidadeUsuarios - 1)) + margemExtra;

        if (quantidadeUsuarios == 0) alturaTotal = 100;

        // Define a nova altura do painel
        Dimension tamanhoPreferido = new Dimension(scrollPanel.getViewport().getWidth(), alturaTotal);
        usuariosPanel.setPreferredSize(tamanhoPreferido);
        usuariosPanel.setMinimumSize(tamanhoPreferido);

        usuariosPanel.revalidate();
        usuariosPanel.repaint();
    }
    
    private void enviarPedidoDeAmizade(String senderEmail, String receiverEmail) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/gamematch_db", "root", "2705");

            // Verifica se já existe pedido pendente
            String verificaSql = "SELECT * FROM friend_requests WHERE sender_email = ? AND receiver_email = ? AND status = 'pending'";
            PreparedStatement verificaStmt = con.prepareStatement(verificaSql);
            verificaStmt.setString(1, senderEmail);
            verificaStmt.setString(2, receiverEmail);
            ResultSet rs = verificaStmt.executeQuery();

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Você já enviou um pedido de amizade para esse usuário.");
                rs.close();
                verificaStmt.close();
                con.close();
                return;
            }

            rs.close();
            verificaStmt.close();

            // Inserção do pedido
            String sql = "INSERT INTO friend_requests (sender_email, receiver_email, status) VALUES (?, ?, 'pending')";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, senderEmail);
            stmt.setString(2, receiverEmail);
            stmt.executeUpdate();

            stmt.close();
            con.close();

            JOptionPane.showMessageDialog(this, "Pedido de amizade enviado com sucesso!");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Erro ao enviar pedido de amizade.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
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
        btnAdd = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logoutLabel = new javax.swing.JLabel();
        userLabel = new javax.swing.JLabel();
        btnNotification = new javax.swing.JLabel();

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

        btnAdd.setBackground(new java.awt.Color(8, 27, 40));
        btnAdd.setFont(new java.awt.Font("Monospaced", 0, 20)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(74, 103, 147));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/add.png"))); // NOI18N
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                .addComponent(btnAdd)
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
                        .addComponent(btnAdd)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jLabel3.setBackground(new java.awt.Color(8, 27, 40));
        jLabel3.setFont(new java.awt.Font("Monospaced", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(74, 103, 147));
        jLabel3.setText("Users:");

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
                        .addGap(393, 393, 393)
                        .addComponent(jLabel3)))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        usuariosPanelLayout.setVerticalGroup(
            usuariosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(usuariosPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(panelModeloUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(361, Short.MAX_VALUE))
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

        btnNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/projeto/gamematch/notification.png"))); // NOI18N
        btnNotification.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNotificationMouseClicked(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNotification)
                .addGap(18, 18, 18)
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
                                    .addComponent(logoutLabel)
                                    .addComponent(btnNotification))))))
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
        new Tela_Usuario_Form(email, true).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userLabelMouseClicked

    private void friendsBuscaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_friendsBuscaMouseClicked
        // Código para ao clicar no Friends vá para a tela dos amigos:
        new Tela_Friends_Form(email).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_friendsBuscaMouseClicked

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
            java.util.logging.Logger.getLogger(Tela_Busca_Usuarios_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Busca_Usuarios_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Busca_Usuarios_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Busca_Usuarios_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Busca_Usuarios_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnAdd;
    private javax.swing.JLabel btnNotification;
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