package com.mycompany.projeto.gamematch;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class PainelFriends extends JPanel {

    private String email;
    private JLabel lblUsername;
    private JLabel lblTags;
    private JLabel btnUnfriend;

    public PainelFriends(String username, String tags, String email, javax.swing.Icon iconeBotao, JPanel modelo) {
        this.email = email;

        lblUsername = new JLabel(username);

        // Quebra de linha nas tags
        String tagsHtml = "<html>" + tags.replace(", ", "<br>") + "</html>";
        lblTags = new JLabel(tagsHtml);

        // Botão "Desfazer amizade" com ícone
        btnUnfriend = new JLabel(iconeBotao);
        btnUnfriend.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnUnfriend.setOpaque(true); // permite customizar fundo, se quiser

        // Estilo visual idêntico ao PainelUsuario
        this.setBackground(new Color(8, 27, 40));

        lblUsername.setForeground(new Color(74, 103, 147));
        lblUsername.setFont(new Font("Monospaced", Font.PLAIN, 24));

        lblTags.setForeground(new Color(74, 103, 147));
        lblTags.setFont(new Font("Monospaced", Font.PLAIN, 18));

        // Layout usando GroupLayout igual ao PainelUsuario
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGap(41)
                .addComponent(lblUsername)
                .addGap(112)
                .addComponent(lblTags)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnUnfriend)
                .addGap(30)
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(lblUsername)
                .addComponent(lblTags)
                .addComponent(btnUnfriend)
        );

        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        this.setMaximumSize(new Dimension(700, Integer.MAX_VALUE)); 
    }

    public String getEmail() {
        return email;
    }

    public JLabel getBtnUnfriend() {
        return btnUnfriend;
    }

    // Para registrar clique no botão
    public void setBtnDesfazerListener(MouseListener listener) {
        for (MouseListener ml : btnUnfriend.getMouseListeners()) {
            btnUnfriend.removeMouseListener(ml);
        }
        btnUnfriend.addMouseListener(listener);
    }
}
