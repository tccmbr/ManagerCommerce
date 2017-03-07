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
        setTitle("Manager Commerce");
        setMinimumSize(new Dimension(500,500));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        preparaCadastroProduto();
    }

    private void preparaCadastroProduto(){
        CadastroProdutoUI cadastroProdutoUI = new CadastroProdutoUI();
        setContentPane(cadastroProdutoUI);
        validate();
    }
}