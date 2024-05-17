import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(4876, "Maria Antonia");
        Pessoa p2 = new Pessoa(22, "Carina Silva");
        Pessoa p3 = new Pessoa(3, "Jose A Barbos");
   /*
        //Qual será o hashcode destes objetos ?
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        //P1 e P3 são iguais
        System.out.println(p1.equals(p3)); //false pois os ids são diferentes
    */
        List<Pessoa> pessoas= new ArrayList<>();
        System.out.println("Tamanho: " + pessoas.size());
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        System.out.println("Tamanho: " + pessoas.size());
        Collections.sort(pessoas);
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o id da pessoa procurada: ");
        int codigoPessoa = Integer.parseInt(sc.nextLine());

        Pessoa procurada = new Pessoa(codigoPessoa, "");
        boolean tem = pessoas.contains(procurada);
        if(tem){
            System.out.println("Pessoa encontrada é: ");
            int index = pessoas.indexOf(procurada);
            procurada = pessoas.get(index);
            System.out.println(procurada);
        }else{
            System.out.println("Pessoa nao está na lista");
        }



    }
}