package view;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaixaView extends JFrame implements ActionListener {
    private Dimension dLabel, dTextField, dButton, dTextArea, dFrame;
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    private TextArea txtMsg;
    private Caixa caixa = new Caixa();

    //método contrutor da janela
    public CaixaView(){
        //definir tamanho dos componentes
        setSizeComponents();

        //Aparenciar da janela
        setWindowAppearance();

        //adicionar componentes
        addComponents();

    }

    private void addComponents() {
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        this.add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        this.add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        this.add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        this.add(txtSaldo);

        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        cmdEntrada.addActionListener(this);
        this.add(cmdEntrada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25,185);
        cmdConsulta.addActionListener(this);
        this.add(cmdConsulta);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(225,150);
        cmdRetirada.addActionListener(this);
        this.add(cmdRetirada);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225,185);
        cmdSair.addActionListener(this);
        this.add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        this.add(txtMsg);
    }

    private void setWindowAppearance() {
        this.setSize(dFrame);
        this.setTitle("Controle de Caixa");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);//definir na maos as posicoes
        this.setLocationRelativeTo(null); //cetralizar a janela
        this.setResizable(false); //nega o redimensionamento
    }

    private void setSizeComponents() {
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95, 20);
        dTextArea = new Dimension(300, 140);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmdSair){
            //Sair do programa, com mensagem para o usuario
            JOptionPane.showMessageDialog(null,
                    "Sair do programa com segurança");
            //Saida
            System.exit(0);
        }
        if(e.getSource()==cmdConsulta){
            double saldo  = caixa.getSaldo();
            txtSaldo.setText(String.format("%.2f", saldo));
            txtMsg.append("Saldo consultado \n");
            return;
        }
        if(e.getSource()==cmdEntrada){
            double valor = Double.parseDouble(txtValor.getText());
            String resultado = caixa.depositar(valor);
            txtMsg.append(resultado + "\n");
            txtValor.setText(null);
            txtValor.requestFocus();
            return;
        }
        if(e.getSource()==cmdRetirada){
            double valor = Double.parseDouble(txtValor.getText());
            String resultado = caixa.sacar(valor);
            txtMsg.append(resultado + "\n");
            txtValor.setText(null);
            txtValor.requestFocus();
        }
    }
}
