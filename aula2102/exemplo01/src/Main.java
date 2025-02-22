public class Main {
    public static void main(String[] args) {
        //Matricular o joao e a maria
        //Criar o objeto (joao)
        Aluno joao = new Aluno();
        joao.ra = 14567;
        joao.nome = "João da Silva";
        joao.salario = 2500.00;
        joao.email = "joao.silva@gmail.com";
        joao.matricular();

        //Criar o objeto (maria)
        Aluno maria = new Aluno();
        maria.ra = 14569;
        maria.nome = "Maria da Silva";
        maria.salario = 2600.00;
        maria.email = "maria.silva@gmail.com";
        maria.matricular();

        maria.cancelarMatricular();
    }
}
