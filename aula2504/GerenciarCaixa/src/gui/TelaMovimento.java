package gui;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class TelaMovimento extends JFrame implements ActionListener {
    private Dimension dFrame, dLabel, dTextField, dButton, dTextArea;
    private Label lblValor, lblSaldo;
    private TextField txtValor, txtSaldo;
    private Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    private TextArea txtMsg;
    private Caixa caixa = new Caixa(); //objeto caixa

    //Definir um construtor personalizado para falar como será a minha
    //janela
    public TelaMovimento(){
        //definir os tamanhos dos elementos
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40, 20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300, 140);
        //Definir a aparencia da janela
        setTitle("Controle de Caixa");
        setSize(dFrame);
        setResizable(false); //nao redimensionar a janela
        setLocationRelativeTo(null); //centralizar a janela
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); //controlar as posicoes dos objetos
        //definindo os dois labels
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25, 50);
        add(lblValor); //adicionando o label na janela.

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25, 80);
        add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75, 50);
        add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75, 80);
        add(txtSaldo);

        cmdEntrada = new Button("Depositar");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25, 150);
        cmdEntrada.addActionListener(this);//evento para o botao depositar
        add(cmdEntrada);

        cmdRetirada = new Button("Retirar");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(180, 150);
        cmdRetirada.addActionListener(this); //evento para o botao retirar
        add(cmdRetirada);

        cmdConsulta = new Button("Consultar");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25, 185);
        cmdConsulta.addActionListener(this); //evento para o botao consultar
        add(cmdConsulta);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(180, 185);
        cmdSair.addActionListener(this); //Evento para o botao sair
        add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        add(txtMsg);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //codificar os elementos que disparam eventos (acao do usuario)
        if(e.getSource()==cmdEntrada){
            //logica do depositar
            double valor = Double.parseDouble(txtValor.getText());
            boolean depositou = caixa.depositar(valor);
            if(depositou){
                String mensagem = "Depositou " + valor + " com sucesso\n";
                txtMsg.append(mensagem);
                mostrarMensagem(mensagem);
                txtValor.setText("");
                txtValor.requestFocus(); //colocar o foco no controle
            }else{
                txtMsg.append("Valor invalido para o deposito\n");
            }
            return;
        }
        if(e.getSource()==cmdRetirada){
            //logica do retirar
            double valor = Double.parseDouble(txtValor.getText());
            boolean sacou = caixa.sacar(valor);
            if(sacou){
                String mensagem = "Saque de \" + valor + \" efetuado com sucesso \n";
                txtMsg.append(mensagem);
                mostrarMensagem(mensagem);
                txtValor.setText("");
                txtValor.requestFocus();
            }else{
                txtMsg.append("Saldo insuficiente para o saque\n");
            }
            return;
        }
        if(e.getSource()==cmdConsulta){
            //logica para devolver o saldo
            txtSaldo.setText(Double.toString(caixa.getSaldo()));
            txtValor.setText("");
            txtValor.requestFocus();
            return;
        }
        if(e.getSource()==cmdSair){
            //logica do sair
            System.exit(0); //sai do programa sem erros
        }
    }

    //Para exibir uma caixa de mensagem para o usuario
    private void mostrarMensagem(String mensagem){
        JOptionPane.showMessageDialog(null,
                mensagem, "Atenção", JOptionPane.INFORMATION_MESSAGE);
    }
}
