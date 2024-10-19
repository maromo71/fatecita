import view.CaixaView;
import view.NewCaixaView;

import javax.swing.*;

public class GerenciarCaixa {
    public static void main(String[] args) {
       // CaixaView tela = new CaixaView();
      //  tela.setVisible(true);
        JFrame tela = new JFrame();
        tela.setContentPane(new NewCaixaView().getFormCaixa());
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setSize(350, 500);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setTitle("Controle de Caixa");
        tela.setVisible(true);

    }
}
