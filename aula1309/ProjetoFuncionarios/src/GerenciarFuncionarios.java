import model.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GerenciarFuncionarios {
    List<Funcionario> funcionarios;

    //Construtor personalizado
    public GerenciarFuncionarios() {
        funcionarios = new ArrayList<>();
        //comecar uma lista vazia
    }

    public void execConsultar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o rg do funcionário a ser consultado");
        String rgProc = scanner.nextLine();
        //varrer a lista a procura do rgProc
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getRg().equalsIgnoreCase(rgProc)){
                System.out.println(funcionario.listar());
                return;
            }
        }
        System.out.println("Funcionário não encontrado");
    }
    public static void main(String[] args) {
        GerenciarFuncionarios gerenciar = new GerenciarFuncionarios();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0; //opcao do menu
        do{
            System.out.println("Menu de Operações");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Bonificar");
            System.out.println("9. Sair");
            System.out.println("Digite sua opção: ");
            opcao = Integer.parseInt(scanner.nextLine());
            switch(opcao){
                case 1:
                    gerenciar.execCadastrar();
                    break;
                case 2:
                    gerenciar.execConsultar();
                    break;
                case 3:
                    gerenciar.execBonificar();
                    break;
                case 4:
                    gerenciar.execListarTodos();
                    break;
                case 5:
                    gerenciar.execInativar();
                    break;
                case 9:
                    System.out.println("Fim do Programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao !=9);
    }

    private void execInativar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o RG do funcionário a inativar: ");
        String rgProc = scanner.nextLine();
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getRg().equalsIgnoreCase(rgProc)){
                funcionario.setAtivo(false); //inativar o funcioário
                System.out.println("Funcionário inatvidao com sucesso");
                return;
            }
        }
        System.out.println("Funcionário não encontrado");
    }

    private void execListarTodos() {
        //Listar todos o funcionários
        //Varrer a lista e imprimir todos
        for(Funcionario funcionario : funcionarios){
            System.out.println(funcionario.listar());
        }
    }

    public void execBonificar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o rg do funcionário a ser bonificado");
        String rgProc = scanner.nextLine();
        //varrer a lista para encontrar o funcionario a ser bonificado
        for(Funcionario funcionario : funcionarios){
            if(funcionario.getRg().equalsIgnoreCase(rgProc)){
                double aumento;
                System.out.println("Digite o valor do aumento: ");
                aumento = Double.parseDouble(scanner.nextLine());
                funcionario.bonificar(aumento);
                System.out.println("Funcionário Bonificado com sucesso");
                return;
            }
        }
        System.out.println("Funcionário não encontrado");
    }
    public void execCadastrar(){
        //Pedir os dados para o usuário
        //Criar um objeto Funcionario e atribuir esses dados
        //Em seguida colocar na lista
        Scanner scanner = new Scanner(System.in);
        Funcionario funcionario = new Funcionario(); //novo funcionario
        System.out.println("Digite o nome do Funcionario: ");
        funcionario.setNome(scanner.nextLine());
        System.out.println("Digite o departamento do Funcionario: ");
        funcionario.setDepartamento(scanner.nextLine());
        System.out.println("Digite o RG do Funcionario: ");
        funcionario.setRg(scanner.nextLine());
        System.out.println("Digite o salário do Funcionário: ");
        funcionario.setSalario(Double.parseDouble(scanner.nextLine()));
        System.out.println("Funcionário cadastrado com sucesso");
        funcionarios.add(funcionario); //adicionei o funcionário na lista
    }
}
