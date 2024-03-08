public class ComnputadorTeste {
    public static void main(String[] args) {
        //criar um novo computador
        Computador computador1 = new Computador();
        //atribuir valores aos seus atributos
        computador1.marca = "HP";
        computador1.numeroSerie = 123;
        computador1.modelo = "Novo";
        computador1.cor = "Prata";
        computador1.preco = 1000;
        //mostrou os dados na tela
        computador1.imprimir();
        //executar o metodo calcular para esse objeto
        computador1.calcularValor();
        System.out.println();
        computador1.imprimir();

        Computador computador2 = new Computador();
        computador2.marca = "IBM";
        computador2.modelo = "Velho";
        computador2.cor = "Preta";
        computador2.preco = 5000;
        computador2.numeroSerie  =234;
        System.out.println();
        computador2.imprimir();
        System.out.println();
        computador2.calcularValor();
        computador2.imprimir();
        //vou mandar alterar o preco para um valor positivo
        System.out.println();
        boolean alterou = computador2.alterarValor(-3000);
        if(alterou){
            System.out.println("Valor alterado com sucesso");
        }else{
            System.out.println("Valor não alterado");
        }

        computador2.imprimir();

    }
}
