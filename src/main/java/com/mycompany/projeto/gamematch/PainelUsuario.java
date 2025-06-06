package com.mycompany.projeto.gamematch;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.BorderFactory;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseListener;

public class PainelUsuario extends JPanel {

    private String email;
    private JLabel lblUsername;
    private JLabel lblTags;
    private JLabel btnAdd;

    public PainelUsuario(String username, String tags, String email, javax.swing.Icon iconeBotao, JPanel modelo) {
        this.email = email;

        lblUsername = new JLabel(username);
        
        // Transforma as tags numa string HTML com quebra de linha
        String tagsHtml = "<html>" + tags.replace(", ", "<br>") + "</html>";
        lblTags = new JLabel(tagsHtml);
        
        btnAdd = new JLabel(iconeBotao);
        btnAdd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR)); // Deixa o botão add com o cursor Hand
        btnAdd.setOpaque(true); // Permite estilizar fundo no futuro
        
        this.setBackground(new Color(8, 27, 40));
    
        lblUsername.setForeground(new Color(74, 103, 147));
        lblUsername.setFont(new Font("Monospaced", Font.PLAIN, 24));

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

        // Largura fixa, altura variável para acompanhar conteúdo
        this.setMaximumSize(new java.awt.Dimension(700, Integer.MAX_VALUE));
        this.setPreferredSize(new Dimension(700, 80)); // altura fixa para consistência visual
    }

    public String getEmail() {
        return email;
    }

    public JLabel getBtnAdd() {
        return btnAdd;
    }
    
    public void addBtnAddListener(MouseListener listener) {
        btnAdd.addMouseListener(listener);
    }
}