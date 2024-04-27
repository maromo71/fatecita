package gui;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaMovimento extends JFrame implements ActionListener {
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    private TextArea txtMsg;
    private Dimension dFrame, dLabel, dTextField, dTextArea, dButton;

    private Caixa caixa;

    //método construtor (construir a janela)
    public TelaMovimento(){
        //Instaciar o objeto caixa
        caixa = new Caixa();
        //Definindo tamanhos (padrão) dos objetos
        dLabel = new Dimension(40,20);
        dFrame = new Dimension(350,400);
        dTextField = new Dimension(150,20);
        dButton =new Dimension(95,20);
        dTextArea = new Dimension(300,140);
        //Definindo a aparência da Janela
        setTitle("Controle de Caixa");
        setLayout(null);//minha responsabilidade colocar elementos na tela
        setLocationRelativeTo(null); //centraliza a janela
        setSize(dFrame); //tamanho da janela
        setResizable(false);//Tamanho fixo da janela
        setDefaultCloseOperation(EXIT_ON_CLOSE); //X fecha a janela por padrao

        //Colocar os componentes na janela
        lblValor = new Label("Valor:"); //novo objeto
        lblValor.setSize(dLabel); //tamanho do objeto
        lblValor.setLocation(25,50); //localizacao do objeto coord x y
        add(lblValor); //adiciona componente na janela

        lblSaldo = new Label("Saldo");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        add(txtSaldo);

        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        cmdEntrada.addActionListener(this);
        add(cmdEntrada);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(225,150);
        cmdRetirada.addActionListener(this);
        add(cmdRetirada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25,185);
        cmdConsulta.addActionListener(this);
        add(cmdConsulta);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225,185);
        cmdSair.addActionListener(this);
        add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmdEntrada){
            double valor = Double.parseDouble(txtValor.getText());
            String retorno = caixa.depositar(valor);
            txtMsg.append(retorno);
            txtMsg.append("\n");
            txtValor.setText(null);
            txtValor.requestFocus(); //coloca o foco no controle
        }
        if(e.getSource()==cmdSair){
            System.exit(0);
        }
        if(e.getSource()==cmdRetirada){
            double valor = Double.parseDouble(txtValor.getText());
            String retorno = caixa.sacar(valor);
            txtMsg.append(retorno);
            txtMsg.append("\n");
            txtValor.setText(null);
            txtValor.requestFocus(); //coloca o foco no controle
        }
        if(e.getSource()==cmdConsulta){
            double saldo = caixa.getSaldo();
            txtSaldo.setText(String.format("%.2f",saldo));
            txtMsg.append("Saldo consultado no momento R$ ");
            txtMsg.append(txtSaldo.getText() + "\n");
        }
    }
}
