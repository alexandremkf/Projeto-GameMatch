package com.mycompany.projeto.gamematch;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.BorderFactory;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Color;

public class PainelUsuario extends JPanel {

    private String email;
    private JLabel lblUsername;
    private JLabel lblTags;
    private JLabel btnAdd;

    public PainelUsuario(String username, String tags, String email, javax.swing.Icon iconeBotao, JPanel modelo) {
        this.email = email;

        lblUsername = new JLabel(username);
        
        // transforma as tags numa string HTML com quebra de linha
        String tagsHtml = "<html>" + tags.replace(", ", "<br>") + "</html>";
        lblTags = new JLabel(tagsHtml);
        
        btnAdd = new JLabel(iconeBotao);
        
        this.setBackground(new Color(8, 27, 40));
    
        lblUsername.setBackground(new Color(8, 27, 40));
        lblUsername.setForeground(new Color(74, 103, 147));
        lblUsername.setFont(new Font("Monospaced", Font.PLAIN, 24));

        lblTags.setBackground(new Color(8, 27, 40));
        lblTags.setForeground(new Color(74, 103, 147));
        lblTags.setFont(new Font("Monospaced", Font.PLAIN, 18)); // menor fonte

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
                .addComponent(btnAdd)
                .addGap(30)
        );

        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                .addComponent(lblUsername)
                .addComponent(lblTags)
                .addComponent(btnAdd)
        );

        this.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // largura fixa, altura variável para acompanhar conteúdo
        this.setMaximumSize(new java.awt.Dimension(700, Integer.MAX_VALUE));
    }

    // Você pode adicionar métodos getter para o email ou botões, se precisar manipular
    public String getEmail() {
        return email;
    }

    public JLabel getBtnAdd() {
        return btnAdd;
    }
}