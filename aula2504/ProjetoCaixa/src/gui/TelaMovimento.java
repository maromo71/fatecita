package gui;

import javax.swing.*;
import java.awt.*;

public class TelaMovimento extends JFrame {
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    private TextArea txtMsg;
    private Dimension dFrame, dLabel, dTextField, dTextArea, dButton;

    //método construtor (construir a janela)
    public TelaMovimento(){
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
        add(cmdEntrada);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(225,150);
        add(cmdRetirada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25,185);
        add(cmdConsulta);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225,185);
        add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);

    }
}
