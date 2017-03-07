package br.com.ewertonolivera.managercommerce.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Manager Commerce
 * <p>
 * Author: Ewerton Oliveira
 * E-mail: ewerton@intelnet.com.br
 */
public class ManagerCommerce extends JFrame {

    public static void main(String[] args) {
        new ManagerCommerce().montaTela();
    }

    private void montaTela() {
        preparaMenu();
        preparaPainelPrincipal();
        preparaJanela();
    }

    private void preparaJanela() {
        setTitle("Manager Commerce");
        setMinimumSize(new Dimension(800,500));
        java.net.URL logoUrl = getClass().getResource("icone.png");
        setIconImage(Toolkit.getDefaultToolkit().getImage(logoUrl));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void preparaMenu() {
        // barra de menu
        JMenuBar menuBar = new JMenuBar();

        // menu produto
        JMenu produtoMenu = new JMenu("Produto");

        // itens do menu produto
        JMenuItem cadastroProdutoItem = new JMenuItem("Cadastro");
        cadastroProdutoItem.addActionListener(e -> preparaCadastroProduto());

        // adiciona os componentes na tela
        produtoMenu.add(cadastroProdutoItem);
        menuBar.add(produtoMenu);
        setJMenuBar(menuBar);
        validate();
    }

    private void preparaPainelPrincipal() {
        java.net.URL logoUrl = getClass().getResource("icone.png");
        ImageIcon logo = new ImageIcon(logoUrl);
        JLabel image = new JLabel("", logo, JLabel.CENTER);

        add(image);
        validate();
    }

    private void preparaCadastroProduto(){
        CadastroProdutoUI cadastroProdutoUI = new CadastroProdutoUI();
        setContentPane(cadastroProdutoUI);
        validate();
    }
}