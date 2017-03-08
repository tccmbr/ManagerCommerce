package br.com.ewertonolivera.managercommerce.ui;

import javax.swing.*;
import java.awt.*;

/**
 * MIT License
 * Copyright (c) 2017 Ewerton Oliveira (TcCMBr)
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 * ManagerCommerce
 *
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