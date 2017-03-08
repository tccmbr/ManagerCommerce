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
 * CadastroProdutoUI
 *
 * Author: Lucas Anselmo
 * E-mail: lucasanselmo01@hotmail.com
 */
class CadastroProdutoUI extends JPanel {

    CadastroProdutoUI () {
        setLayout(new BoxLayout(CadastroProdutoUI.this, BoxLayout.Y_AXIS));
        titulo();
        formulario();
        botoes();
    }

    private void titulo() {
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

    private void formulario() {
        JPanel form = new JPanel();
        form.setLayout(new BoxLayout(form,BoxLayout.Y_AXIS));

        JPanel boxNome = new JPanel();
        boxNome.setLayout(new BoxLayout(boxNome, BoxLayout.X_AXIS));
        boxNome.setMaximumSize(new Dimension(500, 28));
        JLabel nomeLabel = new JLabel("Nome:", null, JLabel.RIGHT);
        JTextField caixaDeTexto1 = new JTextField();
        nomeLabel.setPreferredSize(new Dimension(110,28));
        nomeLabel.setFont(new Font("Verdana", Font.BOLD, 16));

        JPanel boxQuantidade = new JPanel();
        boxQuantidade.setLayout(new BorderLayout());
        boxQuantidade.setMaximumSize(new Dimension(500, 28));
        JLabel quantidadeLabel = new JLabel("Quantidade:", null, JLabel.RIGHT);
        JTextField caixadetexto2 = new JTextField();
        quantidadeLabel.setPreferredSize(new Dimension(110,28));
        quantidadeLabel.setFont(new Font("Verdana", Font.BOLD, 16));

        JPanel boxValor = new JPanel();
        boxValor.setLayout(new BorderLayout());
        boxValor.setMaximumSize(new Dimension(500, 28));
        JLabel valorLabel = new JLabel("Valor:", null, JLabel.RIGHT);
        JTextField caixadetexto3 = new JTextField();
        valorLabel.setPreferredSize(new Dimension(110,28));
        valorLabel.setFont(new Font("Verdana", Font.BOLD, 16));

        JPanel boxDescricao = new JPanel();
        boxDescricao.setLayout(new BorderLayout());
        boxDescricao.setMaximumSize(new Dimension(500, 28));
        JLabel descricaoLabel = new JLabel("Descrição:", null, JLabel.RIGHT);
        JTextField caixadetexto4 = new JTextField();
        descricaoLabel.setPreferredSize(new Dimension(110,28));
        descricaoLabel.setFont(new Font("Verdana", Font.BOLD, 16));

        add(Box.createRigidArea(new Dimension(0,50)));
        boxNome.add(nomeLabel);
        boxNome.add(caixaDeTexto1);
        add(boxNome);

        add(Box.createRigidArea(new Dimension(0,15)));
        boxQuantidade.add(quantidadeLabel, BorderLayout.WEST);
        boxQuantidade.add(caixadetexto2, BorderLayout.CENTER);
        add(boxQuantidade);

        add(Box.createRigidArea(new Dimension(0,15)));
        boxValor.add(valorLabel, BorderLayout.WEST);
        boxValor.add(caixadetexto3, BorderLayout.CENTER);
        add(boxValor);

        add(Box.createRigidArea(new Dimension(0,15)));
        boxDescricao.add(descricaoLabel, BorderLayout.WEST);
        boxDescricao.add(caixadetexto4, BorderLayout.CENTER);
        add(boxDescricao);
    }

    private void botoes () {
        JPanel boxBotoes = new JPanel();
        boxBotoes.setLayout(new BoxLayout(boxBotoes, BoxLayout.X_AXIS));
        boxBotoes.setMaximumSize(new Dimension(500, 28));

        JButton botaoCadastrar = new JButton("Cadastrar");
        JButton botaoLimpar = new JButton("Limpar");

        boxBotoes.add(Box.createRigidArea(new Dimension(200,0)));
        boxBotoes.add(botaoCadastrar);
        boxBotoes.add(Box.createRigidArea(new Dimension(20,0)));
        boxBotoes.add(botaoLimpar);
        add(Box.createRigidArea(new Dimension(0,50)));
        add(boxBotoes);
    }
}
