public class ComputadorTeste {
    public static void main(String[] args) {
        //Criando o objeto
        Computador computador1 = new Computador();
        //Atribuindo valores
        computador1.marca = "HP";
        computador1.modelo = "Computador Novo";
        computador1.cor = "Azul";
        computador1.numeroSerie = 1234;
        computador1.preco = 5000.0;
        //mostra os dados atuais
        computador1.imprimir();
        //invocamos o calcular valor para o objeto
        computador1.calcularValor();
        computador1.imprimir();

        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Computador Velho";
        computador2.cor = "Verde";
        computador2.numeroSerie = 2345;
        computador2.preco = 2000.0;
        computador2.imprimir();
        computador2.calcularValor();
        computador2.imprimir();

        double valor = 1750;
        if(computador2.alterarValor(valor)==1){
            System.out.println("Alterado com sucesso!");
        }else{
            System.out.println("Preco inválido!");
        }
        computador2.imprimir();

    }
}
