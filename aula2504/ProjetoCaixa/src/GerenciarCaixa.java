import gui.TelaMovimento;
import gui.TelaMovimento2;

import javax.swing.*;

public class GerenciarCaixa {
    public static void main(String[] args) {
       // TelaMovimento tela = new TelaMovimento();
       // tela.setVisible(true);
        JFrame tela = new JFrame();
        tela.setContentPane(new TelaMovimento2().getPainel());
        tela.setSize(350,500);
        tela.setTitle("Controle de Caixa");
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        //tela.setResizable(false);
        tela.setVisible(true);
    }
}
