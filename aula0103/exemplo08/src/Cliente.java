public class Cliente {
    //1 atributos
    public int codigo;
    public String nome;
    public int idade;
    public String email;

    //2. Criar os métodos (um método)
    public void exibirDados(){
        System.out.println("Dados do cliente");
        System.out.println("codigo = " + codigo);
        System.out.println("nome = " + nome);
        System.out.println("idade = " + idade);
        System.out.println("email = " + email);
        System.out.println("-------------------");
    }
}
