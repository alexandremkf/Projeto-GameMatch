package com.mycompany.projeto.gamematch;

import javax.swing.*;
import java.awt.*;

public class PainelNotificacao extends JPanel {

    private String email;
    private JLabel lblUsername;
    private JLabel lblTags;
    private JLabel btnAccept;
    private JLabel btnIgnore;

    public PainelNotificacao(String username, String tags, String email, Icon iconeAceitar, Icon iconeIgnorar) {
        this.email = email;

        lblUsername = new JLabel(username);

        String tagsHtml = "<html>" + tags.replace(", ", "<br>") + "</html>";
        lblTags = new JLabel(tagsHtml);

        btnAccept = new JLabel(iconeAceitar);
        btnAccept.setCursor(new Cursor(Cursor.HAND_CURSOR));

        btnIgnore = new JLabel(iconeIgnorar);
        btnIgnore.setCursor(new Cursor(Cursor.HAND_CURSOR));

        setBackground(new Color(8, 27, 40));

        lblUsername.setForeground(new Color(74, 103, 147));
        lblUsername.setFont(new Font("Monospaced", Font.PLAIN, 24));

        lblTags.setForeground(new Color(74, 103, 147));
        lblTags.setFont(new Font("Monospaced", Font.PLAIN, 18));

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createSequentialGroup()
                .addGap(41)
                .addComponent(lblUsername)
                .addGap(112)
                .addComponent(lblTags)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAccept)
                .addGap(10)
                .addComponent(btnIgnore)
                .addGap(30)
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(lblUsername)
                .addComponent(lblTags)
                .addComponent(btnAccept)
                .addComponent(btnIgnore)
        );

        setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        setMaximumSize(new Dimension(700, Integer.MAX_VALUE));
    }

    public JLabel getBtnAccept() {
        return btnAccept;
    }

    public JLabel getBtnIgnore() {
        return btnIgnore;
    }

    public String getEmail() {
        return email;
    }
}
