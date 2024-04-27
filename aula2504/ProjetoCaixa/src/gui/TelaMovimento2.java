package gui;

import model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class TelaMovimento2 {
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton cmdEntrada;
    private JButton cmdConsulta;
    private JButton cmdRetirada;
    private JButton cmdSair;
    private JTextArea txtMsg;
    private JPanel painel;
    private Caixa caixa;

    public TelaMovimento2() {
        caixa = new Caixa();
        cmdEntrada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                String retorno = caixa.depositar(valor);
                txtMsg.append(retorno);
                txtMsg.append("\n");
                txtValor.setText(null);
                txtValor.requestFocus(); //coloca o foco no controle

            }
        });
        cmdRetirada.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                String retorno = caixa.sacar(valor);
                txtMsg.append(retorno);
                txtMsg.append("\n");
                txtValor.setText(null);
                txtValor.requestFocus(); //coloca o foco no controle

            }
        });

        cmdConsulta.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double saldo = caixa.getSaldo();
                txtSaldo.setText(String.format("%.2f",saldo));
                txtMsg.append("Saldo consultado no momento R$ ");
                txtMsg.append(txtSaldo.getText() + "\n");

            }
        });
        cmdSair.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
    }

    public JPanel getPainel() {
        return painel;
    }
}
