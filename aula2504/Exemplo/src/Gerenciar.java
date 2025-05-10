import javax.swing.*;

public class Gerenciar {
    public static void main(String[] args) {
        JFrame tela = new JFrame();
        tela.setContentPane(new Tela().getPainelTela());
        tela.setTitle("Ola Alunos");
        tela.setSize(200, 200);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}
