public class AcampamentoTeste {
    public static void main(String[] args) {
        //Criamos um objeto chamado membro
        Acampamento membro = new Acampamento();
        membro.nome = "Joãozinho";
        membro.idade = 16;
        //Invocar o método imprimir
        membro.imprimir();
        //Executar o método separarGrupo
        membro.separarGrupo();
        //Executar imprimir depois de separaGrupo
        membro.imprimir();
    }
}
