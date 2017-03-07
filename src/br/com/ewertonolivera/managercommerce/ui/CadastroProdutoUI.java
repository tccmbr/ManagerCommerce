package br.com.ewertonolivera.managercommerce.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Manager Commerce
 * <p>
 * Author: Lucas Anselmo
 * E-mail: lucasanselmo01@hotmail.com
 */
class CadastroProdutoUI extends JPanel {

    CadastroProdutoUI () {
        setLayout(new BoxLayout(CadastroProdutoUI.this, BoxLayout.Y_AXIS));
        titulo();
    }

    private void titulo(){
        JPanel painel = new JPanel();
        painel.setLayout(new BorderLayout());
        painel.setBackground(Color.darkGray);
        painel.setMaximumSize(new Dimension(1920,40));

        java.net.URL caminhoCadastroProduto = getClass().getResource("produto.png");
        ImageIcon iconeCadastroProduto = new ImageIcon(caminhoCadastroProduto);
        JLabel titulo = new JLabel("Cadastro de Produto", iconeCadastroProduto, JLabel.CENTER);
        titulo.setFont(new Font("Verdana",Font.BOLD, 25));
        titulo.setForeground(Color.white);

        painel.add(titulo, BorderLayout.NORTH);
        add(painel);
    }
}
