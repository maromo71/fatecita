import java.util.ArrayList;
import java.util.List;

public class GerenciarEmpresa {
    public static List<Logavel> logados = new ArrayList<>();

    public static void main(String[] args) {
        //5 objetos
        Secretaria secretaria = new Secretaria();
        Gerente gerente = new Gerente();
        Operador operador = new Operador();
        Cliente cliente = new Cliente();
        Fornecedor fornecedor = new Fornecedor();
        //As proximas linhas nao podem dar certo
        //operador.efetuarLogin();
        //fornecedor.efetuarLogin();
        //Os outros tres fazem login
        secretaria.efetuarLogin();
        gerente.efetuarLogin();
        cliente.efetuarLogin();
        imprimirLogados(); //Antes da Secretaria sair
        //Secretaria efetua logoff
        secretaria.efetuarLogoff();
        imprimirLogados(); //Depois que a secretaria saiu
    }

    public static void imprimirLogados() {
        System.out.println("=====================================");
        System.out.println("Total de logados: " + logados.size());
        for (Logavel log : logados) {
            System.out.println(log);
        }
        System.out.println("=====================================");
    }

}
