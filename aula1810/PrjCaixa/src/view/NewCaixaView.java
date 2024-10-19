package view;

import model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class NewCaixaView {
    private JPanel formCaixa;
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton entradaButton;
    private JButton retiradaButton;
    private JButton consultaButton;
    private JButton sairButton;
    private JTextArea txtMsg;
    private JLabel lblSaldo;
    private JLabel lblValor;
    private Caixa caixa = new Caixa();

    public JPanel getFormCaixa() {
        return formCaixa;
    }

    public NewCaixaView() {

        sairButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(formCaixa, "Saida");
                System.exit(0);
            }
        });
        entradaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                String resultado = caixa.depositar(valor);
                txtMsg.append(resultado + "\n");
                txtValor.setText(null);
                txtValor.requestFocus();
            }
        });
        retiradaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                String resultado = caixa.sacar(valor);
                txtMsg.append(resultado + "\n");
                txtValor.setText(null);
                txtValor.requestFocus();
            }
        });
        consultaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double saldo  = caixa.getSaldo();
                txtSaldo.setText(String.format("%.2f", saldo));
                txtMsg.append("Saldo consultado \n");
            }
        });
    }
}
