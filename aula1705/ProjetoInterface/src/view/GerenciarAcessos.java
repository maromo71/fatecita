package view;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class GerenciarAcessos {
    //Lista de pessoas que estão logadas no sistema
    public static List<Logavel> logados = new ArrayList<>();

    public static void main(String[] args) {
        GerenciarAcessos gerenciar = new GerenciarAcessos();
        //Simular pessoas cadastradas
        //E depois algumas delas vao logar
        Operador operador = new Operador();
        Secretaria secretaria1 = new Secretaria();
        Secretaria secretaria2 = new Secretaria();
        Gerente gerente = new Gerente();
        Cliente cliente = new Cliente();
        Fornecedor fornecedor = new Fornecedor();
        gerente.login();
        secretaria1.login();
        secretaria2.login();
        cliente.login();
        //Lista dos logados no momento
        gerenciar.listarLogados();
        System.out.println();
        secretaria2.logout();
        //Listar novamento
        gerenciar.listarLogados();

    }

    public void listarLogados(){
        System.out.println("No momento estão logados no sistema");
        System.out.println(logados.size() + " pessoas");
        System.out.println("abaixo: ");
        for(Logavel o : logados){
            System.out.println(o);
        }
    }
}