package com.mycompany.projeto.gamematch;

import javax.swing.*;
import java.awt.*;
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

        // Botão "Add" estilizado com ícone
        btnAdd = new JLabel(iconeBotao);
        btnAdd.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnAdd.setOpaque(true); // permite futura personalização de fundo

        // Estilos visuais
        this.setBackground(new Color(8, 27, 40));

        lblUsername.setForeground(new Color(74, 103, 147));
        lblUsername.setFont(new Font("Monospaced", Font.PLAIN, 24));

        lblTags.setForeground(new Color(74, 103, 147));
        lblTags.setFont(new Font("Monospaced", Font.PLAIN, 18)); // fonte menor

        // Layout usando GroupLayout
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
        this.setMaximumSize(new Dimension(700, Integer.MAX_VALUE)); 
    }

    public String getEmail() {
        return email;
    }

    public JLabel getBtnAdd() {
        return btnAdd;
    }

    // Substitui listeners antigos e adiciona o novo — evita múltiplos cliques duplicados
    public void setBtnAddListener(MouseListener listener) {
        for (MouseListener ml : btnAdd.getMouseListeners()) {
            btnAdd.removeMouseListener(ml);
        }
        btnAdd.addMouseListener(listener);
    }
}